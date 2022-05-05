package com.dio.stander.bankline.api.model;

public class Correntista {
	private Integer id;
	private String nome;
	private String cpf;
	
	private Conta conta;
	
	private void getconta() {
		// TODO Auto-generated method stub

	}
	
	private void voidconta() {
		// TODO Auto-generated method stub

	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}
