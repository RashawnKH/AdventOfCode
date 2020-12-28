package com.sparta.rashawn.day3;

import java.util.ArrayList;

public class MapRepository {


    public static ArrayList<MapDTO> generateMap(String path){
        ArrayList<MapDTO> map = InputReader.readInputs(path);
        return map;
    }

   public static MapDTO generateMapDTO(String row){
       MapDTO mapDTO = new MapDTO();
       mapDTO.setRow(row);

       return mapDTO;
   }
}
