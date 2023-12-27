<%@page import="com.yedam.board.vo.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
	
	<jsp:include page="../layout/menu.jsp"/>
<jsp:include page="../layout/nav.jsp"/>



	<h3>수정화면</h3>
	<%
	BoardVO vo = (BoardVO) request.getAttribute("vo");
	%>
	<form action="modifyBoard.do">
		<input type="hidden" name="bno" value="${vo.boardNo }">
		<table class="table">
			<tbody>
				<tr>
					<td>글번호</td>
					<td colspan="3">"${vo.boardNo }"</td>
				</tr>
				<tr>
					<td>제목</td>
					<td colspan="3">"${vo.title }"</td>

				</tr>
				<tr>
					<td>내용</td><td colspan="3"><textarea rows="4" cols="30" name="content"><%=vo.getContent()%></textarea></td>
				</tr>
				<tr>
					<td>작성자</td>
					<td colspan="3">"${vo.content }"</td>
				</tr>
				<tr>
					<td>작성일</td>
					<td>"${vo.writer }"</td>
					<td>조회수</td>
					<td>"${vo.clickCnt }"</td>
				</tr>
				<tr>
					<td>이미지</td>
					<td colspan="3"></td>
				</tr>
				<tr>
					<td colspan="4" align="center">
					<c:choose>
				<c:when test="${logName eq vo.writer }">
					<input type="submit" value="저장">
						<input type="reset" value="취소">
						</c:when>
				<c:otherwise>
				<input type="submit" value="저장">
						<input type="reset" value="취소">
						</c:otherwise>
				</c:choose>
						</td>
				</tr>
			</tbody>
		</table>
	</form>
	<br>
	<a href="boardList.do">글 목록으로 가기</a>
<jsp:include page="../layout/foot.jsp"/>