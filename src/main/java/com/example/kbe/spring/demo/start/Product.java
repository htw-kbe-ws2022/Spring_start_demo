package com.example.kbe.spring.demo.start;

import com.opencsv.bean.CsvBindByPosition;
import lombok.Data;

@Data
public class Product {

    @CsvBindByPosition(position = 0)
    private int id;
    @CsvBindByPosition(position = 1)
    private String name;
    @CsvBindByPosition(position = 2)
    private String group;
    @CsvBindByPosition(position = 3)
    private String price;
}
