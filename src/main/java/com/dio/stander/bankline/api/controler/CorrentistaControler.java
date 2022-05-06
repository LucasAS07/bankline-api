package com.dio.stander.bankline.api.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dio.stander.bankline.api.repository.CorrentistaRepository;
import com.dio.stander.bankline.api.model.Correntista;

import java.util.List;

@RestController
@RequestMapping("/correntistas")
public class CorrentistaControler {
	@Autowired
	private CorrentistaRepository repository;
	
	@GetMapping
	public List<Correntista> findAll(){
		return repository.findAll();
	}
	
	@PostMapping
	public void save(@RequestBody Correntista correntista) {
		
	}
}
