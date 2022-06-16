package adventOfCode.year2015;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Day13 {

    /*
    private static HashSet<ArrayList<String>> permutations(ArrayList<String> keys){
        HashSet<ArrayList<String>> set = new HashSet<>();
        if(keys.size() == 1){
            set.add(keys);
        } else{
            
        }

        return set;
    }
    */
    

    private static HashSet<ArrayList<String>> test(ArrayList<String> array){
        HashSet<ArrayList<String>> set = new HashSet<>();
        for(int i = 0; i < array.size(); i++){
            ArrayList<String> newList = new ArrayList<>();
            newList.add(array.get(i));
            for(int j = 0; j < array.size(); j++){
                //for(int k = )
            }
        }
        return set;
    }

    public static void main(String[] args) throws IOException {
        
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2015\\inputs\\input13.txt"));

        Map<String, ArrayList<Pair>> preferences = new HashMap<>();
        ArrayList<String> names = new ArrayList<>();
        String line = filereader.readLine();
        
        String now = line.split(" ")[0];
        names.add(now);
        while(line!=null){
            String [] splitLine = line.split(" ");
            ArrayList<Pair> preferencesOfSinglePerson = new ArrayList<>();
            while(now.equals(splitLine[0]) && line!=null){
                if(splitLine[2].equals("gain")){
                    Pair pair = new Pair(splitLine[10], Integer.parseInt(splitLine[3]));
                    preferencesOfSinglePerson.add(pair);
                } else{
                    Pair pair = new Pair(splitLine[10], (-1) * Integer.parseInt(splitLine[3]));
                    preferencesOfSinglePerson.add(pair);
                }
                line = filereader.readLine();
                if(line!=null){
                    splitLine = line.split(" ");
                }
                
            }
            preferences.put(now, preferencesOfSinglePerson);
            if(line!=null){
                now = line.split(" ")[0];
                names.add(now);
            }
                       
        }

        for(String key: preferences.keySet()){
            for(Pair p : preferences.get(key)){
                System.out.println(key + ": " + Integer.toString(p.happiness) + " " + p.name);
            }
        }



        filereader.close();

    }

    private static class Pair{
        String name = "";
        int happiness = 0;

        private Pair(String name, int happiness){
            this.name = name;
            this.happiness = happiness;
        }
    }
    
}


