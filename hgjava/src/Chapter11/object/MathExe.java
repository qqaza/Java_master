package Chapter11.object;

public class MathExe {

	public static void main(String[] args) {
		long result = (long)Math.round(-1.2);
		System.out.println("round: " + result);
		
		//61~100점.
		for(int i = 1; i <=10; i++) {
			int r = 61+ (int)(Math.random() * 40); // 0<= x < 10
			System.out.println(r);			
		}
		
		//1~6 수.
		int[] numbers = new int[5];
		//중복되지 않은 값을 배열에 저장.
		//1. 1~6 숫자 생성.
		//2. 생성된 값이 배열이 있는지 체크.
		//3. 없으면 추가한다.
		//4. 배열의 값이 다 저장되면 종료.
		for(int i=0; i<numbers.length; i++) {
			boolean exist = false;
			int no = 1+ (int)(Math.random()*6+1);
			for(int j=0; j<i; j++) {
				if(numbers[j]==no)
					exist = true;
				}
			if(exist){
				i--;
				continue;
			}
			numbers[i]=no;
				
					
			
			
			
				
		}
		
	
		
	}//end of main

}//end of class
