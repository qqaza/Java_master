package Chapter4;

public class Exam140p {

	public static void main(String[] args) {
		//주사위 번호 뽑기
		int num =(int)(Math.random()*6) +1;
		if(num == 1) {
			System.out.println("1번이 나왔습니다");
		}else if(num ==2) {
			System.out.println("2번이 나왔습니다");
		}else if(num ==3) {
			System.out.println("3번이 나왔습니다");
		}else if(num ==4) {
			System.out.println("4번이 나왔습니다");
		}else if(num ==5) {
			System.out.println("5번이 나왔습니다");
		}else if(num ==6) {
			System.out.println("6번이 나왔습니다");
		}
		
		//switch
		switch(num) {
		case 1 :System.out.println("n1번이 나왔습니다"); break;
		case 2 :System.out.println("n2번이 나왔습니다"); break;
		case 3 :System.out.println("n3번이 나왔습니다"); break;
		case 4 :System.out.println("n4번이 나왔습니다"); break;
		case 5 :System.out.println("n5번이 나왔습니다"); break;
		default :System.out.println("n6번이 나왔습니다"); 
		}
		
		
	}//end main

}// end class
