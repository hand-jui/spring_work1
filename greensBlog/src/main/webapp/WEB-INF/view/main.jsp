<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@48,400,0,0" />
<style type="text/css">
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}

body {
	margin: auto;
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
	display: flex;
}

.whole {
	width: 1000px;
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
}

header {
	width: 1000px;
	display: flex;
	justify-content: space-between;
	align-items: center;
	background-image: url('/image/title.jpg');
	margin-bottom: 30px;
	padding: 10px;
}

.header_title {
	display: flex;
	margin-left: 30px;
}

.sns img {
	height: 35px;
	margin: 5px;
}

.sns {
	margin-right: 30px;
}

a {
	text-decoration: none;
	color: black;
}

.container {
	display: flex;
	align-items: flex-start;
	margin-bottom: 30px;
}

.side_menu {
	width: 170px;
	border: 2px solid #ccc;
	border-radius: 15px;
	margin: 10px;
}

.side_menu_title {
	display: flex;
	justify-content: space-between;
	align-items: flex-start;
	margin: 10px;
}

.side_menu ul {
	margin: 10px;
}

.side_menu ul li {
	list-style: none;
}

.side_menu ul li a {
	text-decoration: none;
	color: black;
}

.side_menu ul li a:hover {
	font-weight: bold;
}

.main_container {
	width: 730px;
	display: flex;
	flex-direction: column;
}

.main_title {
	display: flex;
	justify-content: space-between;
	align-items: flex-start;
	margin: 10px;
}

.main {
	display: flex;
	flex-direction: column;
	align-items: center;
}

.row {
	display: flex;
	margin-bottom: 30px;
}

.content {
	margin: 15px 15px;
}

.content img {
	width: 150px;
	height: 150px;
}

.content_title {
	margin-top: 5px;
	height: 50px;
}

.page_nation {
	margin-top: 10px;
}

.page_nation ul {
	display: flex;
}

.page_nation ul li {
	list-style: none;
}

.page_nation ul li a {
	text-decoration: none;
	color: black;
	margin: 5px;
}

.page_nation ul li a:hover {
	font-weight: bold;
	color: aqua;
}
</style>
</head>
<body>

	<div class="whole">
		<header>
			<div class="header_title">
				<h1>Green's Blog</h1>
				<span class="material-symbols-outlined"><a href="#"> settings </a></span>
			</div>
			<div class="sns">
				<a href="#"><img alt="" src="/image/insta.png"></a> <a href="#"><img alt="" src="/image/youtube.png"></a>
			</div>
		</header>

		<section class="container">

			<nav class="side_menu">
				<div class="side_menu_title">
					<b>전체보기</b> <span class="material-symbols-outlined"><a href="#"> settings </a></span>
				</div>

				<ul>
					<li><a href="#">Python (12)</a></li>
					<li><a href="#">Java (2)</a></li>
					<li><a href="#">Ios (8)</a></li>
					<li><a href="#">소프트웨어 자료 (26)</a></li>
					<li><a href="#">자료구조 (8)</a></li>
					<li><a href="#">리눅스 (8)</a></li>
					<li><a href="#">Git (4)</a></li>
					<li><a href="#">자기계발 (3)</a></li>
					<li><a href="#">경영전략 (20)</a></li>
					<li><a href="#">리더쉽 (7)</a></li>
				</ul>
			</nav>

			<div class="main_container">

				<div class="main_title">
					<p>
						<b>경영전략 </b><b style="color: aqua">20</b>
					</p>
					<span class="material-symbols-outlined"><a href="#"> edit_square </a></span>
				</div>
				<div class="main">
					<div class="row">
						<div class="content">
							<a href="#"><img alt="" src="/image/curby.jpg"></a>
							<div class="content_title">
								<p>
									<a href="#"><b>선생님,, 커비하고싶어요,,</b></a>
								</p>
							</div>

							<div class="edit_date">
								<p>2023.04.12</p>
							</div>
						</div>
						<div class="content">
							<a href="#"><img alt="" src="/image/ssap.jpg"></a>
							<div class="content_title">
								<p>
									<a href="#"><b>삽가능</b></a>
								</p>
							</div>

							<div class="edit_date">
								<p>2023.04.12</p>
							</div>
						</div>
						<div class="content">
							<a href="#"><img alt="" src="/image/nani.jpg"></a>
							<div class="content_title">
								<p>
									<a href="#"><b>??????</b></a>
								</p>
							</div>

							<div class="edit_date">
								<p>2023.04.12</p>
							</div>
						</div>
						<div class="content">
							<a href="#"><img alt="" src="/image/jjan.jpg"></a>
							<div class="content_title">
								<p>
									<a href="#"><b>맥도날드 사과파이,,</b></a>
								</p>
							</div>

							<div class="edit_date">
								<p>2023.04.12</p>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="content">
							<a href="#"> <img alt="" src="/image/mind.jpg"></a>
							<div class="content_title">
								<p>
									<a href="#"><b>뭐시 중헌디</b></a>
								</p>
							</div>

							<div class="edit_date">
								<p>2023.04.12</p>
							</div>
						</div>
						<div class="content">
							<a href="#"><img alt="" src="/image/or.jpg"></a>
							<div class="content_title">
								<p>
									<a href="#"><b>사물놀이</b></a>
								</p>
							</div>

							<div class="edit_date">
								<p>2023.04.12</p>
							</div>
						</div>
						<div class="content">
							<a href="#"><img alt="" src="/image/wawa.jpg"></a>
							<div class="content_title">
								<p>
									<a href="#"><b>치와와</b></a>
								</p>
							</div>

							<div class="edit_date">
								<p>2023.04.12</p>
							</div>
						</div>
						<div class="content">
							<a href="#"><img alt="" src="/image/yes.jpg"></a>
							<div class="content_title">
								<p>
									<a href="#"><b>집가고싶닿</b></a>
								</p>
							</div>

							<div class="edit_date">
								<p>2023.04.12</p>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="content">
							<a href="#"><img alt="" src="/image/yot.jpg"></a>
							<div class="content_title">
								<p>
									<a href="#"><b>슨생님 커비시켜줘 욛</b></a>
								</p>
							</div>

							<div class="edit_date">
								<p>2023.04.12</p>
							</div>
						</div>
						<div class="content">
							<a href="#"><img alt="" src="/image/nosa.jpg"></a>
							<div class="content_title">
								<p>
									<a href="#"><b>난 술 모대</b></a>
								</p>
							</div>

							<div class="edit_date">
								<p>2023.04.12</p>
							</div>
						</div>
						<div class="content">
							<a href="#"><img alt="" src="/image/money.jpg"></a>
							<div class="content_title">
								<p>
									<a href="#"><b>흐즈므르</b></a>
								</p>
							</div>

							<div class="edit_date">
								<p>2023.04.12</p>
							</div>
						</div>
						<div class="content">
							<a href="#"><img alt="" src="/image/doll.jpg"></a>
							<div class="content_title">
								<p>
									<a href="#"><b>맥도날드 사과파이,,</b></a>
								</p>
							</div>

							<div class="edit_date">
								<p>2023.04.12</p>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="content">
							<a href="#"><img alt="" src="/image/broham.jpg"></a>
							<div class="content_title">
								<p>
									<a href="#"><b>행보케 보인다 너,,</b></a>
								</p>
							</div>

							<div class="edit_date">
								<p>2023.04.12</p>
							</div>
						</div>
						<div class="content">
							<a href="#"><img alt="" src="/image/cute.jpg"></a>
							<div class="content_title">
								<p>
									<a href="#"><b>쏘 큩</b></a>
								</p>
							</div>

							<div class="edit_date">
								<p>2023.04.12</p>
							</div>
						</div>
						<div class="content">
							<a href="#"><img alt="" src="/image/ham.jpg"></a>
							<div class="content_title">
								<p>
									<a href="#"><b>빠져라</b></a>
								</p>
							</div>

							<div class="edit_date">
								<p>2023.04.12</p>
							</div>
						</div>
						<div class="content">
							<a href="#"><img alt="" src="/image/yap.jpg"></a>
							<div class="content_title">
								<p>
									<a href="#"><b>쪼그매져라,,</b></a>
								</p>
							</div>

							<div class="edit_date">
								<p>2023.04.12</p>
							</div>
						</div>
					</div>

					<div class="page_nation">
						<ul>
							<li><a href="#"> < 이전</a></li>
							<li><a href="#">1</a></li>
							<li><a href="#">2</a></li>
							<li><a href="#">3</a></li>
							<li><a href="#">4</a></li>
							<li><a href="#">5</a></li>
							<li><a href="#">6</a></li>
							<li><a href="#">7</a></li>
							<li><a href="#">8</a></li>
							<li><a href="#">9</a></li>
							<li><a href="#">10</a></li>
							<li><a href="#">다음 > </a></li>
						</ul>
					</div>
				</div>
			</div>
		</section>
	</div>
</body>
</html>