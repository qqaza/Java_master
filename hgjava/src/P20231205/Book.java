package P20231205;

public class Book {
	//도서코드/ 도서명/ 저자/출판사/가격정보 저장
	
	public String code;
	public String bname;
	public String name;
	public String comp;
	int money; 
	public Book(){
		
	}
	void ShowInfo() {
		System.out.println("도서코드: " + code +'\n'+ " 도서명: " + bname +'\n'+ " 저자명: " + name +'\n'+ " 출판사: " + comp +'\n'+ " 가격정보: " + money);
				 
	}
	public void SetCode(String code) {
		this.code = code;
	}
	public void SetBname(String bname) {
		this.bname = bname;
	}
	public void SetName1(String name) {
		this.name = name;
	}
	public void SetComp(String comp) {
		this.comp = comp;
	}
	public void SetMoney(int money) {
		this.money = money;
	}
	
	public String getCode() {
		return code;
	}
	public String getBname() {
		return bname;
	}
	public String getName() {
		return name;
	}
	public String getComp() {
		return comp;
	}
	public int getMoney() {
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
	

