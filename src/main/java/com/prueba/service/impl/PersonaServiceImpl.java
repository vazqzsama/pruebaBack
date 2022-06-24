package com.prueba.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.prueba.dao.IPersonaDao;
import com.prueba.entity.Persona;
import com.prueba.service.PersonaService;

@Service
@Transactional(readOnly = true)
public class PersonaServiceImpl implements PersonaService {
	
	@Autowired
	private IPersonaDao dao;
	
	@Override
	public List<Persona> findAllPersonas() {
		return (List<Persona>) dao.findAll();
	}
	
}
