package adventOfCode.year2018;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Day5{

    private static Boolean sameButCaps(char character1, char character2){
        int ascii1 = (int) character1;
        int ascii2 = (int) character2;
        double value = ascii1 - ascii2;
        return (Math.abs(value) == 32);
    }

    private static String reduct(String line){
        int k = 0;
        while(k < line.length()-1){
            if(sameButCaps(line.charAt(k), line.charAt(k+1))){
                if(k + 2 < line.length()){
                    line = line.substring(0, k) + line.substring(k+2, line.length());
                } else{
                    line = line.substring(0, k);
                }                
                if(k > 0){
                     k -= 1;
                }
            } else{
                k += 1;
            }
        }
        return line;
    }

    private static Boolean same(String s, String st){
        if(s.equals(st)){
            return true;
        }
        if(sameButCaps(s.charAt(0), st.charAt(0))){
            return true;
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2018\\inputs\\input5.txt"));

        String line = filereader.readLine();

        filereader.close();

        String lineCopy = line;
        line = reduct(line);
        System.out.println(line.length());

        String [] letters = "abcdefghijklmnopqrstuvwxyz".split("");

        int startingLength = lineCopy.length();
        String [] polymer = lineCopy.split("");
        int min = Integer.MAX_VALUE;
        
        for(String s: letters){
            String newPolymer = "";
            for(String st: polymer){
                if(!same(s, st)){
                    newPolymer += st;
                }
            }
            if(newPolymer.length() < startingLength){
                newPolymer = reduct(newPolymer);
                if(newPolymer.length() < min){
                    min = newPolymer.length();
                }
            }
        }
        System.out.println(min);
        /*
        13233
        to high
        */
    }
}