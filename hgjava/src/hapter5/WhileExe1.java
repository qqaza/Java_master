package hapter5;

import java.util.Scanner;

public class WhileExe1 {

	public static void main(String[] args) {
		//for : �ݺ� Ƚ���� ������ �ִ� ���.
		
		//while : ������ �����ϴ� ���� �ݺ�.
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.println("���ڰ��� �Է�>>>");
			
			String txt = scn.nextLine();
			if(txt.equals("quit")){
					System.out.println("�����մϴ�.");
					break;
		}
			System.out.println("�Է°��� " + txt);
		}
			System.out.println("end of prog.");
			
			
			
	}//main

}//class
