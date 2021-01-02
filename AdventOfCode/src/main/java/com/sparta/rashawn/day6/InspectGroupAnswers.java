package com.sparta.rashawn.day6;

import java.util.ArrayList;
import java.util.HashSet;

public class InspectGroupAnswers {


    public static int countYesAnswers(String path){
        ArrayList<Group> groups = GroupRepository.getGroups(path);
        int yesCount = 0;



        for (Group group:groups) {
            yesCount += group.getGroupAnswers().size()-1;
            System.out.println(group.getAnswers().toString());
        }


        return yesCount;
    }



    public static int countSameAnswers(String path){
        ArrayList<Group> groups = GroupRepository.getGroups(path);

        int sameCount = 0;


        for (int i = 0; i<groups.size()-1; i++) {

            String[] group = groups.get(i).getGroups();

            HashSet<Character> sameAnswers  = new HashSet<>();


            if (group.length == 1){
                char[] singleGroup = group[0].toCharArray();

                for (char letter : singleGroup){
                    sameAnswers.add(letter);
                }

            }



            for (int j= 0; j<group.length-1; j++) {
                HashSet<Character> person1 = getDistinct(group[j]);
                HashSet<Character> person2 = getDistinct(group[j+1]);

                for (Character letter: person1) {
                    for (Character secondLetter:person2) {
                        if (letter == secondLetter){
                            sameAnswers.add(letter);

                        }
                    }
                }

            }

            sameCount += sameAnswers.size();

        }


        return sameCount;
    }


    public static HashSet getDistinct(String answers) {
        char[] groupAnswers = answers.toCharArray();
        HashSet<Character> getGroupAnswers = new HashSet<>();

        for (char letter: groupAnswers){
            getGroupAnswers.add(letter);
        }

        return getGroupAnswers;
    }



}
