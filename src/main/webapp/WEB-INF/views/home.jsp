<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
 	<meta name="viewport" content="width=device-width, initial-scale=1">
   	<c:import url="./template/common_css.jsp"></c:import>
</head>
<body>
 <!-- 서버 내부 주소, 상대 경로  -->
  <c:import url="./template/header.jsp"></c:import>
 <div class="container-fluid-magin-5">

      <div class= "container-fluid">
		  <div class= "row col-md-6 offset-md-3">
		  	<div id="carouselExample" class="carousel slide">
		  <div class="carousel-inner">
		    <div class="carousel-item active">
		    <img src="/resources/images/naver.jpg" class="img-fluid" alt="...">
		    </div>
<P>  The time on the server is ${serverTime}. </P>

</body>
</html>
