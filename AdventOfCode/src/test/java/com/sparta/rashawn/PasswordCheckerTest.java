package com.sparta.rashawn;

import com.sparta.rashawn.day2.PasswordChecker;
import com.sparta.rashawn.day2.PasswordDTO;
import com.sparta.rashawn.day2.PasswordRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class PasswordCheckerTest {

       @Test
       public void checkCanGetCount(){

           ArrayList<PasswordDTO> testList = PasswordRepository.getPasswords("src/main/resources/day2_tests.txt");
           Assertions.assertEquals(0,PasswordChecker.getValidPasswordsCount(testList));
       }

}
