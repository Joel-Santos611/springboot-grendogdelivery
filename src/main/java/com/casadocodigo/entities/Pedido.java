package com.casadocodigo.entities;

import java.util.Date;
import java.util.List;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Min;

@Entity
public class Pedido {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@ManyToOne(optional = true)
private Cliente cliente;

@ManyToOne
@Cascade(CascadeType.MERGE)
private List<Item> itens;

@DateTimeFormat(pattern = "dd-MM-YY")
private Date data;

@Min(1)
private Double total;



public Pedido() {
}


public Pedido(Long id, Cliente cliente, List<Item> itens, Date data, Double total) {
    this.id = id;
    this.cliente = cliente;
    this.itens = itens;
    this.data = data;
    this.total = total;
}


public Long getId() {
    return id;
}
public void setId(Long id) {
    this.id = id;
}
public Cliente getCliente() {
    return cliente;
}
public void setCliente(Cliente cliente) {
    this.cliente = cliente;
}
public List<Item> getItens() {
    return itens;
}
public void setItens(List<Item> itens) {
    this.itens = itens;
}
public Date getData() {
    return data;
}
public void setData(Date data) {
    this.data = data;
}
public Double getTotal() {
    return total;
}
public void setTotal(Double total) {
    this.total = total;
}


}
