package conn.yedam;

import java.sql.*;
import java.util.concurrent.ExecutionException;

public class DessertDAO {
	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;

	Connection getConn() {
		String url = "jdbc:oracle:thin:@192.168.0.28:1521:xe";
		try {
			conn = DriverManager.getConnection(url, "dev", "dev");
//			System.out.println("연결 성공~!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	// 주문하기

	boolean orderDessert(int num, int amount) {
		getConn();
		String sql = "update DESSERT " + "set amount=? " + "where num=? ";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, amount);
			psmt.setInt(2, num);
			rs = psmt.executeQuery();
			if (rs.next()) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public Dessert[] getDessertList() {
		getConn();
		Dessert[] desserts = new Dessert[200];
		String sql = "select * from dessert order by 1";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				Dessert dessert = new Dessert();
				dessert.SetNum(rs.getInt("num"));
				dessert.SetName(rs.getString("name"));
				dessert.SetPrice(rs.getInt("price"));
				dessert.SetAmont(rs.getInt("amount"));
				dessert.SetCode(rs.getString("code"));
				for (int i = 0; i < desserts.length; i++) {
					if (desserts[i] == null) {
						desserts[i] = dessert;
						break;
					}
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return desserts;
	}

	// 수정
	public boolean modifyDessert(int num, int amount) {
		getConn();
		String sql = "update dessert " + "set amount=? " + "where num=? ";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, amount);
			psmt.setInt(2, num);

			int r = psmt.executeUpdate();
			if (r > 0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public void getDessertPay() {
		getConn();
		int sum = 0;
		int count = 0;
		String sql = "select (price * amount) as pay, name " + "from dessert";

		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next() && count < 5) {
				System.out.println(rs.getString("name") + " : " + rs.getInt("pay") + "원");
				sum += rs.getInt("pay");
				count++;

			}

		} catch (Exception e) {

		}

	}

	public void modifyDessert1() {
		getConn();
		String sql = "update dessert " + "set amount=0 ";
		try {
			psmt = conn.prepareStatement(sql);
			int r = psmt.executeUpdate();
			if (r > 0) {
				System.out.println("주문이 완료되었습니다.");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}// end of class
