package com.bessemouelhi.ma_rando.controller;

import com.bessemouelhi.ma_rando.model.Parcours;
import com.bessemouelhi.ma_rando.service.ParcoursService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parcours")
@AllArgsConstructor
public class ParcoursController {

    private final ParcoursService parcoursService;

    @PostMapping("/")
    public Parcours create(@RequestBody Parcours parcours) {
        return parcoursService.creer(parcours);
    }

    @GetMapping("/")
    public List<Parcours> read() {
        return parcoursService.lire();
    }

    @PutMapping("/{id}")
    public Parcours update(@PathVariable Long id, @RequestBody Parcours parcours) {
        return parcoursService.modifier(id, parcours);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        return parcoursService.supprimer(id);
    }
}
