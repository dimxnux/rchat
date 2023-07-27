package com.dimxnux.rchat.repository;

import com.dimxnux.rchat.model.Chat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface ChatRepository extends JpaRepository<Chat, Long> {
}
