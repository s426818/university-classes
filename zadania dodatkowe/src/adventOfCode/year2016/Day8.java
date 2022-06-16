package adventOfCode.year2016;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Day8 {
  
    private static int [] moveRight(int [] table, int number){
        int [] temp = new int [table.length];
        for(int i = 0; i < table.length; i++){
            if(i + number < table.length){
                temp[i + number] = table[i];
            } else{
                int pom = i + number - table.length;
                temp[pom] = table[i];
            }
        }
        return temp;
    }

    private static int [] returnCopyOfColumn(int [][] table, int number){
        int [] temp = new int [table[0].length];
        for(int i = 0; i < table.length; i++){
            temp[i] = table[i][number];
        }
        return temp;
    }

    private static int [][] moveDown(int [][] table, int numberOfColumn, int number){
        int [] temp = returnCopyOfColumn(table, number);
        for(int i = 0; i < table.length; i++){
            if(i + number < table.length){
                table[i + number][numberOfColumn] = temp[i];
            } else{
                int pom = i + number - table.length;
                table[pom][numberOfColumn] = temp[i];
            }
        }
        return table;
    }

    private static int[][] chooseFunction(String line, int [][] matrix){
        String [] splitLine = line.split(" ");
        System.out.println(splitLine[0]);
        if(splitLine[0].equals("rect")){
            System.out.print("iogsuig");
            String [] temp = splitLine[1].split("x");
            for(int i = 0; i < Integer.parseInt(temp[1]); i++){
                for(int j = 0; j < Integer.parseInt(temp[0]); j ++){
                    matrix[i][j] = 1;
                }
            }
        } else{
            System.out.println(splitLine.length);
            for(String s: splitLine){
                System.out.println(s);
            }
            String [] temp = splitLine[2].split("=");
            int x = Integer.parseInt(temp[1]);
            int y = Integer.parseInt(splitLine[4]);
            if(splitLine[1].equals("row")){                
                matrix[x] = moveRight(matrix[x], y);
            } else{
                matrix = moveDown(matrix, x, y);
            }
        }
        return matrix;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2016\\inputs\\input8.txt"));

        int [][] matrix = new int [6][50];

        String line = filereader.readLine();
        while(line!=null){
            matrix = chooseFunction(line, matrix);
            line = filereader.readLine();
        }

        int counter = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j]);
                if(matrix[i][j] == 1){
                    counter += 1;
                }
            }
            System.out.println();
        }
        System.out.println(counter);

        filereader.close();
    }
    
}
