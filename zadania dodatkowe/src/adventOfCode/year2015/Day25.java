package adventOfCode.year2015;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Day25 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2015\\inputs\\input25.txt"));

        filereader.close();


        
    }

    private static class Matrix{
        List<Integer> rows = new ArrayList<>();
        List<Integer> columns = new ArrayList<>();

        private Matrix(){

        }

        /*
        private Matrix(int number){
            List<Integer> rows
        }
        */
    }

}
