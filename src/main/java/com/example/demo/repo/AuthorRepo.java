package com.example.demo.repo;

import com.example.demo.model.Author;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AuthorRepo  extends JpaRepository<Author, Id> {


    List<Author> findByLastName(String lastName);


}
