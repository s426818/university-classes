package adventOfCode.year2015;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day24 {

    private static Triple createTriple(int number, List<Integer> list, int desiredWeight){
        Triple triple = new Triple();
        int weight = 0;
        int counter = 0;
        while(weight < desiredWeight && counter < list.size()){
            //if(list.get(counter))
            counter += 1;
        }
        return triple;
    }
    
    public static void main(String[] args) throws IOException {

        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2015\\inputs\\input24.txt"));
        
        List<Integer> weights = new ArrayList<>();
        
        String line = filereader.readLine();
        while(line!=null){
            weights.add(Integer.parseInt(line));
            line = filereader.readLine();
        }

        int oneThirdOfWeight = 0;
        for(int w : weights){
            oneThirdOfWeight += w;
        }

        oneThirdOfWeight = oneThirdOfWeight/3;

        Collections.sort(weights);

        for(int w: weights){
            createTriple(w, weights, oneThirdOfWeight);
        }

        Triple [] possibleGroups = new Triple [weights.size()];


        int counter = 0;
        while(possibleGroups[counter] == null){
            counter += 1;
        }
        System.out.println(possibleGroups[counter]);

        filereader.close();
    }

    private static class Triple extends ArrayList<int []>{

        /*
        private Triple(int[] groupOne, int [] groupTwo, int[] groupThree){
            Triple.add(groupOne);
        }*/

        private Triple(){

        }
    }
}
