package todo20231214;

import java.sql.*;

import P20231205.Book;

//등록/추가/목록/삭제
public class BookDAO {
Connection conn;
PreparedStatement psmt;
ResultSet rs;


Connection getConn() {
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	try {
//		class.forBook("oracl.jdbc.OracleDriver");
		conn = DriverManager.getConnection(url,"dev","dev");
		System.out.println("연결 성공!!");
	}catch(Exception e) {
		
	}
	return conn;
}
//목록
public Book[] getBookList() {
	getConn();
	Book[] books = new Book[10];
	String sql = "select * from book order by 1";
	try {
		psmt = conn.prepareStatement(sql);
		rs = psmt.executeQuery();
		while(rs.next()) {
			Book book = new Book();
			book.SetCode(rs.getString("code"));
			book.SetBname(rs.getString("bname"));
			book.SetName1(rs.getString("name"));
			book.SetComp(rs.getString("comp"));
			book.SetMoney(rs.getInt("money"));
			for(int i =0; i<books.length; i++) {
				if(books[i]==null) {
					books[i]=book;
					break;
				}//if
			}//for
		}
	
	
}catch(Exception e) {
	e.printStackTrace();
}
return books;
}
//추가
public boolean addBook(Book bk) {
	getConn();
	String sql = "insert into book values(?,?,?,?,?)";
			try {
				psmt = conn.prepareStatement(sql);
				psmt.setString(1, bk.getCode());
				psmt.setString(2, bk.getBname());
				psmt.setString(3, bk.getName());
				psmt.setString(4, bk.getComp());
				psmt.setInt(5, bk.getMoney());
				
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
public boolean modifyBook(String bname,String code, int money) {
	getConn();
	String sql = "update book "
			+ "set code = ?, money =? "
			+ "where bname =?";
	try {
		psmt = conn.prepareStatement(sql);
		psmt.setString(1, code);
		psmt.setInt(2, money);
		psmt.setString(3, bname);
		int r = psmt.executeUpdate();
				if(r>0) {
					return true;
				}
	}catch(SQLException e) {
		e.printStackTrace();
	}
	return false;
}
//삭제
public boolean removeBook(String name) {
	getConn();
	String sql = "delete from book where bname=?";
			try {
				psmt = conn.prepareStatement(sql);
				psmt.setString(1, name);
				int r= psmt.executeUpdate();
				if(r>0) {
					return true;
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
			return false;
}
}//end of class