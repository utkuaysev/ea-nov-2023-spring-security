package edu.miu.springsecurity1.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @JsonBackReference
    @ManyToMany
    private List<Product> products;
}
