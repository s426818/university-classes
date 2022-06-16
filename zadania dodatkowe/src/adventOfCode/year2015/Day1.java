package adventOfCode.year2015;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Day1 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2015\\inputs\\input1.txt"));

        String line = filereader.readLine();
        int floor = 0;
        int basemant = 0;
        Boolean wasInBasemant = false;

        for(int i = 0; i < line.length(); i++){
            if(line.charAt(i) == '('){
                floor += 1;
            } else{
                floor -=1;
            }
            if(floor == -1 && !wasInBasemant){
                basemant = i+1;
                wasInBasemant = true;
            }
        }

        System.out.println(floor);
        System.out.println(basemant);

        filereader.close();
    }

}
