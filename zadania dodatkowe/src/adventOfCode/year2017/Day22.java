package adventOfCode.year2017;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Day22 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2017\\inputs\\input22.txt"));

        int [][] grid = new int[1001][1001];
        int [][] evolvedGrid = new int[1001][1001];
        int center = grid.length/2;
        String line = filereader.readLine();
        int beginInsert = center - line.length()/2;
        int row = beginInsert;
        
        while(line!=null){
            int k = 0;
            for(int i = beginInsert; i < beginInsert + line.length(); i++){
                if(line.charAt(k) == '#'){
                    grid[row][i] = 1;
                    evolvedGrid[row][i] = 1;
                }
                 k += 1;
            }
            row += 1;  
            line = filereader.readLine();          
        }

        Virus virus = new Virus(center, center);
        int counter = 0;

        for(int i = 0; i < 10000; i++){
            virus.changeDirection(grid);
            if(grid[virus.positionX][virus.positionY] == 0){
                grid[virus.positionX][virus.positionY] = 1;
                counter += 1;
            } else{
                grid[virus.positionX][virus.positionY] = 0;
            }
            virus.move();
        }

        virus = new Virus(center, center);
        int evolvedCounter = 0;
        for(int i = 0; i < 10000000; i++){
            virus.changeDirection(evolvedGrid);
            if(evolvedGrid[virus.positionX][virus.positionY] == 0){
                evolvedGrid[virus.positionX][virus.positionY] = 2;
            } else{
                if(evolvedGrid[virus.positionX][virus.positionY] == 1){
                    evolvedGrid[virus.positionX][virus.positionY] = 3;
                } else{
                    if(evolvedGrid[virus.positionX][virus.positionY] == 2){
                        evolvedGrid[virus.positionX][virus.positionY] = 1;
                        evolvedCounter += 1;
                    } else{
                        if(evolvedGrid[virus.positionX][virus.positionY] == 3){
                            evolvedGrid[virus.positionX][virus.positionY] = 0;
                        }                
                    }
                }               
            }
            virus.move();
        }

        /*
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid.length; j++){
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
        */

        System.out.println(counter);
        System.out.println(evolvedCounter);

        filereader.close();
    }

    private static class Virus{
        String direction = "UP";
        int positionX = 0;
        int positionY = 0;

        private Virus(){

        }

        private Virus(int positionX, int positionY){
            this.positionX = positionX;
            this.positionY = positionY;
        }

        private void changeDirection(int [][] grid){
            // clean
            if(grid[positionX][positionY] == 0){
                switch (direction){
                    case "UP": direction = "LEFT"; break;
                    case "LEFT" : direction = "DOWN"; break;
                    case "DOWN": direction = "RIGHT"; break;
                    case "RIGHT": direction = "UP"; break;
                }
            } else{
                // infected
                if(grid[positionX][positionY] == 1){
                    switch (direction){
                        case "UP": direction = "RIGHT"; break;
                        case "LEFT" : direction = "UP"; break;
                        case "DOWN": direction = "LEFT"; break;
                        case "RIGHT": direction = "DOWN"; break;
                    }
                } else{
                    // weakened
                    if(grid[positionX][positionY] == 2){
                        
                    } else{
                        // flagged
                        if(grid[positionX][positionY] == 3){
                            switch (direction){
                                case "UP": direction = "DOWN"; break;
                                case "LEFT" : direction = "RIGHT"; break;
                                case "DOWN": direction = "UP"; break;
                                case "RIGHT": direction = "LEFT"; break;
                            }
                        }
                    }
                }
            }
        }

        private void move(){
            switch (direction){
                case "UP": positionX -= 1; break;
                case "LEFT" : positionY -= 1;; break;
                case "DOWN": positionX += 1; break;
                case "RIGHT": positionY += 1; break;
            }
        }
    }

}
