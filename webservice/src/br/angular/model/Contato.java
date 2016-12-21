package br.angular.model;

import java.util.Date;

public class Contato {
	private String nome;
	private Date data;
	private String telefone;
	private Operadora operadora;
	private String serial;
	private Integer id;
	
	public Contato() {

	}

	public Contato(String nome, Date data, String telefone, Operadora operadora,Integer id) {
		this.nome = nome;
		this.data = data;
		this.telefone = telefone;
		this.operadora = operadora;
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Operadora getOperadora() {
		return operadora;
	}

	public void setOperadora(Operadora operadora) {
		this.operadora = operadora;
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
}
