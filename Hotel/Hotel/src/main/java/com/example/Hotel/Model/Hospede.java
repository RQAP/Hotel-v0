package com.example.Hotel.Model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Entity
@Table(name = "Hospedes")
public class Hospede extends Pessoa{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cpf;
    private String dataNasc;
    private String pais;

    public Hospede(String nome, String endereco, String telefone,
                   String email, String bairro, String cep,
                   String cidade, String cpf,
                   String dataNasc, String pais)
    {
        super(nome, endereco, telefone, email, bairro, cep, cidade);

        this.id = id;
        this.cpf= cpf;
        this.dataNasc = dataNasc;
        this.pais = pais;
    }

    public Hospede() {

    }

}
