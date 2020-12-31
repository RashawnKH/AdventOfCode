package com.sparta.rashawn.day4;

import java.util.ArrayList;

public class PassportRepository {



    public static ArrayList<PassportDTO> getPassports(String path){
        ArrayList<PassportDTO> passports = InputReader.readInputs(path);
        return passports;
    }


    public static PassportDTO generatePassportDTO(String details) {
        PassportDTO passportDTO = new PassportDTO();
        passportDTO.setDetails(details);

        String[] arrayOfDetails = details.split(" ");


        for (String line: arrayOfDetails) {

            if (line.contains("byr")) {
                line = line.replace("byr:", "");
                passportDTO.setBirthYear(line);
            } else if (line.contains("iyr")) {
                line = line.replace("iyr:", "");
                passportDTO.setIssueYear(line);
            } else if (line.contains("eyr")) {
                line = line.replace("eyr:", "");
                passportDTO.setExpirationYear(line);
            } else if (line.contains("hgt")) {
                line = line.replace("hgt:", "");
                passportDTO.setHeight(line);
            } else if (line.contains("hcl")) {
                line = line.replace("hcl:", "");
                passportDTO.setHairColour(line);
            } else if (line.contains("ecl")) {
                line = line.replace("ecl:", "");
                passportDTO.setEyeColour(line);
            } else if (line.contains("pid")) {
                line = line.replace("pid:", "");
                passportDTO.setPassportID(line);
            } else if (line.contains("cid")) {
                line = line.replace("cid:", "");
                passportDTO.setCountryID(line);
            }
        }


        return passportDTO;
    }
}
