package com.yedam.board.command;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.yedam.board.service.BoardService;
import com.yedam.board.serviceImpl.BoardServiceMybatis;
import com.yedam.board.vo.BoardVO;
import com.yedam.common.Control;

public class AddBoardControl implements Control {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		// param(3개), db insert, 목록 페이지.
		//get요청일때/ post요청일때..
		if(req.getMethod().equals("GET")) {
			
		

		String title = req.getParameter("title");
		String content = req.getParameter("content");
		String writer = req.getParameter("writer");
		BoardService svc = new BoardServiceMybatis();
		BoardVO vo = new BoardVO();
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
	}else if(req.getMethod().equals("POST")) {
		//파일업로드 포함.
		String saveLoc = req.getServletContext().getRealPath("images");
		int maxSize = 1024 * 1024 * 5;
		MultipartRequest mr = null;
		try {
			mr = new MultipartRequest(req, saveLoc, maxSize, "utf-8",new DefaultFileRenamePolicy() );
			String title = mr.getParameter("title");
			String content = mr.getParameter("content");
			String writer = mr.getParameter("writer");
			String image = mr.getFilesystemName("image");
			
			BoardVO vo = new BoardVO();
			vo.setTitle(title);
			vo.setContent(content);
			vo.setWriter(writer);
			vo.setImage(image);
			// svc : addBoard()
			BoardService svc = new BoardServiceMybatis();
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
			
		} catch (IOException e) {
			e.printStackTrace();
		} //1.request 2. saveLoc 3. maxSize 4. 인코딩 5.리네임정책
	}

	}// execute

}
