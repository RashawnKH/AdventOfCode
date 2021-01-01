package com.sparta.rashawn.day5;

import java.util.ArrayList;

public class SeatRepository {

    public static ArrayList<SeatDTO> getSeats(String path){

        ArrayList<SeatDTO> seats = InputReader.readInputs(path);

        return seats;

    }


    public static SeatDTO generateSeats(String line){

        SeatDTO seat = new SeatDTO(line);

        return seat;

    }




}
