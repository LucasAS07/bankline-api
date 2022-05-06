package com.dio.stander.bankline.api.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.dio.stander.bankline.api.dto.NovaMovimentacao;
import com.dio.stander.bankline.api.model.Correntista;
import com.dio.stander.bankline.api.model.Movimentacao;
import com.dio.stander.bankline.api.model.MovimentacaoTipo;
import com.dio.stander.bankline.api.repository.CorrentistaRepository;
import com.dio.stander.bankline.api.repository.MovimentacaoRepository;

@Service
public class MovimentacaoService {
	@Autowired
	private MovimentacaoRepository repository;
	
	@Autowired
	private CorrentistaRepository correntistaRepository;
	public void save(NovaMovimentacao novaMovimentacao) {
		Movimentacao movimentacao = new Movimentacao();
		Double valor = novaMovimentacao.getTipo()==MovimentacaoTipo.RECEITA? novaMovimentacao.getValor() : novaMovimentacao.getValor() *  -1;
		movimentacao.setDatahora(LocalDateTime.now());
		movimentacao.setDescricao(novaMovimentacao.getDescricao());
		movimentacao.setidConta(novaMovimentacao.getIdConta());
		movimentacao.setTipo(novaMovimentacao.getTipo());
		movimentacao.setValor(valor);
		
		Correntista correntista = correntistaRepository.findById(novaMovimentacao.getIdConta()).orElse(null);
		if (correntista != null) {
			correntista.getConta().setSaldo(correntista.getConta().getSaldo() + valor);
			correntistaRepository.save(correntista);
		}
		
		repository.save(movimentacao);
	}
}
