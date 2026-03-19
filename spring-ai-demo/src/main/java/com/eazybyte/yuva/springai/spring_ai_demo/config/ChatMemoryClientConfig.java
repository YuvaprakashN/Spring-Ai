package com.eazybyte.yuva.springai.spring_ai_demo.config;

import com.eazybyte.yuva.springai.spring_ai_demo.advisor.TokenUsageAuditAdvisor;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.SimpleLoggerAdvisor;
import org.springframework.ai.chat.prompt.ChatOptions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ChatMemoryClientConfig {

    @Bean
    public ChatClient chatClient(ChatClient.Builder chatClientBuilder) {

        return chatClientBuilder
                .build();
    }
}
