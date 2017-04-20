<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="j" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>${product.name}</title>

    <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap/bootstrap.css"/>"/>
    <link rel="stylesheet" href="<c:url value="/resources/css/font-awesome/css/font-awesome.min.css"/>"/>
    <link rel="stylesheet" href="<c:url value="/resources/css/collection.css"/>"/>
    <link href="https://fonts.googleapis.com/css?family=Alegreya:400,700,900" rel="stylesheet">

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
                <span>${product.name}</span>
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
                                     alt="Small product detail image."
                                     onerror="this.onerror=null; this.src='/resources/img/img404/imageNotFound.jpg'">
                            </div>
                        </div>
                        <div class="next-detail-img">
                            <div class="col-md-12" style="margin-top: 30px;">
                                <img class="img-responsive"
                                     src="<c:url value="/resources/img/product/${product.id}/manual_cash_machine.jpg"/>"
                                     alt="Small product detail image."
                                     onerror="this.onerror=null; this.src='/resources/img/img404/imageNotFound.jpg'">

                            </div>
                        </div>
                        <div class="next-detail-img">
                            <div class="col-md-12" style="margin-top: 30px;">
                                <img class="img-responsive"
                                     src="<c:url value="/resources/img/product/${product.id}/not_bieber_just_grass.jpg"/>"
                                     alt="Small product detail image."
                                     onerror="this.onerror=null; this.src='/resources/img/img404/imageNotFound.jpg'">
                            </div>
                        </div>
                    </div>
                </div>
                <div class="large-detail-img">
                    <div class="col-md-8">
                        <img class="img-responsive" src="http://lorempixel.com/730/500"
                             alt="Big product detail image."
                             onerror="this.onerror=null; this.src='/resources/img/img404/imageNotFound.jpg'">
                    </div>
                </div>
            </div>
            <div class="detail-description-wrapper col-md-3">
                <div class="product-detail-name">
                    <div class="col-md-12">
                        <h2 style="margin: -8px 0 0 0;">${product.name}</h2>
                    </div>
                </div>
                <div class="product-detail-category">
                    <div class="col-md-12">
                        <p>
                            Category: <span class="detail-text-color">${product.category.name}</span>
                        </p>
                    </div>
                </div>
                <div class="product-detail-body">
                    <div class="col-md-12">
                        <p>
                            Description: <span class="detail-text-color">${product.description}</span>
                        </p>
                    </div>
                </div>
            </div>
            <div class="potential-customer col-md-3" style="margin-top: 60px;">
                <div class="detail-interested">
                    <div class="col-md-12">
                        <p>
                            Are you interested in this product?
                            Please, if you are, don't
                            hesitate and let us know! We guarantee
                            that you won't be disappointed. You
                            can change your mind within 60 days.
                            <br>
                            <b><u>Money back, no questions asked.</u></b>
                        </p>
                    </div>
                </div>
                <div class="button-interested" style="text-align: center;">
                    <div class="col-md-12">
                        <input type="button" value="Let us know">
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
<script src="<c:url value="/resources/js/on-img-error.js"/>"></script>


</body>
</html>
