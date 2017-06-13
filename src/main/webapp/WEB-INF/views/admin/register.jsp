<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Registration</title>
    <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap/bootstrap.css"/>"/>
    <link rel="stylesheet" href="<c:url value="/resources/css/font-awesome/css/font-awesome.min.css"/>"/>
    <link rel="stylesheet" href="<c:url value="/resources/css/admin.css"/>"/>
</head>
<body>

<jsp:include page="/WEB-INF/partials/header.jsp"/>

<div class="container body-container">
    <div class="row">
        <div class="col-md-12" style="text-align: center;">
            <section>
                <f:form action="${pageContext.request.contextPath}/admin/register" method="POST">
                    <h1>Log in</h1>
                    <hr/>
                    <!--<div asp-validation-summary="All" class="text-danger"></div>-->
                    <div class="col-md-12 input-space">
                        <f:input class="default-bg-field" path="username" placeholder="Username"/>
                        <br/>
                        <span class="username-validation validation-text"></span>
                    </div>
                    <div class="col-md-12 input-space">
                        <f:input class="default-bg-field" type="password" path="password" placeholder="Password"/>
                        <br/>
                        <span class="pass-validation validation-text"></span>
                    </div>
                    <div class="col-md-12 input-space">
                        <input class="default-bg-field" type="password" name="repassword"
                               placeholder="Confirm password"/>
                        <br/>
                        <span class="pass-validation validation-text"></span>
                    </div>
                    <div class="col-md-12 input-space">
                        <input id="registerSubmit" type="submit" value="Register"/>
                    </div>
                </f:form>
            </section>
        </div>
    </div>
    <div class="push"></div>
</div>
<jsp:include page="/WEB-INF/partials/footer.jsp"/>

</body>
</html>
