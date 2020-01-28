<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>index.jsp 파일</title>
	<link href="/index_jsp.css" rel="stylesheet">
</head>
<body>
	<div class="wrapper">
		<div class="header">
			<ul>
				<li class="brand"><h1>ComicBoard</h1></li>
				<li class="menu"><h2><a class="pick" href="/">Home</a></h2></li>
				<li class="menu"><h2><a href="./books.html">HTML 게시판</a></h2></li>
				<li class="menu"><h2><a href="./books">JSP 게시판</a></h2></li>
				<li class="user"><h2><a href="./login.html">Login</a></h2></li>
				<li class="user"><h2><a href="./join.html">Join</a></h2></li>
			</ul>
		</div>
		<div class="middle">
			<ul>
				<li>
					<div class="html">
						<h1>HTML 게시판 바로가기</h1>
						<button type="button" onclick="location.href='./books.html'">바로가기</button>
					</div>
				</li>
				<li>
					<div class="jsp">
						<h1>JSP 게시판 바로가기</h1>
						<button type="button" onclick="location.href='./books'">바로가기</button>
					</div>
				</li>
			</ul>
			<ul>
				<li>
					<div class="write">
						<h1>회원가입 바로가기</h1>
						<button type="button" onclick="location.href='./join.html'">바로가기</button>
					</div>
				</li>
				<li>
					<div class="login">
						<h1>로그인 바로가기</h1>
						<button type="button" onclick="location.href='./login.html'">바로가기</button>
					</div>
				</li>
			</ul>
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