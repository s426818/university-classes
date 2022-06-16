package adventOfCode.year2016;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Day18 {

    private static List<int[]> generateNextRow(List<int []> trapMap){
        int [] lastRow = trapMap.get(trapMap.size()-1);
        int [] newRow  = new int [lastRow.length];
        for(int i = 1; i < lastRow.length - 1; i++){
            if((lastRow[i-1] == 1 && lastRow[i] == 1 && lastRow[i+1] == 0)
                || (lastRow[i-1] == 0 && lastRow[i] == 1 && lastRow[i+1] == 1)
                || (lastRow[i-1] == 1 && lastRow[i] == 0 && lastRow[i+1] == 0)
                || (lastRow[i-1] == 0 && lastRow[i] == 0 && lastRow[i+1] == 1)){
                    newRow[i] = 1;
            }
        }
        trapMap.add(newRow);
        return trapMap;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2016\\inputs\\input18.txt"));
        String input = filereader.readLine();
        filereader.close();    
        
        int counter = 0;

        int [] row = new int[input.length() + 2];
        for(int i = 1; i < input.length() + 1; i++){
            if(input.charAt(i-1) == '^'){
                row[i] = 1;
            }
        }

        List<int []> trapMap = new ArrayList<>();
        trapMap.add(row);

        for(int i = 0; i < 399999; i++){
            trapMap = generateNextRow(trapMap);
        }

        for(int i = 0; i < trapMap.size(); i++){
            for(int j = 1; j < trapMap.get(0).length-1; j++){
                if(trapMap.get(i)[j] == 0){
                    counter += 1;
                }
            }
        }

        /*
        for(int[] t: trapMap){
            for(int i: t){
                System.out.print(i);
            }
            System.out.println();
        }
        */

        System.out.println(counter);
    }

}
