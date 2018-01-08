<%@ page language="java" trimDirectiveWhitespaces="true"
    contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<!-- <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet" media="screen" /> -->
<!-- <link href="<c:url value="/resources/css/core.css" />" rel="stylesheet" media="screen" /> -->
  <title>メニュー画面</title>
</head>

<body>
  <div class="container">
    <c:out value="${name}" /> さん、こんにちは。
  </div>
</body>
</html>