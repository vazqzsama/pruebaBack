package com.prueba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.entity.Persona;
import com.prueba.service.PersonaService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping(path = "/api/")
public class PersonaController {

	@Autowired
	private PersonaService service;
	
	@RequestMapping(path = "findAllPersonas",method = RequestMethod.GET)
	public List<Persona> findAllPersonas() {
		return service.findAllPersonas();
	}
	
}
