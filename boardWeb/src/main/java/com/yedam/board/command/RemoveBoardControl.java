package com.yedam.board.command;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.board.service.BoardService;
import com.yedam.board.serviceImpl.BoardServiceMybatis;
import com.yedam.common.Control;

public class RemoveBoardControl implements Control {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		// param("bno") - 삭제 - 목록.
		String bno = req.getParameter("bno");
		BoardService svc = new BoardServiceMybatis();
		
		if(svc.remBoard(Integer.parseInt(bno))) {
			try {
				resp.sendRedirect("boardList.do");
			}catch(IOException e) {
				e.printStackTrace();
			}
		}else {
			try {
				resp.sendRedirect("getBoard.do?bno=" + bno);
			}catch(IOException e) {
				e.printStackTrace();
			}
		}

//			
	}//end of execute

}//end of class
