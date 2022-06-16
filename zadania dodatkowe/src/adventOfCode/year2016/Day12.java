package adventOfCode.year2016;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Day12 {
    
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

    public static void main(String[] args) throws IOException {
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2016\\inputs\\input12.txt"));

        List<Register> registers = new ArrayList<>();
        registers.add(new Register("a", 0));
        registers.add(new Register("b", 0));
        registers.add(new Register("c", 0));
        registers.add(new Register("d", 0));

        List<Register> otherRegisters = new ArrayList<>();
        otherRegisters.add(new Register("a", 0));
        otherRegisters.add(new Register("b", 0));
        otherRegisters.add(new Register("c", 1));
        otherRegisters.add(new Register("d", 0));

        List<String> instructions = new ArrayList<>();
        String line = filereader.readLine();
        while(line!=null){
            instructions.add(line);
            line = filereader.readLine();
        }

        int k = 0;
        int l = 0;
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
                if(returnValueOfRegister(registers, instruction[1]) != 0){
                    k += Integer.parseInt(instruction[2]);
                } else{
                    k += 1;
                }                
            }
        }

        while(l < instructions.size()){
            String [] instruction = instructions.get(l).split(" ");
            if(instruction[0].equals("inc")){
                otherRegisters = incrementRegister(otherRegisters, instruction[1]);
                l += 1;
            }
            if(instruction[0].equals("dec")){
                otherRegisters = decrementRegister(otherRegisters, instruction[1]);
                l += 1;
            }
            if(instruction[0].equals("cpy")){
                otherRegisters = copyValueToRegister(otherRegisters, instruction[1], instruction[2]);
                l += 1;
            }
            if(instruction[0].equals("jnz")){
                if(returnValueOfRegister(otherRegisters, instruction[1]) != 0){
                    l += Integer.parseInt(instruction[2]);
                } else{
                    l += 1;
                }                
            }
        }

        for(Register r: registers){
            System.out.print(r.id + ": ");
            System.out.println(r.value);
        }

        for(Register r: otherRegisters){
            System.out.print(r.id + ": ");
            System.out.println(r.value);
        }

        filereader.close();
    }

    static class Register{
        String id = "";
        int value = 0;

        Register(){

        }

        Register(String id, int value){
            this.id = id;
            this.value = value;
        }
    }
}
