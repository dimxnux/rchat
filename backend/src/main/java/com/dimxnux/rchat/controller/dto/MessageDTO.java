package com.dimxnux.rchat.controller.dto;

import com.dimxnux.rchat.model.Message;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.Instant;

@RequiredArgsConstructor
@Getter
public class MessageDTO {

    private final String sender;
    private final String content;
    private final Instant createdAt;

    public static MessageDTO from(Message message) {
        return new MessageDTO(
                message.getSender().getUsername(),
                message.getContent(),
                message.getCreatedAt()
        );
    }
}
