angular.module("listaTelefonica").filter("nameFilter",function(){
	return function(input){
		var listaDeNomes = input.split(" ");
		listaDeNomes = listaDeNomes.map(function(nome){
			if(/(da|de)/.test(nome)) return nome;
			return nome.charAt(0).toUpperCase() + nome.substring(1);
		});		
		return listaDeNomes.join(" ");
	};

});