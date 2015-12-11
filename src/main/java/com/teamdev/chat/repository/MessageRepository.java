package com.teamdev.chat.repository;


import com.teamdev.chat.entity.Message;

import java.util.Date;

public interface MessageRepository extends CRUDRepository<Message> {
    Iterable<Message> findAllUserMessages(long userId, long chatRoom);
    Iterable<Message> findAllUserMessagesBefore(long userId, long chatRoom, Date date);
}
