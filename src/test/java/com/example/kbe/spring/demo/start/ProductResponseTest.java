package com.example.kbe.spring.demo.start;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

class ProductResponseTest {


    @Test
    void constructorTest(){
          ProductResponse productResponse = new ProductResponse();
        assertFalse(productResponse.getProducts().isEmpty());
    }


}