
$(document).ready(function() {

    var burger = 'fa-reorder';
    var cross = 'fa-times';
    var active = 'burger-active';

    $('#items-burger').click(function() {
        $(this).toggleClass(active);

        if ($(this).hasClass(active)) {
            $(this).addClass(cross);
            $(this).removeClass(burger);
            $('.burger-items').fadeIn(function() {
                $(this).css('display', 'inline-grid');
            });
        } else {
            $(this).addClass(burger);
            $(this).removeClass(cross);
            $('.burger-items').fadeOut(function() {
                $(this).css('display', 'none');
            });
        }
    });
});