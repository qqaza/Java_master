package Chapter4;

import java.util.Scanner;

public class Exam160p {

	public static void main(String[] args) {
		//문제 2번 : 3의 배수 합
		int sum = 0;
		
		for(int i=1; i<100; i++) {
			if(i%3==0) {
				sum +=i;
			}
		}
		System.out.println(sum);
		//문제 3번 
		while(true) {
			int a = (int)(Math.random()*6)+1;
			int b = (int)(Math.random()*6)+1;
			
			System.out.println("(" +a + "," + b + ")");
			if(a+b==5) {
				break;
			}
			
		}
		System.out.println("끝");
		//문제 4번 
		for(int i=0; i <= 10; i++) {//x : 1~10 까지 반복
				for(int j=0; j<=10; j++) {//y : 1~10 까지 반복
					if(4*i+5*j==60) {//4*x + 5*y = 60인 값 찾기
						System.out.printf("(%d,%d)",i,j);
								
					}
				}
		}
		System.out.println();
		
		//문제 5,6번 별찍기
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	      
		//문제 7번
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------------------------");
			System.out.print("선택> ");
			int num = scanner.nextInt();
			
			
			switch(num) {
			case 1 :{
				System.out.println("예금액>");
				int num2 = scanner.nextInt();
				balance += num2;
				break;
			}
			case 2 :{
				System.out.println("출금액>");
				int num3 = scanner.nextInt();
				if(balance < num3) {
					System.out.println("잔고부족");
				}else {
					balance -= num3;
				}
				break;
			}
			case 3 :{
				
				System.out.println("잔고>" + balance);
				
				break;
			}
			case 4 :{
				run=false;
				System.out.println("프로그램 종료");
				break;
				
			}
		
			}
			
		}
		
		
	}//end main

}//end class
