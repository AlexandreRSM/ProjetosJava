package com.lojaeletro.loja.controller;

import java.util.List;

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

import com.lojaeletro.loja.model.tipoEletro;
import com.lojaeletro.loja.repository.tipoEletroRepository;

@RestController
@RequestMapping("/lojaeletro")
@CrossOrigin
public class tipoEletroController {

	@Autowired
	private tipoEletroRepository repository;
	
	/*findAll*/
	
	@GetMapping
	public ResponseEntity<List<tipoEletro>> GetAll()
	{
		return ResponseEntity.ok(repository.findAll());
	}
	
	/*findByID*/
	
	@GetMapping("/id")
	public ResponseEntity<tipoEletro> GetById(@PathVariable long id)
	{
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public ResponseEntity<tipoEletro> post (@RequestBody tipoEletro eletro)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(eletro));
	}
	
	@PutMapping
	public ResponseEntity<tipoEletro> put (@RequestBody tipoEletro eletro)
	{
		return ResponseEntity.ok(repository.save(eletro));
	}
	
	@DeleteMapping
	public void delete(@PathVariable long id)
	{
		repository.deleteById(id);
	}
}
