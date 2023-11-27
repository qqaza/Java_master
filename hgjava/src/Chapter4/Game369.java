package Chapter4;

import java.util.Scanner;

public class Game369 {

	public static void main(String[] args) {
		//1~ 50
		
		// 3,6,9 갯수 체크 변수
		//숫자 = 1~50 반복문
			//1의 자리에 3,6,9 갯수 체크
		
			//10의 자리 3,6,9 갯수 체크
		
		
		for(int i = 1; i<=50; i++) {
			int a = i%10;
			int aa = i/10;
			
			if(a == 3 && aa == 3 || a == 6 && aa == 3 || a==9 && aa==3) {
				System.out.print("♥♥");
			}else if(a == 3 || a == 6|| a == 9) {
				System.out.print("♥");
			}else if(aa == 3 || aa == 6 || aa == 9) {
				System.out.print("♥");
			}else {
				System.out.print(i);
			}
			if(a == 0) {
				System.out.println();
			}
				System.out.print(" ");
				
		}
			//3,6,9 갯수 체크 변수
			int cnt = 0;
			//숫자 1~50 반복문
			for(int i=1; i<=50; i++) {
				cnt = 0;
				if(i%10 == 3 || i%10 == 6 || i%10 == 9)cnt++;//일의자리에 3,6,9 갯수체크
				if(i/10 == 3 || i/10 == 6 || i/10 == 9)cnt++;//십의자리에 3,6,9 갯수체크				//개
				//갯수가 0개이면 숫자 출력
				//갯수가 1개이면 ♥ 
				//갯수가 2개이면 ♥♥ 
				switch(cnt) {
				case 0 : System.out.print(i + "\t");break;
				case 1 : System.out.print("♥\t");break;
				case 2 : System.out.print("♥♥\t");
				}
				if(i%10 == 0) System.out.println(); //한줄에 10개씩 출력
			}
		
			//동전 교환 프로그램
//			
//			Scanner sc = new Scanner(System.in);
//			int result = 0;
//			int[] coin = new int[5];
//			
//			System.out.print("##교환할 금액 : ");
//			int total = sc.nextInt();
//			while(true) {
//				if(total >500) {
//					coin[0] = total/500;
//					total -= coin[0]*500;
//					result += 500*coin[0];
//				}else if(total >100) {
//					coin[1] = total/100;
//					total -= coin[1]*100;
//					result += 100*coin[1];
//				}else if(total >50) {
//					coin[2] = total/50;
//					total -= coin[2]*50;
//					result += 50*coin[2];
//				}else if(total >10) {
//					coin[3] = total/10;
//					total -= coin[3]*10;
//					result += 10*coin[3];
//				}else {
//					break;
//				}
//			}
//			System.out.println("500원 짜리 : " + coin[0]+ "개");
//			System.out.println("100원 짜리 : " + coin[1]+ "개");
//			System.out.println("50원 짜리 : " + coin[2]+ "개");
//			System.out.println("10원 짜리 : " + coin[3]+ "개");
//			System.out.println("교환 금액 : " + result + "원");
//			System.out.println("남은 금액 : " + total + "원");
			////////////////////////////////////////////////////////
			Scanner sc = new Scanner(System.in);
			System.out.print("##교환할 금액 : ");
			int money = sc.nextInt();
			System.out.println("500원 짜리 : " + money/500 + "개");
			int remoney = money%500;
			System.out.println("100원 짜리 : " + remoney/100 + "개");
			remoney %= 100;
			System.out.println("50원 짜리 : " + remoney/50 + "개");
			remoney %= 50;
			System.out.println("100원 짜리 : " + remoney/10 + "개");
			remoney %= 10;
			System.out.println("교환 금액 :" + (money - remoney));
			System.out.println("남은 금액 : " + remoney);
			
			
			//숫자 맞추기 1~100 사이의 수
			// com 숫자 발생 Math.random()
			int num = (int)(Math.random()*100)+1;
			//반복문 실행
			while(true) {
				System.out.println("숫자 입력 : ");
				int num2 = sc.nextInt();
				if(num == num2 ) {
					System.out.println("축하 합니다");
					break;
				}else if(num < num2) {
					System.out.println("down 하세요");
					
				}else {
					System.out.println("up 하세요");
				}
				
			}
				//숫자 입력 받음
				//입력 숫자 == 채ㅡ  -> 축하합니다 반복문 탈출
				//입력숫자 > com -> down 하세요
				// 입력숫자 < com -> up 하세요
			
			
			
			
			
			
	}	//end main

}//end class
