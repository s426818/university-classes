package adventOfCode.year2018;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Day1 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2018\\inputs\\input1.txt"));

        Set<Integer> freq = new HashSet<>();

        Boolean print = true;

        Integer counter = 0;
        freq.add(counter);
        String line = filereader.readLine();

        while(line!=null){            
            counter += Integer.parseInt(line);
            if(freq.contains(counter) && print){
                System.out.println(counter);
                print = false;
            }
            freq.add(counter);
            line = filereader.readLine();
            if(line == null){
                filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2018\\inputs\\input1.txt"));
                line = filereader.readLine();
            }
        }

        System.out.println(counter);

        filereader.close();
    }
}
