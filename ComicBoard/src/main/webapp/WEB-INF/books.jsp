<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>books.jsp 파일</title>
	<link href="/books_jsp.css" rel="stylesheet">
</head>
<body>
	<div class="wrapper">
		<div class="header">
			<ul>
				<li class="brand"><h1>ComicBoard</h1></li>
				<li class="menu"><h2><a href="/">Home</a></h2></li>
				<li class="menu"><h2><a href="./books.html">HTML 게시판</a></h2></li>
				<li class="menu"><h2><a class="pick" href="./books">JSP 게시판</a></h2></li>
				<li class="user"><h2><a href="./login.html">Login</a></h2></li>
				<li class="user"><h2><a href="./join.html">Join</a></h2></li>
			</ul>
		</div>
		<div class="middle">
			<div class="board">
				<h1>JSP Books Page</h1>
				<table>
					<tr>
					<th>id</th>
					<th>genre</th>
					<th>title</th>
					<th>intro</th>
					<th>writer</th>
					<th>cnt</th>
					<th>insertUserID</th>
					<th>insertDate</th>
					<th>uploadUserID</th>
					<th>uploadDate</th>
					</tr>
					<c:forEach var="book" items="${books}">
						<tr>
							<td>${book.board_ID }</td>
							<td>${book.board_Genre}</td>
							<td>${book.board_Title }</td>
							<td>${book.board_Intro }</td>
							<td>${book.board_Writer }</td>
							<td>${book.board_CNT }</td>
							<td>${book.board_InsertUserID }</td>
							<td>${book.board_InsertDate }</td>
							<td>${book.board_UploadUserID }</td>
							<td>${book.board_UploadDate }</td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
		<div class="footer">
			<ul>
				<li><h1><a href="https://cafe.naver.com/paranhrdschool">PARAN</a></h1></li>
				<li><h1>ComicBoard</h1></li>
				<li><h1>Phone : (061) 746-7000</h1></li>
			</ul>
		</div>
	</div>
</body>
</html>