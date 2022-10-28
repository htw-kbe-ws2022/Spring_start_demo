package com.example.kbe.spring.demo.start;

import lombok.Data;

@Data
public class Greeting {


        private final int id;
        private final String content;

        public Greeting(String row, String content) {
            var line = tryParseRow(row);
            this.id = line;
            this.content = content;
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


}

