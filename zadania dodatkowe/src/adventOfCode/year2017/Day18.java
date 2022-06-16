package adventOfCode.year2017;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Day18 {

    private static int playSound(Map<String, Integer> registers, String value){
        int frequency = Integer.MIN_VALUE;
        if(registers.keySet().contains(value)){
            frequency = registers.get(value);
        } else{
            frequency = Integer.parseInt(value);
        }
        return frequency;
    }

    private static Map<String, Integer> set(Map<String, Integer> registers, String register, String value){
        if(registers.keySet().contains(value)){
            registers.put(register, registers.get(value));
        } else{
            registers.put(register, Integer.parseInt(value));
        }
        return registers;
    }

    private static Map<String, Integer> increase(Map<String, Integer> registers, String register, String value){
        if(registers.keySet().contains(value)){
            registers.put(register, registers.get(value) + registers.get(register));
        } else{
            registers.put(register, Integer.parseInt(value) + registers.get(register));
        }
        return registers;
    }

    private static Map<String, Integer> multiply(Map<String, Integer> registers, String register, String value){
        if(registers.keySet().contains(value)){
            registers.put(register, registers.get(value) * registers.get(register));
        } else{
            registers.put(register, Integer.parseInt(value) * registers.get(register));
        }
        return registers;
    }

    private static Map<String, Integer> modulo(Map<String, Integer> registers, String register, String value){
        if(registers.keySet().contains(value)){
            registers.put(register, registers.get(register) % registers.get(value));
        } else{
            registers.put(register, registers.get(register) % Integer.parseInt(value));
        }
        return registers;
    }

    private static int checkIf0(Map<String, Integer> registers, String value){
        int frequency = Integer.MIN_VALUE;
        if(registers.keySet().contains(value)){
            frequency = registers.get(value);
        } else{
            frequency = Integer.parseInt(value);
        }
        return frequency;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2017\\inputs\\input18.txt"));

        Map<String, Integer> registers = new HashMap<>();
        String [] letters = "abcdefghijklmnopqrstuvwxyz".split("");
        for(String s: letters){
            registers.put(s, 0);
        }

        int frequency = Integer.MIN_VALUE;
        int finalFrequency = Integer.MIN_VALUE;
        Boolean played = false;
        String line = filereader.readLine();
        List<String> instructions = new ArrayList<>();
        while(line!=null){
            instructions.add(line);
            line = filereader.readLine();
        }

        int k = 0;
        while(k >= 0 && k < instructions.size()){
            String [] splitLine = instructions.get(k).split(" ");
            //System.out.println(splitLine[0]);
            switch (splitLine[0]){
                case "snd":{
                    frequency = playSound(registers, splitLine[1]);
                    k += 1;
                    System.out.println(frequency);
                }; break;
                case "set":registers = set(registers, splitLine[1], splitLine[2]);
                           k += 1; break;
                case "add":registers = increase(registers, splitLine[1], splitLine[2]);
                           k += 1; break;
                case "mul":registers = multiply(registers, splitLine[1], splitLine[2]);
                           k += 1; break;
                case "mod":registers = modulo(registers, splitLine[1], splitLine[2]);
                           k += 1; break;
                case "rcv":{
                    if(checkIf0(registers, splitLine[1]) != 0){
                        if(!played){
                            finalFrequency = frequency;
                            k = Integer.MAX_VALUE;
                            played = true;
                        }
                    }
                    k += 1;
                    System.out.println(finalFrequency);
                }; break;
                case "jgz":{
                    if(checkIf0(registers, splitLine[1]) > 0){
                        k += Integer.parseInt(splitLine[2]);
                    } else{
                        k += 1;
                    }
                }; break;
            }
            line = filereader.readLine();
        }

        //System.out.println(frequency);
        System.out.println(finalFrequency);

        filereader.close();
    }

}
