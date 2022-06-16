package adventOfCode.year2016;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Day6 {
    
    private static Pair [] initialize(){
        Pair [] init = new Pair [26];
        String [] alphabet = "abcdefghijklmnopqrstuvwxyz".split("");
        int i = 0;
        for(String s: alphabet){
            init[i] = new Pair(s);
            i += 1;
        }
        return init;
    }

    public static void main(String[] args) throws IOException {
        
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2016\\inputs\\input6.txt"));

        String line = filereader.readLine();
        List<Pair []> list = new ArrayList<>();
        for(int i = 0; i < line.length(); i++){
            list.add(initialize());
        }

        while(line!=null){
            for(int i = 0; i < line.length(); i++){
                list.get(i)[line.charAt(i) - 97].counter += 1;
            }
            line = filereader.readLine();
        }

        String answer = "";
        String modifiedAnswer = "";
        for(Pair[] p: list){
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            String st = "";
            String modifiedSt = "";
            for(Pair pa: p){
                if(pa.counter < min && pa.counter != 0){
                    System.out.println("trst");
                    min = pa.counter;
                    modifiedSt = pa.character;
                }
                if(pa.counter > max){
                    max = pa.counter;
                    st = pa.character;
                }
                
            }
            answer += st;
            modifiedAnswer += modifiedSt;
        }
        System.out.println(answer);
        System.out.println(modifiedAnswer);
        
        filereader.close();

    }
   
    private static class Pair{
        String character = "a";
        int counter = 0;

        private Pair(String character){
            this.character = character;
        }

        private Pair(){

        }
    }
}
