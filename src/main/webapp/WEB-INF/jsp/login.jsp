<%@ page language="java" trimDirectiveWhitespaces="true"
    contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<!-- <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet" media="screen" /> -->
<!-- <link href="<c:url value="/resources/css/core.css" />" rel="stylesheet" media="screen" /> -->
  <title>ログイン画面</title>
</head>

<body>
  <div class="container">
    <form:form modelAttribute="loginDto" action="login" method="POST">
      メールアドレスとパスワードを入力してください。<br>
      <form:input path="mailAddress" />
      <!-- <form:errors path="mailAddress" class="text-error"/><br> -->
      <form:password path="password" />
      <!-- <form:errors path="password" class="text-error"/><br> -->
      <input type="submit" value="送信" />
    </form:form>
  </div>
</body>
</html>