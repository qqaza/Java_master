package chapter1;

import java.util.Scanner;

public class Exam98 {

	public static void main(String[] args) {
		//1�� ����
		String name ="���ڹ�";
		int age = 25;
		String tel1 = "010", tel2 = "123" , tel3 = "4567";
		System.out.println("�̸� : " + name);
		System.out.print("���� : " + age + "\n");
		System.out.printf("��ȭ : %s - %s - %s", tel1, tel2, tel3);
		
		
		//2�� ����
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("ù��° �� : ");
		String strNum1 = scanner.nextLine();
				
		System.out.print("�ι�° �� : ");
		String strNum2 = scanner.nextLine();
				
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		System.out.println("���� ��� : " + result);
				//3�� ����
		System.out.println("[�ʼ� ���� �Է�]");
		System.out.print("1. �̸� : ");
		String name2 = scanner.nextLine();
		
		System.out.print("2. �ֹ� ��ȣ �� 6�ڸ� : ");
		String jmnum = scanner.nextLine();
		
		System.out.print("3. ��ȭ��ȣ : ");
		String pnum = scanner.nextLine();
		
		System.out.println(name2);
		System.out.println(jmnum);
		System.out.println(pnum);
		
		
	} //end main

}//end class
