package com.uis.restfulapp.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@Entity
public class Book {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column()
    private String description;

    @ManyToOne(optional = false, cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
    private Author author;

    @ManyToOne(optional = false, cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
    private Category category;
    
}
