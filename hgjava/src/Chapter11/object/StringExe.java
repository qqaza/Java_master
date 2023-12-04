package Chapter11.object;

public class StringExe {

	public static void main(String[] args) {
		
		String[] fileNames = {"c:/images/prod/sample.jgp",
				"d:/test/sample/americano.png",
				"d:/goods/test/2023/moka.jpg"};
		for(String file : fileNames) {
			System.out.println(findFileName(file));
		}
		
		//
		String[] numbers = {"980304-1234567", //
				"980304-2234567",//
				"020101-3456789",//
				"020104-4456789",//
				"0301053545678"};
		
		for(String no : numbers) {
			System.out.println(findGender(no));
		}
		
		byte[] b1 = "Hello".getBytes();
		for(byte b : b1) {
			System.out.println(b);
		}
		String name = new String(new byte[] {65, 66, 67, 68, 69});
		name = new String(b1);
		System.out.println(name);
		
		char c1 = name.charAt(0);
		System.out.println(c1);
		}//end of main

		static String findGender(String ssn){
			int count = 0;
			char re = ' ';
			for(int i=0;i<ssn.length();i++) {
				if(ssn.charAt(i) !='-') {
					count++;
				}
				if(count==7) {
					re = ssn.charAt(i);
			}
			}
			String b ="";
			
			//생년월일 = 1,2,3,4
			
			char gender = ssn.charAt(7);
			switch(re) {
			case '1' :
				case '3' :
				b="남자";
				
				break;
				case '2' :
				case'4' :
					b="여자";
				
				break;
			}
			return b;
			
		}//end of findGender
		//파일명 가져오기.
		static String findFileName(String file) {
			String[] name = file.split("/");
			String ret1 = name[0];
			String ret2 = name[1];
			String ret3 = name[2];
			String ret4 = name[3];
//			System.out.println("ret1 = "+ret1);
//			System.out.println("ret2 = "+ret2);
//			System.out.println("ret3 = "+ret3);
//			System.out.println("ret4 = "+ret4);
			
			
			return name[name.length-1];
			
		}//end of FileName

	
	
}//end of class
