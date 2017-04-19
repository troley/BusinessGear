<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>${product.name}</title>

    <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap/bootstrap.css"/>"/>
    <link rel="stylesheet" href="<c:url value="/resources/css/font-awesome/css/font-awesome.min.css"/>"/>
    <link rel="stylesheet" href="<c:url value="/resources/css/collection.css"/>"/>

</head>
<body>

<header class="container-fluid">
    <div class="brand">
        <h1><a href="${pageContext.request.contextPath}/" style="color: white;">BusinessGear <sup><i
                class="fa fa-copyright"></i></sup></a></h1>
    </div>
</header>

<section class="main">
    <div class="container body-container">
        <div class="row">
            <div class="breadcrumbs">
                <a href="${pageContext.request.contextPath}/home">Home&ensp;<i class="fa fa-angle-double-right"></i></a>
                <a href="${pageContext.request.contextPath}/products/collection">Collection&ensp;<i
                        class="fa fa-angle-double-right"></i></a>
                <span>${product.name}, ${product.id}</span>
            </div>
        </div>
        <div class="row">
            <div class="back-to-collection">
                <h2><a href="${pageContext.request.contextPath}/products/collection">&longleftarrow; Back to the
                    collection</a></h2>
            </div>
        </div>
        <div class="row" style="margin-top: 30px;">
            <div class="detail-imgs-wrapper col-md-9">
                <div class="aside-imgs">
                    <div class="col-md-4">
                        <div class="first-detail-img">
                            <div class="col-md-12">
                                <img class="img-responsive" src="http://lorempixel.com/250/250"
                                     alt="Small product detail image.">
                            </div>
                        </div>
                        <div class="next-detail-img">
                            <div class="col-md-12" style="margin-top: 30px;">
                                <img class="img-responsive" src="<c:url value="/resources/img/product/${product.id}/manual_cash_machine.jpg"/>"
                                     alt="Small product detail image.">
                            </div>
                        </div>
                        <div class="next-detail-img">
                            <div class="col-md-12" style="margin-top: 30px;">
                                <img class="img-responsive" src="<c:url value="/resources/img/product/${product.id}/not_bieber_just_grass.jpg"/>"
                                     alt="Small product detail image.">
                            </div>
                        </div>
                    </div>
                </div>
                <div class="large-detail-img">
                    <div class="col-md-8">
                        <img class="img-responsive" src="http://lorempixel.com/730/500" alt="Big product detail image.">
                    </div>
                </div>
            </div>
            <div class="detail-description-wrapper col-md-3">
                <div class="product-detail-name">
                    <div class="col-md-12">
                        <h2 style="margin: -8px 0 0 0;">${product.name}, ${product.id}</h2>
                    </div>
                </div>
                <div class="product-detail-category">
                    <div class="col-md-12">
                        <p>
                            Category: ${product.category.name}
                        </p>
                    </div>
                </div>
                <div class="product-detail-body">
                    <div class="col-md-12">
                        <p>
                            ${product.description}
                        </p>
                    </div>
                </div>
            </div>
        </div>
        <div class="push"></div>
    </div>
</section>

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
