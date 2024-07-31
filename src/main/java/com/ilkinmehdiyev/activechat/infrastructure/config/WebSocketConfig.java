package com.ilkinmehdiyev.activechat.infrastructure.config;

import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class WebSocketConfig implements WebSocketConfigurer {
    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(new TextWebSocketHandler(), "/chat");
    }
//
//    @Bean
//    public WebSocketHandler WebSocketHandler() {
//        return new WebSocketHandler();
//    }
}
