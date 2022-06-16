package adventOfCode.year2018;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Day6 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2018\\inputs\\input6.txt"));

        List<String> instructions = new ArrayList<>();
        List<Step> steps = new ArrayList<>();
        List<String> stepsNames = new ArrayList<>();
        Map<String, Step> mapOfSteps = new HashMap<>();

        String [] names = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");
        for(String s: names){
            stepsNames.add(s);
            Step step = new Step(s);
            steps.add(step);
            mapOfSteps.put(s, step);
        }

        String line = filereader.readLine();
        while(line!=null){
            String [] splitLine = line.split(" ");
            instructions.add(line);
            Step stepToBeFinished = mapOfSteps.get(splitLine[1]);
            stepToBeFinished.initialized = true;
            Step stepToBeUnlocked = mapOfSteps.get(splitLine[7]);
            stepToBeUnlocked.initialized = true;
            stepToBeFinished.unlockedString.add(splitLine[7]);
            stepToBeUnlocked.requiredString.add(splitLine[1]);
            mapOfSteps.put(stepToBeFinished.name, stepToBeFinished);
            mapOfSteps.put(stepToBeUnlocked.name, stepToBeUnlocked);
            line = filereader.readLine();
        }

        List<String> ready = new ArrayList<>();
        for(Step s: mapOfSteps.values()){
            if(s.requiredString.size() == 0 && s.initialized){
                ready.add(s.name);
            }
            Collections.sort(s.requiredString);
            Collections.sort(s.unlockedString);            
        }

        String answer = "";
        while(ready.size() > 0){
            Collections.sort(ready);
            String active = ready.get(0);
            answer += active;
            ready.remove(0);
            Step activeStep = mapOfSteps.get(active);
            for(String s: activeStep.unlockedString){
                Step unlockedStep = mapOfSteps.get(s);
                unlockedStep.requiredString.remove(active);
                if(unlockedStep.requiredString.size() == 0 && !ready.contains(unlockedStep.name)){
                    ready.add(unlockedStep.name);
                }
            }
        }

        
        System.out.println(answer);

        filereader.close();
    }

    private static class Step{
        String name = "";
        List<String> requiredString = new ArrayList<>();
        List<String> unlockedString = new ArrayList<>();

        Boolean initialized = false;

        Step(String name){
            this.name = name;
        }

    }
}
