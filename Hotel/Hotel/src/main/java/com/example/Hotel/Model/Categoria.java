package com.example.Hotel.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Entity
@Table(name = "categorias")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private Double valor;

    public void categoria() {}

    public void categoria(String descricao, Long id, Double valor){
        this.descricao = descricao;
        this.id = id;
        this.valor = valor;

    }

}
