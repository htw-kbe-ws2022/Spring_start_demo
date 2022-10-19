package com.example.kbe.spring.demo.start;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WorkWithCSVTest {

    @Test
    void getAllProductsFromList() {
        List<String[]> r;
        WorkWithCSV workWithCSV = new WorkWithCSV("1", "2");
        r = workWithCSV.getAllProductsFromList();
        assertEquals("Banane", r.get(1)[1]);
        }



    @Test
    void getSpecificRowOfCsv() {
        String[] r;
        WorkWithCSV workWithCSV = new WorkWithCSV("1", "2");
        r = workWithCSV.getSpecificRowOfCsv(1);
        assertEquals("Banane", r[1]);
    }
}