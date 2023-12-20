package conn.yedam;

public class Drink {
	int num;
	String name;
	int price;
	int amount;
	String code;

	public Drink() {
	
	}

	public void ShowInfo() {
		System.out.println(this.num + "\t" + this.name + "\t" + this.price + "\t" + this.amount);
	}

	public void SetNum(int num) {
		this.num = num;
	}

	public void SetName(String name) {
		this.name = name;
	}

	public void SetPrice(int price) {
		this.price = price;
	}

	public void SetAmount(int amount) {
		this.amount = amount;
	}

	public void SetCode(String code) {
		this.code = code;
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

	public int getAmount() {
		return amount;
	}

	public String getCode() {
		return code;
	}

	Drink(int num, String name, int price, int amount, String code) {
		this.num = num;
		this.name = name;
		this.price = price;
		this.amount = amount;
		this.code = code;
	}

	public void showDrinkmenu() {
		System.out.println("====================음료메뉴=========================");
		System.out.println("음료번호       음료이름       가격        ");
		System.out.println("1)          아메리카노     3000원        ");
		System.out.println("2)          바닐라 라테    3700원         ");
		System.out.println("3)          자몽 에이드    4500원         ");
		System.out.println("4)           아이스티      3000원       ");
		System.out.println("5)            유자차      3500원        ");
//	System.out.println("===================================================");
	}

	public void getorderDrink() {

	}
}
