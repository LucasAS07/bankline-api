package com.dio.stander.bankline.api.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name = "tab_correntista")
public class Correntista {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length = 60)
	private String nome;
	
	@Column(length = 20)
	private String cpf;
	
	@Embeddable
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
