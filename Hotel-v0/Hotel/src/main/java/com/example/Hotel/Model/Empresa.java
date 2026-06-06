package com.example.Hotel.Model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="empresas")
public class Empresa extends Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cnpj;

    public Empresa() {}

    public Empresa(String nome, String endereco, String telefone,
                   String email, String bairro, String cep,
                   String cidade, String cnpj) {

        super(nome, endereco, telefone, email, bairro, cep, cidade);
        this.cnpj = cnpj;


    }
}
