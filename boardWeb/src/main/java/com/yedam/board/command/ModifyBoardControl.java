package com.yedam.board.command;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.board.service.BoardService;
import com.yedam.board.serviceImpl.BoardServiceMybatis;
import com.yedam.board.vo.BoardVO;
import com.yedam.common.Control;

public class ModifyBoardControl implements Control {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		// 글번호 조회.
				String bno = req.getParameter("bno");
				String content = req.getParameter("content");

				BoardService svc = new BoardServiceMybatis();
				BoardVO vo = new BoardVO();
				vo.setContent(content);
				vo.setBoardNo(Integer.parseInt(bno));
				// 페이지 이동.
				if(svc.modBoard(vo)) {
					try {
						resp.sendRedirect("boardList.do");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else {
					try {
						resp.sendRedirect("boardForm.do");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}


	}

}
