package adventOfCode.year2017;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Day9 {
    
    private static int[] score(String input, int position){
        int [] scoreAndPosition = new int [2];
        String [] splitInput = input.split("");
        scoreAndPosition[0] = 1;
        scoreAndPosition[1] = position;
        while(scoreAndPosition[1] < input.length()){
            if(splitInput[scoreAndPosition[1]].equals("}")){
                scoreAndPosition[1] += 1;
                return scoreAndPosition;
            }
            if(splitInput[scoreAndPosition[1]].equals("{")){
                int [] newScoreAndPosition = score(input.substring(scoreAndPosition[1]+1), 0);
                scoreAndPosition[0] += newScoreAndPosition[0];
                scoreAndPosition[1] += newScoreAndPosition[1];
            } else{
                if(splitInput[scoreAndPosition[1]].equals("!")){
                    scoreAndPosition[1] += 2;
                } else{
                    scoreAndPosition[1] += 1;
                }
            }

        }
        return scoreAndPosition;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2017\\inputs\\input9.txt"));

        String input = filereader.readLine();
        filereader.close();

        System.out.println(score(input, 0)[0] - 1);
    }
    
}
