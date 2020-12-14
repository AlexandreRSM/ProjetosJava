package com.escola.turmas.controller;

import java.util.List;

import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.escola.turmas.model.Tema;
import com.escola.turmas.model.turmas;
import com.escola.turmas.repository.TurmasRepository;

@RestController
@RequestMapping("/turmas")
@CrossOrigin("*")
public class TurmasController {

	@Autowired
	private TurmasRepository repository;
	
	@GetMapping
	public ResponseEntity<List<turmas>> getAll()
	{
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/id")
	public ResponseEntity<turmas> GetById(@PathVariable long id)
	{
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/turmas/{turmas}")
	public ResponseEntity<List<turmas>> getByturmas(@PathVariable String turmas)
	{
		return ResponseEntity.ok(repository.findAllByturma(turmas));
	}
	
	@GetMapping("/ativo/{ativo}")
	public ResponseEntity<List<turmas>> getByAtivo(@PathVariable Boolean ativo)
	{
		return ResponseEntity.ok(repository.findAllByativo(ativo));
	}
	
	@PostMapping
	public ResponseEntity<turmas> post (@RequestBody turmas turma)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(turma));
	}
	
	@PutMapping
	public ResponseEntity<turmas> put (@RequestBody turmas turma)
	{
		return ResponseEntity.ok(repository.save(turma));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id)
	{
		repository.deleteById(id);
	}
}
	
	
