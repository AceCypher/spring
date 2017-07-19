<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Deal-With-It</title>
<link href="<spring:url value='/css/main.css'/>" type="text/css"
    rel="stylesheet">
<link href="<spring:url value='/css/cust_register.css'/>" type="text/css"
    rel="stylesheet">

<link href="<spring:url value='/resources/bootstrap/css/bootstrap.css'/>" type="text/css"
    rel="stylesheet" />
</head>
<body>
    <div class="container">
        <div class="row centered-form">
        <div class="col-xl-12 col-md-8  col-sm-4 col-sm-offset-2 col-md-offset-4">
            <div class="panel panel-default">
                <div class="panel-heading">
                        <h3 class="panel-title">Please sign up for Deal-With-It <small>It's free!</small></h3>
                        </div>
                        <div class="panel-body">
                        <form:form modelAttribute="customer" method="post" role="form">
                            <div class="row">
                                <div class="col-xl-6 col-md-6 col-sm-6">
                                    <div class="form-group">
                                    <form:input path="name" class="form-control input-sm" placeholder="User Name" />
                                    <form:errors path="name" cssClass="error" class="form-control input-sm"  />
                                    </div>
                                </div>
                            </div>

                            <div class="form-group">
                                <form:input path="email" class="form-control input-sm" placeholder="Email Address" />
                                <form:errors path="email" cssClass="error"/>
                            </div>

                            <div class="row">
                                <div class="col-xl-6 col-md-6 col-sm-6">
                                    <div class="form-group">
                                        <form:password path="password" class="form-control input-sm" placeholder="Password" />
                                        <form:errors path="password" cssClass="error" class="form-control input-sm" />
                                    </div>
                                </div>
                                <div class="col-xl-6 col-md-6 col-sm-6">
                                    <div class="form-group">
                                        <input type="password" name="password_confirmation" id="password_confirmation" class="form-control input-sm" placeholder="Confirm Password">
                                    </div>
                                </div>
                            </div>

                            <input type="submit" value="Register" class="btn btn-info btn-block">

                        </form:form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>