package com.sparta.rashawn.day1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class InputReader {


    public static ArrayList<Integer> readInputs(String path){
        ArrayList<Integer> inputs = new ArrayList<>();
        BufferedReader bufferedReader = null;

        try {
            String line;
            int value;
            bufferedReader = new BufferedReader(new FileReader(path));

            while ((line = bufferedReader.readLine())!= null){
                value = Integer.valueOf(line);
                inputs.add(value);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return inputs;
    }







}
