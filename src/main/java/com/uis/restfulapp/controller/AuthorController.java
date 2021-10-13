package com.uis.restfulapp.controller;

import java.util.List;

import javax.validation.Valid;

import com.uis.restfulapp.dto.AuthorDetails;
import com.uis.restfulapp.dto.AuthorForm;
import com.uis.restfulapp.service.AuthorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("author")
public class AuthorController {

    @Autowired
    private AuthorService service;

    @GetMapping
    public List<AuthorDetails> list(){
        return service.findAll();
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public AuthorDetails create(@RequestBody @Valid AuthorForm data){
        return service.create(data);
    }

    @GetMapping("/id/{id}")
    public AuthorDetails findById(@PathVariable final Long id){
        return service.findById(id);
    }

    @PutMapping("/id/{id}")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public AuthorDetails updateByTag(@RequestBody @Valid AuthorForm form, @PathVariable final Long id){
        return service.updateAuthor(form, id);
    }

    @DeleteMapping("/id/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void deleteByTag(@PathVariable final Long id){
        service.deleteById(id);
    }


    
}
