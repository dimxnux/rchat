package com.dimxnux.rchat.service;

import com.dimxnux.rchat.model.Chat;
import com.dimxnux.rchat.model.Message;
import com.dimxnux.rchat.repository.ChatRepository;
import com.dimxnux.rchat.repository.MessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MessageService {

    private final ChatRepository chatRepository;
    private final MessageRepository messageRepository;

    public List<Message> findAllByChatId(long chatId) {
        Chat chat = chatRepository.findById(chatId).orElseThrow();;
        return messageRepository.findAllByChat(chat);
    }
}
