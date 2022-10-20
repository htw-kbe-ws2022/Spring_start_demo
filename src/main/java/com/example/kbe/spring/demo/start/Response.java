package com.example.kbe.spring.demo.start;

public class Response {

    private int row;

    public Response(String row) {
        this.row = tryParseRow(row);
    }

    private int tryParseRow(String row) {
        int line;
        try {
            line = Integer.getInteger(row);
        }catch (NumberFormatException e){
            line = -1;
        }
        return line;
    }

    public String generateResponse(){
        WorkWithCSV workWithCSV = new WorkWithCSV();
        if (row < 0){
            return workWithCSV.getAllProductsFromList().toString();
        }
        return workWithCSV.getSpecificRowOfCsv(row).toString();
    }

}