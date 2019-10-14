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
	<div id="student-container">
		<h3>학생정보검색</h3>
		<p>학생수는 <c:out value="${ count }"/>명입니다.</p>
		<form name="frm" action="${path }/selectOne">
			<table>
				<tr>
					<td>
						<input type="number" name="no">
					</td>
				</tr>
				<tr>
					<td>
						<input type="submit" value="조회">
					</td>
				</tr>
			</table>
			<!-- 조회된 결과 출력하기 EL/jstl이용하기 -->
		</form>
		<c:if test="${not empty s }">
		<table>
			<tr>
				<th>번호</th>
				<th>이름</th>
				<th>전화번호</th>
				<th>이메일</th>
				<th>주소</th>
				<th>등록일</th>
			</tr>
			<tr>
<%-- 				<td><c:out value="${s.studentNo }"/></td>
				<td><c:out value="${s.studentName }"/></td>
				<td><c:out value="${s.studentTel }"/></td>
				<td><c:out value="${s.studentEmail }"/></td>
				<td><c:out value="${s.studentAddr }"/></td>
				<td><fmt:formatDate value="${s.regDate }" pattern="yyyy년MM월dd일"/></td> --%>
				<td><c:out value="${s.STUDENT_NO }"/></td>
				<td><c:out value="${s.STUDENT_NAME }"/></td>
				<td><c:out value="${s.STUDENT_TEL }"/></td>
				<td><c:out value="${s.STUDENT_EMAIL }"/></td>
				<td><c:out value="${s.STUDENT_ADDR }"/></td>
				<td><fmt:formatDate value="${s.regDate }" pattern="yyyy년MM월dd일"/></td>
			</tr>
		</table>
		</c:if>
		<c:if test="${empty s }">
			<p>조회된 결과가 없습니다.</p>
		</c:if>		
	</div>
</body>
</html>