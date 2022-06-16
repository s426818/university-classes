package adventOfCode.year2018;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Day2 {

    private static String same(String id1, String id2){
        String value = "";
        String [] splitId1 = id1.split("");
        String [] splitId2 = id2.split("");
        for(int i = 0; i < splitId1.length; i++){
            if(splitId1[i].equals(splitId2[i])){
                value += splitId1[i];
            }
        }
        return value;
    }

    private static Boolean similarity(String id1, String id2){
        String [] splitId1 = id1.split("");
        String [] splitId2 = id2.split("");
        if(splitId1.length != splitId2.length){
            return false;
        } else{
            int counter = 0;
            for(int i = 0; i < splitId1.length; i++){
                if(!splitId1[i].equals(splitId2[i])){
                    counter += 1;
                }
            }
            if(counter == 1){
                return true;
            }
        }
        return false;
    }

    private static int[] countOccurences(String id){
        int [] twoAndThree = new int[2];
        Map<String, Integer> occurences = new HashMap<>();
        String [] splitId = id.split("");
        for(String letter: splitId){
            if(occurences.keySet().contains(letter)){
                occurences.put(letter, occurences.get(letter) + 1);
            } else{ 
                occurences.put(letter, 1);
            }
        }
        for(String key: occurences.keySet()){
            if(occurences.get(key) == 2){
                twoAndThree[0] = 1;
            }
            if(occurences.get(key) == 3){
                twoAndThree[1] = 1;
            }
        }
        return twoAndThree;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2018\\inputs\\input2.txt"));

        List<String> ids = new ArrayList<>();

        String line = filereader.readLine();
        int [] occurences = new int[2];
        while(line!=null){
            int [] occurencesFromLine = countOccurences(line);
            occurences[0] += occurencesFromLine[0];
            occurences[1] += occurencesFromLine[1];
            ids.add(line);
            line = filereader.readLine();
        }

        System.out.println(occurences[0] * occurences[1]);

        List<String> similar = new ArrayList<>();

        for(int i = 0; i < ids.size(); i++){
            for(int j = 0; j < ids.size(); j++){
                if(i != j){
                    if(similarity(ids.get(i), ids.get(j)) && !similar.contains(ids.get(i))){
                        similar.add(ids.get(i));
                        similar.add(ids.get(j));
                    }
                }
            }
        }

        for(String s: similar){
            System.out.println(s);
        }

        System.out.println(same(similar.get(0), similar.get(1)));

        filereader.close();
    }
}
