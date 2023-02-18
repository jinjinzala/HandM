<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../template/common_css.jsp"></c:import>
<link rel="stylesheet" href="../resources/css/table.css">
</head>
<body>
	<c:import url="../template/header.jsp"></c:import>
 	<div class="row mb-4 border-bottom border-dark">
	<h1 class="col-md-7 mx-auto text-center pb-4">Qnalistpage</h1>
	</div>


<div class="row col-md-7 mx-auto">
	<h1>디테일 페이지</h1>
	<!-- boardnum이 존재할때 -->
    <c:if test = "${not empty dto}">
	 <!-- pagesocope는 생략가능 var=dto는 get뒤에 있는 변수명 똑같이 적어주기-->
	 <h3>게시판 번호 : ${dto.boardNum}</h3>
	 <h3>게시판 제목 : ${dto.boardTitle}</h3>
	 <h3>글쓴이 : ${dto.boardWriter}</h3>
	  <h3>게시판 제목 : ${dto.boardContents}</h3>
	 <h3>작성 날짜 :${dto.boardDate}</h3>
	 <h3>조회수 : ${dto.boardTotal}</h3>
	 <a href="./delete?boardNum=${dto.boardNum}">삭제하기</a>
	</c:if>
	
	<!-- boardnum이 존재하지 않을떄 -->
	<c:if test = "${empty dto}">
	 <h3>해당 board num은 존재하지 않습니다 db를 확인해주씹시오</h3>
	</c:if>
	
	
	<!-- 시간이 있을때 여기 예븐 버튼을 넣어주자~ -->
	<a href="./update?boardNum=${dto.boardNum}">게시판수정</a>
	<a href="./list">목록으로</a>
	
</div>

</body>
</html>