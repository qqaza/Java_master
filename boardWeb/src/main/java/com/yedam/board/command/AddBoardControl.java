package com.yedam.board.command;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.board.service.BoardService;
import com.yedam.board.serviceImpl.BoardServiceMybatis;
import com.yedam.board.vo.BoardVO;
import com.yedam.common.Control;

public class AddBoardControl implements Control {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		// param(3개), db insert, 목록 페이지.

		String title = req.getParameter("title");
		String content = req.getParameter("content");
		String writer = req.getParameter("writer");
		BoardVO vo = new BoardVO();
		BoardService svc = new BoardServiceMybatis();
		vo.setTitle(title);
		vo.setContent(content);
		vo.setWriter(writer);
		// svc : addBoard()
		boolean add = svc.addBoard(vo);
		if (add) {
			try {
				resp.sendRedirect("boardList.do");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			try {
				resp.sendRedirect("boarForm.do");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}// execute

}
