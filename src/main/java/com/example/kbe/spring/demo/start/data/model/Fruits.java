package com.example.kbe.spring.demo.start.data.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;


@Getter
@Builder
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "fruits")
public class Fruits {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "currency")
    private String currency;

    @Column(name = "category")
    private String category;

    @Column(name = "family")
    private String family;

    @Column(name = "price")
    private double price;

    @Column(name = "createdAt")
    private Date createdAt;

    @Column(name = "updatedAt")
    private Date updatedAt;

}
