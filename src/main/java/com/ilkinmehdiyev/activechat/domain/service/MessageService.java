package com.ilkinmehdiyev.activechat.domain.service;

import com.ilkinmehdiyev.activechat.domain.model.Message;

import java.util.List;

public interface MessageService {
    Message saveMessage(Message message);

    List<Message> getChatHistory(String chatId);
}
