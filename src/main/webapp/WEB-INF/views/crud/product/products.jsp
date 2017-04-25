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
    <nav class="crud-nav">
        <div class="row">
            <div class="items-wrapper col-md-12">
                <div class="menu-item">
                    <a href="/crud/products">Products</a>
                </div>
                <div class="menu-item">
                    <!-- next menu item -->
                </div>
            </div>
        </div>
    </nav>
    <hr style="margin: 0;">
    <div class="crud-body">
        <div class="row">
            <div class="crud-body-header">
                <div class="col-md-12">
                    <h1>Products</h1>
                    <a href="/crud/products/create">
                        <input class="default-dark-button" style="width: 250px;" type="button" value="Create new"/>
                    </a>
                </div>
            </div>
            <div class="col-md-12">
                <table class="crud-table" ng-app="app" ng-controller="ProductsController as vm">
                    <thead>
                    <tr>
                        <th>Name</th>
                        <th>Price</th>
                        <th>Description</th>
                        <th>Category</th>
                        <th class="last">Options</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr ng-repeat="product in vm.products">
                        <td>{{ product.name }}</td>
                        <td>&euro; {{ product.price }}</td>
                        <td>{{ product.description }}</td>
                        <td>{{ product.category.name }}</td>
                        <td class="last">
                            <a class="default-a" ng-href="/crud/products/details/{{ product.id }}">Modify |</a>
                            <a class="default-a" href="#">Delete</a>
                        </td>
                    </tr>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
    <div class="push"></div>
</div>

<footer></footer>

<script src="<c:url value="/resources/js/angular.min.js"/>"></script>
<script src="<c:url value="/resources/js/app.module.js"/>"></script>
<script src="<c:url value="/resources/js/products.controller.js"/>"></script>
<script src="<c:url value="/resources/js/jquery-3.1.1.min.js"/>"></script>
<script src="<c:url value="/resources/js/item-activator.js"/>"></script>


</body>
</html>
