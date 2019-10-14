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
	<h2>학생등록</h2>

	<form action="${path }/inputAllEnd" method="post">
		<table>
			<tr>
				<td>이름</td>
				<td>		
					<input type="text" name="studentName" />
				</td>
			</tr>
			<tr>
				<td>전화번호</td>
				<td>		
					<input type="text" name="studentTel" />
				</td>
			</tr>
			<tr>
				<td>이메일</td>
				<td>		
					<input type="email" name="studentEmail" />
				</td>
			</tr>
			<tr>
				<td>주소</td>
				<td>		
					<input type="text" name="studentAddr" />
				</td>
			</tr>
			<tr>
				<td colspan="2">		
					<input type="submit" value="등록" />
				</td>
			</tr>
		</table>		
	</form>
</body>
</html>