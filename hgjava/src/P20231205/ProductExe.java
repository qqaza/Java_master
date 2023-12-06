package P20231205;

public class ProductExe {
	//상품등록/ 상품가격 수정/상품 목록
	private Product[]products;
	
	ProductExe(){
		products = new Product[100];
		products[0] = new Product("p001", "볼펜", 1000);
		products[1] = new Product("p002", "연필", 1200);
		products[2] = new Product("n001", "노트", 1000);
		products[3] = new Product("n002", "다이어리", 3000);
	}
	
	boolean addProduct(Product pd) {
		for(int i=0; i<products.length;i++) {
			if(products[i]==null) {
				products[i] = pd;
				return true;
			}
		}
		return false;
	}
	
	Product[]getProductList(){
		return products;
	}
	boolean modifyProduct(String name ,int price) {
		for(int i=0; i<products.length;i++) {
			if(products[i] !=null &&products[i].getName().equals(name)) {
//				products[i].SetName(name);
				
				products[i].SetPrice(price);
				return true;
			}
		}
		return false;
	}


		
	
}//end of class
