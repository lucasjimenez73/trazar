package ar.edu.unsl.trazar.service;

import ar.edu.unsl.trazar.repository.PersonaRepository;
import ar.edu.unsl.trazar.entity.Persona;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Resource
    private PersonaRepository personaRepository;

    @Override
    public Persona createPersona(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public Persona getPersonaById(Integer id) {
        return personaRepository.findById(id).orElse(null);
    }
}
