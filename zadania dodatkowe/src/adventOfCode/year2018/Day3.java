package adventOfCode.year2018;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Day3 {

    private static int [][] apply(int [][] grid, String [] size, String [] positions){
        for(int i = Integer.parseInt(positions[0]); i < Integer.parseInt(positions[0]) + Integer.parseInt(size[0]); i++){
            for(int j = Integer.parseInt(positions[1]); j < Integer.parseInt(positions[1]) + Integer.parseInt(size[1]); j++){
                grid[i][j] += 1;
            }
        }
        return grid;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2018\\inputs\\input3.txt"));

        int [][] grid = new int [1000][1000];

        String line = filereader.readLine();
        while(line!=null){
            String [] splitLine = line.split(" ");
            String [] size = splitLine[3].split("x");
            String [] positions = splitLine[2].split(",");
            positions[1] = positions[1].substring(0, positions.length-1);
            grid = apply(grid, size, positions);
            line = filereader.readLine();
        }

        int counter = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid.length; j++){
                if(grid[i][j] > 1){
                    counter += 1;
                }
                //System.out.print(grid[i][j]);
            }
            //System.out.println();
        }
        System.out.println(counter);

        filereader.close();
    }
}
