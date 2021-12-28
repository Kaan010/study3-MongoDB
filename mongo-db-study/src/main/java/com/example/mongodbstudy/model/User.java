package com.example.mongodbstudy.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Data
@Document(collection = "user")
public class User {


    @Id
    private String id;
    private String name;
    private String surName;
    private String email;
    private String telephone;
    private String userName;
}
