package com.sparta.rashawn.day3;


import java.util.ArrayList;

public class InspectMap {

    public static int countTrees(String path, int x_position, int y_position) {
        int treeCounter = 0;
        int indexCounter = x_position;

        ArrayList<MapDTO> map = MapRepository.generateMap(path);




        for (int i = 0; i < map.size()-y_position; i++) {

            if (indexCounter >= map.get(i).getRow().length()){

                indexCounter = indexCounter%31;
            }


                if (map.get(i + y_position).getRow().charAt(indexCounter) == '#') {
                    treeCounter++;
                }


            if (y_position > 1){
                 y_position = y_position + 1;
            }

            indexCounter += x_position;
        }
        System.out.println(treeCounter);
        return treeCounter;
    }


}








