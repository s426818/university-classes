package adventOfCode.year2017;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Day8 {

    
    private static Map<String, Integer> increment(Map<String, Integer> registersMap, String name, int valueToModify){
        registersMap.put(name, registersMap.get(name) + valueToModify);
        return registersMap;
    }

    private static Map<String, Integer> decrement(Map<String, Integer> registersMap, String name, int valueToModify){
        registersMap.put(name, registersMap.get(name) - valueToModify);
        return registersMap;
    }
    
    private static Map<String, Integer> incOrDec(Map<String, Integer> registersMap, String name, int valueToModify, String insctruction){
        if(insctruction.equals("inc")){
            return increment(registersMap, name, valueToModify);
        }
        if(insctruction.equals("dec")){
            return decrement(registersMap, name, valueToModify);
        }
        return registersMap;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2017\\inputs\\input8.txt"));

        Set<Register> registersSet = new HashSet<>();
        Map<String, Integer> registers = new HashMap<>();
        Set<String> registerNames = new HashSet<>();

        String line = filereader.readLine();
        while(line!=null){
            String[] splitLine = line.split(" ");
            if(!registerNames.contains(splitLine[0])){
                registerNames.add(splitLine[0]);
            }
            line = filereader.readLine();
        }

        for(String r: registerNames){            
            Register register = new Register(r);
            registersSet.add(register);
            registers.put(r, 0);
        }

        /*
        for(Register r: registersSet){
            System.out.println(r.name);
        }
        */

        filereader.close();
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2017\\inputs\\input8.txt"));
        line = filereader.readLine();
        int max = 0;
        while(line!=null){
            String [] splitLine = line.split(" ");
            int valueToCheck = Integer.MIN_VALUE;
            int valueToCheckWith = Integer.MIN_VALUE;
            int valueToModify = Integer.MIN_VALUE;
            String insctruction = splitLine[1];
            if(registers.keySet().contains(splitLine[2])){
                valueToModify = registers.get(splitLine[2]);
            } else{
                valueToModify = Integer.parseInt(splitLine[2]);
            }
            if(registers.keySet().contains(splitLine[4])){
                valueToCheck = registers.get(splitLine[4]);
            } else{
                valueToCheck = Integer.parseInt(splitLine[4]);
            }
            if(registers.keySet().contains(splitLine[6])){
                valueToCheckWith = registers.get(splitLine[6]);
            } else{
                valueToCheckWith = Integer.parseInt(splitLine[6]);
            }

            switch (splitLine[5]){
                case ">":{
                    if(valueToCheck > valueToCheckWith){                        
                        registers = incOrDec(registers, splitLine[0], valueToModify, insctruction);
                        if(max < registers.get(splitLine[0])){
                            max = registers.get(splitLine[0]);
                        }
                    }
                }; break;
                case "<":{
                    if(valueToCheck < valueToCheckWith){
                        registers = incOrDec(registers, splitLine[0], valueToModify, insctruction);
                        if(max < registers.get(splitLine[0])){
                            max = registers.get(splitLine[0]);
                        }
                    }
                }; break;
                case "<=":{
                    if(valueToCheck <= valueToCheckWith){
                        registers = incOrDec(registers, splitLine[0], valueToModify, insctruction);
                        if(max < registers.get(splitLine[0])){
                            max = registers.get(splitLine[0]);
                        }
                    }
                }; break;
                case ">=":{
                    if(valueToCheck >= valueToCheckWith){
                        registers = incOrDec(registers, splitLine[0], valueToModify, insctruction);
                        if(max < registers.get(splitLine[0])){
                            max = registers.get(splitLine[0]);
                        }
                    }
                }; break;
                case "==":{
                    if(valueToCheck == valueToCheckWith){
                        registers = incOrDec(registers, splitLine[0], valueToModify, insctruction);
                        if(max < registers.get(splitLine[0])){
                            max = registers.get(splitLine[0]);
                        }
                    }
                }; break;
                case "!=":{
                    if(valueToCheck != valueToCheckWith){
                        registers = incOrDec(registers, splitLine[0], valueToModify, insctruction);
                        if(max < registers.get(splitLine[0])){
                            max = registers.get(splitLine[0]);
                        }
                    }
                }; break;
            }

            line = filereader.readLine();
        }

        System.out.println(Collections.max(registers.values()));
        System.out.println(max);

        filereader.close();
    }

    private static class Register{
        String name = "";
        int value = 0;

        private Register(String name){
            this.name = name;
        }
    }

}
