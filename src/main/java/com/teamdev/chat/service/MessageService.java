package com.teamdev.chat.service;


import java.util.Date;

public interface MessageService {

    Iterable<MessageDTO> getUserChatRoomMessages(long chatRoom);
    boolean sendMessage(long actor, long chatRoom);
    boolean sendPrivateMessage(long actor, long chatRoom, long user);

    class MessageDTO{
        final Long fromUserId;
        final String fromUserName;
        final String message;
        final boolean privateMessage;
        private Date date;

        public MessageDTO(Long fromUserId, String fromUserName, String message, boolean privateMessage, Date date) {
            this.fromUserId = fromUserId;
            this.fromUserName = fromUserName;
            this.message = message;
            this.privateMessage = privateMessage;
            this.date = date;
        }

        public Date getDate() {
            return date;
        }
    }
}
