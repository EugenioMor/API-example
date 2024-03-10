package com.APIexample.service;

import com.APIexample.model.Persona;

import java.util.List;

public interface IPersonaService {

    public Persona crearPersona(Persona persona);

    public void borrarPersona(Long id);

    public List<Persona> listarPersonas();

    public Persona buscarPersonaPorId(Long id);

    public void modificarPersona(Persona persona);
}
