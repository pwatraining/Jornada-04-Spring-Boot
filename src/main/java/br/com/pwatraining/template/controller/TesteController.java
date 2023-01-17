package br.com.pwatraining.template.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/teste/")
public class TesteController {

	@GetMapping("getautor")
	public ResponseEntity<String> getAutor() {
		String autor = "Anderson Fabio da Silva";
		return new ResponseEntity<>(autor, HttpStatus.OK);
	} 
}