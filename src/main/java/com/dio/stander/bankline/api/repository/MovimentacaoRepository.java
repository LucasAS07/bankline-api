package com.dio.stander.bankline.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.stander.bankline.api.model.Movimentacao;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Integer>{

}
