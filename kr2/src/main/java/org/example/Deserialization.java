package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Deserialization {
    public ArrayList<String> read() throws IOException {
        ArrayList<String> programs = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            String line;
            while ((line = br.readLine())!= null) {
                programs.add(line);
            }
        } return programs;
    }
}
