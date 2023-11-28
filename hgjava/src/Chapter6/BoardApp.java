package Chapter6;

import java.util.Scanner;

public class BoardApp {

	
	public static void main(String[] args) {
		
		Board[] boards = new Board[100];
	Scanner scn = new Scanner(System.in);
	
	boolean run = true;
	
	while(run) {
		System.out.println("1.등록 || 2.목록 || 3.상세조회 || 4.종료");
		System.out.print("입력>>>");
		int menu = Integer.parseInt(scn.nextLine());
		
		switch(menu) {
		case 1:
			System.out.println("게시글 번호>>>");
			int num = scn.nextInt();
			System.out.println("제목>>>");
			String tatle = scn.nextLine();
			System.out.println("작성자>>>");
			String name =  scn.nextLine();
			System.out.println("내용>>>");
			String memo = scn.nextLine();
			System.out.println("작성일시>>>");
			int time = scn.nextInt();
			Board bod = new Board(num,tatle,name,memo,time);
			
			
			for(int i=0; i< boards.length; i++) {
				if(boards[i] == null) {
					boards[i]=bod;
					break;
				}
				}
			
		case 2://목록보기
			for(int i=0; i<boards.length; i++) {
				if(boards[i] != null) {
					boards[i].showInfo();
				}
			}
		case 3://상세조회
			
			
		case 4:
			
			
		}//end of switch
		
	}//end of while

	}//end of main

}//end of class
