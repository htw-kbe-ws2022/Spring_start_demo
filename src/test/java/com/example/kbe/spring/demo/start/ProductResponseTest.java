package com.example.kbe.spring.demo.start;

import com.example.kbe.spring.demo.start.data.ProductResponse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class ProductResponseTest {


    @Test
    void constructorTest(){
          ProductResponse productResponse = new ProductResponse();
        assertFalse(productResponse.getProducts().isEmpty());
    }


    @Test
    void initTest(){
        ProductResponse productResponse = new ProductResponse();
        assertFalse(productResponse.getProducts().isEmpty());
    }
    @Test
    void initTestProducts(){
        ProductResponse productResponse = new ProductResponse();
        var product = productResponse.getProducts();
        assertEquals("Banane", product.get(0).getName());
    }

    @Test
    void tryParsRowCorrect(){
        ProductResponse productResponse = new ProductResponse();
        var result = productResponse.tryParseRow("1");
        assertEquals(1, result);
    }

    @Test
    void tryParseRowWrongGetDeafault(){
        ProductResponse productResponse = new ProductResponse();
        var result = productResponse.tryParseRow("bla");
        assertEquals(-1, result);
    }
}