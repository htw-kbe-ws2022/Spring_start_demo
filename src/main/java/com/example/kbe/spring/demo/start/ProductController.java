package com.example.kbe.spring.demo.start;

import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
class ProductController {

    @GetMapping("/products")
    public List<Product> csvResponse(){

       val response = new ProductResponse();
       return response.getProducts();
      /*   val response2 = response.generateResponse();
        return response2;*/

    }
}