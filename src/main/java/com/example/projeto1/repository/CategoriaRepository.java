package com.example.projeto1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.projeto1.entities.Categorias;

@Repository
public interface CategoriaRepository extends JpaRepository<Categorias, Long>{
	
}
