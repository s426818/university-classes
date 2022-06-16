package adventOfCode.year2015;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Day23 {

    private static int simpleActionEffect(String action, int number){
        if(action.equals("hlf")){
            return number/2;
        }
        if(action.equals("tpl")){
            return number*3;
        }
        if(action.equals("inc")){
            return number+1;
        }
        return number;
    }

    private static int[] takeSimpleAction(String [] instruction, int [] register){
        if(instruction[1].equals("a")){
            register[0] = simpleActionEffect(instruction[0], register[0]);
            register[2] += 1;
        } else{
            register[1] = simpleActionEffect(instruction[0], register[1]);
            register[2] += 1;
        }
        return register;
    }

    private static int[] ifElseJumpAction(String [] instruction, int [] register){        
        if(Character.toString(instruction[1].charAt(0)).equals("a")){
            if(instruction[0].equals("jie")){
                if(register[0]%2 == 0){
                    register[2]  += Integer.parseInt(instruction[2]);
                } else{
                    register[2] += 1;
                }
            } else{
                if(register[0] == 1){
                    register[2]  += Integer.parseInt(instruction[2]);
                } else{
                    register[2] += 1;
                }
            }
        } else{
            if(instruction[0].equals("jie")){
                if(register[1]%2 == 0){
                    register[2]  += Integer.parseInt(instruction[2]);
                } else{
                    register[2] += 1;
                }
            } else{
                if(register[1] == 1){
                    register[2]  += Integer.parseInt(instruction[2]);
                } else{
                    register[2] += 1;
                }
            }
        }
        return register;
    }
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2015\\inputs\\input23.txt"));

        int [] registers = {0, 0, 0};
        List<String> instructions = new ArrayList<>();

        String line = filereader.readLine();

        while(line!=null){
            instructions.add(line);
            line = filereader.readLine();
        }

        while(registers[2] < instructions.size()){
            String [] splitInstruction = instructions.get(registers[2]).split(" ");
            // if-else jump instructions
            if(splitInstruction[0].equals("jio") || splitInstruction[0].equals("jie")){
                registers = ifElseJumpAction(splitInstruction, registers);
            } else{
                // jump
                if(splitInstruction[0].equals("jmp")){
                    registers[2] += Integer.parseInt(splitInstruction[1]);
                } else{
                    // standard action
                    registers = takeSimpleAction(splitInstruction, registers);
                }
            }
        }

        System.out.println(registers[1]);

        int [] secondRegisters = {1, 0, 0};
        while(secondRegisters[2] < instructions.size()){
            String [] splitInstruction = instructions.get(secondRegisters[2]).split(" ");
            // if-else jump instructions
            if(splitInstruction[0].equals("jio") || splitInstruction[0].equals("jie")){
                secondRegisters = ifElseJumpAction(splitInstruction, secondRegisters);
            } else{
                // jump
                if(splitInstruction[0].equals("jmp")){
                    secondRegisters[2] += Integer.parseInt(splitInstruction[1]);
                } else{
                    // standard action
                    secondRegisters = takeSimpleAction(splitInstruction, secondRegisters);
                }
            }
        }

        System.out.println(secondRegisters[1]);

        filereader.close();
    }
    
}
