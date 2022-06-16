package adventOfCode.year2017;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Day21 {

    private static int [][] matchPatternFrom2To3(int[][] littleGrid){
        int [][] newGrid = new int[3][3];

        return newGrid;
    }

    private static int[][] dividesBy2(int[][] grid){
        int newSize = (grid.length/2) * 3;
        int [][] newGrid = new int[newSize][newSize];
        for(int i = 0; i < grid.length; i += 2){
            int [][] littleGrid = new int [2][2];
            for(int j = i; j < i+2; j++){
                for(int k = i; k < i+2; k++){
                    littleGrid[j][k] = grid[j][k];
                }
            }
            int [][] biggerGrid = matchPatternFrom2To3(littleGrid);
            
        }
        return newGrid;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2017\\inputs\\input2.txt"));

        filereader.close();

        int [][] grid = {{0, 1, 0}, {0, 0, 1}, {1, 1, 1}};
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid.length; j++){
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }

        for(int i = 0; i < 2; i++){
            if(grid.length % 2 == 0){
                grid = dividesBy2(grid);
            }
        }

        int counter = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid.length; j++){
                System.out.print(grid[i][j]);
                if(grid[i][j] == 1){
                    counter += 1;
                }
            }
            System.out.println();
        }
        System.out.println(counter);
    }
}
