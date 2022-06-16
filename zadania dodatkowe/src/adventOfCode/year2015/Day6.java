package adventOfCode.year2015;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Day6 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2015\\inputs\\input6.txt"));

        int [][] grid = new int[1000][1000];
        String line = filereader.readLine();
        int brightness = 0;

        while(line!=null){
            String [] stringLine = line.split(" ");
            if(stringLine[0].equals("toggle")){
                String [] startArray = stringLine[1].split(",");
                String [] endArray = stringLine[3].split(",");
                for(int i = Integer.parseInt(startArray[0]); i <= Integer.parseInt(endArray[0]); i++){
                    for(int j = Integer.parseInt(startArray[1]); j <= Integer.parseInt(endArray[1]); j++){
                        grid[i][j] += 2;
                        brightness += 2;
                    }
                }
            } else{
                String [] startArray = stringLine[2].split(",");
                String [] endArray = stringLine[4].split(",");
                for(int i = Integer.parseInt(startArray[0]); i <= Integer.parseInt(endArray[0]); i++){
                    for(int j = Integer.parseInt(startArray[1]); j <= Integer.parseInt(endArray[1]); j++){
                        if(stringLine[1].equals("on")){
                            grid[i][j] += 1;
                            brightness += 1;
                        } else{
                            if(grid[i][j] > 0){
                                grid[i][j] -= 1;
                                brightness -= 1;
                            }
                        }
                    }
                }
            }

            /*
            String [] stringLine = line.split(" ");
            if(stringLine[0].equals("toggle")){
                String [] startArray = stringLine[1].split(",");
                String [] endArray = stringLine[3].split(",");
                for(int i = Integer.parseInt(startArray[0]); i <= Integer.parseInt(endArray[0]); i++){
                    for(int j = Integer.parseInt(startArray[1]); j <= Integer.parseInt(endArray[1]); j++){
                        if(grid[i][j] == 1){
                            grid[i][j] = 0;
                        } else{
                            grid[i][j] = 1;
                        }
                        //brightness += 2;
                    }
                }
            } else{
                String [] startArray = stringLine[2].split(",");
                String [] endArray = stringLine[4].split(",");
                for(int i = Integer.parseInt(startArray[0]); i <= Integer.parseInt(endArray[0]); i++){
                    for(int j = Integer.parseInt(startArray[1]); j <= Integer.parseInt(endArray[1]); j++){
                        if(stringLine[1].equals("on")){
                            grid[i][j] = 1;
                            //brightness += 1;
                        } else{
                            grid[i][j] = 0;
                            //brightness -= 1;
                        }
                    }
                }
            }
            */
            line = filereader.readLine();
        }

        int sum = 0;
        for(int i = 0; i < 1000; i++){
            for(int j = 0; j < 1000; j++){
                if(grid[i][j] == 1){
                    sum += 1;
                }
            }
        }

        System.out.println(sum);
        System.out.println(brightness);

        filereader.close();

    }
    
}
