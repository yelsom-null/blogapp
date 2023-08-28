package com.example.demo.controller;

import com.example.demo.model.Author;
import com.example.demo.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Author")
public class AuthorController {


    private AuthorService authorService;
    @Autowired
    public AuthorController(AuthorService authorService){
        this.authorService = authorService;
    }

    @PostMapping("add")
    public ResponseEntity<Author> createAuthor(@RequestBody Author author){
        Author newAuthor = authorService.saveAuthor(author);
        return new ResponseEntity<>(newAuthor, HttpStatus.CREATED);
    }

    @GetMapping ("find")
    public ResponseEntity<List<Author>> findAuthorById(@RequestParam String lastName){
        List<Author> author = authorService.findAuthor(lastName);
        return new ResponseEntity<>(author,HttpStatus.OK);
    }

}
