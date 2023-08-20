package com.bessemouelhi.ma_rando.service;

import com.bessemouelhi.ma_rando.model.Parcours;

import java.util.List;

public interface ParcoursService {
    Parcours creer(Parcours parcours);
    List<Parcours> lire();
    Parcours modifier(Long id, Parcours parcours);
    String supprimer(Long id);
}
