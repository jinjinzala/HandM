<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../template/common_css.jsp"></c:import>
 <link rel="stylesheet" href="/resources/css/table.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
<link rel="stylesheet" href="../resources/css/table.css">
</head>
<body>
	<c:import url="../template/header.jsp"></c:import>
 <div class="container fluid my-5">
   <div class= "row mb-4 ">
   <h1 class="mb-2"> 게시글 추가 등록</h1>
	</div>
	
	<!-- 같은 add페이지로 가는데 이름이 같으니깐 메서드 형식인 post로 구분한다 -->
	<from class = "row g-3 ms-auto" action="./add" method="post" enctype="multipart/form-data">
	
		<div class ="col-12">
			<label for="boardTitle" class="form-label">게시판 제목 </label>
  			<input type="text" class="form-control" id="boardTitle" name="boardTitle">
 		</div>
 		<div class ="col-12">
			<label for="boardWriter" class="form-label">게시판 작성자 </label>
  			<input type="text" class="form-control" id="boardWriter" name="boardWriter">
 		</div>
 		<div class ="col-12">
			<label for="boardDate" class="form-label">작성날짜 </label>
  			<input type="date" class="form-control" id="boardDate" name="boardDate">
 		</div>
 		<div class ="col-12">
			<label for="boardTotal" class="form-label">0 </label>
  			<input type="text" class="form-control" id="boardTotal" name="boardTotal">
 		</div>
 			<div class="col-12">
    		<label for="files" class="form-label">이미지 첨부</label>
    		<input type="file" class="form-control" id="files" name="pic">
  		</div>
 		<div class ="col-12">
			<label for="boardContents" class="form-label">내용</label>
  			<input type="text" class="form-control" id="boardContents" name="boardContents">
 		</div>
 		
 		
 		
 		
 		
		<!-- <input type="text" name="boardTitle" placeholder="게시판 제목">
		<input type="text" name="boardWriter" placeholder="게시판 작성자">
		<input type="text" name="boardDate" placeholder="작성날짜">
		<input type="text" name="boardTotal" value="0">
 -->		<!-- 상세내용은 데이터의 양의 많으니깐 textarea 사용 -->
		<!-- <textarea rows="" cols="" name="boardContents" placeholder="게시판 내용" ></textarea> -->
		

	    <button type="submit" class="btn btn-primary">등록</button>

		
	</from>
	   </div>
   <c:import url="../template/common_js.jsp"></c:import>
</body>
</html>