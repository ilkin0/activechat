package com.ilkinmehdiyev.activechat.application.service;

import com.ilkinmehdiyev.activechat.domain.model.Message;
import com.ilkinmehdiyev.activechat.domain.service.MessageService;
import com.ilkinmehdiyev.activechat.infrastructure.persistence.MessageRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class MessageApplicationService implements MessageService {
    private final MessageRepository messageRepository;

    @Override
    public Message saveMessage(Message message) {
        log.info("Starting to save message for chat: {}", message.getChatId());
        return messageRepository.save(message);
    }

    @Override
    public List<Message> getChatHistory(String chatId) {
        log.info("Starting to get chat history for chat: {}", chatId);
        return messageRepository.findByChatIdOrderByTimestampDesc(chatId);
    }
}
