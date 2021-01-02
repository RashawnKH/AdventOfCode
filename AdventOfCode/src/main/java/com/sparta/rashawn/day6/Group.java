package com.sparta.rashawn.day6;

import java.util.HashSet;

public class Group {



    private String answers;

    public HashSet getGroupAnswers() {
        char[] groupAnswers = answers.toCharArray();
        HashSet<Character> getGroupAnswers = new HashSet<>();

        for (char letter: groupAnswers){
            getGroupAnswers.add(letter);
        }

        return getGroupAnswers;
    }


    public String getAnswers() {
        return answers;
    }

    public String[] getGroups(){
        String[] groups = answers.split(" ");

        return groups;
    }

    public void setAnswers(String answers) {
        this.answers = answers;
    }
}
