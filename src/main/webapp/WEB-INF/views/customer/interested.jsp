<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Registration</title>
    <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap/bootstrap.css"/>"/>
    <link rel="stylesheet" href="<c:url value="/resources/css/font-awesome/css/font-awesome.min.css"/>"/>
    <link rel="stylesheet" href="<c:url value="/resources/css/customer.css"/>"/>
    <link href="https://fonts.googleapis.com/css?family=Love+Ya+Like+A+Sister|Overlock" rel="stylesheet">
</head>
<body>

<jsp:include page="/WEB-INF/partials/header.jsp"/>

<div class="container-fluid body-container">
    <div class="container">
        <div class="row">
            <div class="breadcrumbs">
                <a href="${pageContext.request.contextPath}/home">Home&ensp;<i
                        class="fa fa-angle-double-right"></i></a>
                <span>Registration</span>
            </div>
        </div>
        <div class="row" style="margin-top: 20px;">
            <div class="col-md-12 text-center">
                <div class="fancy-header-cursive-text">
                    <h1 style="font-size: 50px; opacity: 0.18;"><i>Welcome to the registration page</i></h1>
                </div>
            </div>
        </div>
        <div class="row">
            <p class="follow-steps-text">
                Please follow the steps below to register your user account
                and to let us know which product(s) you are interested in.
            </p>
            <div class="registration-panel">
                <div class="row">
                    <div class="col-md-12">
                        <div class="registration-steps">
                            <ul class="no-list-style" style="margin: 0;">
                                <li id="step-one" class="col-xs-4 active">
                                    <span class="big-round-num">1</span>
                                </li>
                                <li class="col-xs-4" id="step-two">
                                    <span class="big-round-num">2</span>
                                </li>
                                <li class="col-xs-4" id="step-three">
                                    <span class="big-round-num">3</span>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-12 text-center">
                        <form id="interestedForm" modelAttribute="command" action="/user_registration" method="post">
                            <div class="customer-registration active">
                                <div class="col-xs-12">
                                    <input class="default-bg-field" type="text" placeholder="First Name" required>
                                </div>
                                <div class="col-xs-12">
                                    <input class="default-bg-field" type="text" placeholder="Last Name" required>
                                </div>
                                <div class="col-xs-12">
                                    <input class="default-bg-field" type="email" placeholder="Email Address" required>
                                </div>
                                <div class="col-xs-12">
                                    <input class="default-bg-field" type="tel" placeholder="Tel. nr." required>
                                </div>
                                <div class="col-xs-12">
                                    <input id="chooseProducts" class="default-dark-button" type="button" value="Choose products">
                                </div>
                            </div>
                            <div class="product-of-interest">
                                <div ngIf=""></div>
                            </div>
                            <div class="registration-confirmation">

                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="row" style="background-color: black; margin-top: 75px;">
        <img class="transparent-bottom-image"
             src="${pageContext.request.contextPath}/resources/img/registration/bottom-code-image.jpg"
             alt="Bottom image of some lines of code.">
    </div>
    <div class="push"></div>
</div>

<jsp:include page="/WEB-INF/partials/footer.jsp"/>

<script src="<c:url value="/resources/js/jquery-3.1.1.min.js"/>"></script>
<script src="<c:url value="/resources/js/on-img-error.js"/>"></script>
<script src="<c:url value="/resources/js/interested.js"/>"></script>

</body>
</html>
