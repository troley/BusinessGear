
$(document).ready(function() {
    var charlen = $('.detail-description-wrapper .product-detail-name h2');

    if (charlen.text().length >= 13 && charlen.text().length < 18) {
        charlen.replaceWith($('<h3 style="margin: -8px 0 0 0;">' + charlen.text() + '</h3>'));
    } else if (charlen.text().length >= 18) {
        charlen.replaceWith($('<h4 style="margin: -8px 0 0 0;">' + charlen.text() + '</h4>'));
    }

});