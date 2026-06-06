package com.example.Hotel.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "consumos")
public class Consome {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String dataConsumo;
    private Integer quantidade;
    private Double valor;

    @ManyToOne
    @JoinColumn(name = "ocupacao_id")
    private Ocupa ocupa;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private ItemFrigobar item;

    public Consome() {
    }
}