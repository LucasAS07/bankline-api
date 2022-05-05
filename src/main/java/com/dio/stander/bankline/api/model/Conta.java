package com.dio.stander.bankline.api.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Conta {
	@Column(name = "conta_numero")
	private Long numeo;
	
	@Column(name = "conta_saldo")
	private Double saldo;
	
	public Long getNumeo() {
		return numeo;
	}
	public void setNumeo(Long numeo) {
		this.numeo = numeo;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	
}
