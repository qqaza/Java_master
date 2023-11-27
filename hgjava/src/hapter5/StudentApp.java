package hapter5;

import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int studentNum = 0;
		int[] scores = null;
		String[] names = null;
		
		//1.학생수 2.점수입력 3.목록출력 4.분석(최고점수,평균)5.종료
		boolean run = true;
		while(run) {
			System.out.println("1.학생수 2.점수입력 3.목록출력 4.분석(최고점수,평균)5.종료");
			System.out.print("입력: ");
			int menu = scn.nextInt();// 3 Enter.
			scn.nextLine();
			
			switch(menu) {
			case 1:
			System.out.println("학생 수 입력>>");
			studentNum = scn.nextInt();
			scn.nextLine();
			scores = new int[studentNum];
			names = new String[studentNum];
			break;
			case 2:
			System.out.println("점수 입력>>");
			//for 반복.
			for(int i=0; i < scores.length; i++) {
				System.out.print("names["+i+"]>>");
				names[i] = scn.nextLine();
				System.out.println("scores[" + i + "]>>");
				scores[i] = scn.nextInt();
				scn.nextLine();
			}
			break;
			case 3:
			System.out.println("목록 출력>>");
			for(int i=0; i < scores.length; i++) {
				System.out.println("이름은 "+ names[i] + ","+ "scores[" + i + "]" + scores[i]);
			}
			break;
			case 4:
			System.out.println("분석>>");
			//최고 점수 출력.구현
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
			System.out.println(maxName +"의" + ",점수" + "max값: " + maxScore + "평균값: " + avg);
			break;
			
//			int count = 0;
//			for(int num : scores) {
//				count++;
//			}
//			System.out.println((double)sum/count);
			
			case 5:
			System.out.println("종료>>");
			run = false;
			break;
			
			}//end of switch
		} //end of while
		System.out.println("end of prog.");

	}//end main

}//end class
