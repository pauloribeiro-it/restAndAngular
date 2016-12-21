angular.module("listaTelefonica").factory("contatosAPI",function($http,config,serialGenerator){
	var getContatos = function(){
		return $http.get(config.baseUrl+"/wsContato/allContatos");
	};
	
	var getContato = function(id){
		return $http.get(config.baseUrl+"/wsContato/findContato/"+id);
	};
	
	var saveContato = function(contato){
		return $http.post(config.baseUrl+"/wsContato/adicionarContato", contato);
	};
	
	return{
		getContatos : getContatos,
		saveContato : saveContato,
		getContato  : getContato
	};
});