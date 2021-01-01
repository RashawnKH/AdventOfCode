package com.sparta.rashawn;

import com.sparta.rashawn.day5.SeatDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SeatDTOTest {

    @Test
    public void testGetBinary(){


        SeatDTO seat1 = new SeatDTO("BFBBBBBLLR");

        Assertions.assertEquals(seat1.getBinaryColumn(), "001");
        Assertions.assertEquals(seat1.getBinaryRow(), "1011111");

    }


    @Test
    public void testGetRow(){
        SeatDTO seat1 = new SeatDTO("BFBBBBBLLR");
        Assertions.assertEquals(seat1.getRow(), 95 );


    }

   @Test
    public void testGetColumn(){
       SeatDTO seat1 = new SeatDTO("BFBBBBBLLR");
       Assertions.assertEquals(seat1.getColumn(),1 );
   }
}
