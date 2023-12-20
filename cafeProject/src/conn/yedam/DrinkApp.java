package conn.yedam;

import java.util.Scanner;

public class DrinkApp {

	public static void main(String[] args) {
		Drink[] drinks = new Drink[300];
		Scanner scn = new Scanner(System.in);
		Drink d = new Drink();
		Dessert de = new Dessert();
		DrinkDAO dao = new DrinkDAO();
		DessertDAO ddao = new DessertDAO();
		dao.getConn();
		ddao.getConn();
		boolean run = true;

		while (run) {
			System.out.println("1.메뉴판 || 2.주문하기 || 3.주문 내용 확인 || 4.주문 수정 || 5.주문 완료 ");
			System.out.println("입력>>>");

			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1:
				d.showDrinkmenu();
				de.ShowDessertMenu();
				break;

			case 2:// 주문하기
//				de.getorderDessert();
				boolean cofe = true;
				int first = 0;
				int second = 0;
				while (cofe) {
					System.out.println("========Drink===========");
					System.out.println("1. 아메리카노 (3,000원)");
					System.out.println("2. 바닐라라테 (3,700원)");
					System.out.println("3. 자몽에이드 (4,500원)");
					System.out.println("4. 아이스티  (3,000원)");
					System.out.println("5.  유자차   (3,500원)");
					System.out.println("메뉴를 선택해 주세요.");
					System.out.println("======================");

					System.out.println("주문하실 음료를 선택주세요>>>");
					int num = Integer.parseInt(scn.nextLine());
					System.out.println("주문하신 음료의 수를 선택해 주세요.>>>");
					int amount = Integer.parseInt(scn.nextLine());

					if (dao.orderDrink(num, amount) && first == 0) {
						first++;
					}
					System.out.println("디저트를 선택하시겠습니까?>>>");
					System.out.println("1.네.         2.아니요.");
					int submenu = Integer.parseInt(scn.nextLine());
					if (submenu == 1) {
						de.getorderDessert();
						System.out.println("주문하실 디져트를 골라주세요>>>");

						int num1 = Integer.parseInt(scn.nextLine());
						System.out.println("주문하신 디져트의 수을 선택해 주세요.>>>");
						int amount1 = Integer.parseInt(scn.nextLine());
						if (ddao.orderDessert(num1, amount1) && second == 0) {
							second++;

						} else
							System.out.println("주문이 완료되었습니다.");
						System.out.println("=========================");
					}
					break;

				}
				break;

			case 3:// 주문내용 확인
				System.out.println("주문하신 내용입니다.");
				System.out.println("==============================");
				ddao.getDessertPay();
				System.out.println("--------------------");
				dao.getDrinkPay();
				dao.getTotal();
				System.out.println("==============================");
				break;
				
			case 4:// 수정하기(추가하기)
				System.out.println("변경하실 메뉴를 선택해주세요");
				System.out.println("1.음료            2.디저트");
				int menu2 = Integer.parseInt(scn.nextLine());
				if (menu2 == 1) {
					d.showDrinkmenu();
					System.out.println("변경하실 음료를 선택해주세요>>>");
					int num = Integer.parseInt(scn.nextLine());
					System.out.println("변경할 음료수>>>");
					int amount = Integer.parseInt(scn.nextLine());
					if (dao.modifyDrink(num, amount)) {
					}
				}
				if (menu2 == 2) {
					de.ShowDessertMenu();
					System.out.println("변경하실 디저트를 선택주세요>>>");
					int dnum = Integer.parseInt(scn.nextLine());
					System.out.println("변경할 디저트>>>");
					int damount = Integer.parseInt(scn.nextLine());
					if (ddao.modifyDessert(dnum, damount)) {
					}
				} else {
					System.out.println("변경되었습니다.");
				}
				break;
				
			case 5:// 주문완료
				run = false;
				dao.modifyDrink1();
				ddao.modifyDessert1();
			}
		} // while
		System.out.println("이용해 주셔서 감사합니다.");
	}// end of main

}// end of class
