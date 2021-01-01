package com.sparta.rashawn.day5;

import java.util.ArrayList;
import java.util.Collections;

public class SeatFinder {
    private static ArrayList<Integer> seatIDs = new ArrayList<>();


    public static int findHighestSeatID(String path){
        ArrayList<SeatDTO> seats = SeatRepository.getSeats(path);

        int highestSeatID = 0;

        for (SeatDTO seat : seats){
            int row = seat.getRow();
            int column = seat.getColumn();
            int seatID = (row * 8) + column;
            seatIDs.add(seatID);

            if (seatID > highestSeatID){
                highestSeatID = seatID;
            }

        }

        return highestSeatID;

    }


    public static int findSeat(){
        Collections.sort(seatIDs);
        int mySeatID = 0;

        for (int i = 0; i < seatIDs.size()-2; i++) {

            if (seatIDs.get(i+1) - seatIDs.get(i) == 2){
                mySeatID = seatIDs.get(i) + 1;
            }

        }

        return mySeatID;


    }








}
