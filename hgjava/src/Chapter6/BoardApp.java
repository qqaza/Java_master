package Chapter6;

import java.util.*;

public class BoardApp {

	public static void main(String[] args) {
		
		Board[] boards = new Board[100];
	Scanner scn = new Scanner(System.in);
//	BoardExe exe = new BoardExe();
	boolean run = true;
	
	while(run) {
		System.out.println("1.등록 || 2.목록 || 3.상세조회 || 4.종료");
		System.out.print("입력>>>");
		int menu = Integer.parseInt(scn.nextLine());
		
		switch(menu) {
		case 1:
			System.out.println("게시글 번호>>>");
			int num = Integer.parseInt(scn.nextLine());
			System.out.println("제목>>>");
			String title = scn.nextLine();
			System.out.println("작성자>>>");
			String name = scn.nextLine();
			System.out.println("내용>>>");
			String memo = scn.nextLine();
			System.out.println("작성일시>>>");
			String time = scn.nextLine();
			//int time = Integer.parseInt(scn.nextLine());
			Board bod = new Board(num, title, name, memo, time);
			
			
			for(int i=0; i< boards.length; i++) {
				if(boards[i] == null) {
					boards[i]=bod;
				}
				}
			    		break;
		case 2://목록보기
			for(int i = 0; i < boards.length; i++) {
				if(boards[i] != null) {
					boards[i].showInfo();
				}
				break;
			}
		case 3://상세조회
			System.out.println("찾을 게시판 조회>>");
			num = Integer.parseInt(scn.nextLine());
			for(int i=0; i<boards.length; i++) {
				if(boards[i] !=null && boards[i].getNum() == num) {
					boards[i].showInfo();
				}
		}
			break;
			
		case 4://종료
			System.out.println("프로그램을 종료합니다.");
			run = false;
			
			
		}//end of switch
		
	}//end of while
	System.out.println("end of prog");
	}//end of main

}//end of class
