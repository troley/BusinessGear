<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Admin</title>
    <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap/bootstrap.css"/>"/>
    <link rel="stylesheet" href="<c:url value="/resources/css/font-awesome/css/font-awesome.min.css"/>"/>
    <link rel="stylesheet" href="<c:url value="/resources/css/admin.css"/>"/>
</head>
<body>

<header class="container-fluid">
    <div class="brand">
        <h1><a href="${pageContext.request.contextPath}/" style="color: white;">BusinessGear <sup><i
                class="fa fa-copyright"></i></sup></a></h1>
    </div>
</header>

<div class="container body-container">
    <div class="row">
        <div class="col-md-12" style="text-align: center;">
            <section>
                <f:form action="${pageContext.request.contextPath}/admin/login/verify" method="POST">
                    <h1>Log in</h1>
                    <hr />
                    <!--<div asp-validation-summary="All" class="text-danger"></div>-->
                    <div class="col-md-12 input-space">
                        <f:input class="default-bg-field" path="username"  name="Username" placeholder="Username" />
                        <br />
                        <span class="username-validation validation-text"></span>
                    </div>
                    <div class="col-md-12 input-space">
                        <f:input class="default-bg-field" type="password" path="password" placeholder="Password" />
                        <br />
                        <span class="pass-validation validation-text"></span>
                    </div>
                    <div class="col-md-12 input-space">
                        <input id="logInSubmit" type="submit" value="Log in" />
                    </div>
                </f:form>
            </section>
        </div>
    </div>
    <div class="push"></div>
</div>

<footer>
    <div class="container">
        <div class="row">
            <div class="col-md-4">
                <ul class="no-list-style">
                    <li><a href="#">Terms of Service</a></li>
                    <li><a href="#">Privacy Policy</a></li>
                </ul>
            </div>
            <div class="col-md-4">
                <ul class="no-list-style">
                    <li><a href="#">Contact</a></li>
                    <li><a href="#">About Us</a></li>
                    <li><a href="#">The Team</a></li>
                </ul>
            </div>
            <div class="col-md-4">
                <ul class="no-list-style">
                    <li><a href="#">Software Collection</a></li>
                </ul>
            </div>
        </div>
    </div>
</footer>


<script src="<c:url value="/resources/js/jquery-3.1.1.min.js"/>"></script>
<script src="<c:url value="/resources/js/angular.min.js"/>"></script>
<script src="<c:url value="/resources/js/site.js"/>"></script>
<script src="<c:url value="/resources/js/app.module.js"/>"></script>
<script src="<c:url value="/resources/js/products.controller.js"/>"></script>

</body>
</html>
