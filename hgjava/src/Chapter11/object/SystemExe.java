package Chapter11.object;

public class SystemExe {

	public static void main(String[] args) {
//System: 1970년 1월1일 0시.
		//1000*60*60*24 = 하루를 기준
		long dayCnt = 1000*60*60*24*365;
		long cur = System.currentTimeMillis(); //현재시점의 Date
		System.out.println(cur / dayCnt);
		
		long start = System.currentTimeMillis();
		long sum=0;
		for(int i=1; i<100000; i++) {
			sum += i;
		}
		System.out.println("누적합계: "+ sum);
		long end = System.currentTimeMillis();
		System.out.println("걸린시간: "+ (end - start));
	}

}
