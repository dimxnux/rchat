package com.dimxnux.rchat.controller.dto;

import com.dimxnux.rchat.model.Chat;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.Instant;

@Getter
@RequiredArgsConstructor
public class ChatDTO {

    private final Long id;
    private final Instant createdAt;

    public static ChatDTO from(Chat chat) {
        return new ChatDTO(
                chat.getId(),
                chat.getCreatedAt()
        );
    }
}
