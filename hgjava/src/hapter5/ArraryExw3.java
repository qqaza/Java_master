package hapter5;

public class ArraryExw3 {

	public static void main(String[] args) {
		String[] nameAry = {"ȫ�浿","��浿","�ڱ浿","Ȳ�浿","ȫ�浿"};
		
		String search = "ȫ�浿";
		int count = 0;
		//for�ݺ��� Ȱ��.
		for(int i = 0; i<nameAry.length; i++) {
			if(nameAry[i].equals(search)) {
				count++;
			}
		}
		
		System.out.println(search+"�� ��" + count + "�� �Դϴ�.");
		
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
