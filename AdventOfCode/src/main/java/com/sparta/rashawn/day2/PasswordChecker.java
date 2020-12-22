package com.sparta.rashawn.day2;

import java.util.ArrayList;

public class PasswordChecker {

    public static int getValidPasswordsCount(ArrayList<PasswordDTO> passwordDTOS){
        int count = 0;

        ArrayList<PasswordDTO> passwords = passwordDTOS;
        for (PasswordDTO passwordDTO : passwords){
            int[] policyNumbers = passwordDTO.getPasswordPolicyNumber();
            boolean getInRange = hasCharactersAtIndex(passwordDTO.getPassword(), passwordDTO.getPasswordPolicyLetter(), policyNumbers[0], policyNumbers[1]);
            if (getInRange == true){
                count++;
            }

        }
        return count;
    }


    private static boolean hasCharacters(String password, String letter, int minimum, int maximum){
        int count = 0;
        boolean checkInRange = false;

        for (int i = 0; i<password.length(); i++){
            if (password.charAt(i) == letter.charAt(0)){
                       count++;
            }
        }
        if (count >= minimum && count <= maximum){
            checkInRange = true;
        }
        return checkInRange;
    }



    private static boolean hasCharactersAtIndex(String password, String letter, int minimum, int maximum){
        boolean checkIndex = false;
        int getMinimumIndex = minimum -1;
        int getMaximumIndex = maximum - 1;



        boolean checkMinimum = password.charAt(getMinimumIndex) == letter.charAt(0);
        boolean checkMaximum = password.charAt(getMaximumIndex)== letter.charAt(0);


        if (checkMaximum && checkMinimum){
            checkIndex = false;
        } else if (checkMaximum || checkMinimum){
               checkIndex = true;
            }
        return checkIndex;
    }

}
