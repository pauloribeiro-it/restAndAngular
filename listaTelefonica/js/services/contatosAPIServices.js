angular.module("listaTelefonica").factory("contatosAPI",function($http,config,serialGenerator){
	var getContatos = function(){
		return $http.get(config.baseUrl+"/wsContato/allContatos");
	};
	
	var saveContato = function(contato){
		delete contato.operadora.preco;
		return $http.post(config.baseUrl+"/wsContato/adicionarContato", contato);
	};
	
	return{
		getContatos : getContatos,
		saveContato : saveContato
	};
});