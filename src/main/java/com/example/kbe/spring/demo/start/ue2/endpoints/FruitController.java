package com.example.kbe.spring.demo.start.ue2.endpoints;

import com.example.kbe.spring.demo.start.data.Product;
import com.example.kbe.spring.demo.start.data.ProductResponse;
import com.example.kbe.spring.demo.start.data.model.Fruits;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/fruits")
class FruitController {

    @Autowired
    FruitsRepository fruitsRepository;

    @GetMapping("/fuitsFromCsv")
    public List<Product> csvResponse(@RequestParam(value = "PRODUCT_ID", defaultValue = "noOneGiven")String PRODUCT_ID){
       val response = new ProductResponse(PRODUCT_ID);
       if (response.getRow() == -1)
           return response.getProducts();
       else
           return response.getProduct();
    }

    @GetMapping("")
    public List<Fruits> getAllFruits(){
        List<Fruits> fruits;
          return fruitsRepository.findAll();
    }

    @GetMapping("/{id}")
    public Fruits getSpecificFruit(@PathVariable(value = "id")String id){
        try{
            return fruitsRepository.getReferenceById(Long.parseLong(id, 10));
        }
        catch (NullPointerException  NumberFormatException  ){
            return fruitsRepository.getReferenceById((long) 1.0);
        }
        catch (IllegalArgumentException e){
            return null;
        }
    }


    @PostMapping("/add")
    public Fruits setNewFruit(@RequestBody Fruits fruit){
        fruitsRepository.save(fruit);
        return fruit;
    };
    @PostMapping("/remove")
    public String removeFruit(@RequestBody Fruits fruit){
        fruitsRepository.delete(fruit);
        return fruit.toString() + " has been deleted";
    };



    // todo change -> fruits
    // todo delete -> fruits

}