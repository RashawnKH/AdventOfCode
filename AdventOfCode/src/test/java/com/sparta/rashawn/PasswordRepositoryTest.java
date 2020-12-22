package com.sparta.rashawn;

import com.sparta.rashawn.day2.PasswordDTO;
import com.sparta.rashawn.day2.PasswordRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class PasswordRepositoryTest {

    @Test
    public void checkCanGetPasswords(){
        ArrayList<PasswordDTO> test = new ArrayList<>();
        PasswordDTO passwordDTO1 = new PasswordDTO();
        passwordDTO1.setPasswordPolicyNumber("1-4");
        passwordDTO1.setPassword("mrfmmbjxr");
        passwordDTO1.setPasswordPolicyLetter("m:");

        PasswordDTO passwordDTO2 = new PasswordDTO();
        passwordDTO2.setPasswordPolicyNumber("5-16");
        passwordDTO2.setPassword("bbbbhbbbbpbxbbbcb");
        passwordDTO2.setPasswordPolicyLetter("b:");


        PasswordDTO passwordDTO3 = new PasswordDTO();
        passwordDTO3.setPasswordPolicyNumber("7-8");
        passwordDTO3.setPassword("qxrxmxccxxx");
        passwordDTO3.setPasswordPolicyLetter("x:");

        test.add(passwordDTO1);
        test.add(passwordDTO2);
        test.add(passwordDTO3);


        ArrayList<PasswordDTO> passwords = PasswordRepository.getPasswords("src/main/resources/day2_tests.txt");

        for (int i = 0; i < passwords.size(); i++){
            Assertions.assertEquals(passwords.get(i).toString(), test.get(i).toString());
        }

    }


    @Test
    public void checkCanGeneratePasswordDTO(){
        PasswordDTO passwordDTO = new PasswordDTO();
        passwordDTO.setPassword("123456");
        passwordDTO.setPasswordPolicyLetter("a:");
        passwordDTO.setPasswordPolicyNumber("20-1000");

        String[] testArray = new String[]{"20-1000", "a:", "123456"};

        PasswordDTO passwordDTOTest = PasswordRepository.generatePasswordDTO(testArray);

        Assertions.assertEquals(passwordDTO.toString(), passwordDTOTest.toString());

    }



}
