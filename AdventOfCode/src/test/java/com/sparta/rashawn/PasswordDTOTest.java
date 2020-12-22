package com.sparta.rashawn;

import com.sparta.rashawn.day2.PasswordDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PasswordDTOTest {



    @Test
    public void checkSetters(){
        PasswordDTO passwordDTO = new PasswordDTO();
        passwordDTO.setPassword("123456");
        passwordDTO.setPasswordPolicyLetter("a:");

        Assertions.assertEquals("123456", passwordDTO.getPassword());
        Assertions.assertEquals("a", passwordDTO.getPasswordPolicyLetter());

    }



    @Test
    public void checkGetPasswordPolicyNumber(){
        PasswordDTO passwordDTO = new PasswordDTO();
        passwordDTO.setPasswordPolicyNumber("1-5");
        Assertions.assertEquals(2,passwordDTO.getPasswordPolicyNumber().length);

        int[] testArray = passwordDTO.getPasswordPolicyNumber();

        Assertions.assertEquals(1,testArray[0]);
        Assertions.assertEquals(5, testArray[1]);



        PasswordDTO passwordDTO2 = new PasswordDTO();
        passwordDTO2.setPasswordPolicyNumber("11-500");
        Assertions.assertEquals(2,passwordDTO2.getPasswordPolicyNumber().length);

        int[] testArray2 = passwordDTO2.getPasswordPolicyNumber();

        Assertions.assertEquals(11,testArray2[0]);
        Assertions.assertEquals(500, testArray2[1]);

    }









}
