
$(document).ready(function() {

    var urlSubstring = '/products';
    var descendingTags = ['.crud-nav', '.menu-item', 'a'];
    var cssProperty = 'active-nav-item';

    toggleItem(urlSubstring, descendingTags, cssProperty);

});

function toggleItem(urlSubstring, descendingTags, cssProperty) {

    var selectorTags = '';
    var cookieKey = 'cookieKey';

    // assign selector array into one string
    descendingTags.forEach(function(item) {
        selectorTags += (' ' + item)
    });

    // returns if user is on page or not to check if the cookie should be removed or kept
    var userLeftPage = function (urlSubstring) {
        return location.href.toLowerCase().indexOf(urlSubstring) < 0;
    };

    if (userLeftPage(urlSubstring)) {
        removeCookie(cookieKey);
    } else {
        if (getCookie(cookieKey) === 'undefined' ||
            getCookie(cookieKey) === null) {
            $(''+selectorTags).each(function() {
                $(selectorTags).addClass(cssProperty);
                var deepestSelectorText = $(selectorTags).text().trim();
                setCookie(cookieKey, deepestSelectorText); // remember the text of the last index of selectorTags
            });
        }

        $(selectorTags).click(function() {
            var newClickedItem = $(this).text().trim();
            var currentClickedItem = getCookie(cookieKey); // get text from current selected item

            if (currentClickedItem !== newClickedItem) {
                $(selectorTags).each(function() {
                    $this = $(this);

                    if ($this.text() === currentClickedItem) {
                        $this.parent().removeClass(cssProperty);
                    }
                    if ($this.text() === newClickedItem) {
                        setCookie(cookieKey, $this.text());
                    }
                });
            }
        });

        var newItemText = getCookie(cookieKey);
        $(selectorTags).each(function() {
            $this = $(this);

            if ($this.text() === newItemText) {
                $this.parent().addClass(cssProperty);
            }
        });
    }

    function setCookie(key, value) {
        localStorage.setItem(key, value);
    }

    function getCookie(key) {
        return localStorage.getItem(key);
    }

    function removeCookie(key) {
        localStorage.removeItem(key);
    }
}