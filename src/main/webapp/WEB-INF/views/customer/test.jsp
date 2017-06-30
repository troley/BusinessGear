<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Title</title>

</head>
<body>
<div class="row">
    <div class="col-md-12">
        <form id="interestedFormC">
            <div class="customer-registration active">
                <div class="col-xs-12" style="margin-top: 45px;">
                    <input class="default-bg-field" type="text" name="fname" placeholder="First Name"/>
                </div>
                <div class="col-xs-12">
                    <input class="default-bg-field" type="text" name="lname" placeholder="Last Name"/>
                </div>
                <div class="col-xs-12">
                    <input class="default-bg-field" type="date" name="birthdate"
                             placeholder="Bith date Address"/>
                </div>
                <div class="col-xs-12">
                    <input class="default-bg-field" type="email" name="email"
                             placeholder="Email Address" required="required"/>
                </div>
                <div class="col-xs-12">
                    <input class="default-bg-field" type="number" name="telnumber"
                             placeholder="Tel. nr."/>
                </div>
                <div class="col-xs-12">
                    <input class="default-bg-field" type="submit" value="submit"/>
                </div>
            </div>
        </form>
    </div>
</div>

<script src="<c:url value="/resources/js/jquery-3.1.1.min.js"/>"></script>
<script src="<c:url value="/resources/js/interested.js"/>"></script>

</body>
</html>
