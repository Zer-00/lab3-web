package com.mitocode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.model.Nombre;
import com.mitocode.repo.JugadorRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class JugadorService {
     @Autowired 
    private JugadorRepo jugadorRepo;

    public Nombre createJugador(Nombre nombre){
        return jugadorRepo.save(nombre);
    }

    public List<Nombre> getNombres(){
        return (List<Nombre>) jugadorRepo.findAll();
    }

    public void deleteJugador(Integer id){
        jugadorRepo.deleteById(id);
    }
    public void deleteJugadores(){
        jugadorRepo.deleteAll();
    }
}
