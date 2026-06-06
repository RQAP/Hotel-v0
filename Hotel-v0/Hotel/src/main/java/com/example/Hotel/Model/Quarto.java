package com.example.Hotel.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "quartos")
public class Quarto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    @Getter
    private Integer numero;
    @Setter
    @Getter
    private Integer situacao;

    @Setter
    @Getter
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    public Quarto() {
    }

    public Quarto(Integer numero, Categoria categoria) {
        this.numero = numero;
        this.categoria = categoria;
        this.situacao = 0;
    }

}