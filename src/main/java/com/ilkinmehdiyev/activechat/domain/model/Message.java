package com.ilkinmehdiyev.activechat.domain.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Getter
@Setter
@Document
public class Message {
    @Id
    private String id;
    private String chatId;
    private String senderId;
    private String content;
    private Instant timestamp;

    public Message(String id, String chatId, String senderId, String content, Instant timestamp) {
        this.id = id;
        this.chatId = chatId;
        this.senderId = senderId;
        this.content = content;
        this.timestamp = timestamp;
    }

    public Message(String content) {
        this.content = content;
    }
}
