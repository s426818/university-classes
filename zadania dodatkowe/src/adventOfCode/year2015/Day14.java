package adventOfCode.year2015;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Day14 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2015\\inputs\\input14.txt"));

        List<Reindeer> array = new ArrayList<>();

        String line = filereader.readLine();
        while(line!=null){
            String [] stringLine = line.split(" ");
            Reindeer reindeer = new Reindeer(stringLine[0], Integer.parseInt(stringLine[3]), 0, 
                                             Integer.parseInt(stringLine[3]), Integer.parseInt(stringLine[13]), Integer.parseInt(stringLine[3]));
            array.add(reindeer);
            line = filereader.readLine();
        }

        for(Reindeer r : array){
            System.out.println(r.name);
        }

        for(int i = 0; i < 1000; i++){
            for(Reindeer r : array){
                r.timeGoesBy();
            }
        }

        for(Reindeer r : array){
            System.out.println(r.distance);
        }

        for(Reindeer r : array){
            System.out.println(r.countDistance(1000));
        }

        filereader.close();

    }

    private static class Reindeer{
        String name = "";
        int speed = 0;
        int rest = 0;
        int fly = 0;
        int distance = 0;

        int counterRest = 0;
        int counterFly = 0;

        private Reindeer(String name, int speed, int rest, int fly, int counterRest, int counterFly){
            this.speed = speed;
            this.rest = rest;
            this.fly = fly;
            this.counterFly = counterFly;
            this.counterRest = counterRest;
            this.name = name;
        }

        private void timeGoesBy(){
            if(fly!=0){
                distance += speed;
                fly -= 1;
                if(fly == 0){
                    rest = counterRest;
                }
            } else{
                if(rest!=0){
                    rest -= 1;
                    if(rest==0){
                        fly = counterFly;
                    }
                }
            }
        }

        private int countDistance(int seconds){
            int maxDistance = 0;
            int howManyRestAndFly = seconds/(counterFly + counterRest);
            maxDistance += howManyRestAndFly*counterFly*speed;
            if(howManyRestAndFly*(counterFly + counterRest) < seconds){
                for(int i = 0; i < seconds - howManyRestAndFly*(counterFly + counterRest); i++){
                    maxDistance += speed;
                }
            }
            return maxDistance;
        }

    }
    
}
