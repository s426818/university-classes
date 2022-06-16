package adventOfCode.year2015;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Day5 {
    
    private static Boolean repeatingPair(String word){
        Set<String> pairs = new HashSet<>();
        Boolean temp = false;
        int k = 0;
        while(!temp && k < word.length() - 1){
            String pair = Character.toString(word.charAt(k)) + Character.toString(word.charAt(k+1));
            if(pairs.contains(pair)){
                temp = true;
            } else{
                if(k < word.length() - 2 && word.charAt(k) == word.charAt(k+1) && word.charAt(k+2) == word.charAt(k+1)){
                    k += 1;
                }
                pairs.add(pair);
            }
            k +=1;
        }
        return temp;
    }

    private static Boolean combo(String word){
        Boolean temp = false;
        int k = 0;
        while(!temp && k < word.length() - 2){
            if(word.charAt(k) == word.charAt(k+2)){
                temp = true;
            }            
            k +=1;
        }
        return temp;
    }

    public static void main(String[] args) throws IOException {
        
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2015\\inputs\\input5.txt"));

        String line = filereader.readLine();
        int counter = 0;
        int betterCounter = 0;

        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        Set<String> badWords = new HashSet<>();
        badWords.add("ab");
        badWords.add("cd");
        badWords.add("pq");
        badWords.add("xy");

        while(line!=null){
            int vowelCounter = 0;
            Boolean doubleLetter = false;
            Boolean badWord = false;

            if(combo(line) && repeatingPair(line)){
                betterCounter += 1;
            }

            int k = 0;
            while(k < line.length() - 1 && !badWord){
                if(vowels.contains(line.charAt(k))){
                    vowelCounter += 1;
                }
                if(line.charAt(k) == line.charAt(k+1)){
                    doubleLetter = true;
                }
                if(badWords.contains(Character.toString(line.charAt(k)) + Character.toString(line.charAt(k+1)))){
                    badWord = true;
                }
                k += 1;
            }

            if(vowels.contains(line.charAt(k))){
                vowelCounter += 1;
            }

            if(vowelCounter >=3 && doubleLetter && !badWord){
                counter += 1;
            }

            line = filereader.readLine();
        }

        System.out.println(counter);
        System.out.println(betterCounter);

        filereader.close();

    }

    
}
