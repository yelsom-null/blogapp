package com.example.demo.model;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Post {

    @OneToMany(mappedBy = "post")
    private List<Comment> comments;

    @ManyToOne
    private Author author;

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    String postText;
    public Post() {
    }

    public Post(String postText) {
        this.postText = postText;
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }
}
