package com.teamdev.chat.entity;


import java.util.Date;

public class Message {
    private Long id;
    private Long userFromId;
    private Long userToId;
    private Long chatRoomId;
    private Date date;
    private String message;

}
