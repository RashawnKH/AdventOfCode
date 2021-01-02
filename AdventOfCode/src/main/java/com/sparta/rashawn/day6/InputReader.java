package com.sparta.rashawn.day6;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


    public class InputReader {

        public static ArrayList<Group> readInputs(String path){
            ArrayList<Group> groups = new ArrayList<>();
            BufferedReader bufferedReader = null;


            try {
                String line;
                String tempLine = "";
                bufferedReader = new BufferedReader(new FileReader(path));

                while ((line = bufferedReader.readLine())!= null){

                    if (!line.isEmpty()){
                        tempLine +=line + " ";
                    }
                    if(line.isEmpty()){
                        groups.add(GroupRepository.generateGroups(tempLine));
                        tempLine = "";
                    }

                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            return groups;
        }

    }






