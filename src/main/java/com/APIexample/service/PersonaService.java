package com.APIexample.service;

import com.APIexample.dto.PersonaDTO;
import com.APIexample.model.Persona;
import com.APIexample.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements IPersonaService{

    @Autowired
    private PersonaRepository personaRepo;

    @Override
    public Persona crearPersona(Persona persona) {
        return personaRepo.save(persona);
    }

    @Override
    public void borrarPersona(Long id) {
        personaRepo.deleteById(id);
    }

    @Override
    public List<Persona> listarPersonas() {
        return personaRepo.findAll();
    }

    @Override
    public Persona buscarPersonaPorId(Long id) {
        return personaRepo.findById(id).orElse(null);
    }

    @Override
    public void modificarPersona(Persona persona) {
        personaRepo.save(persona);
    }

    public PersonaDTO login(String user, String password) {
       Persona persona = personaRepo.findByUserAndPassword(user, password);

       PersonaDTO personaDTO = new PersonaDTO(persona.getId(),
                                              persona.getUbication(),
                                              persona.getPosition(),
                                              persona.getFullName(),
                                              persona.getImage());

       return personaDTO;
    }
}
