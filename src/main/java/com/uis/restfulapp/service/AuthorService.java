package com.uis.restfulapp.service;

import java.util.List;

import com.uis.restfulapp.dto.AuthorDetails;
import com.uis.restfulapp.dto.AuthorForm;

public interface AuthorService {

    /**
     * 
     * Save a new Author in database
     * @param formData author data to save
     */
    AuthorDetails create(AuthorForm author);

    /**
     * 
     * Return list of authors
     * @return {@link AuthorDetails}
     */
    List<AuthorDetails> findAll();

    
}
