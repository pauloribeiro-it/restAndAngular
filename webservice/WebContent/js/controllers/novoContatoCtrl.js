angular.module("listaTelefonica").controller("detalhesContatoCtrl", function ($scope)	{
	$scope.app = "Lista Telefonica";
	$scope.operadoras = operadoras.data;

	$scope.adicionarContato = function (contato) {
		contato.serial = serialGenerator.generate();
		contatosAPI.saveContato(contato).success(function (data) {
			delete $scope.contato;
			$scope.contatoForm.$setPristine();
			$location.path("/contatos");
		});
	};
	
	
});