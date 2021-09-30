package com.uis.restfulapp.service;

import java.util.ArrayList;
import java.util.List;

import com.uis.restfulapp.dto.AuthorDetails;
import com.uis.restfulapp.dto.AuthorForm;
import com.uis.restfulapp.entity.Author;
import com.uis.restfulapp.repository.AuthorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService{

    @Autowired
    private AuthorRepository Author_repository;

    @Override
    public AuthorDetails create(AuthorForm authorData){
        Author author = authorData.getEntity();
        AuthorDetails author_detail = new AuthorDetails();
        author_detail.setEntity(Author_repository.save(author));
        return author_detail;
    }

    @Override
    public List<AuthorDetails> findAll(){
        Iterable<Author> list_authors = Author_repository.findAll();
        List<AuthorDetails> list_details = new ArrayList<>();

        list_authors.forEach(author->{
            AuthorDetails detail = new AuthorDetails();
            detail.setEntity(author);
            list_details.add(detail);
        });
        return list_details;
    }

    
}
