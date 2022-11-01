package com.example.kbe.spring.demo.start.ue2.endpoints;

import com.example.kbe.spring.demo.start.data.model.Fruits;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FruitsRepository extends JpaRepository<Fruits, Long> {

}
