package com.sparta.rashawn.day6;

import java.util.ArrayList;

public class GroupRepository {

    public static ArrayList<Group> getGroups(String path){
        ArrayList<Group> groups = InputReader.readInputs(path);

        return groups;
    }


    public static Group generateGroups(String line){
        Group group = new Group();
        group.setAnswers(line);


        return group;

    }



}
