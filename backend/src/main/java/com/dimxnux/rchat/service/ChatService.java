package com.dimxnux.rchat.service;

import com.dimxnux.rchat.model.Chat;
import com.dimxnux.rchat.repository.ChatRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ChatService {

    private final ChatRepository chatRepository;

    public List<Chat> findAll() {
        return chatRepository.findAll();
    }
}
