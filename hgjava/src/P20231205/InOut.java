package P20231205;

import java.util.Date;

public class InOut {
	String pdcode;
	String pddate;
	int num;
	String buysell;
	
	void ShowInfo() {
		System.out.println("상품코드 "+ pdcode + "처리날짜 "+pddate+"수량 "+ num + "판(구)매 "+buysell);
	}
	void SetPdcode(String pdcode) {
		this.pdcode = pdcode;
	}
	void SetPddate(String pddate) {
		this.pddate=pddate;
	}
	void SetNum(int num) {
		this.num=num;
	}
	void SeyBuysell(String buysell) {
		this.buysell=buysell;
	}
	String getPdcode() {
		return pdcode;
	}
	String getPddate() {
		return pddate;
	}
	int getNum() {
		return num;
	}
	String getBuysell() {
		return buysell;
	}
	
	InOut(String pdcode, String pddate, int num, String buysell){
		this.pdcode=pdcode;
		this.pddate=pddate;
		this.num=num;
		this.buysell=buysell;
	}
	
	
	
	
}//end of class
