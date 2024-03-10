package com.APIexample.repository;

import com.APIexample.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {

    public Persona findByUserAndPassword(String user, String password);
}
