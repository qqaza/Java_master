package P20231205;

public class InOutExe {
private InOut[]inouts;
//판매 구매 재고
InOutExe(){
	inouts = new InOut[100];
	inouts[0]=new InOut("p001", "yyyy-MM-dd", 0, "(개)");
	inouts[1]=new InOut("p002", "yyyy-MM-dd", 0, "(개)");
	inouts[2]=new InOut("n001", "yyyy-MM-dd", 0, "(개)");
	inouts[3]=new InOut("n002", "yyyy-MM-dd", 0, "(개)");
}
	boolean addInOut(InOut io) {
		for(int i=0; i<inouts.length;i++) {
			if(inouts[i]==null) {
				inouts[i]=io;
				return true;
			}
		}
		return false;
	}
	InOut[]getInOutList(){
		return inouts;
	}
	

}//end of class
