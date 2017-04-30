<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>${command.name} Details</title>
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
            <f:form id="deleteProductForm" action="/crud/products/delete/${command.id}" method="POST">
                <div class="col-md-12 col-xs-12">
                    <div class="col-md-5 col-xs-3">
                        <span class="float-right">Product Name:</span>
                    </div>
                    <div class="col-md-7 col-xs-9">
                        <span class="float-left">${command.name}</span>
                    </div>
                </div>
                <div class="col-md-12 col-xs-12">
                    <div class="col-md-5 col-xs-3">
                        <span class="float-right">Product Price:</span>
                    </div>
                    <div class="col-md-7 col-xs-9">
                        <span class="float-left">${command.price}</span>
                    </div>
                </div>
                <div class="col-md-12 col-xs-12">
                    <div class="col-md-5 col-xs-3">
                        <span class="float-right">Product Description:</span>

                    </div>
                    <div class="col-md-7 col-xs-9">
                        <div class="product-description-area">
                                ${command.description}
                        </div>
                    </div>
                </div>
                <div class="col-md-12 col-xs-12">
                    <div class="col-md-5 col-xs-3">
                        <span class="float-right">Product Category:</span>

                    </div>
                    <div class="col-md-7 col-xs-9">
                        <span class="float-left">${command.category.name}</span>
                    </div>
                </div>
                <div class="col-md-12 col-xs-12">
                    <input class="default-dark-button" type="button"
                           onclick="deleteProductConfirmation('deleteProductForm')" value="Delete product"/>
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

<script type="text/javascript">
    function deleteProductConfirmation(formId) {
        var tof = confirm("Do you want to delete this product?");
        if (tof) {
            document.getElementById(formId).submit();
        }
    }
</script>


</body>
</html>
