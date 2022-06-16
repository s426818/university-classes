package adventOfCode.year2017;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Day6 {
    
    private static int[] findMax(int [] state){
        int [] valueAndPosition = new int[2];
        int max = Integer.MIN_VALUE;
        int position = Integer.MIN_VALUE;
        for(int i = 0; i < state.length; i++){
            if(state[i] > max){
                max = state[i];
                position = i;
            }
        }
        valueAndPosition[0] = max;
        valueAndPosition[1] = position;
        return valueAndPosition;
    }

    private static int[] redistribute(int [] state){
        int[] valueAndPosition = findMax(state);
        int[] newState = new int[state.length];
        int addToAll = valueAndPosition[0]/state.length;
        int rest = valueAndPosition[0] % state.length;
        for(int i = 0; i < state.length; i++){
            if(i == valueAndPosition[1]){
                newState[i] = addToAll;
            } else{
                newState[i] = state[i] + addToAll;
            }            
        }
        int k = valueAndPosition[1] + 1;
        while(rest > 0){
            if(k >= state.length){
                k = 0;
            }
            newState[k] += 1;
            rest -= 1;
            k += 1;
        }
        return newState;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2017\\inputs\\input6.txt"));

        Set<int []> reachedStates = new HashSet<>();
        List<int []> reachedStatesList = new ArrayList<>();
        String [] line = filereader.readLine().split(" ");
        int [] state = new int [line.length];
        for(int i = 0; i < line.length; i++){
            state[i] = Integer.parseInt(line[i]);
        }
        reachedStates.add(state);
        reachedStatesList.add(0, state);

        int k = 1;
        Boolean duplicate = false;
        int [] newState = redistribute(state);
        while(!duplicate){
            reachedStates.add(newState);
            reachedStatesList.add(newState);
            state = newState;
            newState = redistribute(state);

            for(int[] i: reachedStates){
                int l = 0;
                for(int j = 0; j < i.length; j++){
                    if(i[j] == newState[j]){
                        l += 1;
                    }
                }
                if(l == i.length){
                    duplicate = true;
                }
            }
            k += 1;
            //System.out.println(k);
        }

        int position = Integer.MIN_VALUE;
        for(int i = 0; i < reachedStates.size(); i++){
            int b = 0;
            for(int j = 0; j < reachedStatesList.get(i).length; j++){
                if(reachedStatesList.get(i)[j] == newState[j]){
                    b += 1;
                }
            }
            if(b == reachedStatesList.get(i).length){
                position = i;
            }
        }

        System.out.println(position);
        System.out.println(reachedStates.size());
        System.out.println(reachedStatesList.size());
        System.out.println(reachedStates.size()-position);
        
        System.out.println(k);
        filereader.close();
    }

}
