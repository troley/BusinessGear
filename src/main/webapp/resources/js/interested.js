$(document).ready(function () {
    var activeItem = $("#step-one");
    var stepsArr = [
        $(".customer-registration"),
        $(".product-of-interest"),
        $(".registration-confirmation")
    ];
    var selectedProductValues = [];
    var actualProducts = [];
    const allProducts = ajaxGetAllProducts(); // get all products (whole objects) from database

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
                appendCustomerDetails();
                appendList();
                stepsArr[2].addClass("active");
                break;
        }
    });

    // remove hidden product input generated after #productSelectBox select
    // which constantly gets posted with the form
    var sneakyProductInput = $('.images-overflow input');
    if (sneakyProductInput.attr('name') === "_products") {
        sneakyProductInput.remove();
    }

    // on product image click at step 2
    $('.images-overflow img').on('click', function () {
        var ancestor = $(this).parent().parent(); // div class="col-md-12 second-step-image-wrapper"
        var inputValue = ancestor.find('span').attr('value');

        for (var i = 0; i < selectedProductValues.length; i++) {
            // deselect image and remove values from array
            if (selectedProductValues[i] === inputValue) {
                selectedProductValues.splice(i, 1);
                actualProducts.splice(i, 1);
                markSelectedOption('#productsSelectBox', inputValue, false);
                $(this).css('border-color', 'lightgray');
                $(this).css('opacity', '1');
                return;
            }
        }
        $(this).css('border-color', '#004cff');
        $(this).css('opacity', '.4');
        selectedProductValues[i++] = inputValue;
        markSelectedOption('#productsSelectBox', inputValue, true);
    });

    // on Choose Products button click at step 1
    $('#chooseProducts').on('click', function () {
        var parent = $("#step-two");

        activeItem = reactivateSteps(parent, stepsArr, activeItem);

        stepsArr[1].addClass("active");
    });

    // on Go to confirmation page click at step 2
    $('#goToConfirmation').on('click', function () {
        var parent = $("#step-three");
        appendCustomerDetails();
        activeItem = reactivateSteps(parent, stepsArr, activeItem);

        stepsArr[2].addClass("active");
        appendList();
    });

    // on form submit at step 3.
    // Serialize all data correctly into a JSON object
    // and POST them.
    $('#interestedForm').submit(function (e) {
        var serializedData = $('#interestedForm').serializeArray();
        var data = {};

        $(serializedData).each(function(i, field) {
            if (field.name !== 'products') {
                data[field.name] = field.value;
            } else {
                data[field.name];
            }
        });

        // init 'products' key in data var which will create
        // a new JSON object in data var with the selected products.
        data['products'] = actualProducts;

        if (data['products'].length <= 0) {
            alert("No products were selected!");

            // redirect the customer to step 2 (product page view)
            var parent = $('#step-two');
            activeItem = reactivateSteps(parent, stepsArr, activeItem);
            stepsArr[1].addClass('active');


            e.preventDefault();
            throw new Error(
                "No products have been selected by potentially new customer."
            );
        }

        var jsonifiedData = JSON.stringify(data);
        alert(jsonifiedData);

        $.ajax({
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            type: "POST",
            url: "/api/customer/interested",
            dataType: "json",
            data: jsonifiedData,
            success: function (data) {
                alert("Data added successfully.");
            },
            error: function (data) {
                alert("An error occurred.");
            }
        });
        e.preventDefault();
    });

    function appendCustomerDetails() {
        $('#firstNameConfirm').text($('#fname').val());
        $('#lastNameConfirm').text($('#lname').val());
        $('#birthDateConfirm').text($('#birthdate').val());
        $('#emailConfirm').text($('#email').val());
        $('#telNumConfirm').text($('#telnumber').val());
    }

    function appendList() {
        var list = ""; // later append chosen products into DOM in step 3 of /interested page

        // append the selected products to the list which will be printed in
        // step 3 of the /interested page.
        for (var i = 0; i < selectedProductValues.length; i++) {
            var product = null;
            var productFound = false;

            if (actualProducts.length > 0) {

                // First scan the actualProducts array to check if the selectedProductValues[i]
                // already is stored in the actualProducts. If so the lower for loop won't be executed,
                // because else it might add products which already exist within actualProducts array.
                for (var k = 0; k < actualProducts.length; k++) {
                    if (actualProducts[k] === null || actualProducts[k] === 'undefined')
                        continue;
                    if (actualProducts[k].id == selectedProductValues[i]) {
                        productFound = true;
                        product = actualProducts[k];
                        list += "<li>" + product.name + "</li>"
                    }
                }
            }

            // if actualProducts does not contain selectedProductValues[i]
            if (!productFound) {
                for (var x = 0; x < allProducts.length; x++) {
                    if (selectedProductValues[i] == allProducts[x].id) {
                        product = allProducts[x];
                        actualProducts.push(product);
                        list += "<li>" + product.name + "</li>"
                    }
                }
            }
        }
        var chosenProductsList = $('#chosenProductsList');
        chosenProductsList.text("");
        chosenProductsList.append(list);
    }
});

function markSelectedOption(selectId, searchValue, checkOption) {
    $(selectId).children('option').each(function () {

        var option = $(this);
        if (option.attr('value') === searchValue) {
            if (checkOption != true && checkOption != false)
                throw new Error("Third argument must be true or false.");
            if (checkOption) {
                option.attr('selected', 'selected');
            } else {
                option.attr('selected', null);
            }
        }
    });
}

function reactivateSteps(parent, stepsArr, activeItem) {
    stepsArr.forEach(function (item) {
        item.removeClass("active")
    });
    activeItem.removeClass("active");
    parent.addClass("active");
    activeItem = parent;

    return activeItem;
}

function ajaxGetAllProducts() {
    var products;
    $.ajax({
        url: "/api/products/all",
        async: false,
        success: function (data) {
            products = data;
        }
    });
    return products;
}