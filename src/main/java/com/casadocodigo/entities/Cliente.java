package com.casadocodigo.entities;

import java.util.List;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;

@Entity
public class Cliente {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@Length(min = 2, max = 300, message = "O tamanho do nome deve ser entre {min} e {max} caracteres")
private String nome;

@NotNull
@Length(min = 2, max = 300, message = "O tamanho do endereço deve ser entre {min} e {max} caracteres")
private String endereco;

@OneToMany(mappedBy = "Cliente", fetch = FetchType.EAGER)
@Cascade(CascadeType.ALL)
private List<Pedido> pedidos;


public Cliente() {
}


public Cliente(Long id, String nome, String endereco, List<Pedido> pedidos) {
    this.id = id;
    this.nome = nome;
    this.endereco = endereco;
    this.pedidos = pedidos;
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
public String getEndereco() {
    return endereco;
}
public void setEndereco(String endereco) {
    this.endereco = endereco;
}
public List<Pedido> getPedidos() {
    return pedidos;
}
public void setPedidos(List<Pedido> pedidos) {
    this.pedidos = pedidos;
}


}
