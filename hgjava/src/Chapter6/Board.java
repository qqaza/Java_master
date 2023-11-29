package Chapter6;

public class Board {
 int num; //게시글번호
 String title; // 제목
 String name; //작성자
 String memo; // 내용
 String time; //작성일시
 
 void showInfo() {
	 System.out.println("번호는 "+ num + "제목은 " + title + "작성자는 " + name + "내용은 " + memo + "작성일지는 " + time + "입니다.");
 }


	//나도 변경했습니다.


void SetNum(int num) {
	this.num = num;
}
void SetTitle(String title) {
	this.title = title;
}
void setName(String name) {
	this.name = name;
}
void SetMemo(String memo) {
	this.memo = memo;
}
void SetTime(String time) {
	this.time = time;
}

int getNum() {
	return num;
}
String getTitle() {
	return title;
}
String getName() {
	return name;
}
String getMemo() {
	return memo;
}
String getTime() {
	return time;
}
Board(int num,  String title, String name, String memo, String time){
	this.num = num;
	this.title = title;
	this.name = name;
	this.memo = memo;
	this.time = time;
}
}//end of class

