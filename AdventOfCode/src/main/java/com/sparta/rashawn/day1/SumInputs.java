package com.sparta.rashawn.day1;

import java.util.ArrayList;

public class SumInputs {

    private static final int CHECKER = 2020;

    public static int findExpenses(){

        ArrayList<Integer> inputList = InputReader.readInputs("src/main/resources/inputs.txt");
        int expenses = 0;

        for (int firstList : inputList){
            for (int secondList: inputList) {
                for (int thirdList: inputList){
                    if (sum(firstList, secondList,thirdList) == CHECKER){
                        expenses = firstList * secondList * thirdList;
                   }
                }
            }
        }
        return expenses;
    }

    public static int sum(int first, int second, int third){
        int sum = first + second + third;
        return sum;
    }


}
