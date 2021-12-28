package com.example.mongodbstudy.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.Date;

@Document(collection = "product_comment")
@Data
public class ProductComment {

    @Id
    private String id;
    private String comment;
    private Date commentDate;
    private String userId;
    private String userName;

}
