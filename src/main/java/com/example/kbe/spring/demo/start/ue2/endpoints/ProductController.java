package com.example.kbe.spring.demo.start.ue2.endpoints;

import com.example.kbe.spring.demo.start.data.Product;
import com.example.kbe.spring.demo.start.data.ProductResponse;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
class ProductController {

    @GetMapping("/products")
    public List<Product> csvResponse(@RequestParam(value = "PRODUCT_ID", defaultValue = "noOneGiven")String PRODUCT_ID){

       val response = new ProductResponse(PRODUCT_ID);
       if (response.getRow() == -1)
           return response.getProducts();
       else
           return response.getProduct();

      /*   val response2 = response.generateResponse();
        return response2;*/

    }
}