package adventOfCode.year2015;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Day17 {

    private static int howManyNeighbours(int [][] array, int x, int y){
        int neighbours = 0;
        for(int i = x-1; i <= x+1; i++){
            for(int j = y-1; j <= y+1; j++){
                if(!(i == x && j == y)){
                    neighbours += array[i][j];
                }
            }
        }
        return neighbours;
    }

    private static int[][] nextStep(int [][] array){
        int [][] newArray = new int [array.length][array.length];
        for(int i = 1; i < array.length-1; i++){
            for(int j = 1; j < array.length-1; j++){
                if(array[i][j] == 0){
                    if(howManyNeighbours(array, i, j) == 3){
                        newArray[i][j] = 1;
                    }
                } else{
                    if(howManyNeighbours(array, i, j) == 2 || howManyNeighbours(array, i, j) == 3){
                        newArray[i][j] = 1;
                    }
                }
            }
        }
        return newArray;
    }

    private static int[][] nextStepPro(int [][] array){
        int [][] newArray = new int [array.length][array.length];
        for(int i = 1; i < array.length-1; i++){
            for(int j = 1; j < array.length-1; j++){
                if(array[i][j] == 0){
                    if(howManyNeighbours(array, i, j) == 3){
                        newArray[i][j] = 1;
                    }
                } else{
                    
                    if(howManyNeighbours(array, i, j) == 2 || howManyNeighbours(array, i, j) == 3){
                        newArray[i][j] = 1;
                    }
                }
                if(i == 1 && j ==1 || i == array.length-2 && j == 1 || i == 1 && j == array.length-2 || i == array.length-2 && j == array.length-2){
                    newArray[i][j] = 1;
                }
            }
        }
        return newArray;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2015\\inputs\\input17.txt"));

        int [][] lights = new int[102][102];
        int [][] alsoLights = new int[102][102];
        int k = 1;
        String line = filereader.readLine();
        while(line!=null){
            for(int i = 0; i < line.length(); i++){
                if(line.charAt(i) == '#'){
                    lights[k][i+1] = 1;
                    alsoLights[k][i+1] = 1;
                }
            }
            k += 1;
            line = filereader.readLine();
        }

        for(int i = 0; i < 100; i++){
            /*
            for(int j = 1; j < lights.length-1; j++){
                for(int l = 1; l < lights.length-1; l++){
                    System.out.print(lights[j][l]);
                }
                System.out.println();
            }
            System.out.println("***********");
            */
            lights = nextStep(lights);
            alsoLights = nextStepPro(alsoLights);
        }

        int sumPro = 0;
        int sum = 0;
        for(int j = 1; j < lights.length-1; j++){
            for(int l = 1; l < lights.length-1; l++){
                sum += lights[j][l];
                sumPro += alsoLights[j][l];
            }
        }

        System.out.println(sum);
        System.out.println(sumPro);

        filereader.close();
    }

}
