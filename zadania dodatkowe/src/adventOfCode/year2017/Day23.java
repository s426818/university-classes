package adventOfCode.year2017;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Day23 {

    private static int getLetterReturnIndex(String letter){
        switch (letter){
            case "a": return 0;
            case "b": return 1;
            case "c": return 2;
            case "d": return 3;
            case "e": return 4;
            case "f": return 5;
            case "g": return 6;
            case "h": return 7;
        }
        return 0;
    }
    
    private static Map<String, Integer> set(Map<String, Integer> registers, String register, String value){
        int valueToPut = Integer.MIN_VALUE;
        if(registers.keySet().contains(value)){
            valueToPut = registers.get(value);
        } else{
            valueToPut = Integer.parseInt(value);
        }
        registers.put(register, valueToPut);
        return registers;
    }

    private static Map<String, Integer> sub(Map<String, Integer> registers, String register, String value){
        int valueToPut = Integer.MIN_VALUE;
        int newValue= registers.get(register);
        if(registers.keySet().contains(value)){
            valueToPut = registers.get(value);
        } else{
            valueToPut = Integer.parseInt(value);
        }
        newValue -= valueToPut;
        registers.put(register, newValue);
        return registers;
    }

    private static Map<String, Integer> mul(Map<String, Integer> registers, String register, String value){
        int valueToPut = Integer.MIN_VALUE;
        int newValue= registers.get(register);
        if(registers.keySet().contains(value)){
            valueToPut = registers.get(value);
        } else{
            valueToPut = Integer.parseInt(value);
        }
        newValue *= valueToPut;
        registers.put(register, newValue);
        return registers;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2017\\inputs\\input23.txt"));

        List<String> instructions = new ArrayList<>();
        String line = filereader.readLine();
        while(line!=null){
            instructions.add(line);
            line = filereader.readLine();
        }

        filereader.close();

        String [] letters = "abcdefgh".split("");
        Map<String, Integer> registers = new HashMap<>();
        for(String s: letters){
            registers.put(s, 0);
        }

        int k = 0;
        int counter = 0;
        while(k < instructions.size()){
            String [] instructionSplit = instructions.get(k).split(" ");
            switch (instructionSplit[0]){
                case "set":{
                    registers = set(registers, instructionSplit[1], instructionSplit[2]);
                    k += 1;
                }; break;
                case "sub":{
                    registers = sub(registers, instructionSplit[1], instructionSplit[2]);
                    k += 1;
                }; break;
                case "mul":{
                    registers = mul(registers, instructionSplit[1], instructionSplit[2]);
                    k += 1;
                    counter += 1;
                }; break;
                case "jnz":{
                    int valueToCheck = Integer.MIN_VALUE;                    
                    if(registers.keySet().contains(instructionSplit[1])){
                        valueToCheck = registers.get(instructionSplit[1]);
                    } else{
                        valueToCheck = Integer.parseInt(instructionSplit[1]);
                    }
                    if(valueToCheck != 0){
                        int valueToJump = Integer.MIN_VALUE;
                        if(registers.keySet().contains(instructionSplit[2])){
                            valueToJump = registers.get(instructionSplit[2]);
                        } else{
                            valueToJump = Integer.parseInt(instructionSplit[2]);
                        }
                        k += valueToJump;
                    } else{
                        k += 1;
                    }                    
                }; break;
            }
        }

        System.out.println(counter);

        for(String s: letters){
            registers.put(s, 0);
        }
        registers.put("a", 1);
        
        k = 0;
        while(k < instructions.size()){
            String [] instructionSplit = instructions.get(k).split(" ");
            switch (instructionSplit[0]){
                case "set":{
                    registers = set(registers, instructionSplit[1], instructionSplit[2]);
                    k += 1;
                }; break;
                case "sub":{
                    registers = sub(registers, instructionSplit[1], instructionSplit[2]);
                    k += 1;
                }; break;
                case "mul":{
                    registers = mul(registers, instructionSplit[1], instructionSplit[2]);
                    k += 1;
                }; break;
                case "jnz":{
                    int valueToCheck = Integer.MIN_VALUE;                    
                    if(registers.keySet().contains(instructionSplit[1])){
                        valueToCheck = registers.get(instructionSplit[1]);
                    } else{
                        valueToCheck = Integer.parseInt(instructionSplit[1]);
                    }
                    if(valueToCheck != 0){
                        int valueToJump = Integer.MIN_VALUE;
                        if(registers.keySet().contains(instructionSplit[2])){
                            valueToJump = registers.get(instructionSplit[2]);
                        } else{
                            valueToJump = Integer.parseInt(instructionSplit[2]);
                        }
                        k += valueToJump;
                    } else{
                        k += 1;
                    }                    
                }; break;
            }
        }
    
        System.out.println(registers.get("h"));
    }

}
