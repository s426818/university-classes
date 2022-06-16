package adventOfCode.year2017;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Day12 {

    private static Set<Integer> findReceivers(Set<Integer> receivers, Map<Integer, int[]> pipes){
        for(int i: receivers){
            int [] simpleReceiversOfI = pipes.get(i);
            for(int j: simpleReceiversOfI){
                if(!receivers.contains(j)){
                    receivers.add(j);
                    receivers.addAll(findReceivers(receivers, pipes));
                }
            }
        }
        return receivers;
    }

    private static Set<Integer> findReceiversAgain(Set<Integer> receivers, Map<Integer, int[]> pipes, int number){
        Set<Integer> set = new HashSet<>();
        int [] simpleReceivers = pipes.get(number);
        int size = set.size();
        for(int i: simpleReceivers){
            set.add(i);
        }
        if(set.size() == size){
            
        }
        return set;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2017\\inputs\\input12.txt"));

        Map<Integer, int[]> pipes = new HashMap<>();
        Set<Integer> receiversOf0 = new HashSet<>();
        receiversOf0.add(0);

        String line = filereader.readLine();
        while(line!=null){
            String [] splitLine = line.split(" <=> ");
            String [] splitReceivers = splitLine[1].split(", ");
            int [] receivers = new int [splitReceivers.length];
            for(int i = 0; i < splitReceivers.length; i++){
                receivers[i] = Integer.parseInt(splitReceivers[i]);
            }
            pipes.put(Integer.parseInt(splitLine[0]), receivers);
        }

        filereader.close();
    }

}
