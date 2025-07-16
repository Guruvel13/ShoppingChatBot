package com.example.ShoppingChatBot.modles;

import java.sql.Timestamp;

public class ChatMessageDto {

    private String message;
    private String sessionId;
    private String userType;
    private Timestamp timestamp;

    public ChatMessageDto(String message, String sessionId, String userType, Timestamp timestamp) {
        this.message = message;
        this.sessionId = sessionId;
        this.userType = userType;
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

}
