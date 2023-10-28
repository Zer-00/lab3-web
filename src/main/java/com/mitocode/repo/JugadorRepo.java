package com.mitocode.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mitocode.model.Nombre;

@Repository
public interface JugadorRepo extends JpaRepository<Nombre,Integer> {
    
}