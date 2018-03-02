var app = angular.module('app',['ngRoute']);

app.run(function($rootScope) {
    $rootScope.valorPedido = 0;
    $rootScope.valorLanches = 0;
    $rootScope.valorProdutos = 0;
    $rootScope.valorDesconto = 0;
    $rootScope.percDescontoLigth = 10;
    $rootScope.erro = "";
});
app.config(function($routeProvider, $locationProvider, )
{
   // remove o # da url
   $locationProvider.html5Mode(true);

   $routeProvider

   // para a rota '/', carregaremos o template index.html e o controller 'home'
   .when('/index', {
      templateUrl : 'index.html',
      controller  : 'home',
   })

   // para a rota '/monteoseu', carregaremos o template monteoseu.html e o controller 'ProdutosController'
   .when('/monteoseu', {
      templateUrl : 'TudoBomLanches/Interface/pages/monteoseu.html',
      controller  : 'ProdutosController',
      controllerAs: "vm"
   })

   // para a rota '/lanches', carregaremos o template lanches.html e o controller 'LanchesController'
   .when('/lanches', {
      templateUrl : 'TudoBomLanches/Interface/pages/lanches.html',
      controller  : 'LanchesController',
      controllerAs: "vm"
   })

   // caso não seja nenhum desses, redirecione para a rota '/'
   .otherwise ({ redirectTo: '/' });
});

app.controller('ProdutosController', function($rootScope, $location, $http, $scope) {
    $rootScope.activetab = $location.path();
    
    if ($rootScope.produtos==0 || $rootScope.produtos == undefined){
        $http({
            method : "GET",
            url : "https://polar-meadow-46819.herokuapp.com/tudoBomLanches/api/ListaProdutos"
        }).then(function(response) {
            $rootScope.produtos = response.data;
        });
    }

    $scope.calculaValorTotalProduto =function(i, quantiade, valor){
        $rootScope.produtos.java[i].total = (quantiade*valor);
        $scope.calculaValorPromocoes($rootScope);
    };

    $scope.calculaValorTotal = function(){
        $rootScope.valorProdutos = 0;
        $rootScope.produtos.java.forEach(element => {
            if (element.total != undefined){
                if (element.valorPromocional != undefined && element.valorPromocional != 0){
                    $rootScope.valorProdutos = (element.valorPromocional+$rootScope.valorProdutos);
                }
                else{
                    $rootScope.valorProdutos = (element.total+$rootScope.valorProdutos);
                }
            }
        });
        if ($rootScope.temAlface == 1 && $rootScope.temBacon == 0){
            $rootScope.valorDesconto = (($rootScope.valorLanches+$rootScope.valorProdutos)*($rootScope.percDescontoLigth/100));
        }
        else{
            $rootScope.valorDesconto = 0;
        }
        $rootScope.valorPedido = (($rootScope.valorLanches+$rootScope.valorProdutos)-$rootScope.valorDesconto);
    }

    $scope.calculaValorPromocoes = function($rootScope){
        $rootScope.activetab = $location.path();
        $rootScope.produtos.java.forEach(element => {
            if (element.nome == "Hamburguer" || element.nome == "Queijo"){
                if (element.quantidade >=3){
                    if (element.quantidade % 3 == 0){
                        var qtdAtual = (element.quantidade / 3);
                        qtdAtual = (qtdAtual+qtdAtual);
                        element.valorPromocional = (qtdAtual*element.valor);
                    }
                }else{
                    element.valorPromocional = 0;
                }
            }
            
            if (element.nome == "Alface"){
                if (element.quantidade > 0){
                    $rootScope.temAlface = 1;
                }
                else{
                    $rootScope.temAlface = 0;
                }
            }
            if (element.nome == "Bacon"){
                if (element.quantidade > 0){
                    $rootScope.temBacon = 1;
                }
                else{
                    $rootScope.temBacon = 0;
                }
            }
        });
        $scope.calculaValorTotal();
    }
});

app.controller('LanchesController', function($http, $scope, $rootScope, $location) {
    $rootScope.activetab = $location.path();
    if ($rootScope.lanches == 0 || $rootScope.lanches == undefined){
        $http({
            method : "GET",
            url : "https://polar-meadow-46819.herokuapp.com/tudoBomLanches/api/ListaLanches"
        }).then(function(response) {
            $rootScope.lanches = response.data;
        });
    }

    $scope.calculaValorTotallanche =function(i, quantiade, valor){
        $rootScope.lanches.java[i].total = (quantiade*valor);
        $scope.calculaValorTotal();
    };

    $scope.calculaValorTotal = function(){
        $rootScope.valorLanches = 0;
        $rootScope.lanches.java.forEach(element => {
            if (element.total != undefined){
                $rootScope.valorLanches = (element.total+$rootScope.valorLanches);
            }
        });
        $rootScope.valorPedido = ($rootScope.valorLanches+$rootScope.valorProdutos);
    }
});

app.controller('home', function($http, $scope, $rootScope, $location) {
    $rootScope.activetab = $location.path();
});