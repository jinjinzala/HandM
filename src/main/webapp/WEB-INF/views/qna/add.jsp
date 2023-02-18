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
	
	<h1> 게시판 등록 페이지</h1>
	<!-- 같은 add페이지로 가는데 이름이 같으니깐 메서드 형식인 post로 구분한다 -->
	<from action="./add" method="post">
	
		<input type="text" name="boardTitle" placeholder="게시판 제목">
		<input type="text" name="boardWriter" placeholder="게시판 작성자">
		<input type="text" name="boardDate" placeholder="작성날짜">
		<input type="text" name="boardTotal" value="0">
		<!-- 상세내용은 데이터의 양의 많으니깐 textarea 사용 -->
		<textarea rows="" cols="" name="boardContents" placeholder="게시판 내용" ></textarea>
		
		<input type="submit" value="등록">
	</from>
	
	
</body>
</html>