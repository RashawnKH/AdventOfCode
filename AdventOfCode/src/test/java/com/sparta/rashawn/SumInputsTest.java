package com.sparta.rashawn;

import com.sparta.rashawn.day1.SumInputs;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumInputsTest {


    @Test
    public void checkCanSum(){
        Assertions.assertEquals(6,SumInputs.sum(1,2,3));
    }

    @Test
    public void checkCanFindExpenses(){
        Assertions.assertEquals(218767230,SumInputs.findExpenses());
    }


}
