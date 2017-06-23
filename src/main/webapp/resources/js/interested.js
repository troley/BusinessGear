$(document).ready(function () {
    var activeItem = $("#step-one");
    var stepsArr = [
        $(".customer-registration"),
        $(".product-of-interest"),
        $(".registration-confirmation")
    ];

    // on large number click activate the clicked large number
    // and deactivate the other ones.
    $("ul li span").click(function () {

        var parent = $(this).parent();

        activeItem = reactivateSteps(parent, stepsArr, activeItem);

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

    $('#chooseProducts').on('click', function() {
        var parent = $("#step-two");

        activeItem = reactivateSteps(parent, stepsArr, activeItem);

        stepsArr[1].addClass("active");
    });

    $('#goToConfirmation').on('click', function() {
        var parent = $("#step-three");

        activeItem = reactivateSteps(parent, stepsArr, activeItem);

        stepsArr[2].addClass("active");
    });

    // get products selected by customer for later AJAX POST request.
    var ajaxProducts = getSelectedProducts();

});

function reactivateSteps(parent, stepsArr, activeItem) {
    stepsArr.forEach(function (item) {
        item.removeClass("active")
    });
    activeItem.removeClass("active");
    parent.addClass("active");
    activeItem = parent;

    return activeItem;
}

function getSelectedProducts() {
    var products = [];

    $('.images-overflow img').on('click', function() {
        var ancestor = $(this).parent().parent();
        var inputValue = ancestor.find('input').attr('value');

        for (var i = 0; i < products.length; i++) {
            if (products[i] === inputValue) {
                products.splice(i, 1);
                $(this).css('border-color', 'lightgray');
                $(this).css('opacity', '1');
                return;
            }
        }

        $(this).css('border-color', '#004cff');
        $(this).css('opacity', '.4');
        products[i++] = inputValue;
    });

    return products;
}