package com.sparta.rashawn;

import com.sparta.rashawn.day5.SeatDTO;
import com.sparta.rashawn.day5.SeatRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class SeatRepositoryTest {


    @Test
    public void checkGetSeats(){
        ArrayList<SeatDTO> seats = SeatRepository.getSeats("src/main/resources/day5_test.txt");

        SeatDTO seat1 = new SeatDTO("BFBBBBBLLR");
        SeatDTO seat2 = new SeatDTO("BBFFBBFRRL");

        for (SeatDTO seat:seats) {
            System.out.println( seat.getBinaryRow() + " " + seat.getBinaryColumn());
        }

        Assertions.assertEquals(seat1.toString(), seats.get(0).toString());
        Assertions.assertEquals(seat2.toString(), seats.get(1).toString());

    }





}
