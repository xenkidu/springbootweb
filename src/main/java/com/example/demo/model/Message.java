package com.example.demo.model;

import java.util.SplittableRandom;

public class Message {
    private String content;

    public Message(String content) {
        this.content = content;
    }
    public Message() {
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
