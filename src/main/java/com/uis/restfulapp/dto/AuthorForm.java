package com.uis.restfulapp.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.uis.restfulapp.entity.Author;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class AuthorForm {

    @NotNull(message="Name can't be null.")
    @NotEmpty(message = "Name can't be empty.")
    private String name;

    @NotNull(message="Country can't be null.")
    @NotEmpty(message = "Country can't be empty.")
    private String country;

    public Author getEntity(){
        Author author = new Author();
        setEntity(author);
        return author;
    }

    public void setEntity(Author author){
        author.setName(name);
        author.setCountry(country);
    }

    
}
