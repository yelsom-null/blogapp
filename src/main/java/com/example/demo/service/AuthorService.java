package com.example.demo.service;


import com.example.demo.model.Author;
import com.example.demo.repo.AuthorRepo;
import jakarta.persistence.Access;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepo authorRepo;

    public Author saveAuthor(Author author){
        return authorRepo.save(author);
    }

    public List<Author> findAuthor(String lastName){
        return authorRepo.findByLastName(lastName);
    }



    public List<Author> showAllAuthors(){
        return authorRepo.findAll();
    }
}
