package com.sparta.rashawn.day5;

public class SeatDTO {
    private int row;
    private int column;
    private String line;

    public SeatDTO(String line) {
        this.line = line;
    }


    public String getBinaryRow(){
        String binaryRow = line.substring(0,7);
        binaryRow = binaryRow.replace("BF", "10");


        for (int i=0; i<binaryRow.length(); i++) {
            if (binaryRow.charAt(i) == 'F') {
                binaryRow = binaryRow.replace(binaryRow.charAt(i), '0');
            }else if (binaryRow.charAt(i) == 'B'){
                binaryRow = binaryRow.replace(binaryRow.charAt(i), '1');
            }
        }

        return binaryRow;
    }


    public String getBinaryColumn(){
        String binaryColumn = line.substring(7,10);

        for (int i=0; i<binaryColumn.length(); i++) {
            if (binaryColumn.charAt(i) == 'L') {
                binaryColumn = binaryColumn.replace(binaryColumn.charAt(i), '0');
            }else if (binaryColumn.charAt(i) == 'R'){
                binaryColumn = binaryColumn.replace(binaryColumn.charAt(i), '1');
            }
        }



        return binaryColumn;
    }




    public int getRow() {
        String binaryRow = getBinaryRow();
        int row = 0;

        for (int i = binaryRow.length()-1; i>=0; i--){
            boolean checkForOne = binaryRow.charAt(i) == '1';

            if (checkForOne && i == 0){
                row += 64;
            }else if (checkForOne && i == 1){
                row+=32;
            }else if (checkForOne && i == 2){
                row+=16;
            }else if (checkForOne && i ==  3){
                row+=8;
            }else if (checkForOne && i == 4){
                row+=4;
            }else if (checkForOne && i == 5){
                row+=2;
            }else if (checkForOne && i == 6){
                row+=1;
            }
        }
        return row;
    }




    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        int column = 0;

        String binaryColumn  =  getBinaryColumn();

        for (int i = binaryColumn.length()-1; i >= 0 ; i--) {
            boolean checkForOne = binaryColumn.charAt(i) == '1';

            if (checkForOne && i == 0){
                column+= 4;
            }else if (checkForOne && i == 1){
                column+= 2;

            }else if (checkForOne && i == 2){
                column+= 1;
            }

        }
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    @Override
    public String toString() {
        return "SeatDTO{" +
                "row='" + row + '\'' +
                ", column='" + column + '\'' +
                '}';
    }
}
