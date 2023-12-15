package P20231205;

import java.util.Scanner;

import Remind6.StudentDAO;
import todo20231214.BookDAO;

public class BookApp {

public static void main(String[] args) {
	Book[]books = new Book[100];
	
	Scanner scn = new Scanner(System.in);
	BookExe exe = new BookExe();
	BookDAO dao = new BookDAO();
	boolean run = true;
	
	while(run) {
		System.out.println("1.등록 || 2.목록 || 3.수정 || 4.삭제 || 5.종료");
		System.out.print("입력>>");
		
		int  menu = Integer.parseInt(scn.nextLine());
		
		switch(menu) {
		case 1:
			System.out.println("도서코드 입력>>");
			String code = scn.nextLine();
			System.out.println("도서명 입력>>");
			String bname = scn.nextLine();
			System.out.println("저자명>>");
			String name = scn.nextLine();
			System.out.println("출판사>>");
			String comp = scn.nextLine();
			System.out.println("가격 정보>>");
			int money = Integer.parseInt(scn.nextLine());
			
			Book  bk = new Book(code, bname, name,comp, money);
			
			if(dao.addBook(bk)) {
				System.out.println("등록 되었습니다.");
			}else {
				System.out.println("등록 불가.");
			}
			break;
			
		case 2:
			for(Book bk1 : dao.getBookList()) {
				if(bk1 != null) {
					bk1.ShowInfo();
				}
			}
			break;
			
			
		case 3:
			System.out.println("조회할 도서명을 입력>>>");
			bname = scn.nextLine();
			
			System.out.println("도서코드>>");
			code = scn.nextLine();
			
			System.out.println("가격>>");
			money = Integer.parseInt(scn.nextLine());
			
			if(dao.modifyBook(bname,code, money)) {
				System.out.println("수정 완료.");
			}else {
				System.out.println("수정 실패.");
			}
			break;
			
		case 4:
			System.out.print("삭제할 도서명>>>");
			bname = scn.nextLine();
			
			if(dao.removeBook(bname)) {
				System.out.println("삭제 완료.");
			}else {
				System.out.println("삭제 실패.");
			}
				break;
				
		case 5:
			System.out.println("프로그램을 종료합니다.");
			run = false;
		}//switch
	}//while
		System.out.println("End of prog.");
	}//end of main
}//end of class
