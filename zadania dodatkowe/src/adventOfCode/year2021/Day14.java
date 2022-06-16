package adventOfCode.year2021;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Day14 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2021\\inputs\\input14.txt"));

        String polimer = filereader.readLine();
        Map<String, String> formulas = new HashMap<>();
        Map<String, Long> counter = new HashMap<>();

        Map<String, String> test = new HashMap<>();

        for(int i = 0; i < polimer.length(); i++){
            if(counter.containsKey(Character.toString(polimer.charAt(i)))){
                counter.put(Character.toString(polimer.charAt(i)), counter.get(Character.toString(polimer.charAt(i)))+1);
            } else{
                counter.put(Character.toString(polimer.charAt(i)), Long.parseLong("1"));
            }
        }

        int k = 0;
        String line = filereader.readLine();
        line = filereader.readLine();

        formulas.put("czesc1",  "blep");
        while(line!=null){
            String [] array = line.split(" -> ");
            String value = array[1];
            test.put(array[0], value);
            formulas.put(array[0], "czesc");
            line = filereader.readLine();
            k += 1;
        }

        for(String key: test.keySet()){
            System.out.print(key);
            System.out.print(" ");
            System.out.println(test.get(key));
        }

        for(String key : counter.keySet()){
            System.out.print(key);
            System.out.print(" ");
            System.out.println(counter.get(key));
            
        }

        System.out.println(polimer);

        for(int i = 0 ; i < 10; i++){
            String nowyPolimer = "";
            for(int j = 0; j < polimer.length()-1; j++){
                nowyPolimer += polimer.substring(j, j+1);
                String nowyZnak = test.get(Character.toString(polimer.charAt(j)) + Character.toString(polimer.charAt(j+1)));
                nowyPolimer += nowyZnak;
                if(counter.keySet().contains(nowyZnak)){
                    counter.put(nowyZnak, counter.get(nowyZnak)+1);
                } else{
                    counter.put(nowyZnak, Long.parseLong("1"));
                }                
            }
            polimer = nowyPolimer + Character.toString(polimer.charAt(polimer.length()-1));
        }


        for(int i = 0; i < polimer.length()-2; i++){
            for(int j = 0; j < 40; j++){
                String whatShouldBeAdded = "";
                String newPolimer = polimer.substring(j, j+2);
                System.out.println(newPolimer);
            }
        }

        for(String key : counter.keySet()){
            System.out.print(key);
            System.out.print(" ");
            System.out.println(counter.get(key));
            
        }

        long max = Collections.max(counter.values());
        long min = Collections.min(counter.values());

        System.out.println(max);
        System.out.println(min);

        System.out.println(max - min);

        

        filereader.close();
        
    }

}
