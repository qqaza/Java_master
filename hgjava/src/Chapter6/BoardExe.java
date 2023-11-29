package Chapter6;


import java.text.SimpleDateFormat;
import java.util.Date;

//저장소: boards
public class BoardExe {
	
	Board[]boards;
	BoardExe(){
		boards = new Board[100];
	}
	//초기값 생성.
	void initData() {
		boards[0] = new Board(1, "첫번째 글","user01","첫번째 글입력중입니다.");
		boards[1] = new Board(2, "두번째 글","user02","두번째 글입력중입니다.");
		boards[3] = new Board(4, "네번째 글","user04","네번째 글입력중입니다.");
		boards[4] = new Board(3, "세번째 글","user03","세번째 글입력중입니다.");
		boards[5] = new Board(3, "다섯번째 글","user05","다섯번째 글입력중입니다.");
		boards[6] = new Board(3, "여섯번째 글","user06","여섯번째 글입력중입니다.");
		boards[7] = new Board(3, "일곱번째 글","user07","일곱번째 글입력중입니다.");
		boards[8] = new Board(3, "여덟번째 글","user08","여덟번째 글입력중입니다.");
		
	}
	//등록. 글번호,제목,작성자,내용,작성일시 => 반환값: boolean.
	boolean addBoard(Board board) {
		for(int i=0; i<boards.length; i++) {
			if(boards[i] == null) {
				boards[i] = board;
				return true; //break; //반복문 종료.
			}//if
		}//for
		return false;
	}//boolean
	
	//목록. 반환값: 배열
	Board[] boardList() {
		//boards => 새로운 배열에 정렬된 값으로 변환.
		Board temp =null;
		for(int j=0; j<boards.length -1; j++) {
			//위치변경 작업
		for(int i=0; i<boards.length -1; i++) {
			if(boards[i]!=null && boards[i+1]!=null)
			if(boards[i].getNum() >boards[i+1].getNum()) {
				temp = boards[i];
				boards[i] = boards[i+1];
				boards[i+1] = temp;
			}//if
		}//for
	}//for(j)
		return boards;
}//end of boardList
	//배열, 페이지 => 페이지의 5건을 반환.
	Board[] pageList(Board[] ary, int page){
		Board[] resultAry = new Board[5];
		
		int start = (page -1) * 5;
		int end = page *5;
		int j =0;
		for(int i=0; i<ary.length; i++) {
			if(i>= start && i<end) {
				resultAry[j++] = ary[i];
				
			}//end if
		}//end for
		return resultAry;
	}//pageList
	
	//단건조회. 매개변수: 글번호, 반환값: Board
	Board getBoard(int num) {
		for(int i=0; i<boards.length; i++) {
			if(boards[i] != null && boards[i].getNum()==num) {
				return boards[i];
			}//if
		}//for
		return null;
	}
	// 신규번호생성: 현재글번호+1
	int getSequnce() {
		int seqNo = 1;
		// 배열에서 글번호의 max가져오기.
		int max =0;
		for(int i=0;i<boards.length; i++) {
			if(boards[i] != null && boards[i].getNum()>max) {
				max = boards[i].getNum();
			}//if
		}//for
		seqNo = max + 1;
		return seqNo;
	}
	//수정.매개값(글번호, 내용) => boolean.
	boolean modBoard(int no, String content) {
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		for(int i = 0; i<boards.length; i++) {
			if(boards[i] != null && boards[i].getNum()==no) {
				boards[i].SetMemo(content);
				boards[i].SetTime(sdf.format(today));
				return true;
			}//if
		}//for
		return false;
	}//boolean
	
	//삭제. 매개값(글번호) => boolean.
	boolean remBoard(int no) {
		for(int i=0; i<boards.length; i++) {
			if(no == boards[i].getNum()) {
				boards[i] = null;
				return true;
			}//if
		}//for
		return false;
	}
	
	//사용자가 해당글번호의 수정, 삭제권한 체크 => boolean.
	boolean CheckResponsibility(String id, int no) {
		for(int i=0;i<boards.length; i++) {
			if(boards[i] != null && boards[i].getNum()==no && boards[i].getName().equals(id)) {
				return true;
			}//if
		}//for
		return false;
	}
	
	//게시글을 담고 있는 배열에서 값이 있는 건수를 반환.
	int getBoardCount() {
		int realCnt = 0;
		for(int i =0; i<boards.length; i++){
		if(boards[i]!=null) {
			realCnt++;
		}//if
			
		}//for
		return realCnt;
	}// getBoardCount
}// end of class
