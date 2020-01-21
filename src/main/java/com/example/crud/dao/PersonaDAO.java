
package com.example.crud.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.crud.model.Persona;

public interface PersonaDAO extends CrudRepository<Persona, Integer> {

}
