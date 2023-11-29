package Chapter6;

import java.util.*;

public class BoardApp {
	static BoardExe exe = new BoardExe();
	public static void main(String[] args) {
		
//		Board[] boards = new Board[100];
		Scanner scn = new Scanner(System.in);
		BoardExe exe = new BoardExe();
		UserExe uexe = new UserExe();
		String id = null;
		
		while(true) {
			System.out.println("id를 입력>>>");
			id = scn.nextLine();
			System.out.println("pw를 입력>>>");
			String pw = scn.nextLine();
			User user = uexe.logIn(id,  pw);
			if(user != null) {
				System.out.println(user.getUserName() +" 님 환영합니다!");
				break;
			}else {
				System.out.println("id, pw를 확인하세요!");
			}
		}//end of while
		
	//초기값 생성
	exe.initData();
	boolean run = true;
	
	while(run) {
		System.out.println("1.등록 || 2.목록 || 3.상세조회 || 4.수정 || 5.삭제 || 6.종료");
		System.out.print("입력>>>");
		int menu = Integer.parseInt(scn.nextLine());
		
		switch(menu) {
		case 1:
			System.out.println("게시글 번호>>>");
			int num = Integer.parseInt(scn.nextLine());
			System.out.print("제목입력>>>");
			String title = scn.nextLine();
			System.out.print("작성자>>>");
			String name = scn.nextLine();
			System.out.print("내용입력>>>");
			String memo = scn.nextLine();
			System.out.print("일시입력>>>");
			String time = scn.nextLine();
			//int time = Integer.parseInt(scn.nextLine());
			Board bod = new Board(exe.getSequnce(), title, id, memo, time);
			
			
			if(exe.addBoard(bod)) {
				System.out.println("입력 성공!");
			}else {
				System.out.println("입력 실패!");
			}
			    		break;
//			for(int i=0; i< boards.length; i++) {
//				if(boards[i] == null) {
//					boards[i]=bod;
//					break;
//				}//if
//				}//for
			    		
		case 2://목록보기
			Board[]boardAry = exe.boardList();
			showList(boardAry, 1);
			while(true) {
				int page = Integer.parseInt(scn.nextLine());
				if(page==0) {
					break;
				}
				showList(boardAry,page);
			}
				break;

			
//			for(int i = 0; i < boards.length; i++) {
//				if(boards[i] != null) {
//					boards[i].showInfo();
//				}//if
//			}//for
			
		case 3://상세조회
			System.out.println("찾을 게시판 조회>>");
			num = Integer.parseInt(scn.nextLine());
			Board result = exe.getBoard(num);
			if(result !=null) {
				System.out.println(result.showDetailInfo());
			}else {
				System.out.println("조회된 정보가 없습니다.");
			}
			break;
//			for(int i=0; i<boards.length; i++) {
//				if(boards[i] !=null && boards[i].getNum() == num) {
//					boards[i].showInfo();
//				}
//		}
		case 4: //수정
			System.out.println("수정할 글 번호>>>");
			num = Integer.parseInt(scn.nextLine());
			System.out.println("수정할 글 내용>>>");
			memo = scn.nextLine();
			if(!exe.CheckResponsibility(id, num)) {
				System.out.println("수정할 권한이 없습니다.");
				continue;
			}
			
			if(exe.modBoard(num,  memo)) {
				System.out.println("변경 성공!");
			}else {
				System.out.println("처리 실패!");
			}
			break;
		case 5: //삭제.
			System.out.println("삭제할 글 번호>>>");
			num = Integer.parseInt(scn.nextLine());
			if(!exe.CheckResponsibility(id, num)) {
				System.out.println("삭제할 권한이 없습니다.");
				continue;
			}
			if(exe.remBoard(num)) {
				System.out.println("삭제 성공!");
			}else {
				System.out.println("삭제 실패!");
			}
		case 6://종료
			System.out.println("프로그램을 종료합니다.");
			run = false;
			
			
		}//end of switch
		
	}//end of while
	System.out.println("end of prog");
	}//end of main
	public static void showList(Board[] boardAry, int page) {
		//페이징 처리/
		
		Board[]pageAry = exe.pageList(boardAry, page);
		
		System.out.println("글번호 제목    작성자  작성일시");
		System.out.println("=========================");
		for(Board brd : pageAry) {
			if(brd != null)
				brd.showInfo();
		}
	
		
		//전체페이지 계산하고 출력.
		int cnt = exe.getBoardCount();
		int totalPage = (int)Math.ceil(cnt/5.0);
		System.out.println(totalPage);
		
		for(int i=1;i<=totalPage; i++) {
			System.out.println(i + " ");
		}
		System.out.println("\n페이지를 선택하세요(종료하려면 0을 입력하세요)>>>");
		
	}//showList

}//end of class
