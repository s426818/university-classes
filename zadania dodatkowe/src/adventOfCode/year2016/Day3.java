package adventOfCode.year2016;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Day3 {

    private static Boolean isThisTriangle(int a, int b, int c){
        if(a + b > c && a + c > b && b + c > a){
            return true;
        }
        return false;
    }
    
    private static int [] readNumbers(String line){
        int [] array = new int[3];
        int i = 0;
        while(line.charAt(i) == ' '){
            i += 1;
        }
        String number1 = "";
        while(line.charAt(i) != ' '){
            number1 += Character.toString(line.charAt(i));
            i += 1;
        }
        while(line.charAt(i) == ' '){
            i += 1;
        }
        String number2 = "";
        while(line.charAt(i) != ' '){
            number2 += Character.toString(line.charAt(i));
            i += 1;
        }
        while(line.charAt(i) == ' '){
            i += 1;
        }
        String number3 = "";
        while(i < line.length()){
            number3 += Character.toString(line.charAt(i));
            i += 1;
        }
        array[0] = Integer.valueOf(number1);
        array[1] = Integer.valueOf(number2);
        array[2] = Integer.valueOf(number3);
        return array;
    }

    public static void main(String[] args) throws IOException {
        
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2016\\inputs\\input3.txt"));

        BufferedReader filereaderVert = null;
        filereaderVert = new BufferedReader(new FileReader("src\\adventOfCode\\year2016\\inputs\\input3.txt"));

        int numberOfTriangles = 0;
        int numberOfTrianglesVertically = 0;
        String line = filereader.readLine();
        
        while(line!=null){
            int [] array = readNumbers(line);
            if(isThisTriangle(array[0], array[1], array[2])){
                numberOfTriangles += 1;
            }
            line = filereader.readLine();
        }

        line = filereaderVert.readLine();
        while(line!=null){
            List<int []> matrix = new ArrayList<>();
            matrix.add(readNumbers(line));
            line = filereaderVert.readLine();
            matrix.add(readNumbers(line));
            line = filereaderVert.readLine();
            matrix.add(readNumbers(line));

            int [] array1 = {matrix.get(0)[0], matrix.get(1)[0], matrix.get(2)[0]};
            int [] array2 = {matrix.get(0)[1], matrix.get(1)[1], matrix.get(2)[1]};
            int [] array3 = {matrix.get(0)[2], matrix.get(1)[2], matrix.get(2)[2]};

            if(isThisTriangle(array1[0], array1[1], array1[2])){
                numberOfTrianglesVertically += 1;
            }
            if(isThisTriangle(array2[0], array2[1], array2[2])){
                numberOfTrianglesVertically += 1;
            }
            if(isThisTriangle(array3[0], array3[1], array3[2])){
                numberOfTrianglesVertically += 1;
            }

            line = filereaderVert.readLine();
        }

        System.out.println(numberOfTriangles);
        System.out.println(numberOfTrianglesVertically);

        filereader.close();
        filereaderVert.close();
    }
}
