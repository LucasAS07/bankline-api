package com.dio.stander.bankline.api.model;

public class Movimentacao {
	private Interger id;
	private LocalDataTime datahora;
	private String descricao;
	private Double valor;
	private MovimentacaoTipo tipo;
	public Interger getId() {
		return id;
	}
	public void setId(Interger id) {
		this.id = id;
	}
	public LocalDataTime getDatahora() {
		return datahora;
	}
	public void setDatahora(LocalDataTime datahora) {
		this.datahora = datahora;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public MovimentacaoTipo getTipo() {
		return tipo;
	}
	public void setTipo(MovimentacaoTipo tipo) {
		this.tipo = tipo;
	}
	
	
}
