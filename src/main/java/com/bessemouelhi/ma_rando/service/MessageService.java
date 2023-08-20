package com.bessemouelhi.ma_rando.service;

import com.bessemouelhi.ma_rando.model.Message;

import java.util.List;

public interface MessageService {
    Message creer(Message message);

    List<Message> lire();

    Message modifier(Long id, Message message);

    String supprimer(Long id);
}
