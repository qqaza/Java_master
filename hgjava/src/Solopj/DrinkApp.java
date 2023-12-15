package Solopj;

import java.util.Scanner;

public class DrinkApp {

	public static void main(String[] args) {
		Drink[]drinks = new Drink[100];
		Scanner scn = new Scanner(System.in);
		Drink d = new Drink();
		DrinkDAO dao = new DrinkDAO(); 
		
//		Drink drk = new Drink(num, name, price, number);
		
		
		boolean run = true;
		
		while(run) {
			System.out.println("1.메뉴판 || 2.주문하기 || 3.주문 내용 확인 || 4.주문 수정 || 5.주문 취소 || 6.처음으로");
			System.out.println("입력>>>");
			
			int menu = Integer.parseInt(scn.nextLine());
			
			
			switch(menu) {
			case 1:
			d.showDrinkmenu();
				
			
			break;
			
			case 2://주문하기
				boolean jumun = true;
				while(jumun) {
					System.out.println("주문하실 음료를 골라주세요>>>");
					int num= Integer.parseInt(scn.nextLine());
					System.out.println("주문하신 음료의 수량을 입력해 주세요.>>>");
					int count = Integer.parseInt(scn.nextLine());
					
					if(dao.orderDrink(num,count)) {
						System.out.println("");
					};
				}
					
				
				System.out.println("주문이 완료되었습니다.");
				break;
				
			case 3://주문내용 확인
				System.out.println("주문하신 내용입니다.");
				System.out.println("==============================");
				Drink[] dl = dao.getDrinkList(); 
				for(int i =0;i<dl.length;i++) {
					if(dl[i] != null) {
						dl[i].ShowInfo();
					}
				}
					
						
				
				
				System.out.println("==============================");
			break;
			
			case 4://수정하기(추가하기)
				System.out.println("변경할 음료의 번호를 눌러주세요>>>");
				num= Integer.parseInt(scn.nextLine());
				System.out.println("변경할 음료수량>>>");
				count = Integer.parseInt(scn.nextLine());
				if(dao.modifyDrink(num,count)) {
					System.out.println("변경 되었습니다.");
				}else {
					System.out.println("다시 입력해 주세요.");
				}
				break;
			case 5://취소(삭제)
				
				System.out.println("취소할 음료의 번호를 눌러 주세요>>>");
				 num= Integer.parseInt(scn.nextLine());
				if(dao.removeDrink(num)) {
					System.out.println("주문삭제 되었습니다.");
				}else {
					System.out.println("다시 입력해 주세요.");
				}
				break;
				
				
			case 6://종료
				
				System.out.println("잠시만 기다려 주세요.");
				run = false;
			}	
		}//while
		System.out.println("이용해 주셔서 감사합니다.");
	}//end of main





}//end of class
