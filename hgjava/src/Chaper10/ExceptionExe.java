package Chaper10;

public class ExceptionExe {

	public static void main(String[] args) {
		
		try {
			Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("끝");
	}

}
