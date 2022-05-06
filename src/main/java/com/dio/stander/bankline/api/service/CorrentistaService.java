package com.dio.stander.bankline.api.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.stander.bankline.api.dto.NovoCorrentista;
import com.dio.stander.bankline.api.model.Conta;
import com.dio.stander.bankline.api.model.Correntista;
import com.dio.stander.bankline.api.repository.CorrentistaRepository;

@Service
public class CorrentistaService {
	@Autowired
	private CorrentistaRepository repository;
	public void save(NovoCorrentista novoCorrentista) {
		Correntista correntista = new Correntista();
		correntista.setCpf(novoCorrentista.getCpf());
		correntista.setNome(novoCorrentista.getNome());
		
		Conta conta = new Conta();
		conta.setSaldo(0.0);
		conta.setNumeo(new Date().getTime());
		
		correntista.set
		repository.save(correntista);
		}
}
