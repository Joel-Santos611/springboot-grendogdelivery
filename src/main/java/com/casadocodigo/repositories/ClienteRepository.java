package com.casadocodigo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.casadocodigo.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    
}
