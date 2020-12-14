package com.escola.turmas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.escola.turmas.model.turmas;

@Repository
public interface TurmasRepository extends JpaRepository<turmas, Long> {
	
	public List<turmas> findAllById(Long id);
	
	public List<turmas> findAllByturma(String turmas);
	
	public List<turmas> findAllByativo(Boolean ativo);

}
