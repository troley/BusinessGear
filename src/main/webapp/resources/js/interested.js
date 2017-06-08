$(document).ready(function () {
    var activeItem = $("#step-one");
    var stepsArr = [
        $(".customer-registration"),
        $(".product-of-interest"),
        $(".registration-confirmation")
    ];

    $("ul li span").click(function () {
        stepsArr.forEach(function (item) {
            item.removeClass("active")
        });
        activeItem.removeClass("active");
        $(this).parent().addClass("active");
        activeItem = $(this).parent();

        switch (activeItem.attr("id")) {
            case "step-one":
                stepsArr[0].addClass("active");
                break;
            case "step-two":
                stepsArr[1].addClass("active");
                break;
            case "step-three":
                stepsArr[2].addClass("active");
                break;
        }
    });


});