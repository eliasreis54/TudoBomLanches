var app = angular.module('app', []);

app.controller('ProdutosController', function($http, $scope) {
    var vm = this;
    $scope.valorPedido = 0;
    $scope.descontoPromocao = 0;
    $scope.nomePromocoes = 0;
    $http({
        method : "GET",
        url : "https://polar-meadow-46819.herokuapp.com/tudoBomLanches/api/ListaProdutos"
    }).then(function(response) {
        vm.produtos = response.data;
    });

    $scope.calculaValorTotalProduto =function(i, quantiade, valor){
        vm.produtos.java[i].total = (quantiade*valor);
        $scope.calculaValorTotal(vm);
    };

    $scope.calculaValorTotal = function(vm){
        $scope.valorPedido = 0;
        vm.produtos.java.forEach(element => {
            if (element.total != undefined){
                $scope.valorPedido = (element.total+$scope.valorPedido);
            }
        });
        $scope.calculaValorPromocoes(vm);
    }

    $scope.calculaValorPromocoes = function(vm){
        $scope.descontoPromocao = 0;
        $scope.nomePromocoes = "";
        vm.produtos.java.forEach(element => {
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
        });
    }
});

app.controller('LanchesController', function($http, $scope) {
    var vm = this;
    $scope.valorPedido = 0;
    $scope.descontoPromocao = 0;
    $scope.nomePromocoes = 0;
    $http({
        method : "GET",
        url : "https://polar-meadow-46819.herokuapp.com/tudoBomLanches/api/ListaLanches"
    }).then(function(response) {
        vm.lanches = response.data;
    });

});