package com.bessemouelhi.ma_rando.repository;

import com.bessemouelhi.ma_rando.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
}
