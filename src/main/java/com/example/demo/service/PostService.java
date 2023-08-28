package com.example.demo.service;

import com.example.demo.model.Post;
import com.example.demo.repo.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
public class PostService {
    @Autowired
    private PostRepo postRepo;


    public Post createPost(Post post){
        return postRepo.save(post);
    }

    public Post getPost(Long id){
        return postRepo.findById(id).orElse(null);
    }

    public List<Post> getAllPosts() {
        return postRepo.findAll();
    }

    public void deletePost(Long id) {
        postRepo.deleteById(id);
    }
}
