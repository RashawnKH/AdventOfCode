package com.sparta.rashawn.day5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class InputReader {

    public static ArrayList<SeatDTO> readInputs(String path){
        ArrayList<SeatDTO> seats = new ArrayList<>();
        BufferedReader bufferedReader = null;

        try {
            String line;
            bufferedReader = new BufferedReader(new FileReader(path));
            while ((line = bufferedReader.readLine())!= null){
                    seats.add(SeatRepository.generateSeats(line));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return seats;
    }

}

