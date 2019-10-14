<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"  %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p><a href="${path }/firstMybatis">첫 마이바티스(입력,insert)</a></p>
	
	<p><a href="${path }/nameInput">이름입력 후 대입</a></p>
	
	<p><a href="${path }/inputAll">학생 입력</a></p>
	
	<p><a href="${path }/deleteStudent">학생 삭제</a></p>
	
	<p><a href="${path }/selectCount">전체 학생 수 조회</a></p>
	
	<p><a href="${path }/selectList">전체 학생 조회</a></p>
	
</body>
</html>
