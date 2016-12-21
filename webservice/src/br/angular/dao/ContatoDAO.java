package br.angular.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.angular.model.Contato;
import br.angular.model.Operadora;

public class ContatoDAO implements GenericDAO<Contato>{

	public List<Contato> findAll() {
		List<Contato> contatos = new ArrayList<Contato>();
		contatos.add(new Contato("Pedro", new Date(), "9999-8888", new Operadora("Oi",14,"Celular",1.0f),1));
		contatos.add(new Contato("Ana", new Date(), "9999-8877", new Operadora("Vivo",15,"Celular",2.0f),2));
		contatos.add(new Contato("Maria", new Date(), "9999-8866", new Operadora("Tim",41,"Celular",3.0f),3));
		return contatos;
	}

}
