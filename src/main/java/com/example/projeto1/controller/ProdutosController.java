package com.example.projeto1.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projeto1.entities.Produtos;
import com.example.projeto1.repository.ProdutosRepository;


@RestController
@RequestMapping(value = "/produtos")
public class ProdutosController {
	
	@Autowired
	private ProdutosRepository ProdutosRepository;
	
	@GetMapping
	public ResponseEntity<List<Produtos>> findAll(){
		List<Produtos> list = ProdutosRepository.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Produtos> findById(@PathVariable Long id){
		Produtos cat = ProdutosRepository.findById(id).get();
		return ResponseEntity.ok().body(cat);
	}
	
}
