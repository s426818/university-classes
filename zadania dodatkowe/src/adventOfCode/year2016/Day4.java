package adventOfCode.year2016;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Day4 {

    private static Map<String, Integer> addLetter(Map<String, Integer> map, String letter){
        if(map.keySet().contains(letter)){
            map.put(letter, map.get(letter) + 1);
        } else{
            map.put(letter, 1);
        }
        return map;
    }

    private static Boolean checkChecksum(String checksum, Map<String, Integer> letters){
        for(String s: checksum.split("")){
            if(letters.get(s) == Collections.max(letters.values())){
                Set<String> maxLetters = new HashSet<>();
                for(String st: letters.keySet()){
                    if(letters.get(st) == Collections.max(letters.values())){
                        maxLetters.add(st);
                    }
                }
                if(!s.equals(Collections.min(maxLetters))){
                    return false;
                }
                letters.remove(s);
            } else{
                return false;
            }
        }
        return true;
    }

    private static int isItReal(String s, Map<String, Integer> letters){
        String [] idAndChecksum = s.split("");
        int k = 0;
        String id = "";
        while(!idAndChecksum[k].equals("[")){
            id += idAndChecksum[k];
            k += 1;
        }
        k += 1;
        String checksum = "";
        while(!idAndChecksum[k].equals("]")){
            checksum += idAndChecksum[k];
            k += 1;
        }
        
        if(checkChecksum(checksum, letters)){
            return Integer.parseInt(id);
        }
        return 0;
    }

    private static int doSth(String line){
        Map<String, Integer> letters = new HashMap<>();
        String [] splitLine = line.split("-");
        for(int i = 0; i < splitLine.length-1; i++){
            String [] partOfName = splitLine[i].split("");
            for(String s: partOfName){
                letters = addLetter(letters, s);
            }
        }
        /*
        String name = "";
        for(int i = 0; i < splitLine.length - 1; i++){
            for(String st: splitLine[i].split("")){
                if(st.equals("-")){
                    name += " ";
                }
                name += move(st, howMuchToMove(343));
            }
        }
        if(isItReal(splitLine[splitLine.length-1], letters) > 0){
            System.out.print(name + ": ");
            System.out.println(splitLine[splitLine.length-1]);
        }
        */
        return isItReal(splitLine[splitLine.length-1], letters);
    }
    
    private static int howMuchToMove(int number){
        while(number > 26){
            number -= 26;
        }
        return number;
    }

    private static String [] alphabet = "abcdefghijklmnopqrstuvwxyz".split("");

    private static int findIndex(String letter){
        int i = 0;
        while(!alphabet[i].equals(letter)){
            i += 1;
        }
        return i;
    }

    private static String move(String letter, int number){
        int counter = findIndex(letter);
        while(number > 0){
            counter += 1;
            number -= 1;
            if(counter == 26){
                counter = 0;
            }
        }
        return alphabet[counter];
    }

    public static void main(String[] args) throws IOException {
        
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2016\\inputs\\input4.txt"));

        int sum = 0;
        String line = filereader.readLine();

        List<Integer> t = new ArrayList<>();
        while(line!=null){
            int temp = doSth(line);
            if(temp > 421 && temp < 499){
                t.add(temp);
            }
            sum += temp;
            
            line = filereader.readLine();
        }

        System.out.println(sum);
        Collections.sort(t);
        for(int i: t){
            System.out.println(i);
        }

        /*
        String name = "";
        String [] fakename = "qzmt-zixmtkozy-ivhz".split("-");
        for(String s: fakename){
            for(String st: s.split("")){
                if(st.equals("-")){
                    name += " ";
                }
                name += move(st, howMuchToMove(343));
            }
        }
        System.out.println(name);
        */

        filereader.close();
    }
}
