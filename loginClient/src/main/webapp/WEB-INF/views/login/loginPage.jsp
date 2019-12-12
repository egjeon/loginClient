<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 페이지</title>
</head>
<body>
<form class="px-4 py-3" action="/login" method="post">
    아이디 : 
    <input type="text" class="form-control" name="loginId" placeholder="example">
    비밀번호 :
    <input type="password" class="form-control" name="loginPwd" placeholder="Password">
<br>
    <input name="${_csrf.parameterName}" type="hidden" value="${_csrf.token}"/>
    <button type="submit" class="btn btn-primary">Sign in</button>
</form>

</body>
</html>