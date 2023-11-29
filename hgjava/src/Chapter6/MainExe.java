package Chapter6;

public class MainExe {
public static void main(String[] args) {
	
	String[] strs = {"1asd","2asd1","3asd3","4asd2","5asd44","6asd5","7asd6","8asd9"};
	int page = 1;
	int stars = (page -1) * 5;
	int end = page *5;
	for(int i=0; i<strs.length; i++) {
		if(i>= stars && i<end) {
			System.out.println(strs[i]);
			
		}//end if
	}//end for
	
	int cnt = 36;
	
	int totalPage = (int)Math.ceil(cnt/5.0);
	System.out.println(totalPage);
	
	for(int i=1;i<=totalPage; i++) {
		System.out.print(i + " ");
		
	}//for
}//end of main
}//end of class
