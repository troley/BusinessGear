<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Products</title>
    <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap/bootstrap.css"/>"/>
    <link rel="stylesheet" href="<c:url value="/resources/css/font-awesome/css/font-awesome.min.css"/>"/>
    <link rel="stylesheet" href="<c:url value="/resources/css/products_crud.css"/>"/>
</head>
<body>

<header class="container-fluid">
    <div class="brand">
        <h1><a href="${pageContext.request.contextPath}/" style="color: white;">BusinessGear <sup><i
                class="fa fa-copyright"></i></sup></a></h1>
    </div>
</header>

<div class="container body-container">


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

</body>
</html>
