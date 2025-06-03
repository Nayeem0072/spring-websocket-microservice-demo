package com.synesisit.chat.demo;

import lombok.Data;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;
import java.time.LocalDateTime;
import java.util.UUID;

@Table("messages")
@Data
public class Message {
    @PrimaryKey
    private UUID id;
    private String content;
    private String sender;
    private LocalDateTime timestamp;

    public Message(String content, String sender) {
        this.id = UUID.randomUUID();
        this.content = content;
        this.sender = sender;
        this.timestamp = LocalDateTime.now();
    }
}