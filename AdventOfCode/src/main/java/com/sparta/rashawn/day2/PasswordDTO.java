package com.sparta.rashawn.day2;

public class PasswordDTO {
    private String passwordPolicyNumber;
    private String password;
    private String passwordPolicyLetter;

    public int[] getPasswordPolicyNumber() {
        String[] splitPolicyNumber = passwordPolicyNumber.split("-");
        int lowerLimit = Integer.valueOf(splitPolicyNumber[0]);
        int upperLimit = Integer.valueOf(splitPolicyNumber[1]);

        int[] policyNumbers = new int[]{lowerLimit,upperLimit};

        return policyNumbers;
    }

    public void setPasswordPolicyNumber(String passwordPolicyNumber) {
        this.passwordPolicyNumber = passwordPolicyNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordPolicyLetter() {
        String letter = passwordPolicyLetter.replace(":","");
        return letter;
    }

    public void setPasswordPolicyLetter(String passwordPolicyLetter) {
        this.passwordPolicyLetter = passwordPolicyLetter;
    }


    @Override
    public String toString() {
        return "PasswordDTO{" +
                "passwordPolicyNumber='" + passwordPolicyNumber + '\'' +
                ", password='" + password + '\'' +
                ", passwordPolicyLetter='" + passwordPolicyLetter + '\'' +
                '}';
    }
}
