package com.example.projeto1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.projeto1.entities.Produtos;

@Repository
public interface ProdutosRepository  extends JpaRepository<Produtos, Long>{
	
}
