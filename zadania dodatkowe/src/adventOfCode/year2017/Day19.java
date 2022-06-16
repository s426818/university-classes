package adventOfCode.year2017;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Day19 {

    private static int[] newPositions(List<String []> map, int currentPositionX, int currentPositionY, String direction, int directionInt, String message){
        String [] alphabet = "QWERTYUIOPASDFGHJKLZXCVBNM".split("");
        int [] newPosition = new int [3];
        String currentSymbol = map.get(currentPositionX)[currentPositionY];
        if(currentSymbol.equals("|")){
            
            if(map.get(currentPositionX)[currentPositionY-1] == " " && map.get(currentPositionX)[currentPositionY+1] == " "){
                map.get(currentPositionX)[currentPositionY] = " ";
            } else{
                map.get(currentPositionX)[currentPositionY-1] = "-";
            }
            if(direction.equals("South")){
                if(map.get(currentPositionX + 1)[currentPositionY] != " "){
                    currentPositionX += 1;
                }
            }
            switch (directionInt){
                // South
                case 2: if(map.get(currentPositionX + 1)[currentPositionY] != " "){
                                currentPositionX += 1;
                                }; break;
                // East
                case 1: if(map.get(currentPositionX)[currentPositionY + 1] != " "){
                                currentPositionY += 1;
                                }; break;
                // North
                case 0: if(map.get(currentPositionX - 1)[currentPositionY] != " "){
                                currentPositionX -= 1;
                                }; break;
                //West
                case 3: if(map.get(currentPositionX)[currentPositionY - 1] != " "){
                                currentPositionY -= 1;
                                }; break;
            }
        } else{
            if(currentSymbol.equals("-")){

            } else{
                if(currentSymbol.equals("+")){

                } else{
                    message += currentSymbol;
                }
            }
        }
        return newPosition;
    }
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2017\\inputs\\input19.txt"));

        List<String []> map = new ArrayList<>();
        String message = "";
        String line = filereader.readLine();
        int currentPositionY = 0;
        int currentPositionX = 0;
        String direction = "South";
        int directionInt = 2;
        while(line.charAt(currentPositionY) != '|'){
            currentPositionY += 1;
        }
        while(line!=null){
            map.add(line.split(""));
            line = filereader.readLine();
        }
        
        for(int i = 0; i < map.size(); i++){
            for(int j = 0; j < map.get(0).length; j++){
                System.out.print(map.get(i)[j]);
            }
            System.out.println();
        }

        System.out.println(message);

        filereader.close();
    }

}
