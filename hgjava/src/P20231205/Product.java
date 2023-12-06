package P20231205;

public class Product {
	String code;
	String name;
	int price;
	
	void ShowInfo() {
		System.out.println(" 상품코드:" +code + " 상품명:" +name + " 가격:" +price);
			
		}
	void SetCode(String code) {
		this.code = code;
	}
	void SetName(String name) {
		this.name=name;
	}
	void SetPrice(int price) {
		this.price=price;
	}
	String getCode() {
		return code;
	}
	String getName() {
		return name;
	}
	int getPrice() {
		return price;
	}
	Product(String code, String name, int price){
		this.code=code;
		this.name=name;
		this.price=price;
	}
	
	
	
}//end of class
