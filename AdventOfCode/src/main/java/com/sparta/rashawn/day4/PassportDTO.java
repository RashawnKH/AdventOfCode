package com.sparta.rashawn.day4;

import java.util.ArrayList;

public class PassportDTO {
    private int birthYear;
    private int issueYear;
    private int expirationYear;
    private String height;



    private String heightMeasurement;
    private String hairColour;
    private String eyeColour;
    private String passportID;
    private String countryID;
    private String details;

    public int getHeightMeasurement() {


        int measurment = 0;

        if (heightMeasurement!=null){
            measurment =  Integer.valueOf(heightMeasurement);
        }
        return measurment;
    }




    public void setDetails(String details){

        this.details = details;
    }

    public String getDetails(){
        return details;
    }



    public int getBirthYear() {

        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = Integer.valueOf(birthYear);
    }

    public int getIssueYear() {
        return issueYear;
    }

    public void setIssueYear(String issueYear) {
        this.issueYear = Integer.valueOf(issueYear);
    }

    public int getExpirationYear() {
        return expirationYear;
    }

    public void setExpirationYear(String expirationYear) {
        this.expirationYear = Integer.valueOf(expirationYear);
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {


        if (height.contains("cm")){
            this.heightMeasurement = height.replace("cm", "");
        }else if (height.contains("in")){
            this.heightMeasurement = height.replace("in", "");
        }
        this.height = height;
    }

    public String getHairColour() {
        return hairColour;
    }

    public void setHairColour(String hairColour) {
        this.hairColour = hairColour;
    }

    public String getEyeColour() {
        return eyeColour;
    }

    public void setEyeColour(String eyeColour) {
        this.eyeColour = eyeColour;
    }

    public String getPassportID() {
        return passportID;
    }

    public void setPassportID(String passportID) {
        this.passportID = passportID;
    }

    public String getCountryID() {
        return countryID;
    }

    public void setCountryID(String countryID) {
        this.countryID = countryID;
    }

    @Override
    public String toString() {
        return "PassportDTO{" +
                "birthYear='" + birthYear + '\'' +
                ", issueYear='" + issueYear + '\'' +
                ", expirationYear='" + expirationYear + '\'' +
                ", height='" + height + '\'' +
                ", hairColour='" + hairColour + '\'' +
                ", eyeColour='" + eyeColour + '\'' +
                ", passportID='" + passportID + '\'' +
                '}';
    }
}
