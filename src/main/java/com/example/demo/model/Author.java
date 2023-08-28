package com.example.demo.model;

import jakarta.persistence.*;
import org.springframework.cglib.core.GeneratorStrategy;

import java.util.List;


@Entity
public class Author {
    private String firstName;
    private String lastName;
    private String userName;
    private int uniqueId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(mappedBy = "author")
    private List<Post> posts;
    public Author(){}
    public Author(String firstName, String lastName, String userName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
