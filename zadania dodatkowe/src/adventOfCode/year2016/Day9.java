package adventOfCode.year2016;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Day9 {
    
    private static String decompress(String line){
        int k = 0;
        String output = "";
        String [] splitLine = line.split("");
        while(k < line.length()){
            if(splitLine[k].equals("(")){
                k += 1;
                String stringPom = "";
                while(!splitLine[k].equals(")")){
                    stringPom += splitLine[k];
                    k += 1;
                }
                k += 1;
                String [] marker = stringPom.split("x");
                int numberOfCharactersToCopy = Integer.parseInt(marker[0]);
                int numberOfRepetitions = Integer.parseInt(marker[1]);
                stringPom = "";
                for(int i = 0; i < numberOfCharactersToCopy; i++){
                    stringPom += splitLine[k];
                    k += 1;
                }
                for(int i = 0; i < numberOfRepetitions; i++){
                    output += stringPom;
                }
            } else{
                output += splitLine[k];
                k += 1;
            }
            //k += 1;
        }
        return output;
    }

    private static long decompress2(String line){
        long sum = 0;

        int k = 0;
        String [] splitLine = line.split("");
        while(k < line.length()){
            if(splitLine[k].equals("(")){
                k += 1;
                String stringPom = "";
                while(!splitLine[k].equals(")")){
                    stringPom += splitLine[k];
                    k += 1;
                }
                k += 1;
                // at this point we have marker that will not be multiplied
                String [] marker = stringPom.split("x");
                int numberOfCharactersToCopy = Integer.parseInt(marker[0]);
                int numberOfRepetitions = Integer.parseInt(marker[1]);
                stringPom = "";
                for(int i = 0; i < numberOfCharactersToCopy; i++){
                    stringPom += splitLine[k];
                    k += 1;
                }
                // stringPom now contains all we will multiply
                sum += numberOfRepetitions * decompress2(stringPom);
            } else{
                k += 1;
                sum += 1;
            }
        }

        return sum;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2016\\inputs\\input9.txt"));

        String line = filereader.readLine();

        filereader.close();

        System.out.println(decompress(line).length());
        System.out.println(decompress2(line));
    }
    
}
