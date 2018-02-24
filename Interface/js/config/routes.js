app.config(function($routeProvider, $locationProvider, $httpProvider) {
    $httpProvider.defaults.withCredentials = true;

    $routeProvider

        .when('/', {
            templateUrl: '/inicio.html',
            //controller: 'loginToken',
        })
        .when('/monteoseu', {
            templateUrl: '/monteoseu.html',
            controller: 'ProdutosController',
        })
        .when('/lanches', {
            templateUrl: '/lanches.html',
            controller: 'ProdutosController',
        })
        .otherwise({
            //   redirecTo: '/login'
        });
});