package com.bessemouelhi.ma_rando.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "PARCOURS")
@Getter
@Setter
@NoArgsConstructor
public class Parcours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    private Double distance;

    private Double depart_lat;

    private Double depart_lng;

    private Double duree;

    private int difficulte;

    private int note;

    private int date;

    private String image;

    private int id_utilisateur;
}
