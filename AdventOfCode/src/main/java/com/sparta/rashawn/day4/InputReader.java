package com.sparta.rashawn.day4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class InputReader {

    public static ArrayList<PassportDTO> readInputs(String path){
        ArrayList<PassportDTO> passports = new ArrayList<>();
        BufferedReader bufferedReader = null;


        try {
            String line;
            String tempLine = "";
            bufferedReader = new BufferedReader(new FileReader(path));

            while ((line = bufferedReader.readLine())!= null){

                if (!line.isEmpty()){
                   tempLine +=line + " ";
                }
                if(line.isEmpty()){
                    passports.add(PassportRepository.generatePassportDTO(tempLine));
                    tempLine = "";
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return passports;
    }

}

