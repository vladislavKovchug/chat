package com.teamdev.chat.entity;


import java.util.Date;

public class Message {
    private Long id;
    private Long userFromId;
    private Long userToId;
    private Long chatRoomId;
    private Date date;
    private String message;

    public Message() {
    }

    public Message(Long id, Long userFromId, Long userToId, Long chatRoomId, Date date, String message) {
        this.id = id;
        this.userFromId = userFromId;
        this.userToId = userToId;
        this.chatRoomId = chatRoomId;
        this.date = date;
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserFromId() {
        return userFromId;
    }

    public void setUserFromId(Long userFromId) {
        this.userFromId = userFromId;
    }

    public Long getUserToId() {
        return userToId;
    }

    public void setUserToId(Long userToId) {
        this.userToId = userToId;
    }

    public Long getChatRoomId() {
        return chatRoomId;
    }

    public void setChatRoomId(Long chatRoomId) {
        this.chatRoomId = chatRoomId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
