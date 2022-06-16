package adventOfCode.year2017;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Day4 {

    private static Boolean areThesePalindroms(String a, String b){
        if(a.length() != b.length()){
            return false;
        }
        Boolean palindrom = true;
        //String newWord = "";
        String [] splitA = a.split("");
        String [] splitB = b.split("");
        List<String> listA = new ArrayList<>();
        List<String> listB = new ArrayList<>();
        //int i = 0;
        for(String s: splitA){
            listA.add(s);
        }
        for(String s: splitB){
            listB.add(s);
        }
        while(palindrom && listA.size() > 0){
            int size = listA.size();
            String letter = listA.get(0);
            int k = 0;
            while(k < listB.size()){
                if(listB.get(k).equals(letter)){
                    listB.remove(k);
                    listA.remove(letter);
                    k = Integer.MAX_VALUE;
                } else{
                    k += 1;
                }
            }
            if(size == listA.size()){
                palindrom = false;
            }
        }

        /*
        if(listA.size() == 0){
            return true;
        }
        */

        return palindrom;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2017\\inputs\\input4.txt"));

        int counter = 0;
        int abotherCounter = 0;
        String line = filereader.readLine();
        while(line!=null){
            String [] splitLine = line.split(" ");
            Boolean valid = true;
            Boolean anotherValid = true;
            for(int i = 0; i < splitLine.length-1; i++){
                for(int j = i+1; j < splitLine.length; j++){
                    if(splitLine[i].equals(splitLine[j])){
                        valid = false;
                    }
                    if(splitLine[i].equals(splitLine[j]) || areThesePalindroms(splitLine[i], splitLine[j])){
                        anotherValid = false;
                    }
                }
            }
            if(valid){
                counter += 1;
            }
            if(anotherValid){
                abotherCounter += 1;
            }
            line = filereader.readLine();
        }

        System.out.println(counter);
        System.out.println(areThesePalindroms("abc", "cba"));
        System.out.println(areThesePalindroms("kotek", "płotek"));
        System.out.println(areThesePalindroms("mama", "mama"));
        System.out.println(areThesePalindroms("kołek", "kełok"));
        System.out.println(abotherCounter);
        
        filereader.close();
    }

}
