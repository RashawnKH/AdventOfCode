package com.sparta.rashawn;

import com.sparta.rashawn.day1.InputReader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class FileReaderTest {


    @Test
    public void checkCanReadFile(){
        ArrayList<Integer> testFile = InputReader.readInputs("src/main/resources/test.txt");
        ArrayList<Integer> compareList = new ArrayList<>();
        compareList.add(1);
        compareList.add(2);
        compareList.add(3);
        compareList.add(4);
        compareList.add(5);

        Assertions.assertEquals(5, testFile.size());
        Assertions.assertTrue(testFile.containsAll(compareList));
    }
}
