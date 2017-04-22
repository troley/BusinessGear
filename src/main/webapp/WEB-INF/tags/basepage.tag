<%@tag description="Simple Wrapper Tag" pageEncoding="UTF-8" %>
<%@attribute name="header" fragment="true" %>
<%@attribute name="footer" fragment="true" %>
<%@attribute name="head_links" fragment="true" %>
<%@attribute name="js_scripts" fragment="true" %>

<html>
<head>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <jsp:invoke fragment="head_links"/>
</head>
<body>

<header class="container-fluid">
    <jsp:invoke fragment="header"/>
</header>

<div class="container body-container">
    <jsp:doBody/>
    <div class="push"></div>
</div>

<jsp:invoke fragment="footer"/>

<jsp:invoke fragment="js_scripts"/>

</body>
</html>