package com.example.kbe.spring.demo.start;

import com.opencsv.CSVReader;
import lombok.Getter;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.io.FileReader;
import java.util.List;

@Slf4j
public class WorkWithCSV {
    private String location = "products.csv";
    @Getter
    private String id;
    @Getter
    private String answer;
    private int inId;

    public WorkWithCSV(String id, String answer){
        this.id = id;
        this.answer = answer;
    }
    public WorkWithCSV(){}


    @SneakyThrows
    public List<String[]> getAllProductsFromList(){
        List<String[]> r;
        try (CSVReader reader = new CSVReader(new FileReader(location))) {
            r = reader.readAll();
            //r.forEach(x -> (Arrays.toString(x)));
        }
        return r;
    }
    @SneakyThrows
    public String[] getSpecificRowOfCsv(int row){

        List<String[]> r;
        try (CSVReader reader = new CSVReader(new FileReader(location))) {
            r = reader.readAll();
            //r.forEach(x -> (Arrays.toString(x)));
        }
        if (row > r.size())
            return null;
        return  r.get(row);
    }

}
