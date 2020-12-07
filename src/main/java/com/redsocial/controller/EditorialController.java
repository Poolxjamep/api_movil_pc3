package com.redsocial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redsocial.entity.Editorial;
import com.redsocial.service.EditorialService;

@RestController
@RequestMapping("/api/rest/editorial")
public class EditorialController {

	@Autowired
	private EditorialService service;
	
	@GetMapping("/")
	public ResponseEntity<List<Editorial>> lista(){
		return ResponseEntity.ok(service.listaEditorial());
	}
	
	@GetMapping("/porNombre/{filtro}")
	public ResponseEntity<List<Editorial>> listaPorNombre(@PathVariable String filtro){
		return ResponseEntity.ok(service.listaEditorialPorNombre(filtro));
	}
}
