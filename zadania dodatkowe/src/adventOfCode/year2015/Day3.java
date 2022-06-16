package adventOfCode.year2015;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Day3 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2015\\inputs\\input3.txt"));

        String line = filereader.readLine();
        int [][] grid = new int [line.length()][line.length()];
        int j = line.length()/2;
        int k = line.length()/2;
        int o = line.length()/2;
        int p = line.length()/2;
        int counter = 1;

        Santa realSanta = new Santa(j, k);
        Santa roboSanta = new Santa(j, k);

        Set<String> realSantaHouses = new HashSet<>();
        Set<String> roboSantaHouses = new HashSet<>();

        String house = Integer.toString(j) + ", " + Integer.toString(k);
        realSantaHouses.add(house);
        roboSantaHouses.add(house);

        grid[j][k] += 2;

        for(int i = 0; i < line.length(); i += 2){
            /*
            if(line.charAt(i) == '<'){
                k -= 1;
                grid[j][k] += 1;
            } 
            if(line.charAt(i) == '>'){
                k += 1;
                grid[j][k] += 1;
            }
            if(line.charAt(i) == '^'){
                j += 1;
                grid[j][k] += 1;
            }
            if(line.charAt(i) == 'v'){
                j -= 1;
                grid[j][k] += 1;
            }
            if(grid[j][k] == 1){
                counter += 1;
            }

            if(line.charAt(i+1) == '<'){
                p -= 1;
                grid[o][p] += 1;
            } 
            if(line.charAt(i+1) == '>'){
                p += 1;
                grid[o][p] += 1;
            }
            if(line.charAt(i+1) == '^'){
                o += 1;
                grid[o][p] += 1;
            }
            if(line.charAt(i+1) == 'v'){
                o -= 1;
                grid[o][p] += 1;
            }
            if(grid[o][p] == 1){
                counter += 1;
            }
            */

            realSanta.moveSanta(line.charAt(i));
            grid[realSanta.xPosition][realSanta.yPosition] += 1;
            house = Integer.toString(realSanta.xPosition) + ", " + Integer.toString(realSanta.yPosition);
            realSantaHouses.add(house);

            roboSanta.moveSanta(line.charAt(i+1));
            grid[roboSanta.xPosition][roboSanta.yPosition] += 1;
            house = Integer.toString(roboSanta.xPosition) + ", " + Integer.toString(roboSanta.yPosition);
            roboSantaHouses.add(house);
        }

        
        int sum = 0;
        for(int i = 0; i < line.length(); i++){
            for(int l = 0; l < line.length(); l++){
                if(grid[i][l] != 0){
                    sum += 1;
                }
            }
        }
        

        System.out.println(counter);
        System.out.println(sum);

        System.out.println(realSantaHouses.size());
        System.out.println(roboSantaHouses.size());

        Set<String> housesInTotal = new HashSet<>();
        housesInTotal.addAll(realSantaHouses);
        housesInTotal.addAll(roboSantaHouses);
        System.out.println(housesInTotal.size());

        filereader.close();
        
    }

    private static class Santa{
        private int xPosition = 0;
        private int yPosition = 0;

        private Santa(int x, int y){
            xPosition = x;
            yPosition = y;
        }

        private void moveSanta(char c){
            if(c == '<'){
                yPosition -= 1;
            }

            if(c == '>'){
                yPosition += 1;
            }

            if(c == '^'){
                xPosition -= 1;
            }

            if(c == 'v'){
                xPosition += 1;
            }
        }
    }

}
