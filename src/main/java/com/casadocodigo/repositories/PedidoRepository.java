package com.casadocodigo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.casadocodigo.entities.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
