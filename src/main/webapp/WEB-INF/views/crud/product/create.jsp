<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Create product</title>
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
    <div class="row">
        <div class="col-md-12">
            <div class="create-item-header">
                <h1 style="text-align: center;">Create Product</h1>
            </div>
        </div>
        <div class="col-md-12">
            <f:form action="/crud/products/create" modelAttribute="command" method="POST">
                <f:hidden path="id"/>
                <div class="col-md-12 col-xs-12">
                    <div class="col-md-5 col-xs-3">
                        <f:label class="crud-label float-right" path="name" for="name">Product Name:</f:label>
                    </div>
                    <div class="col-md-7 col-xs-9">
                        <f:input class="default-crud-field float-left" type="text" path="name"/>
                    </div>
                </div>
                <div class="col-md-12 col-xs-12">
                    <div class="col-md-5 col-xs-3">
                        <f:label class="crud-label float-right" path="price" for="price">Product Price:</f:label>
                    </div>
                    <div class="col-md-7 col-xs-9">
                        <f:input class="default-crud-field float-left" type="text" path="price"/>
                    </div>
                </div>
                <div class="col-md-12 col-xs-12">
                    <div class="col-md-5 col-xs-3">
                        <f:label class="crud-label float-right" path="description" for="description">Product Description:</f:label>
                    </div>
                    <div class="col-md-7 col-xs-9">
                        <f:input class="default-crud-field float-left" type="text" path="description"/>
                    </div>
                </div>
                <div class="col-md-12 col-xs-12">
                    <div class="col-md-5 col-xs-3">
                        <f:label class="crud-label float-right" path="category" for="category">Product Category:</f:label>
                    </div>
                    <div class="col-md-7 col-xs-9">
                        <f:select class="default-crud-field float-left" type="text" path="category">
                            <f:option value="EMPTY">-- SELECT OPTION --</f:option>
                            <c:forEach var="category" items="${categories}">
                                <f:option value="${category.id}">${category.name}</f:option>
                            </c:forEach>
                        </f:select>
                    </div>
                </div>
                <div class="col-md-12 col-xs-12">
                    <input class="default-dark-button" type="submit" value="Create product"/>
                </div>
            </f:form>
        </div>
    </div>
</div>

<footer></footer>

<script src="<c:url value="/resources/js/angular.min.js"/>"></script>
<script src="<c:url value="/resources/js/app.module.js"/>"></script>
<script src="<c:url value="/resources/js/products.controller.js"/>"></script>
<script src="<c:url value="/resources/js/jquery-3.1.1.min.js"/>"></script>
<script src="<c:url value="/resources/js/item-activator.js"/>"></script>

</body>
</html>
