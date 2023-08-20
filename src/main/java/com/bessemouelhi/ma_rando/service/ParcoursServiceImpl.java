package com.bessemouelhi.ma_rando.service;

import com.bessemouelhi.ma_rando.model.Parcours;
import com.bessemouelhi.ma_rando.repository.ParcoursRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ParcoursServiceImpl implements ParcoursService{

    private final ParcoursRepository parcoursRepository;

    @Override
    public Parcours creer(Parcours parcours) {
        return parcoursRepository.save(parcours);
    }

    @Override
    public List<Parcours> lire() {
        return parcoursRepository.findAll();
    }

    @Override
    public Parcours modifier(Long id, Parcours parcours) {
        return parcoursRepository.findById(id).map(p -> {
            p.setNom(parcours.getNom());
            p.setDistance(parcours.getDistance());
            p.setDepart_lat(parcours.getDepart_lat());
            p.setDepart_lng(parcours.getDepart_lng());
            p.setDuree(parcours.getDuree());
            p.setDifficulte(parcours.getDifficulte());
            p.setNote(parcours.getNote());
            p.setDate(parcours.getDate());
            p.setImage(parcours.getImage());

            return parcoursRepository.save(p);
        }).orElseThrow(() -> new RuntimeException("Parcours non trouvé"));
    }

    @Override
    public String supprimer(Long id) {
        parcoursRepository.deleteById(id);
        return "Parcours supprimé";
    }
}
