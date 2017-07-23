<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="<spring:url value='/resources/bootstrap/css/bootstrap.css'/>" type="text/css" rel="stylesheet" />
	<link href="<spring:url value='/resources/css/main.css'/>" type="text/css" rel="stylesheet">
	<link href="<spring:url value='/resources/css/jquery.countdownTimer.css'/>" type="text/css" rel="stylesheet">
	
	<title>Deal-With-It</title>
</head>
<body>

<header class="headerBgImage">
	<div class="container">
		<h1 class="siteName"><a  href="bids">DEAL WITH IT!</a></h1>
		<br>
		<a class="headerLinks" href="login">Customer Login | </a>
		<a class="headerLinks" href="list">Customer List | </a>
		<a class="headerLinks" href="register">Register | </a>
		<a class="headerLinks" href="dashboard">Dashboard | </a>
	</div>
</header>
<br>



<footer class="footer navbar-fixed-bottom">
	<a class="headerLinks" href="login">Customer Login </a><br>
	<a class="headerLinks" href="list">Customer List </a><br>
	<a class="headerLinks" href="register">Register </a><br>
	<a class="headerLinks" href="dashboard">Bids Page </a><br>
</footer>
</body>
<script src="<spring:url value='/resources/js/jquery-2.0.3.js'/>"></script>
<script src="<spring:url value='/resources/bootstrap/js/bootstrap.min.js'/>"></script>
<script src="<spring:url value='/resources/js/script.js'/>"></script>
<script src="<spring:url value='/resources/js/jquery.countdownTimer.min.js'/>"></script>
</html>
