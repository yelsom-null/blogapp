package com.example.demo.repo;

import com.example.demo.model.Post;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PostRepo extends JpaRepository<Post, Id> {
    Optional<Post> findById(Long id);

    void deleteById(Long id);

}
