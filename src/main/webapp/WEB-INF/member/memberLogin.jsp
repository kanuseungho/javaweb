<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  <c:set var="ctp" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>title</title>
  <jsp:include page="/include/bs4.jsp" />
</head>
<body>
<jsp:include page="/include/header.jsp" />
<p><br/></p>
<div class="container">
	<div class="modal-dialog">
		<div class="modal-content p-3">
		   <h2 class="text-center">회원로그인</h2>
		   <p class="text-center">회원 아이디와 비밀번호를 입력해주세여</p>
		  <form name="myform" method="post" action="${ctp}/MemberInputOk.mem" class="was-validated">
		    <div class="form-group">
		      <label for="mid">회원 아이디</label> <!--아이디에 쿠키로 꺼내주어야함  -->
		      <input type="text" class="form-control" name="mid" id="mid" value="${mid}" placeholder="아이디를 입력해주세요"  required autofocus/>
		      <div class="valid-feedback">Ok!!!</div>
		      <div class="invalid-feedback">아이디를을 입력해 주세요.</div>
		    </div>
		    <div class="form-group">
		      <label for="pwd">비밀번호</label>
		      <input type="password" class="form-control" name="pwd" id="pwd" placeholder="비밀번호를 입력해주세요" required="required" />
		      <div class="valid-feedback">Ok!!!</div>
		      <div class="invalid-feedback">비밀번호를 입력해 주세요.</div>
		    </div>
		    <div class="form-group text-center">
		    	<button type="submit" class="btn btn-primary mr-1">로그인</button>
		    	<button type="reset" class="btn btn-warning mr-1">다시입력</button>
		    	<button type="button" onclick="location.href='${ctp}/';" class="btn btn-danger mr-1">돌아가기</button>
		    	<button type="button" onclick="location.href='${ctp}/MemberJoin.mem';" class="btn btn-success">회원가입</button>
		    </div>
		  </form>
	  </div>
	 </div>
</div>
<div class="row text-center" style="font-size:15px;">
	<span class="col"><input type="checkbox" name="idSave" checked="checked"/>아이디 저장</span>
	<span class="col"></span>
		[<a href="#">아이디찾기</a>]	<!-- 이메일로찾기 -->
		[<a href="#">비밀번호찾기</a>] <!-- 아이디랑이메일 -->
</div>
<p><br/></p>
<jsp:include page="/include/footer.jsp" />
</body>
</html>