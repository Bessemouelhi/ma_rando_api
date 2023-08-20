package com.bessemouelhi.ma_rando.controller;

import com.bessemouelhi.ma_rando.model.Message;
import com.bessemouelhi.ma_rando.service.MessageService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/message")
@AllArgsConstructor
public class MessageController {

    private final MessageService serviceService;

    @PostMapping("/")
    public Message create(@RequestBody Message message) {
        return serviceService.creer(message);
    }

    @GetMapping("/")
    public List<Message> read() {
        return serviceService.lire();
    }

    @PutMapping("/{id}")
    public Message update(@PathVariable Long id, @RequestBody Message message) {
        return serviceService.modifier(id, message);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        return serviceService.supprimer(id);
    }
}
