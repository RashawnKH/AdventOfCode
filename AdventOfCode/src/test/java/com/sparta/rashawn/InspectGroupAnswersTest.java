package com.sparta.rashawn;

import com.sparta.rashawn.day6.InspectGroupAnswers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InspectGroupAnswersTest {



    @Test
    public void checkCanCountYes(){
        int sum = InspectGroupAnswers.countYesAnswers("src/main/resources/day6_test.txt");

        Assertions.assertEquals(sum, 23);
    }

    @Test
    public void checkCanCountSameAnswers(){
      int sum = InspectGroupAnswers.countSameAnswers("src/main/resources/day6_test.txt");

      Assertions.assertEquals(sum, 10);


    }



}
