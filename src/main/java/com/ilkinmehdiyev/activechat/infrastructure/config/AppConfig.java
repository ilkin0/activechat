package com.ilkinmehdiyev.activechat.infrastructure.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.socket.config.annotation.EnableWebSocket;

@Configuration
@EnableWebSocket
@Import({WebSocketConfig.class})
public class AppConfig {
}
