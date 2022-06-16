package adventOfCode.year2021;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day13 {

    private static int [][] fold(int [][] array, Character c, int number){
        //w lewo
        if(c.equals('x')){
            int [][] newArray = new int [array.length][number];

            for(int i = 0; i < newArray.length; i++){
                for(int j = 0; j < newArray[0].length; j++){
                    if(array[i][j] == 1){
                        newArray[i][j] = 1;
                    }
                }
            }

            for(int i = 0; i < array.length; i++){
                for(int j = number+1; j < array[0].length; j++){
                    if(array[i][j] == 1){
                        newArray[i][((array[0].length-1) - j)] = 1;
                    }
                }
            }

            return newArray;

        } else{
            //w górę
            int [][] newArray = new int [number][array[0].length];

            for(int i = 0; i < newArray.length; i++){
                for(int j = 0; j < newArray[0].length; j++){
                    if(array[i][j] == 1){
                        newArray[i][j] = 1;
                    }
                }
            }

            for(int i = number+1; i < array.length; i++){
                for(int j = 0; j < array[0].length; j++){
                    if(array[i][j] == 1){
                        newArray[((array.length-1) - i)][j] = 1;
                    }
                }
            }

            return newArray;
        }
    }
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2021\\inputs\\input13.txt"));

        List<Integer> listOfX = new ArrayList<>();
        List<Integer> listOfY = new ArrayList<>();
        List<Character> xOrY  = new ArrayList<>();
        List<Integer> pointsOfFold = new ArrayList<>();

        String line = filereader.readLine();
        while(!line.equals("")){
            String [] splitLine = line.split(",");
            listOfX.add(Integer.parseInt(splitLine[0]));
            listOfY.add(Integer.parseInt(splitLine[1]));
            line = filereader.readLine();
        }

        int [][] dots = new int[Collections.max(listOfX)+1][Collections.max(listOfY)+1];

        //System.out.println(Collections.max(listOfX));
        //System.out.println(Collections.max(listOfY));

        for(int i = 0; i < listOfX.size(); i++){
            dots[listOfX.get(i)][listOfY.get(i)] = 1;
        }

        line = filereader.readLine();
        while(line!=null){
            String [] splitLine = line.split("=");
            xOrY.add(splitLine[0].charAt(splitLine[0].length()-1));
            pointsOfFold.add(Integer.parseInt(splitLine[1]));
            line = filereader.readLine();
        }

        /*
        for(Character c : xOrY){
            System.out.println(c);
        }

        for(Integer i : pointsOfFold){
            System.out.println(i);
        }
        */

        int suma = 0;

        /*
        for(int i = 0; i < xOrY.size(); i++){
            suma = 0;
            dots = fold(dots, xOrY.get(i), pointsOfFold.get(i));

            for(int j = 0; j < dots.length; j++){
                for(int k = 0; k < dots[0].length; k++){
                    suma += dots[j][k];
                    System.out.print(dots[j][k]);
                }
                System.out.println("");
            }
            System.out.println("--------");
            System.out.println(suma);
        }
        */

        dots = fold(dots, xOrY.get(0), pointsOfFold.get(0));

        for(int j = 0; j < dots.length; j++){
            for(int k = 0; k < dots[0].length; k++){
                suma += dots[j][k];
                //System.out.print(dots[j][k]);
            }
            //System.out.println("");
        }

        System.out.println(suma);

        filereader.close();
    }
}
