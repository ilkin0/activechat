package com.ilkinmehdiyev.activechat.interfaces.web.rest;

import com.ilkinmehdiyev.activechat.domain.model.Message;
import com.ilkinmehdiyev.activechat.domain.service.MessageService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/messages")
@Slf4j
@RequiredArgsConstructor
public class MessagesController {
    private final MessageService messageService;

    @GetMapping("/{chatId}")
    public List<Message> getMessages(@PathVariable("chatId") String chatId) {
        log.info("Getting messages for chat id {}", chatId);
        return messageService.getChatHistory(chatId);
    }
}
