package com.mitocode.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mitocode.model.Nombre;
import com.mitocode.service.JugadorService;

@RestController
@RequestMapping("/jugador")
public class JugadorController {
    @Autowired
    private JugadorService jugadorService;

    @GetMapping("/get")
    public List<Nombre> getNombres(){
        return jugadorService.getNombres();
    }

    @PostMapping("/create")
    public Nombre createJugador(@RequestBody Nombre nombre){
        System.out.println(nombre);
        return jugadorService.createJugador(nombre);
    }

    @DeleteMapping(value = "/delete/{id}")
    public String deleteClient(@PathVariable Integer id) {
        jugadorService.deleteJugador(id);
        return "Client has been deleted successfully.";
    }
    @DeleteMapping("/delete/all")
    public String deleteJugadores(){
    jugadorService.deleteJugadores();
    return "todos los jugadores eliminados";
    }
}
