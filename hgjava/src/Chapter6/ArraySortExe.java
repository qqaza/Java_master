package Chapter6;

public class ArraySortExe {
	public static void main(String[] args) {
		
		int[] numAry = { 2, 1, 5, 4, 3 };
		
		//정렬작업.
		int temp =0;
		for(int j=0; j<numAry.length -1; j++) {
			//위치변경 작업
		for(int i=0; i<numAry.length -1; i++) {
			if(numAry[i] > numAry[i+1]) {
				temp = numAry[i];
				numAry[i] = numAry[i+1];
				numAry[i+1] = temp;
			}//if
		}//for
	}//for(j)
		for(int num : numAry)
			System.out.println(num);
	}//main
		
		

		
}//class