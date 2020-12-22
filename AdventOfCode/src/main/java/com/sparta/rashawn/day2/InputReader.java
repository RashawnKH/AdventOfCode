package com.sparta.rashawn.day2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class InputReader {

    public static ArrayList<PasswordDTO> readInputs(String path){
        ArrayList<PasswordDTO> passwords = new ArrayList<>();
        BufferedReader bufferedReader = null;

        String[] arrayOfStrings;

        try {
            String line;
            bufferedReader = new BufferedReader(new FileReader(path));

            while ((line = bufferedReader.readLine())!= null){
                   arrayOfStrings = line.split(" ");
                   passwords.add(PasswordRepository.generatePasswordDTO(arrayOfStrings));

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return passwords;
    }

}

