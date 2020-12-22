package com.sparta.rashawn.day2;

import java.util.ArrayList;

public class App {


    public static void main(String[] args) {
        ArrayList<PasswordDTO> passwordList = PasswordRepository.getPasswords("src/main/resources/day2_inputs.txt");
        System.out.println(PasswordChecker.getValidPasswordsCount(passwordList));
    }
}
