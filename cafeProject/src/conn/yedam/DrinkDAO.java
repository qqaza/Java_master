package conn.yedam;

import java.sql.*;

public class DrinkDAO {
	Connection conn;
	PreparedStatement psmt;
	PreparedStatement psmt2;
	ResultSet rs;
	ResultSet rs2;

	Connection getConn() {
		String url = "jdbc:oracle:thin:@192.168.0.28:1521:xe";
		try {
			conn = DriverManager.getConnection(url, "dev", "dev");
//			System.out.println("연결 성공!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	// 주문하기
	boolean orderDrink(int num, int amount) {
		String sql = "update drink " + "set amount=? " + "where num=?";
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

	// 내용 확인
	public Drink[] getDrinkList() {
		Drink[] drinks = new Drink[300];
		String sql = "select * from drink order by 1";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				Drink drink = new Drink();
				drink.SetNum(rs.getInt("num"));
				drink.SetName(rs.getString("name"));
				drink.SetPrice(rs.getInt("price"));
				drink.SetAmount(rs.getInt("amont"));
				drink.SetCode(rs.getString("code"));
				for (int i = 0; i < drinks.length; i++) {
					if (drinks[i] == null) {
						drinks[i] = drink;
						break;
					}
				}
			} // while
		} catch (Exception e) {
			e.printStackTrace();
		}
		return drinks;
	}// list

	// 추가
	public boolean addDrink(int num, int amount) {
		String sql = "update drink set amount=((select amount from drink where num=?)+?) where num=?"; // 업데이트로 바꾸기
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, num);
			psmt.setInt(2, amount);
			psmt.setInt(3, num);

			int r = psmt.executeUpdate();
			if (r > 0) {
				return true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	// 수정
	public boolean modifyDrink(int num, int amount) {
		String sql = "update drink " + "set amount=? " + "where num =?";
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
	}// 수정

	void getDrinkPay() {
		int sum = 0;
		int count = 0;
		String sql = "select (price * amount) as pay, name " + "from drink";
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

	void modifyDrink1() {
		String sql = "update drink " + "set amount=0";
		try {
			psmt = conn.prepareStatement(sql);
//		 psmt.setInt(1, count);
			int r = psmt.executeUpdate();
			if (r > 0) {
//				System.out.println("주문이 완료되었습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	void getTotal() {
		int sum = 0;
		String sql = "select (price * amount) as pay " + "from dessert";
		String sql2 = "select (price * amount) as pay " + "from drink";

		try {
			psmt = conn.prepareStatement(sql);
			psmt2 = conn.prepareStatement(sql2);

			rs = psmt.executeQuery();
			rs2 = psmt2.executeQuery();

			while (rs.next()) {
				sum += rs.getInt("pay");
			}
			while (rs2.next()) {
				sum += rs2.getInt("pay");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("총 계산금액 : " + sum + "원 입니다.");
	}

}