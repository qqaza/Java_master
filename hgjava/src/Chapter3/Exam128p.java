package Chapter3;

import java.util.*;

public class Exam128p {

	public static void main(String[] args) {
		//문제 4번
		
		int penNum = 534;
		int stuNum = 30;
		//학생 1명이 가지는 연필 개수
		int ppsNum = penNum / stuNum;
		int rempNum = penNum % stuNum;
		
		System.out.printf("학생당 연필수 : %d, 남은 연필 수 : %d \n", ppsNum, rempNum);
		
		//5번 문제 -> 강제 타입 변환
		//6번 문제
		int value = 356;
		System.out.println(value/100*100);
		//문제 7 => 부동 소수점 표현 방식0.1 은 0.1 보다 큰 값 
		//강제 타입 변환 (float)0.1
		
		//8번 문제
		//사다리꼴의 넓이 = (윗변 + 아랫변) * 높이/2
		int lenghTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = ((lenghTop + lengthBottom) *(double)height/2);
		System.out.println(area);
		
		//9번 문제
//		Scanner sc = new Scanner(System.in);
//		System.out.print("첫번째 수 : ");
//		double num1 = sc.nextDouble();
//		
//		System.out.print("두번째 수 : ");
//		double num2 = sc.nextDouble();
//		
//		if(num2 == 0.0) {
//			System.out.println("결과 : 무한대");
//		}else {
//			System.out.println("결과 : " + num1/num2);
//					
//		}
		
		//10번 문제
		int var1 = 10;
		int var2 = 3;
		int var3 = 14;
		double var4 = var1* var1 * Double.parseDouble(var2 + "." +var3);
		System.out.println("원의 넓이: " + var4);
		
		//11번 문제
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("아이디");
		String name = scanner.nextLine();
		
		System.out.print("패스워드");
		String strPassword = scanner.nextLine();
		int password = Integer.parseInt(strPassword);
		
		if(name.equals("java")) {
			if(password == 12345) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("로그인 실패: 패스워드가 다릅니다");
			}
		}else {
			System.out.println("로그인 실패: 아이디가 존재하지 않습니다");
		}
		
		
		
	}//end main

		
}//end class
