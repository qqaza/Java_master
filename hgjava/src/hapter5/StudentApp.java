package hapter5;

import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int studentNum = 0;
		int[] scores = null;
		String[] names = null;
		
		//1.�л��� 2.�����Է� 3.������ 4.�м�(�ְ�����,���)5.����
		boolean run = true;
		while(run) {
			System.out.println("1.�л��� 2.�����Է� 3.������ 4.�м�(�ְ�����,���)5.����");
			System.out.print("�Է�: ");
			int menu = scn.nextInt();// 3 Enter.
			scn.nextLine();
			
			switch(menu) {
			case 1:
			System.out.println("�л� �� �Է�>>");
			studentNum = scn.nextInt();
			scn.nextLine();
			scores = new int[studentNum];
			names = new String[studentNum];
			break;
			case 2:
			System.out.println("���� �Է�>>");
			//for �ݺ�.
			for(int i=0; i < scores.length; i++) {
				System.out.print("names["+i+"]>>");
				names[i] = scn.nextLine();
				System.out.println("scores[" + i + "]>>");
				scores[i] = scn.nextInt();
				scn.nextLine();
			}
			break;
			case 3:
			System.out.println("��� ���>>");
			for(int i=0; i < scores.length; i++) {
				System.out.println("�̸��� "+ names[i] + ","+ "scores[" + i + "]" + scores[i]);
			}
			break;
			case 4:
			System.out.println("�м�>>");
			//�ְ� ���� ���.����
			int maxScore = 0;
			double avg =0;
			int sum = 0;
			//
			String maxName = "";
//			for(int max : scores) {
			for(int i = 0; i< scores.length; i++) {
				sum += scores[i];
				if(maxScore <scores[i] ) {
					maxScore = scores[i];
					maxName = names[i];
				}
			}
			avg = sum * 1.0 / scores.length;
			System.out.println(maxName +"��" + ",����" + "max��: " + maxScore + "��հ�: " + avg);
			break;
			
//			int count = 0;
//			for(int num : scores) {
//				count++;
//			}
//			System.out.println((double)sum/count);
			
			case 5:
			System.out.println("����>>");
			run = false;
			break;
			
			}//end of switch
		} //end of while
		System.out.println("end of prog.");

	}//end main

}//end class
