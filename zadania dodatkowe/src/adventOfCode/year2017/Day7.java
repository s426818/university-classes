package adventOfCode.year2017;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Day7 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2017\\inputs\\input7.txt"));

        List<String> names = new ArrayList<>();
        List<String> namesAll = new ArrayList<>();
        List<String []> holders = new ArrayList<>();
        List<String []> holded = new ArrayList<>();
        List<Program> programs = new ArrayList<>();
        String line = filereader.readLine();
        int k = 0;
        while(line!=null){
            String [] splitLine = line.split(" ");
            if(splitLine.length > 2){
                names.add(splitLine[0]);
                holders.add(splitLine);

                List<String> holdedPrograms = new ArrayList<>();
                for(int i = 3; i < splitLine.length; i++){
                    holdedPrograms.add(splitLine[i].substring(0, splitLine[i].length()-1));
                }
                String weight = splitLine[1].substring(1, splitLine[1].length()-1);
                Program program = new Program(k, splitLine[0], Integer.parseInt(weight), holdedPrograms);
                programs.add(program);
            } else{
                holded.add(splitLine);

                String weight = splitLine[1].substring(1, splitLine[1].length()-1);
                Program program = new Program(k, splitLine[0], Integer.parseInt(weight));
                programs.add(program);
            }
            namesAll.add(splitLine[0]);
            k += 1;
            line = filereader.readLine();
        }
        List<String> holdedNames = new ArrayList<>();
        Set<String> holdedNamesSet = new HashSet<>();
        for(String [] s: holders){
            for(int i = 3; i < s.length-1; i++){
                holdedNames.add(s[i].substring(0, s[i].length()-1));
                holdedNamesSet.add(s[i].substring(0, s[i].length()-1));
            }
            holdedNames.add(s[s.length-1]);
            holdedNamesSet.add(s[s.length-1]);
        }
        /*
        for(String s: holdedNamesSet){
            System.out.println(s);
        }
        System.out.println();
        for(String s: names){
            System.out.println(s);
        }
        */
        System.out.println();

        String nameOfBaseProgram = "";
        for(String s: names){
            if(!holdedNamesSet.contains(s)){
                System.out.println(s);
                nameOfBaseProgram = s;
            }
        }

        int indexOfBaseProgram = 0;
        Program baseProgram = null;
        for(Program p: programs){
            if(p.name.equals(nameOfBaseProgram)){
                indexOfBaseProgram = p.index;
                baseProgram = p;
            }
        }
        System.out.println(baseProgram.name);
        for(Program p: programs){
            p.findIndexes(programs);
        }
        for(Program p: programs){
            p.countSum(programs);
        }

        filereader.close();
    }

    private static class Program{
        int index = Integer.MIN_VALUE;
        String name = "";
        int ownWeight = Integer.MIN_VALUE;
        int sumWeight = Integer.MIN_VALUE;
        List<String> holdedPrograms = new ArrayList<>();
        List<Integer> indexOfHoldedPrograms = new ArrayList<>();

        private Program(){

        }

        private Program(int index, String name, int ownWeight){
            this.name = name;
            this.ownWeight = ownWeight;
            this.index = index;
        }

        private Program(int index, String name, int ownWeight, List<String> holdedPrograms){
            this.name = name;
            this.ownWeight = ownWeight;
            this.holdedPrograms = holdedPrograms;
            this.index = index;
        }

        private void findIndexes(List<Program> programs){
            for(String s: holdedPrograms){
                int i = Integer.MIN_VALUE;
                int k = 0;
                while(i == Integer.MIN_VALUE){
                    if(programs.get(k).name.equals(s)){
                        i = k;
                    }
                    k += 1;
                }
                indexOfHoldedPrograms.add(i);
            }
        }

        private void countSum(List<Program> programs){
            sumWeight = ownWeight;
            for(int i: indexOfHoldedPrograms){
                if(programs.get(i).sumWeight==Integer.MIN_VALUE){
                    programs.get(i).countSum(programs);
                }
                sumWeight += programs.get(i).sumWeight;
            }
        }
    }
}
