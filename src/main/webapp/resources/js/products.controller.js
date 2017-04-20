(function () {
    'use strict';

    angular.module('app').controller('ProductsController', ProductsController);

    ProductsController.$inject = ['$http'];

    function ProductsController($http) {
        var vm = this;

        vm.products = [];
        vm.singleProduct = null;
        vm.getAll = getAll;
        vm.getFiltered = getFiltered;
        vm.getProductById = getProductById;

        vm.range = function (min, max, step) {
            step = step || 1;
            var input = [];
            for (var i = min; i <= max; i += step) {
                input.push(i);
            }
            return input;
        };
        vm.extra = 0;

        init();

        function init() {
            getAll();
        }

        function getAll() {
            var url = '/api/products/all';
            var productsPromise = $http.get(url);
            productsPromise.then(function (response) {
                vm.products = response.data;
                vm.extra = vm.products.length % 3 != 0 ? 1 : 0;
            });
        }

        function getFiltered(id) {
            var url = '/api/products/category/' + id;
            var productsPromise = $http.get(url);
            productsPromise.then(function (response) {
                vm.products = response.data;
                vm.extra = vm.products.length % 3 != 0 ? 1 : 0;
            });
        }

        function getProductById(id) {
            var url = '/api/products/' + id;
            var productsPromise = $http.get(url);
            productsPromise.then(function (response) {
                vm.products = response.data;
            });
        }
    }

})();