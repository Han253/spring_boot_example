package com.uis.restfulapp.repository;

import com.uis.restfulapp.entity.Author;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Long>{
    
}
