package com.bessemouelhi.ma_rando.service;

import com.bessemouelhi.ma_rando.model.Message;
import com.bessemouelhi.ma_rando.repository.MessageRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MessageServiceImpl implements MessageService{

    private final MessageRepository messageRepository;

    @Override
    public Message creer(Message message) {
        return messageRepository.save(message);
    }

    @Override
    public List<Message> lire() {
        return messageRepository.findAll();
    }

    @Override
    public Message modifier(Long id, Message message) {
        return messageRepository.findById(id).map(msg -> {
            msg.setContenu(message.getContenu());
            msg.setDate(message.getDate());

            return messageRepository.save(msg);
        }).orElseThrow(() -> new RuntimeException("Message non trouvé"));
    }

    @Override
    public String supprimer(Long id) {
        messageRepository.deleteById(id);
        return "Message supprimé";
    }
}
