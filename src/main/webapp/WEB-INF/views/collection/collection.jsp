<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>Collection</title>

    <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap/bootstrap.css"/>"/>
    <link rel="stylesheet" href="<c:url value="/resources/css/font-awesome/css/font-awesome.min.css"/>"/>
    <link rel="stylesheet" href="<c:url value="/resources/css/collection.css"/>"/>
    <link href="https://fonts.googleapis.com/css?family=Alegreya:400,700,700i|Inknut+Antiqua:600|Slabo+27px"
          rel="stylesheet"/>

</head>
<body>

<div ng-app="app" ng-controller="ProductsController as vm">
    <header class="container-fluid">
        <div class="brand">
            <h1><a href="${pageContext.request.contextPath}/home" style="color: white;">BusinessGear <sup><i
                    class="fa fa-copyright"></i></sup></a><i id="items-burger" class="fa fa-reorder"></i> </h1>
        </div>
        <div class="row">
            <div class="col-md-12 text-center">
                <div class="burger-items">
                    <input ng-click="vm.getAll()" class="filter-button" type="button" value="All">
                    <input ng-click="vm.getFiltered(1)" class="filter-button" type="button"
                           value="Administration">
                    <input ng-click="vm.getFiltered(4)" class="filter-button" type="button" value="Hardware">
                    <input ng-click="vm.getFiltered(3)" class="filter-button" type="button" value="Management">
                    <input ng-click="vm.getFiltered(2)" class="filter-button" type="button" value="Development">
                </div>
            </div>
        </div>
    </header>
    <section class="showcase">
        <div class="container-fluid body-container">
            <div class="row">
                <div class="breadcrumbs">
                    <a href="${pageContext.request.contextPath}/home">Home&ensp;<i
                            class="fa fa-angle-double-right"></i></a>
                    <span>Collection</span>
                </div>
            </div>
            <div class="section-split" style="margin: 80px 0;">
                <div class="section-text">
                    <h2>
                        <span>Collection</span>
                    </h2>
                    <hr>
                </div>
            </div>
            <div ng-repeat="n in vm.range(1, (vm.products.length / 3) + vm.extra)">
                <div class="row products-row">
                    <div class="container">
                        <div ng-repeat="product in vm.products.slice((n - 1) * 3, n * 3)">
                            <div class="col-md-4">
                                <div class="panel">
                                    <a ng-href="/products/detail/{{ product.id }}">
                                        <div class="panel-image">
                                            <img class="img-responsive" src="http://lorempixel.com/270/211"
                                                 alt="Lorem Ipsum">
                                        </div>
                                        <div class="panel-image-title">
                                            <div class="col-md-6">
                                                <h3>{{ product.name }}</h3>
                                            </div>
                                            <div id="productPrice" class="col-md-6"
                                                 style="display: none; text-align: right;">
                                                <h3> &euro; {{ product.price }} </h3>
                                            </div>
                                        </div>
                                    </a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="push"></div>
        </div>
    </section>
</div>

<jsp:include page="/WEB-INF/partials/footer.jsp"/>


<script src="<c:url value="/resources/js/jquery-3.1.1.min.js"/>"></script>
<script src="<c:url value="/resources/js/angular.min.js"/>"></script>
<script src="<c:url value="/resources/js/site.js"/>"></script>
<script src="<c:url value="/resources/js/app.module.js"/>"></script>
<script src="<c:url value="/resources/js/products.controller.js"/>"></script>
<script src="<c:url value="/resources/js/on-img-error.js"/>"></script>
<script src="<c:url value="/resources/js/burger.js"/>"></script>

</body>
</html>
