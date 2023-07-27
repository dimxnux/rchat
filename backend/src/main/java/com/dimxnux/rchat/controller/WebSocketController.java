package com.dimxnux.rchat.controller;

import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {

    @MessageMapping("/echo")
    @SendTo("/topic/echo")
    public Message<String> echo(Message<String> payload) {
        return payload;
    }
}
