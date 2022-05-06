package com.dio.stander.bankline.api.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dio.stander.bankline.api.repository.CorrentistaRepository;
import com.dio.stander.bankline.api.repository.MovimentacaoRepository;
import com.dio.stander.bankline.api.service.CorrentistaService;
import com.dio.stander.bankline.api.service.MovimentacaoService;
import com.dio.stander.bankline.api.dto.NovaMovimentacao;
import com.dio.stander.bankline.api.dto.NovoCorrentista;
import com.dio.stander.bankline.api.model.Correntista;
import com.dio.stander.bankline.api.model.Movimentacao;

import java.util.List;

@RestController
@RequestMapping("/movimentacoes")
public class MovimentacaoControler {
	@Autowired
	private MovimentacaoRepository repository;
	
	@Autowired
	private MovimentacaoService service;
	
	@GetMapping
	public List<Movimentacao> findAll(){
		return repository.findAll();
	}
	
	@PostMapping
	public void save(@RequestBody NovaMovimentacao movimentacao) {
		service.save(movimentacao);
	}
}
