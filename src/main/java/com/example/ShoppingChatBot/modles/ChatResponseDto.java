package com.example.ShoppingChatBot.modles;

import java.util.List;

public class ChatResponseDto {

    private String message;
    private String type;
    private Object data;
    private List<String> suggestions;

    public ChatResponseDto(String message, String type, Object data, List<String> suggestions) {
        this.message = message;
        this.type = type;
        this.data = data;
        this.suggestions = suggestions;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public List<String> getSuggestions() {
        return suggestions;
    }

    public void setSuggestions(List<String> suggestions) {
        this.suggestions = suggestions;
    }
}
