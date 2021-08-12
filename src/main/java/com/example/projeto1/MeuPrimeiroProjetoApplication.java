package com.example.projeto1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.projeto1.entities.Categorias;
import com.example.projeto1.entities.Produtos;
import com.example.projeto1.repository.CategoriaRepository;
import com.example.projeto1.repository.ProdutosRepository;

@SpringBootApplication
public class MeuPrimeiroProjetoApplication  implements CommandLineRunner{
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private ProdutosRepository produtosRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(MeuPrimeiroProjetoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categorias cat1 = new Categorias(null, "Eletricos");
		Categorias cat2 = new Categorias(null, "books");
		
		Produtos p1 = new Produtos(null, "TV", 2200.00, cat1);
		Produtos p2 = new Produtos(null,"Domain Driven Designer", 2200.00, cat2);
		Produtos p3 = new Produtos(null, "PS5", 2800.00, cat1);
		Produtos p4 = new Produtos(null, "Doker", 100.00, cat2);
		
		cat1.getProdutos().addAll(Arrays.asList(p1,p3));
		cat1.getProdutos().addAll(Arrays.asList(p2,p4));
				
		categoriaRepository.save(cat1);
		categoriaRepository.save(cat2);
		
		produtosRepository.save(p1);
		produtosRepository.save(p2);
		produtosRepository.save(p3);
		produtosRepository.save(p4);
		
	}

}
