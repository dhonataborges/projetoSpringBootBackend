package com.example.projeto1.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projeto1.entities.Categorias;
import com.example.projeto1.repository.CategoriaRepository;

import java.util.List;


@RestController
@RequestMapping(value = "/categorias")
public class CategoriasController {
	
	@Autowired
	private CategoriaRepository categoriasRepository;
	
	@GetMapping
	public ResponseEntity<List<Categorias>> findAll(){
		List<Categorias> list = categoriasRepository.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Categorias> findById(@PathVariable Long id){
		Categorias cat = categoriasRepository.findById(id).get();
		return ResponseEntity.ok().body(cat);
	}
	
}
