package adventOfCode.year2017;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Day5 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2017\\inputs\\input5.txt"));

        List<Integer> jumps = new ArrayList<>();
        List<Integer> anotherJumps = new ArrayList<>();
        String line = filereader.readLine();
        while(line!=null){
            jumps.add(Integer.parseInt(line));
            anotherJumps.add(Integer.parseInt(line));
            line = filereader.readLine();
        }

        filereader.close();

        int counter = 0;
        int k = 0;
        while(k < jumps.size()){
            int jump = jumps.get(k);
            jumps.remove(k);
            jumps.add(k, jump+1);
            k += jump;
            counter += 1;
        }

        
        int anotherCounter = 0;
        int l = 0;
        while(l < anotherJumps.size()){
            int jump = anotherJumps.get(l);
            anotherJumps.remove(l);
            if(jump >= 3){
                anotherJumps.add(l, jump-1);
            } else{
                anotherJumps.add(l, jump+1);
            }
            l += jump;
            anotherCounter += 1;
        }

        System.out.println(counter);
        System.out.println(anotherCounter);
    }
    
}
