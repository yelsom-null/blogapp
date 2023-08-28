package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class Comment {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @ManyToOne
    Post post;
    String text;
    public Comment(){}

    public Comment(String text){
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
