package adventOfCode.year2015;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day10 {

    private static String newNext(String number){
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < number.length(); i++){
            list.add(Character.valueOf(number.charAt(i)) - 48);
        }
        Collections.reverse(list);
        String newNumber = "";
        int counter = 1;
        int check = number.charAt(0) - 48;
        for(int i = 1; i < number.length(); i++){
            int temp = number.charAt(i) - 48;
            if(temp == check){
                counter += 1;
            } else{
                newNumber += Integer.toString(counter) + Integer.toString(check);
                counter = 1;
            }
            check = temp;
        }
        newNumber += Integer.toString(counter) + Integer.toString(check);
        return newNumber;
    }

    public static void main(String[] args) throws IOException {
        
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2015\\inputs\\input10.txt"));
        String line = filereader.readLine();

        for(int i = 0; i < 50; i++){
            line = newNext(line);
        }

        /*
        for(int i = 0; i < 40; i++){
            line = newNext(line);
        }
        */
        //System.out.println(newNext(line));
        System.out.println(line.length());

        filereader.close();
        
    }
    
}
