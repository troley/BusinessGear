<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Home</title>

    <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap/bootstrap.css"/>" />
    <link rel="stylesheet" href="<c:url value="/resources/css/font-awesome/css/font-awesome.min.css"/>" />
    <link rel="stylesheet" href="<c:url value="/resources/css/site.css"/>" />
    <link href="https://fonts.googleapis.com/css?family=Alegreya:400,700,700i|Inknut+Antiqua:600|Slabo+27px"
          rel="stylesheet" />
</head>
<body>

<header class="container">
    <div class="brand">
        <h1><a href="#" style="color: white;">BusinessGear <sup><i class="fa fa-copyright"></i></sup></a></h1>
    </div>
    <div class="welcome-header">
        <h1>Custom optimised software solutions</h1>
        <h2>We'll fulfill your software demands</h2>
    </div>
    <div class="row top-body-row">
        <div class="col-md-12">
            <div class="let-us-know">
                <h2>Let us know if you're interested!</h2>
                <form id="interestForm" action="#" method="post">
                    <div class="form-inputs">
                        <input id="interestEmail" type="email" placeholder="Enter your e-mail address" required>
                        <input id="interestSubmit" type="submit" value="Get started">
                    </div>
                </form>
            </div>
        </div>
    </div>
</header>

<div class="container body-container">
    <section class="expectations">
        <div class="section-split">
            <div class="section-text">
                <h2><span>What you can expect from us</span></h2>
                <hr>
            </div>
        </div>
        <div class="row row-margins">
            <div class="panels-wrapper">
                <div class="col-md-4">
                    <div class="panel">
                        <div class="panel-title">
                            <b><i class="fa fa-desktop"></i>&ensp;Custom Solution</b>
                        </div>
                        <div class="panel-body">
                            <p>
                                You don't have to worry
                                about software which doesn't
                                cover your idea for 100%.
                                We will take care of the gaps
                                and make sure the software
                                fits your demands.
                            </p>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="panel">
                        <div class="panel-title">
                            <b><i class="fa fa-tachometer"></i>&ensp;Guaranteed Support</b>
                        </div>
                        <div class="panel-body">
                            <p>
                                You bought our software
                                but you find out it could
                                use some upgrades here
                                and there? Fear not, as we
                                will maintain the software
                                to keep it optimal and up to
                                date for you.
                            </p>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="panel">
                        <div class="panel-title">
                            <b><i class="fa fa-heart"></i>&ensp;Our customer, our king</b>
                        </div>
                        <div class="panel-body">
                            <p>
                                If you ever bought a software
                                from us and find yourself in
                                need of a new software solution
                                for anything else, then you'll
                                get a 15% discount on your next
                                software.
                            </p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <section class="showcase">
        <div class="section-split">
            <div class="section-text">
                <h2><span>A few from our showcase</span></h2>
                <hr>
            </div>
        </div>
        <div class="row gray-wrapper-row">
            <div class="col-md-12">
                <div class="row">
                    <div class="panels-wrapper">
                        <div class="col-md-4">
                            <div class="panel">
                                <a href="#">
                                    <div class="panel-image">
                                        <img class="img-responsive" src="http://lorempixel.com/270/211"
                                             alt="Lorem Ipsum">
                                    </div>
                                    <div class="panel-image-title">
                                        <h3>Manager Assistant</h3>
                                    </div>
                                </a>
                            </div>
                        </div>
                        <div class="col-md-4">
                            <div class="panel">
                                <a href="#">
                                    <div class="panel-image">
                                        <img class="img-responsive" src="http://placehold.it/270x211" alt="Lorem Ipsum">
                                    </div>
                                    <div class="panel-image-title">
                                        <h3>Project </h3>
                                    </div>
                                </a>
                            </div>
                        </div>
                        <div class="col-md-4">
                            <div class="panel">
                                <a href="#">
                                    <div class="panel-image">
                                        <img class="img-responsive" src="http://placehold.it/270x211" alt="Lorem Ipsum">
                                    </div>
                                    <div class="panel-image-title">
                                        <h3>Manager Assistant</h3>
                                    </div>
                                </a>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="panels-wrapper">
                        <div class="col-md-4">
                            <div class="panel">
                                <a href="#">
                                    <div class="panel-image">
                                        <img class="img-responsive" src="http://placehold.it/270x211" alt="Lorem Ipsum">
                                    </div>
                                    <div class="panel-image-title">
                                        <h3>Manager Assistant</h3>
                                    </div>
                                </a>
                            </div>
                        </div>
                        <div class="col-md-4">
                            <div class="panel">
                                <a href="#">
                                    <div class="panel-image">
                                        <img class="img-responsive" src="http://placehold.it/270x211" alt="Lorem Ipsum">
                                    </div>
                                    <div class="panel-image-title">
                                        <h3>Project </h3>
                                    </div>
                                </a>
                            </div>
                        </div>
                        <div class="col-md-4">
                            <div class="panel">
                                <a href="#">
                                    <div class="panel-image">
                                        <img class="img-responsive" src="http://placehold.it/270x211" alt="Lorem Ipsum">
                                    </div>
                                    <div class="panel-image-title">
                                        <h3>Manager Assistant</h3>
                                    </div>
                                </a>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="full-collection">
                    <p>
                        <a href="${pageContext.request.contextPath}/products/collection" class="default-a">
                            See full collection &DoubleRightArrow;
                        </a>
                    </p>
                </div>
            </div>
        </div>
    </section>
    <section class="appointment-steps">
        <div class="section-split" style="margin-top: 0;">
            <div class="section-text">
                <h2><span>This is how it works</span></h2>
                <hr>
            </div>
        </div>
        <div class="row row-margins">
            <div class="col-lg-offset-1 col-md-offset-1 col-lg-6 col-md-6 col-sm-12">
                <div class="big-img">
                    <div class="img-panel">
                        <p class="first">
                            All you simply have to do
                            is submit your email address
                            and we'll contact you within
                            72 hours. This can be achieved by
                            filling out your e-mail
                            address at the <a href="#"
                                              style="font-weight: bold; text-decoration: underline !important;">top</a>
                            of the page.
                        </p>
                        <p class="second">
                            We'll analyze what has to
                            be done and prepare everything
                            that's needed to get to work
                            on your software as soon
                            as possible.
                        </p>
                        <p class="third">
                            After that everything that has
                            to be done has been analysed
                            and prepared correctly, we'll
                            start building your software
                            infrastructure right away.
                        </p>
                        <p class="fourth">
                            After we've build the product,
                            we'll present it to you so that
                            you have the basic understanding
                            of how the software works
                            be used. Of course the software
                            will be user friendly and will
                            require just a short time to learn.
                        </p>
                    </div>
                    <img class="img-responsive" src="http://www.enudge.com.au/images/dynamic_element_email_bg.jpg"
                         alt="Big picture">
                </div>

            </div>
            <div class="col-md-5 col-sm-12">
                <div class="step-by-step">
                    <ol id="howItWorks" class="no-list-style">
                        <li id="first">
                            <span class="big-round-num clickable">1</span><span class="clickable">You let us know</span>
                        </li>
                        <li id="second">
                            <span class="big-round-num clickable">2</span><span class="clickable">We analyse & prepare</span>
                        </li>
                        <li id="third">
                            <span class="big-round-num clickable">3</span><span class="clickable">We build the infrastructure</span>
                        </li>
                        <li id="fourth">
                            <span class="big-round-num clickable">4</span><span class="clickable">You receive complete product</span>
                        </li>
                    </ol>
                </div>
            </div>
        </div>
    </section>
    <section class="about-us">
        <div class="section-split">
            <div class="section-text">
                <h2><span>About Us</span></h2>
                <hr>
            </div>
        </div>
        <div class="row gray-wrapper-row">
            <div class="col-md-12">
                <div class="row" style="margin-bottom: 25px;">
                    <div class="portrait">
                        <div class="col-md-offset-1 col-md-5 col-xs-12">
                            <div class="portrait-img">
                                <img src="<c:url value="/img/about_us/trump.jpg"/>"
                                     alt="Image of Rene Uhliar, one of the developers">
                            </div>
                        </div>
                        <div class="col-md-3 col-md-offset-right-3 col-xs-12">
                            <div class="portrait-description">
                                <p>
                                    Lorem ipsum dolor sit amet,
                                    consectetuer adipiscing elit.
                                    Aenean commodo ligula eget dolor.
                                    Aenean massa. Cum sociis natoque penatibus
                                    et magnis dis parturient montes,
                                    nascetur ridiculus mus.
                                </p>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row row-margins" style="margin-top: 25px;">
                    <div class="portrait">
                        <div class="after col-md-3 col-md-offset-3 col-xs-12">
                            <div class="portrait-description reverse">
                                <p>
                                    Lorem ipsum dolor sit amet,
                                    consectetuer adipiscing elit.
                                    Aenean commodo ligula eget dolor.
                                    Aenean massa. Cum sociis natoque penatibus
                                    et magnis dis parturient montes,
                                    nascetur ridiculus mus.
                                </p>
                            </div>
                        </div>
                        <div class="before col-md-6 col-xs-12">
                            <div class="portrait-img reverse">
                                <img src="<c:url value="/img/about_us/stupid.jpg"/>" alt="Image of Maros Uhliar, head developer">
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <div class="push"></div>
</div>

<footer>
    <div class="container">
        <div class="row">
            <div class="col-md-4">
                <ul class="no-list-style">
                    <li><a href="#">Terms of Service</a></li>
                    <li><a href="#">Privacy Policy</a></li>
                </ul>
            </div>
            <div class="col-md-4">
                <ul class="no-list-style">
                    <li><a href="#">Contact</a></li>
                    <li><a href="#">About Us</a></li>
                    <li><a href="#">The Team</a></li>
                </ul>
            </div>
            <div class="col-md-4">
                <ul class="no-list-style">
                    <li><a href="#">Software Collection</a></li>
                </ul>
            </div>
        </div>
    </div>
</footer>


<script src="<c:url value="/resources/js/jquery-3.1.1.min.js"/>"></script>
<script src="<c:url value="/resources/js/angular.min.js"/>"></script>
<script src="<c:url value="/resources/js/site.js"/>"></script>
<script src="<c:url value="/resources/js/app.module.js"/>"></script>
<script src="<c:url value="/resources/js/products.controller.js"/>"></script>
</body>
</html>
