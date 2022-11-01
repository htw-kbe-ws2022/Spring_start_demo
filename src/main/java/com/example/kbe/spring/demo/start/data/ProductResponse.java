package com.example.kbe.spring.demo.start.data;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBeanBuilder;
import lombok.Data;
import lombok.SneakyThrows;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
@Data
public class ProductResponse {

    private int row;
    private List<Product> products;
    private String location = "./products.csv";

    public ProductResponse(){
        initProducts();
    }

    public ProductResponse(String row) {
        initProducts();
        this.row = tryParseRow(row);
    }

    public int tryParseRow(String row) {
        int line;
        try {
            line = Integer.parseInt(row);
        }catch (NumberFormatException e){
            line = -1;
        }catch (NullPointerException e){
            line = -1;
        }
        return line;
    }




    @SneakyThrows
    private void initProducts(){
        List<String[]> r;
        try (CSVReader reader = new CSVReader(
                new FileReader(location))) {
            r = reader.readAll();
        }
        products = new CsvToBeanBuilder(
                new FileReader(location))
                .withType(Product.class)
                .withSkipLines(1)
                .build()
                 .parse();
        //System.out.println(r.toString());



    }

    public List<Product> getProduct() {
        List<Product> productsResponse = new ArrayList<>();
        productsResponse.add(this.getProducts().get(row));
        return productsResponse;
    }
}