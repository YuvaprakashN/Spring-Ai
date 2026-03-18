package com.eazybyte.yuva.springai.spring_ai_demo.advisor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ai.chat.client.ChatClientRequest;
import org.springframework.ai.chat.client.ChatClientResponse;
import org.springframework.ai.chat.client.advisor.api.CallAdvisor;
import org.springframework.ai.chat.client.advisor.api.CallAdvisorChain;
import org.springframework.ai.chat.model.ChatResponse;

public class TokenUsageAuditAdvisor implements CallAdvisor {
    private static final Logger logger = LoggerFactory.getLogger(TokenUsageAuditAdvisor.class);

    @Override
    public ChatClientResponse adviseCall(ChatClientRequest chatClientRequest, CallAdvisorChain callAdvisorChain) {

        ChatClientResponse response = callAdvisorChain.nextCall(chatClientRequest);
        ChatResponse chatResponse = response.chatResponse();
        if (chatResponse.getMetadata() != null) {
logger.info(chatResponse.getMetadata().getUsage().getTotalTokens().toString());
        }
        return response;
    }

    @Override
    public String getName() {
        return this.getClass().getName();
    }

    @Override
    public int getOrder() {
        return 1;
    }
}
