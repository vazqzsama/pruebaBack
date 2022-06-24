package com.prueba.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prueba.entity.Persona;

@Repository
public interface IPersonaDao extends CrudRepository<Persona, Long> {

}
