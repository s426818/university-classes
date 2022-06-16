package adventOfCode.year2016;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import adventOfCode.year2016.Day12.Register;

public class Day23 {

    private static List<Register> incrementRegister(List<Register> registers, String id){

        for(Register r: registers){
            if(r.id.equals(id)){
                r.value += 1;
            }
        }
        return registers;
    }

    private static List<Register> decrementRegister(List<Register> registers, String id){
        for(Register r: registers){
            if(r.id.equals(id)){
                r.value -= 1;
            }
        }
        return registers;
    }

    private static int returnValueOfRegister(List<Register> registers, String id){
        int value = Integer.MIN_VALUE;
        for(Register r: registers){
            if(r.id.equals(id)){
                value = r.value;
            }
        }
        return value;
    }

    private static List<Register> copyValueToRegister(List<Register> registers, String valueToCopy, String id){
        if(!id.equals("a") && !id.equals("b") && !id.equals("c") && !id.equals("d")){
            return registers;
        }
        if(valueToCopy.equals("a") || valueToCopy.equals("b") || valueToCopy.equals("c") || valueToCopy.equals("d")){
            int value = Integer.MIN_VALUE;
            for(Register r: registers){
                if(r.id.equals(valueToCopy)){
                    value = r.value;
                }
            }
            for(Register r: registers){
                if(r.id.equals(id)){
                    r.value = value;
                }
            }
        } else{
            for(Register r: registers){
                if(r.id.equals(id)){
                    r.value = Integer.parseInt(valueToCopy);
                }
            }
        }
        return registers;
    }

    private static List<String> toggle(List<Register> registers, List<String> instructions, int index, String numberOfInstructionToModify){
        int newIndex = index;
        if(numberOfInstructionToModify.equals("a") || numberOfInstructionToModify.equals("b") || numberOfInstructionToModify.equals("c") 
          || numberOfInstructionToModify.equals("d")){
            for(Register r: registers){
                if(numberOfInstructionToModify.equals(r.id)){
                    newIndex += r.value;
                }
            }
        } else{
            newIndex += Integer.parseInt(numberOfInstructionToModify);
        }
        if(newIndex >= instructions.size()){
            return instructions;
        }
        String [] instruction = instructions.get(newIndex).split(" ");
        if(instruction[0].equals("cpy")){
            instruction[0] = "jnz";
        } else{
            if(instruction[0].equals("jnz")){
                instruction[0] = "cpy";
            }
        }
        if(instruction[0].equals("inc")){
            instruction[0] = "dec";
        } else{
            instruction[0] = "inc";
        }
        instructions.remove(newIndex);
        String newInstruction = "";
        for(String s: instruction){
            newInstruction += s + " ";
        }
        instructions.add(newIndex, newInstruction);
        return instructions;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2016\\inputs\\input23.txt"));

        List<Register> registers = new ArrayList<>();
        registers.add(new Register("a", 7));
        registers.add(new Register("b", 0));
        registers.add(new Register("c", 0));
        registers.add(new Register("d", 0));

        List<String> instructions = new ArrayList<>();
        String line = filereader.readLine();
        while(line!=null){
            instructions.add(line);
            line = filereader.readLine();
        }

        int k = 0;
        while(k < instructions.size()){
            String [] instruction = instructions.get(k).split(" ");
            if(instruction[0].equals("inc")){
                registers = incrementRegister(registers, instruction[1]);
                k += 1;
            }
            if(instruction[0].equals("dec")){
                registers = decrementRegister(registers, instruction[1]);
                k += 1;
            }
            if(instruction[0].equals("cpy")){
                registers = copyValueToRegister(registers, instruction[1], instruction[2]);
                k += 1;
            }
            if(instruction[0].equals("jnz")){
                int valueToTest = Integer.MIN_VALUE;
                int valueToJump = Integer.MIN_VALUE;
                if(instruction[1].equals("a") || instruction[1].equals("b") || instruction[1].equals("c") || instruction[1].equals("d")){
                    valueToTest = returnValueOfRegister(registers, instruction[1]);
                } else{
                    valueToTest = Integer.parseInt(instruction[1]);
                }
                if(instruction[2].equals("a") || instruction[2].equals("b") || instruction[2].equals("c") || instruction[2].equals("d")){
                    valueToJump = returnValueOfRegister(registers, instruction[2]);
                } else{
                    valueToJump = Integer.parseInt(instruction[2]);
                }
                if(valueToTest != 0){
                    k += valueToJump;
                } else{
                    k += 1;
                }                
            }
            if(instruction[0].equals("tgl")){
                instructions =  toggle(registers, instructions, k, instruction[1]);
                k += 1;
            }
            System.out.println(k);
        }

        for(Register r: registers){
            System.out.print(r.id + ": ");
            System.out.println(r.value);
        }
        
        filereader.close();
    }

}
