<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<from action="./update" method="post">
	
		<input type="text" name="boardTitle" value="${dto.boardTitle}"  placeholder="게시판 제목">
		<input type="text" name="boardWriter" value="${dto.boardWriter}"  placeholder="게시판 작성자">
		<input type="text" name="boardDate"  value="${dto.boardDate}" placeholder="작성날짜">
		<input type="text" name="boardTotal" value="0">
		<!-- 상세내용은 데이터의 양의 많으니깐 textarea 사용 textarea는 value를 가운데에 넣어줘야한다 -->
		<textarea rows="" cols="" name="boardContents" placeholder="게시판 내용" >"${dto.boardContents}"</textarea>
		
		<input type="submit" value="수정">
	</from>
</body>
</html>