<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Oops</title>
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
    <h1>${errorMsg}</h1>
</div>

<footer></footer>

</body>
</html>
