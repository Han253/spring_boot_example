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

    /**
     * Return author by id
     * @return {@link AuthorDetails}
     * 
     */
    AuthorDetails findById(Long id);


    /**
     * 
     * @param AuthorForm data from form to update
     * @param id is the id of the update author.
     */
    AuthorDetails updateAuthor(AuthorForm form,Long id);


    /**
     * 
     * Delete by id
     * 
     * @param id is the id of the author to delete.
     */
    void deleteById(Long id);

    
}
