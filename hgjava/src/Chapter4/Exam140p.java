package Chapter4;

public class Exam140p {

	public static void main(String[] args) {
		//�ֻ��� ��ȣ �̱�
		int num =(int)(Math.random()*6) +1;
		if(num == 1) {
			System.out.println("1���� ���Խ��ϴ�");
		}else if(num ==2) {
			System.out.println("2���� ���Խ��ϴ�");
		}else if(num ==3) {
			System.out.println("3���� ���Խ��ϴ�");
		}else if(num ==4) {
			System.out.println("4���� ���Խ��ϴ�");
		}else if(num ==5) {
			System.out.println("5���� ���Խ��ϴ�");
		}else if(num ==6) {
			System.out.println("6���� ���Խ��ϴ�");
		}
		
		//switch
		switch(num) {
		case 1 :System.out.println("n1���� ���Խ��ϴ�"); break;
		case 2 :System.out.println("n2���� ���Խ��ϴ�"); break;
		case 3 :System.out.println("n3���� ���Խ��ϴ�"); break;
		case 4 :System.out.println("n4���� ���Խ��ϴ�"); break;
		case 5 :System.out.println("n5���� ���Խ��ϴ�"); break;
		default :System.out.println("n6���� ���Խ��ϴ�"); 
		}
		
		
	}//end main

}// end class
