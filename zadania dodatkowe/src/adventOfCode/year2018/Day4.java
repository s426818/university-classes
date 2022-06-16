package adventOfCode.year2018;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Day4 {

    private static int findSleepyGuard(List<Guard> guards){
        int id = 0;
        int maxSleep = 0;
        for(Guard guard: guards){
            int sleep = guard.totalSleep();
            if(sleep > maxSleep){
                maxSleep = sleep;
                id = guard.id;
            }
        }
        return id;
    }

    private static int findSteadilySleepyGuard(List<Guard> guards){
        int id = 0;
        int maxSleep = 0;
        for(Guard guard: guards){
            int sleep = guard.mostSleptThroughMinute();
            if(guard.minutesAsleep.get(sleep)!=null){
                if(guard.minutesAsleep.get(sleep) > maxSleep){
                    maxSleep = guard.minutesAsleep.get(sleep);
                    id = guard.id;
                }
            }            
        }
        return id;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2018\\inputs\\input4.txt"));

        List<String> dates = new ArrayList<>();
        Map<String, String> informations = new HashMap<>();
        Set<Integer> guardsIds = new HashSet<>();
        
        String line = filereader.readLine();
        while(line!=null){
            String [] splitLine = line.split(" ");
            String date = splitLine[0] + " " + splitLine[1];
            dates.add(date);
            String information = "";
            switch (splitLine[2]){
                case "Guard": {
                    information = splitLine[3].substring(1, splitLine[3].length());
                    guardsIds.add(Integer.parseInt(information));
                 } break;
                default: information = splitLine[2];
            }
            informations.put(date, information);
            line = filereader.readLine();
        }

        Collections.sort(dates);
        Set<Integer> sortedGuardsIds = new TreeSet<Integer>(guardsIds);

        List<Guard> guards = new ArrayList<>();

        for(int i: sortedGuardsIds){
           Guard guard = new Guard(i);
           guards.add(guard);
        }

        int numberOfGuard = Integer.parseInt(informations.get(dates.get(0)));
        int i = 0;
        while(i < dates.size()){
            if(informations.get(dates.get(i)).equals("falls")){
                String dataFallAsleep = dates.get(i);
                String dataAwake = dates.get(i+1);
                for(int j = 0; j < guards.size(); j++){
                    if(guards.get(j).id == numberOfGuard){
                        guards.get(j).addMinutsSlept(dataFallAsleep, dataAwake);
                    }
                }
                i += 2;
            } else{
                numberOfGuard = Integer.parseInt(informations.get(dates.get(i)));
                i += 1;
            }
        }
        //System.out.println(numberOfGuard);

        //System.out.println(dates.size());

        int guardId = findSleepyGuard(guards);
        int otherGuardId = findSteadilySleepyGuard(guards);

        for(Guard guard: guards){
            if(guard.id == guardId){
                System.out.println(guard.id);
                System.out.println(guard.totalSleep());
                System.out.println(guard.mostFrequentlySleptMinute());
                System.out.println(guard.optimalCombination());
            }
            if(guard.id == otherGuardId){
                System.out.println(guard.id);
                System.out.println(guard.mostSleptThroughMinute());
                System.out.println(guard.otherOptimalCombination());
            }
            
        }


        filereader.close();
    }

    private static class Guard{
        int id = 0;
        Map<Integer, Integer> minutesAsleep = new HashMap<>();

        Guard(int id){
            this.id = id;
        }

        int mostFrequentlySleptMinute(){
            int max = 0;
            int position = 0;
            for(int key: minutesAsleep.keySet()){
                if(minutesAsleep.get(key) > max){
                    max = minutesAsleep.get(key);
                    position = key;
                }
            }
            return position;
        }

        int optimalCombination(){
            return id * mostFrequentlySleptMinute();
        }

        int otherOptimalCombination(){
            int minute = mostSleptThroughMinute();
            return minute * id;
        }

        int totalSleep(){
            int sum = 0;
            for(int value: minutesAsleep.values()){
                sum += value;
            }
            return sum;
        }

        void addMinutsSlept(String dataFallAsleep, String dataWake){
            String [] splitData = dataFallAsleep.split(" ");
            String hour = splitData[1].substring(0, splitData[1].length()-1);
            String minutesString = hour.split(":")[1];
            int minutesFallAsleep = Integer.parseInt(minutesString);

            splitData = dataWake.split(" ");
            hour = splitData[1].substring(0, splitData[1].length()-1);
            minutesString = hour.split(":")[1];
            int minutesAwake = Integer.parseInt(minutesString);

            for(int i = minutesFallAsleep; i < minutesAwake; i++){
                if(minutesAsleep.keySet().contains(i)){
                    this.minutesAsleep.put(i, minutesAsleep.get(i) + 1);
                } else{
                    this.minutesAsleep.put(i, 1);
                }                
            }
        }

        int mostSleptThroughMinute(){
            int max = 0;
            int minute = 0;
            for(int key: minutesAsleep.keySet()){
                if(minutesAsleep.get(key) > max){
                    max = minutesAsleep.get(key);
                    minute = key;
                }
            }
            return minute;
        }

        @Override
        public String toString() {
            return "Guard [id=" + id + ", minutesAsleep=" + minutesAsleep + "]";
        }

    }
    
}
