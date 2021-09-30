package com.uis.restfulapp.dto;

import com.uis.restfulapp.entity.Author;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AuthorDetails {

    private long id;
    private String name;
    private String country;

    public void setEntity(Author author){
        id = author.getId();
        name = author.getName();
        country = author.getCountry();        
    }
    
}
