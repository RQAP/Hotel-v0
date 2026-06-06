package com.example.Hotel.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "servicos")
public class Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    @Getter
    private String descricaoServico;

    @Setter
    @Getter
    private Double valorServico;

    public Servico() {
    }

    public Servico(String descricaoServico, Double valorServico) {
        this.descricaoServico = descricaoServico;
        this.valorServico = valorServico;
    }

}