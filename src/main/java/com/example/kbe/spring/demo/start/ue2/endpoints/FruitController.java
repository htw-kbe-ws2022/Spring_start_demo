package com.example.kbe.spring.demo.start.ue2.endpoints;

import com.example.kbe.spring.demo.start.data.model.Fruits;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/fruits")
class FruitController {

    @Autowired
    FruitsRepository fruitsRepository;



    @GetMapping("")
    public List<Fruits> getAllFruits(){
        List<Fruits> fruits;
          return fruitsRepository.findAll();
    }

    @GetMapping("/{id}")
    public Fruits getSpecificFruit(@PathVariable(value = "id")Long id){
        try{
            long longNr = Long.valueOf(id);
            System.out.println(longNr);
            var isInThere = fruitsRepository.existsById (longNr);
            var result2 = fruitsRepository.findById(longNr);
            var result = fruitsRepository.getReferenceById(longNr);
            return result;

        }
        catch (NullPointerException  NumberFormatException  ){
            return fruitsRepository.getReferenceById((long) 1.0);
        }
    }


    @PostMapping("/add")
    public Fruits setNewFruit(@RequestBody Fruits fruit){
        fruitsRepository.save(fruit);
        return fruit;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Fruits> removeFruitById(@PathVariable(value = "id") Long id) {
        Optional<Fruits> fruit = fruitsRepository.findById(id);
        fruitsRepository.deleteById(id);
        return fruit.isEmpty() ? ResponseEntity.notFound().build() : ResponseEntity.ok(fruit.get());
    }



}