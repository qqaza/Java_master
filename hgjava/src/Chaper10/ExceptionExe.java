package Chaper10;

public class ExceptionExe {

	public static void main(String[] args) {
		try {
			test();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("끝");
	}
public static void test() throws ClassNotFoundException {
	//일반예외 : 예외를 처리.
					Class.forName("java.lang.String");
				
				
}			

			
}
