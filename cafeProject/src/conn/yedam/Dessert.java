package conn.yedam;

public class Dessert {

	int num;
	String name;
	int price;
	int amount;
	String code;

	public Dessert() {

	}

	public void ShowInfo() {
		System.out.println(this.num + "\t" + this.name + "\t" + this.price + "\t" + this.amount + "\t");
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

	public void SetAmont(int amount) {
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

	public int getAmonut() {
		return amount;
	}

	public String getcode() {
		return code;
	}

	Dessert(int num, String name, int price, int amount, String code) {
		this.num = num;
		this.name = name;
		this.price = price;
		this.amount = amount;
		this.code = code;

	}

	public void ShowDessertMenu() {
		System.out.println("====================디져트 메뉴=========================");
		System.out.println("디져트번호       종류        가격        ");
		System.out.println("1)          치크케이크     3900원        ");
		System.out.println("2)           마카롱       3000원        ");
		System.out.println("3)          에크타르트     3900원        ");
		System.out.println("=====================================================");
	}

	public void getorderDessert() {
		System.out.println("=================Dessert===============");
		System.out.println("디져트번호       종류        가격        ");
		System.out.println("1) 치크케이크 (3,900원)        ");
		System.out.println("2) 마카롱 (3,000원)        ");
		System.out.println("3) 에크타르트 (3,900원)        ");

	}

}// end of main
