package adventOfCode.year2021;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DayEight {
    

    public static void main(String[] args) throws IOException {

        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2021\\input8.txt"));

        String line = filereader.readLine();

        int wynik = 0;
        while(line != null){
            String [] tablicaLine = line.split(" \\| ");
            for(int i = 0; i < 2; i++){
                System.out.println(tablicaLine[i]);
            }
            String [] outputValues = tablicaLine[1].split(" ");
            for(String value : outputValues){
                System.out.println(value);
                if(value.length() == 2 || value.length() == 3 || value.length() == 4 || value.length() == 7){
                    wynik += 1;
                }
            }
            line = filereader.readLine();
        }

        System.out.println(wynik);

        filereader.close();
    }
    
}
