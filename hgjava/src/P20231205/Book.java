package P20231205;

public class Book {
	//도서코드/ 도서명/ 저자/출판사/가격정보 저장
	
	String code;
	String bname;
	String name;
	String comp;
	int money;
	void ShowInfo() {
		System.out.println("도서코드: " + code + " 도서명: " + bname + " 저자명: " + name + " 출판사: " + comp + " 가격정보: " + money);
				 
	}
	void SetCode(String code) {
		this.code = code;
	}
	void SetBname(String bname) {
		this.bname = bname;
	}
	void SetName1(String name) {
		this.name = name;
	}
	void SetComp(String comp) {
		this.comp = comp;
	}
	void SetMoney(int money) {
		this.money = money;
	}
	
	String getCode() {
		return code;
	}
	String getBname() {
		return bname;
	}
	String getName() {
		return name;
	}
	String getComp() {
		return comp;
	}
	int getMoney() {
		return money;
	}
	
	Book(String code, String bname, String name, String comp, int money){
		this.code = code;
		this.bname = bname;
		this.name=name;
		this.comp=comp;
		this.money=money;
	}
	
		
	}
	

