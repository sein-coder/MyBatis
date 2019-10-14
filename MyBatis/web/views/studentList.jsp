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
	<form action="${path }/studentSearchName" method="post">
		<input type="text" name="name"/>
		<input type="text" name="phone" />
		<input type="submit" value="찾기"/>
	</form>

	<c:if test="${ not empty list }">
		<table>
			<tr>
				<th>학생번호</th>
				<th>학생이름</th>
				<th>학생전화번호</th>
				<th>학생이메일</th>
				<th>학생주소</th>
			<tr>
			<c:forEach var="s" items="${ list }">
				<tr>
					<td><c:out value="${s.studentNo }" /></td>
					<td><c:out value="${s.studentName }" /></td>
					<td><c:out value="${s.studentTel }" /></td>
					<td><c:out value="${s.studentEmail }" /></td>
					<td><c:out value="${s.studentAddr }" /></td>
				</tr>			
			</c:forEach>
		</table>	
	</c:if>
	
	<!-- map으로 처리하기 -->
	<c:if test="${ not empty list2 }">
		<table>
			<tr>
				<th>학생번호</th>
				<th>학생이름</th>
				<th>학생전화번호</th>
				<th>학생이메일</th>
				<th>학생주소</th>
			<tr>
			<c:forEach var="s" items="${ list2 }">
				<tr>
					<td><c:out value='${s["STUDENT_NO"] }'/></td>
					<td><c:out value='${s["STUDENT_NAME"] }'/></td>
					<td><c:out value='${s["STUDENT_TEL"] }'/></td>
					<td><c:out value='${s["STUDENT_EMAIL"] }'/></td>
					<td><c:out value='${s["STUDENT_ADDR"] }'/></td>
				</tr>			
			</c:forEach>
		</table>	
	</c:if>

</body>
</html>