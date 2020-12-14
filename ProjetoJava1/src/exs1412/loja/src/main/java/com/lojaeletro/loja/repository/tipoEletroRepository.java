package com.lojaeletro.loja.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lojaeletro.loja.model.tipoEletro;

@Repository
public interface tipoEletroRepository extends JpaRepository<tipoEletro, Long> {

	public List<tipoEletro> findAllById(Long id);
	
	public List<tipoEletro> findAllByAtivo(Boolean ativo);
}
