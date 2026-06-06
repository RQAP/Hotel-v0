package com.example.Hotel.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "diarias")
public class Diaria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Setter
    @Getter
    private String dataDiaria;
    @Setter
    @Getter
    private Double valorDiaria;
    @Setter
    @Getter
    private Boolean diariaQuitada;

    @ManyToOne
    @JoinColumn(name = "ocupacao_id")
    private Ocupa ocupa;

    public Diaria() {
    }

    public Diaria(Ocupa ocupa, String dataDiaria, Double valorDiaria) {
        this.ocupa = ocupa;
        this.dataDiaria = dataDiaria;
        this.valorDiaria = valorDiaria;
        this.diariaQuitada = false;
    }

    public Double consultarDiaria() {
        return valorDiaria;
    }

}