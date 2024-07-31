package com.ilkinmehdiyev.activechat.infrastructure.persistence;

import com.ilkinmehdiyev.activechat.domain.model.Message;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MessageRepository extends MongoRepository<Message, String> {
    List<Message> findByChatIdOrderByTimestampDesc(String chatId);
}
