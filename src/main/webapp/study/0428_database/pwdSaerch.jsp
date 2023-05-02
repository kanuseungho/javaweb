<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  <c:set var="ctp" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>title</title>
  <jsp:include page="/include/bs4.jsp" />
</head>
<body>
<p><br/></p>
<div class="container">
  <form name="myform" method="post" action="/database/">
  	<table border="1"> 
  		<tr>
  			<td><input type="text" name="mid" placeholder="아이디를 입력하세요"></td>
  			<td><input type="text" name="name" placeholder="이름을 입력하세요"></td>
  		</tr>
  		<td><input type="submit" value="비밀번호 찾기"></td>
  	</table>
  </form>
</div>
<p><br/></p>
</body>
</html>