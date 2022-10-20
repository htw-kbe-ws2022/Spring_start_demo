package com.example.kbe.spring.demo.start;

import lombok.val;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
class CSVResponse {

    @GetMapping("/getCsv")
    public Response csvResponse(@RequestParam (value = "row", defaultValue = "all") String row){
        val response = new Response(row);
        val response2 = response.generateResponse();
        return response;
    }
}