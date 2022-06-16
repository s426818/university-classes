package adventOfCode.year2021;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day10 {

    private static Boolean isItOpeningOne(char c){
        if(c == '(' || c == '[' || c == '{' || c == '<'){
            return true;
        }
        return false;
    }

    private static Boolean doesItMatch(char cFromList, char cFromLine){
        if(cFromList == '(' && cFromLine == ')'){
            return true;
        }
        if(cFromList == '{' && cFromLine == '}'){
            return true;
        }
        if(cFromList == '[' && cFromLine == ']'){
            return true;
        }
        if(cFromList == '<' && cFromLine == '>'){
            return true;
        }
        return false;
    }

    private static int howMuchToAdd(char c){
        int number = 0;
        switch (c){
            case ')': number = 3; break;
            case ']': number = 57; break;
            case '}': number = 1197; break;
            case '>': number = 25137; break;
        }
        return number;
    }

    private static int howMuchToAdd2(char c){
        int number = 0;
        switch (c){
            case '(': number = 1; break;
            case '[': number = 2; break;
            case '{': number = 3; break;
            case '<': number = 4; break;
        }
        return number;
    }
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2021\\input10.txt"));

        int suma = 0;
        String line = filereader.readLine();
        List<Long> listOfSums = new ArrayList<>();
        while(line!=null){
            List<Character> listOfChars = new ArrayList<>();
            int k = 0;
            for(int i = 0; i < line.length(); i++){
                if(k == 0){
                    if(isItOpeningOne(line.charAt(i))){
                        listOfChars.add(line.charAt(i));
                    } else{
                        if(doesItMatch(listOfChars.get(listOfChars.size()-1), line.charAt(i))){
                            listOfChars.remove(listOfChars.size()-1);
                        } else{
                            suma += howMuchToAdd(line.charAt(i));
                            k = 1;
                        }
                    }
                }
            }
            
            if(k==0){
                long incompletedSum = 0;
                Collections.reverse(listOfChars);
                for(char c: listOfChars){
                    incompletedSum = (incompletedSum*5) + howMuchToAdd2(c);
                }
                listOfSums.add(incompletedSum);
            }

            line = filereader.readLine();
        }

        Collections.sort(listOfSums);

        for(int i = 0; i < listOfSums.size(); i++){
            System.out.println(listOfSums.get(i));
        }

        System.out.println(listOfSums.get((listOfSums.size()/2)));
        //System.out.println(5/2);

        /*
        for(long i : listOfSums){
            System.out.println(i);
        }
        */

        System.out.println(suma);
        filereader.close();
    }

}
