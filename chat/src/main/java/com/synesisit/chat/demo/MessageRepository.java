package com.synesisit.chat.demo;

import org.springframework.data.cassandra.repository.CassandraRepository;
import java.util.UUID;

public interface MessageRepository extends CassandraRepository<Message, UUID> {
}
