<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>${product.name} Details</title>
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
            <h1 style="text-align: center;">Product Details</h1>
        </div>
        <div class="col-md-12">
            <f:form action="/crud/products/details/update" method="POST">
                <f:hidden path="id"/>
                <div class="col-md-12 col-xs-12">
                    <div class="col-md-5 col-xs-3">
                        <f:label class="crud-label float-right" path="name" for="name">Product Name:</f:label>
                    </div>
                    <div class="col-md-7 col-xs-9">
                        <f:input class="default-crud-field float-left" type="text" path="name" value="${command.name}"/>
                    </div>
                </div>
                <div class="col-md-12 col-xs-12">
                    <div class="col-md-5 col-xs-3">
                        <f:label class="crud-label float-right" path="price" for="price">Product Price:</f:label>
                    </div>
                    <div class="col-md-7 col-xs-9">
                        <f:input class="default-crud-field float-left" type="text" path="price"
                                 value="${command.price}"/>
                    </div>
                </div>
                <div class="col-md-12 col-xs-12">
                    <div class="col-md-5 col-xs-3">
                        <f:label class="crud-label float-right" path="description"
                                 for="description">Product Description:</f:label>
                    </div>
                    <div class="col-md-7 col-xs-9">
                        <f:textarea class="default-crud-textarea float-left" rows="5" cols="40" type="text" path="description"
                                 value="${command.description}"/>
                    </div>
                </div>
                <div class="col-md-12 col-xs-12">
                    <div class="col-md-5 col-xs-3">
                        <f:label class="crud-label float-right" path="category"
                                 for="category">Product Category:</f:label>
                    </div>
                    <div class="col-md-7 col-xs-9">
                        <f:input class="default-crud-field float-left" type="text" path="category"
                                 value="${command.category.name}"/>
                    </div>
                </div>
                <div class="col-md-12 col-xs-12">
                    <input class="default-dark-button" type="submit" value="Update product"/>
                </div>
            </f:form>
        </div>
        <div class="col-xs-12" style="margin-top: 20px;">
            <a class="default-a" href="/crud/products">&longleftarrow; Back to products overview</a>
        </div>
    </div>
</div>

<footer></footer>

<script src="<c:url value="/resources/js/jquery-3.1.1.min.js"/>"></script>

</body>
</html>
