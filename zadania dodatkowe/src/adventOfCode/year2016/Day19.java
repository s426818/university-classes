package adventOfCode.year2016;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Day19 {

    private static int nextIndex(int[] elves, int k){
        int l = k+1;
        if(l >= elves.length - 1){
            l = 0;
        }
        while(elves[l] != 0){
            if(l >= elves.length - 1){
                l = 0;
            }
            l += 1;
        }
        return l;
    }

    private static int [] steal(int [] elves, int k){
        // elf who steals is on the k index, we look for index of the elf he will steal from
        k += 1;
        if(k >= elves.length-1){
            k = 0;
        }
        while(elves[k] != 0){
            if(k >= elves.length-1){
                k = 0;
            }
            k += 1;
        }
        elves[k] = Integer.MAX_VALUE;
        return elves;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2016\\inputs\\input19.txt"));
        String input = filereader.readLine();
        filereader.close(); 

        List<Elf> elves = new ArrayList<>();
        for(int i = 1; i <= Integer.parseInt(input); i++){
            elves.add(new Elf(i));
        }

        List<Elf> elves2 = new ArrayList<>();
        for(int i = 1; i <= Integer.parseInt(input); i++){
            elves2.add(new Elf(i));
        }

        int c = 0;
        for(int i = 0; i < 3000000; i++){
            c += 1;
        }

        System.out.println(c);

        /*
        int k = 0;
        while(elves.size() > 1){
            if(k > elves.size() - 1){
                k = 0;
            } else{
                if(k == elves.size() - 1){
                    elves.remove(0);
                } else{
                    elves.remove(k+1);
                }
                k += 1;
            }
        }
        */

        /*
        while(elves2.size() > 1){
            Elf temp = elves2.get(0);
            elves2.remove(0);
            elves2.remove(1);
            elves2.add(temp);
        }
        */

        while(elves2.size() > 1){
            List<Elf> newElves = new ArrayList<>();
            if(elves2.size() % 2 == 0){
                for(int i = 0; i < elves2.size(); i += 2){
                    newElves.add(elves2.get(i));
                }
            } else{
                for(int i = 2; i < elves2.size(); i += 2){
                    newElves.add(elves2.get(i));
                }
            }
            elves2 = newElves;
        }

        System.out.println(elves.get(0).id);
        System.out.println(elves.size());

        System.out.println(elves2.get(0).id);
        System.out.println(elves2.size());
        
    }

    private static class Elf{
        int id = 0;

        private Elf(){

        }

        private Elf(int id){
            this.id = id;
        }
    }

}
