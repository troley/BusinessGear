
$(document).ready(function() {

    $("img").on("error", function(){
        $(this).attr('src', '/resources/img/img404/imageNotFound.jpg');
    });
});
