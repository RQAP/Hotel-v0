package com.example.Hotel.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "solicitacoes")
public class Solicita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String dataServico;
    private Double valor;

    @ManyToOne
    @JoinColumn(name = "ocupacao_id")
    private Ocupa ocupa;

    @ManyToOne
    @JoinColumn(name = "servico_id")
    private Servico servico;

    public Solicita() {
    }
}