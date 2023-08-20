package com.bessemouelhi.ma_rando.repository;

import com.bessemouelhi.ma_rando.model.Parcours;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParcoursRepository extends JpaRepository<Parcours, Long> {
}