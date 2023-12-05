package P20231205;

public class BookExe {
	//등록기능/목록기능/수정기능/삭제기능
	private Book[]books;
	
	BookExe(){
		books = new Book[100];
		books[0] =new Book("B001", "이것이자바다" , "신용권" , "예담" , 25000);
		books[1] =new Book("C003", "자바기초" , "김재원" , "예담" , 20000);
		books[2] =new Book("D001", "자바마스터" , "박재민" , "예담" , 15000);
		
	}
	
	boolean addBook(Book bk) {
		for(int i=0; i<books.length;i++) {
			if(books[i]==null) {
				books[i] = bk;
				return true;
			}
		}
		return false;
	}
	
	Book[]getBookList(){
		return books;
	}
	
	boolean modifyBook(String code, int money ) {
		for(int i=0; i<books.length;i++) {
			if(books[i] !=null && books[i].getCode().equals(code)) {
				books[i].SetCode(code);
				
				books[i].SetMoney(money);
				return true;
			}
		}
		return false;
	}
	
	
	boolean removeBook(String bname) {
		for(int i=0;i<books.length;i++) {
			if(books[i]!=null && books[i].getBname().equals(bname)) {
				books[i] = null;
				return true;
			}
		}
		return false;
	}

	public boolean modifytudent1(String code, String bname, String name, int money) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean removeBook1(String bname) {
		// TODO Auto-generated method stub
		return false;
	}

//	public boolean modifyBook(String code, int money) {
//		// TODO Auto-generated method stub
//		return false;
//	}
	
	
	
	
}





