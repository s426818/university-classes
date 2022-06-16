package adventOfCode.year2015;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Day19 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2015\\inputs\\input19.txt"));

        Map<String, ArrayList<String>> instructions = new HashMap<>();
        Set<String> molecules = new HashSet<>();

        String line = filereader.readLine();

        while(!line.equals("")){
            String [] splitLine = line.split(" => ");
            if(instructions.keySet().contains(splitLine[0])){
                instructions.get(splitLine[0]).add(splitLine[1]);
            } else{
                ArrayList<String> list = new ArrayList<>();
                list.add(splitLine[1]);
                instructions.put(splitLine[0], list);
            }
            line = filereader.readLine();
        }

        /*
        for(String key : instructions.keySet()){
            System.out.println(instructions.get(key));
            System.out.println(key);
        }
        */
        

        String molecule = filereader.readLine();
        
        molecule += "         ";

        int n = 0;
        for(int i = 0; i < molecule.length(); i++){
            if(instructions.keySet().contains(Character.toString(molecule.charAt(i)))){
                String beggining = molecule.substring(0, i);
                String ending = molecule.substring(i+1);
                for(String s : instructions.get(Character.toString(molecule.charAt(i)))){
                    molecules.add(beggining + s + ending);
                }
            }
            if(instructions.keySet().contains(molecule.substring(n, n+2))){
                String beggining = molecule.substring(0, i);
                String ending = molecule.substring(i+2);
                for(String s : instructions.get(molecule.substring(n, n+2))){
                    molecules.add(beggining + s + ending);
                }
            }
            if(n < molecule.length()-2){
                n += 1;
            }
        }

        /*
        for(String s : molecules){
            System.out.println(s);
        }
        */

        //System.out.println(n);

        System.out.println(molecules.size());

        filereader.close();

    }
    
}
