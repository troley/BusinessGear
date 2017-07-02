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
                <div class="center-block">
                    <div class="row">
                        <a href="/admin">
                            <div style="width: 500px; height: 150px; background-color: lightgreen; margin: 35px auto 0 auto; text-align:center;">
                                <h2 style="padding-top: 20px;">Successfully registered.</h2>
                                <h3>Click here to go back to admin page</h3>
                            </div>
                        </a>
                    </div>
                </div>
            </section>
        </div>
    </div>
    <div class="push"></div>
</div>
<jsp:include page="/WEB-INF/partials/footer.jsp"/>
</body>
</html>
