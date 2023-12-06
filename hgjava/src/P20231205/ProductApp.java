package P20231205;

import java.util.Scanner;

import javax.annotation.processing.SupportedSourceVersion;

public class ProductApp {

	public static void main(String[] args) {
		//상품관리/입출고관리/종료
		//1-1등록 1-2수정 1-3목록
		//2-1판매 2-2구매 2-3재고  
	Product[]products = new Product[100];
	Scanner scn = new Scanner(System.in);
	ProductExe exe = new ProductExe();
	
	
	boolean run = true;
	
	while(run) {
		System.out.println("1.상품관리 || 2.입출고관리 || 3.종료");
		System.out.print("입력>>>");
		
		int menu = Integer.parseInt(scn.nextLine());
		
		
		switch(menu) {
		case 1:
			System.out.println("1-1)등록 | 1-2)수정 | 1-3)목록");
			System.out.println("==================================");
			System.out.print("입력>>>");
			
			int menu1 = Integer.parseInt(scn.nextLine());
			
			switch(menu1) {
			case 1:
				System.out.println("상품코드 등록>>>");
				String code = scn.nextLine();
				System.out.println("상품명 등록>>>");
				String name = scn.nextLine();
				System.out.println("상품 가격>>>");
				int price = Integer.parseInt(scn.nextLine());
				break;
				
			case 2:
				System.out.println("조회할 상품명>>>");
				name = scn.nextLine();
				
				System.out.println("가격 수정>>>");
				price = Integer.parseInt(scn.nextLine());
				
				if(exe.modifyProduct(name, price)) {
					System.out.println("수정 완료.");
				}else {
					System.out.println("다시 확인해 주세요.");
				}
				break;
			case 3:
				System.out.println("목록 조회>>>");
				for(Product pd : exe.getProductList()) {
					if(pd != null) {
						pd.ShowInfo();
					}
				}
				break;
				}//menu1
			continue;
		case 2:
			System.out.println("2-1)판매 | 2-2)구매 | 2-3)재고");
			System.out.print("====================================");
			int menu2 = Integer.parseInt(scn.nextLine());
			
			switch(menu2) {
			case 1:
				System.out.println("판매 물품>>>");
				String item = scn.nextLine(); 
			
				System.out.println("판매 수량>>>");
				int num = Integer.parseInt(scn.nextLine());
				break;
			case 2:
				System.out.println("구매 물품>>>");
				String items = scn.nextLine();
				System.out.println("구매 수량>>>");
				int num2 = Integer.parseInt(scn.nextLine());
			case 3:
				System.out.println("재고 수량>>>");
				
				break;
			}//menu2
			break;
		case 3:
			System.out.println("프로그램을 종료합니다.");
			run = false;
		}//menu	
		
	}//while
	System.out.println("End of prog.");
	}//end of main

}//end of class
