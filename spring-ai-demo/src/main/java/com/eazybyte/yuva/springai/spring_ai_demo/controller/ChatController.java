package com.eazybyte.yuva.springai.spring_ai_demo.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ChatController {

    private ChatClient chatClient;

    public ChatController(ChatClient.Builder builder){
        this.chatClient=builder.build();
    }

    @GetMapping("/chat")
    public String chat(@RequestParam String message){
        return chatClient.prompt(message).call().content();
    }

}
