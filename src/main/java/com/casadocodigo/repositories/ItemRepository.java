package com.casadocodigo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.casadocodigo.entities.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
