package com.example.Hotel.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "itens_frigobar")
public class ItemFrigobar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    @Getter
    private String descricaoItem;

    @Setter
    @Getter
    private Double valorItem;

    public ItemFrigobar() {
    }

    public ItemFrigobar(String descricaoItem, Double valorItem) {
        this.descricaoItem = descricaoItem;
        this.valorItem = valorItem;
    }

}