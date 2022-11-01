package com.example.kbe.spring.demo.start.data.model;

import lombok.*;

import javax.persistence.*;

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
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "family")
    private String family;

    @Column(name = "price")
    private double price;


}
