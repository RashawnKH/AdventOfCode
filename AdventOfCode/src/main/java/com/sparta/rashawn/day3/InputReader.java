package com.sparta.rashawn.day3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class InputReader {

    public static ArrayList<MapDTO> readInputs(String path){
        ArrayList<MapDTO> rows = new ArrayList<>();
        BufferedReader bufferedReader = null;

        String[] arrayOfStrings;

        try {
            String line;
            bufferedReader = new BufferedReader(new FileReader(path));

            while ((line = bufferedReader.readLine())!= null){
                arrayOfStrings = line.split("");
                rows.add(MapRepository.generateMapDTO(line));

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return rows;
    }

}

