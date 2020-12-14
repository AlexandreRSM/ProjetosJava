package com.lojaeletro.loja.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lojaeletro.loja.model.*;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	public List<Categoria> findAllById(Long id);
	
	public List<Categoria> findAllByDescricaoContainingIgnoreCase(String descricao);
}