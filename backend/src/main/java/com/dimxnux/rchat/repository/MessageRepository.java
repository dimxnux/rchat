package com.dimxnux.rchat.repository;

import com.dimxnux.rchat.model.Chat;
import com.dimxnux.rchat.model.Message;
import com.dimxnux.rchat.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MessageRepository extends JpaRepository<Message, Long> {

    List<Message> findAllByChatAndSender(Chat chat, User sender);
    List<Message> findAllByChat(Chat chat);
}
