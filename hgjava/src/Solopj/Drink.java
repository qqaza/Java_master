package Solopj;

public class Drink {
	//음료 번호, 음료 이름, 가격, 수량
	
	int num;
	String name;
	int price;
	int count;
	public Drink() {
		
	}
	public void ShowInfo() {
		System.out.println(this.num + "\t" + this.name + "\t" +this.price + "\t" +this.count);
	}
	
	public void SetNum(int num) {
		this.num = num;
	}
	public void SetName(String name) {
		this.name=name;
	}
	public void SetPrice(int price) {
		this.price=price;
	}
	public void SetCount(int count) {
		this.count=count;
	}
	
	public int getNum() {
		return num;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public int getCountr() {
		return count;
	}
	
	Drink(int num, String name, int price, int count){
		this.num = num;
		this.name=name;
		this.price=price;
		this.count=count;
	}
	
void showDrinkmenu() {
	System.out.println("====================메뉴판=========================");
	System.out.println("음료번호       음료이름       가격        ");
	System.out.println("1)          아메리카노     3000원        ");
	System.out.println("2)          바닐라 라테    3700원         ");
	System.out.println("3)          자몽 에이드    4500원         ");
	System.out.println("4)           아이스티      3000원       ");
	System.out.println("5)            유자차      3500원        ");
	System.out.println("==================================================");
}
}//end of class
