package com.example.Hotel.Model;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@MappedSuperclass
public class Pessoa {

    protected String nome;
    protected String endereco;
    protected String telefone;
    protected String email;
    protected String cep;
    protected String cidade;
    protected String bairro;

    public Pessoa() {
    }

    public Pessoa(String nome, String endereco, String telefone, String email,
                  String cep, String cidade, String bairro) {

        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.cep = cep;
        this.cidade = cidade;
        this.bairro = bairro; }

}


