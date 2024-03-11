package com.casadocodigo.entities;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

@Entity
public class Item {

@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@NotNull
@Length(min = 2, max = 30, message = "O tamanho do nome deve ser entre {min} e {max} caracteres")
private String nome;

@NotNull
@Min(value = 20,message = "O valor minimo deve ser {value} reais")
private Double preco;


public Item() {
}

public Item(Long id, String nome, Double preco) {
    this.id = id;
    this.nome = nome;
    this.preco = preco;
}

public Long getId() {
    return id;
}
public void setId(Long id) {
    this.id = id;
}
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public Double getPreco() {
    return preco;
}
public void setPreco(Double preco) {
    this.preco = preco;
}


}
