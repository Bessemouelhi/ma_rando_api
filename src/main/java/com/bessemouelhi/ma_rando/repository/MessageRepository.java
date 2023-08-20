package com.bessemouelhi.ma_rando.repository;

import com.bessemouelhi.ma_rando.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}