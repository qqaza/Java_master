package Solopj;

import java.sql.*;

public class DrinkDAO {
Connection conn;
PreparedStatement psmt;
ResultSet rs;

Connection getConn() {
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	try {
		conn =  DriverManager.getConnection(url,"dev","dev");
		System.out.println("연결 성공!!");
	}catch(Exception e) {
		
	}
	return conn;
}

//주문하기
boolean orderDrink(int num,int count) {
	getConn();
	String sql = "update drink "
			+ "set count=? "
			+ "where num=? ";
	try {
		psmt = conn.prepareStatement(sql);
		psmt.setInt(1,count);
		psmt.setInt(2,num);
		int r = psmt.executeUpdate();
		if(r>0) {
			return true;
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	return false;
}

//내용 확인
public Drink[] getDrinkList() {
	getConn();
	Drink[]drinks = new Drink[100];
	String sql = "select * from drink order by 1";
	try {
		psmt = conn.prepareStatement(sql);
		rs = psmt.executeQuery();
		while(rs.next()) {
			Drink drink = new Drink();
			drink.SetNum(rs.getInt("num"));
			drink.SetName(rs.getString("name"));
			drink.SetPrice(rs.getInt("price"));
			drink.SetCount(rs.getInt("count"));
			for(int i =0; i<drinks.length;i++) {
				if(drinks[i]==null) {
					drinks[i]=drink;
					break;
				}
			}
		}//while
	}catch(Exception e) {
		e.printStackTrace();
	}
	return drinks;
}//list

//추가
public boolean addDrink(Drink drk) {
	getConn();
	String sql = "insert into drink values(?,?)";
	try {
		psmt = conn.prepareStatement(sql);
		psmt.setInt(1, drk.getNum());
		psmt.setInt(2, drk.getCountr());
		
		int r = psmt.executeUpdate();
		if(r==1) {
			return true;
		}
	
}catch(SQLException e) {
	e.printStackTrace();
}
return false;
}





//수정
public boolean modifyDrink(int num, int count) {
	getConn();
	String sql = "update drink "
			     + "set count=? " 
			     + "where num =?";
	try {
		psmt = conn.prepareStatement(sql);
		psmt.setInt(1, count);
		psmt.setInt(2, num);
		
		int r = psmt.executeUpdate();
				if(r>0) {
					return true;
				}
	}catch(SQLException e) {
		e.printStackTrace();
	}
	return false;
}//수정









//삭제
public boolean removeDrink(int num) {
	getConn();
	String sql = "delete from dronk where name=?";
	try {
		psmt = conn.prepareStatement(sql);
		psmt.setInt(1, num);
		int r= psmt.executeUpdate();
		if(r>0) {
			return true;
		}
	}catch(SQLException e) {
		e.printStackTrace();
	}
	return false;
}//삭제
	
}//end of class
