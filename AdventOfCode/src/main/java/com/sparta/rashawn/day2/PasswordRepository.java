package com.sparta.rashawn.day2;

import java.util.ArrayList;

public class PasswordRepository {


    public static ArrayList<PasswordDTO> getPasswords(String path){
        ArrayList<PasswordDTO> passwords = InputReader.readInputs(path);

        return passwords;
    }


    public static PasswordDTO generatePasswordDTO(String[] input){
        PasswordDTO passwordDTO = new PasswordDTO();
        passwordDTO.setPasswordPolicyNumber(input[0]);
        passwordDTO.setPasswordPolicyLetter(input[1]);
        passwordDTO.setPassword(input[2]);

        return passwordDTO;

    }

}
