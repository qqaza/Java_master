package hapter5;

public class ArraryExw3 {

	public static void main(String[] args) {
		String[] nameAry = {"홍길동","김길동","박길동","황길동","홍길동"};
		
		String search = "홍길동";
		int count = 0;
		//for반복문 활용.
		for(int i = 0; i<nameAry.length; i++) {
			if(nameAry[i].equals(search)) {
				count++;
			}
		}
		
		System.out.println(search+"은 총" + count + "명 입니다.");
		
		int[] scores = {88, 68, 72, 89, 92, 70};
		int maxScore = 0;
		
		for(int max : scores) {
			if(maxScore < max) {
				maxScore = max;
			}
		}
		System.out.println(maxScore);
				
		

	}//main

}//class
