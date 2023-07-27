package com.dimxnux.rchat.controller;

import com.dimxnux.rchat.controller.dto.ChatDTO;
import com.dimxnux.rchat.controller.dto.MessageDTO;
import com.dimxnux.rchat.model.Chat;
import com.dimxnux.rchat.model.Message;
import com.dimxnux.rchat.service.ChatService;
import com.dimxnux.rchat.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class ChatRestController {

    private final MessageService messageService;
    private final ChatService chatService;

    @GetMapping("/chats/{id}/messages")
    public ResponseEntity<List<MessageDTO>> messagesByChat(@PathVariable("id") Long chatId) {
        List<Message> messages = messageService.findAllByChatId(chatId);
        List<MessageDTO> messageDTOList = messages.stream().map(MessageDTO::from).collect(Collectors.toList());
        return ResponseEntity.ok(messageDTOList);
    }

    @GetMapping("/chats")
    public ResponseEntity<List<ChatDTO>> chats() {
        List<Chat> chats = chatService.findAll();
        List<ChatDTO> chatRespons = chats.stream().map(ChatDTO::from).collect(Collectors.toList());
        return ResponseEntity.ok(chatRespons);
    }
}
