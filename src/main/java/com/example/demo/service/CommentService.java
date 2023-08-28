package com.example.demo.service;

import com.example.demo.model.Comment;
import com.example.demo.repo.CommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentRepo commentRepo;

    public Comment saveComment(Comment comment){
        return commentRepo.save(comment);
    }


    public List<Comment> findAllComments(){
        return commentRepo.findAll();
    }



}
