package adventOfCode.year2017;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Day1 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2017\\inputs\\input1.txt"));

        int counter = 0;
        String [] input = filereader.readLine().split("");
        for(int i = 0; i < input.length; i++){
            if(i == input.length-1){
                if(input[i].equals(input[0])){
                    counter += Integer.parseInt(input[i]);
                }
            } else{
                if(input[i].equals(input[i+1])){
                    counter += Integer.parseInt(input[i]);
                }
            }
        }

        int anotherCounter = 0;
        int half = input.length/2;
        for(int i = 0; i < input.length; i++){
            if(i + half < input.length){
                if(input[i].equals(input[i+half])){
                    anotherCounter += Integer.parseInt(input[i]);
                }
            } else{
                int k = (i + half) - input.length;
                if(input[i].equals(input[k])){
                    anotherCounter += Integer.parseInt(input[i]);
                }
            }
        }

        System.out.println(anotherCounter);
        System.out.println(counter);

        filereader.close();
    }
}
