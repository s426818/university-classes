package adventOfCode.year2021;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Day11 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2021\\inputs\\input11.txt"));

        Octupus [][] octupuses = new Octupus [10][10];

        for(int i = 0; i < 10; i++){
            String line = filereader.readLine();
            for(int j = 0; j < 10; j++){
                Octupus octupus = new Octupus(Character.valueOf(line.charAt(j)) - 48);
                octupuses[i][j] = octupus;
            }
        }

        int steps = 10;

        for(int i = 0; i < steps; i++){

        }


        
        filereader.close();
    }

    private static Octupus [][] energize(Octupus [][] octupuses){

        return octupuses;
    }

    

    private static class Octupus{
        private int value = 0;
        private Boolean didItFlash = false;

        private Octupus(int value){
            this.setValue(value);
        }

        public Boolean getDidItFlash() {
            return didItFlash;
        }

        public void setDidItFlash(Boolean didItFlash) {
            this.didItFlash = didItFlash;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        
    }

}
