package Chapter4;

import java.util.Scanner;

public class Exam160p {

	public static void main(String[] args) {
		//���� 2�� : 3�� ��� ��
		int sum = 0;
		
		for(int i=1; i<100; i++) {
			if(i%3==0) {
				sum +=i;
			}
		}
		System.out.println(sum);
		//���� 3�� 
		while(true) {
			int a = (int)(Math.random()*6)+1;
			int b = (int)(Math.random()*6)+1;
			
			System.out.println("(" +a + "," + b + ")");
			if(a+b==5) {
				break;
			}
			
		}
		System.out.println("��");
		//���� 4�� 
		for(int i=0; i <= 10; i++) {//x : 1~10 ���� �ݺ�
				for(int j=0; j<=10; j++) {//y : 1~10 ���� �ݺ�
					if(4*i+5*j==60) {//4*x + 5*y = 60�� �� ã��
						System.out.printf("(%d,%d)",i,j);
								
					}
				}
		}
		System.out.println();
		
		//���� 5,6�� �����
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	      
		//���� 7��
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("--------------------------------");
			System.out.print("����> ");
			int num = scanner.nextInt();
			
			
			switch(num) {
			case 1 :{
				System.out.println("���ݾ�>");
				int num2 = scanner.nextInt();
				balance += num2;
				break;
			}
			case 2 :{
				System.out.println("��ݾ�>");
				int num3 = scanner.nextInt();
				if(balance < num3) {
					System.out.println("�ܰ����");
				}else {
					balance -= num3;
				}
				break;
			}
			case 3 :{
				
				System.out.println("�ܰ�>" + balance);
				
				break;
			}
			case 4 :{
				run=false;
				System.out.println("���α׷� ����");
				break;
				
			}
		
			}
			
		}
		
		
	}//end main

}//end class
