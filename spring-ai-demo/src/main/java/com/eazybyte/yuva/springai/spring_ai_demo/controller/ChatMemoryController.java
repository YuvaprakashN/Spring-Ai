package com.eazybyte.yuva.springai.spring_ai_demo.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ChatMemoryController {

    private ChatClient chatClient;

    public ChatMemoryController(ChatClient chatClient){
        this.chatClient=chatClient;
    }

    @GetMapping("/chat-memory")
    public String chat(@RequestParam String message){

        return chatClient
                .prompt()
                .user(message)
                .call().content();
    }

}
