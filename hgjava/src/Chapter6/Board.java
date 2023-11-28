package Chapter6;

public class Board {
 int num; //게시글번호
 String title; // 제목
 String name; //작성자
 String memo; // 내용
 int time; //작성일시
 
 void showInfo() {
	 System.out.println("번호는 "+ num + "제목은 " + title + "작성자는 " + name + "내용은 " + memo + "작성일지는 " + time + "입니다.");
 }
Board(int num,  String title, String name, String memo, int time){
	this.num = num;
	this.title = title;
	this.name = name;
	this.memo = memo;
	this.time = time;
	
}
	
}

