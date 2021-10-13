package com.uis.restfulapp.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

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

    @Override
    public AuthorDetails findById(Long id){
        AuthorDetails author_detail = new AuthorDetails();
        Author author = Author_repository.getById(id);
        author_detail.setEntity(author);
        return author_detail;        
    }

    @Override
    public AuthorDetails updateAuthor(AuthorForm form, Long id){
        Author author = Author_repository.getById(id);
        form.setEntity(author);
        AuthorDetails author_detail = new AuthorDetails();
        author_detail.setEntity(Author_repository.save(author));
        return author_detail;
    }

    @Transactional
    @Override
    public void deleteById(Long id){
        Author_repository.deleteById(id);
    }


    
}
