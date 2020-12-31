package com.sparta.rashawn.day4;

import java.util.ArrayList;

public class PassportChecker {


    public static int countValidPassports(String path) {
        ArrayList<PassportDTO> passports = PassportRepository.getPassports(path);
        int counter = 0;


        for (PassportDTO passport : passports) {
            String details = passport.getDetails();
            boolean getDetails = details.contains("byr") && details.contains("iyr") && details.contains("eyr") && details.contains("hgt") && details.contains("hcl") && details.contains("ecl") && details.contains("pid");
            if (getDetails) {
                counter++;
            }
        }

        return counter;


    }


    public static int countValidPassportValues(String path) {
        ArrayList<PassportDTO> passports = PassportRepository.getPassports(path);
        int counter = 0;
        for (PassportDTO passportDTO : passports) {
            boolean checkAllValues = !passportDTO.toString().contains("null");

            if (checkAllValues && checkValidValues(passportDTO)) {
                counter++;
            }
        }


        return counter;

    }

    private static boolean checkValidValues(PassportDTO passportDTO) {
        boolean checkValues =
                checkBirthYear(passportDTO) &&
                checkExpirationYear(passportDTO) &&
                checkEyeColour(passportDTO) &&
                checkHairColour(passportDTO) &&
                checkHeight(passportDTO) &&
                checkIssueYear(passportDTO) &&
                checkPassportID(passportDTO);

        return checkValues;

    }


    private static boolean checkBirthYear(PassportDTO passportDTO) {
        int birthYear = passportDTO.getBirthYear();


        if (birthYear >= 1920 && birthYear <= 2002) {
            return true;
        }

        return false;
    }


    private static boolean checkIssueYear(PassportDTO passportDTO) {
        int issueYear = passportDTO.getIssueYear();

        if (issueYear >= 2010 && issueYear <= 2020) {
            return true;
        }

        return false;

    }


    private static boolean checkExpirationYear(PassportDTO passportDTO) {
        int expirationYear = passportDTO.getExpirationYear();
        if (expirationYear >= 2020 && expirationYear <= 2030) {
            return true;
        }

        return false;
    }

    private static boolean checkHeight(PassportDTO passportDTO) {
        int measurement = passportDTO.getHeightMeasurement();
        String height = passportDTO.getHeight();

        if (height.contains("in")) {
            if (measurement >= 59 && measurement <= 76) {
                return true;
            }
        } else if (height.contains("cm")) {
            if (measurement >= 150 && measurement <= 193) {
                return true;
            }
        }

        return false;

    }

    private static boolean checkHairColour(PassportDTO passportDTO) {

        String hairColour = passportDTO.getHairColour();

        if (hairColour.startsWith("#")) {
            for (int i = 0; i <hairColour.length(); i++) {
                 if ((hairColour.charAt(i) >= '0' || hairColour.charAt(i) <= '9') && (hairColour.charAt(i) >='a' || hairColour.charAt(i) <=('f'))){

                     return true;
                 }
            }

        }

        return false;
    }


    private static boolean checkEyeColour(PassportDTO passportDTO){
        String eyeColour = passportDTO.getEyeColour();

        String[] eyeColourArray = new String[]{"amb", "brn","blu", "gry", "grn","hzl", "oth"};

        for (String colour : eyeColourArray){
            if (eyeColour.equals(colour)){
                return true;
            }
        }

        return false;
    }


    private static boolean checkPassportID(PassportDTO passportDTO){
        String passportID = passportDTO.getPassportID();

        if (passportID.length() == 9){

                return true;

        }

        return false;


    }

}
