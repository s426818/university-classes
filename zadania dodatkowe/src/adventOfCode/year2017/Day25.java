package adventOfCode.year2017;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Day25 {

    private static Map<String, State> createState(BufferedReader fileReader, Map<String, State> states) throws IOException{
        
        String line = fileReader.readLine();
        String [] splitLine = line.split(" ");
        String name = splitLine[2].split("")[0];

        line = fileReader.readLine();
        line = fileReader.readLine();
        splitLine = line.split(" ");
        int valueToWriteWhen0 = Integer.parseInt(splitLine[splitLine.length-1].split("")[0]);

        line = fileReader.readLine();
        splitLine = line.split(" ");
        String directionToMoveWhen0 = splitLine[splitLine.length-1];

        line = fileReader.readLine();
        splitLine = line.split(" ");
        String nameOfStateAfter0 = splitLine[splitLine.length-1].split("")[0];

        line = fileReader.readLine();

        line = fileReader.readLine();
        splitLine = line.split(" ");
        int valueToWriteWhen1 = Integer.parseInt(splitLine[splitLine.length-1].split("")[0]);

        line = fileReader.readLine();
        splitLine = line.split(" ");
        String directionToMoveWhen1 = splitLine[splitLine.length-1];

        line = fileReader.readLine();
        splitLine = line.split(" ");
        String nameOfStateAfter1 = splitLine[splitLine.length-1].split("")[0];

        State state = new State(name, valueToWriteWhen0, directionToMoveWhen0, nameOfStateAfter0, valueToWriteWhen1, directionToMoveWhen1, nameOfStateAfter1);
        states.put(name, state);

        return states;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2017\\inputs\\input25.txt"));

        Map<String, State> states = new HashMap<>();

        String line = filereader.readLine();
        line = filereader.readLine();  
        
        for(int i = 0; i < 6; i++){
            line = filereader.readLine();
            states = createState(filereader, states);
            //line = filereader.readLine();
        }

        Tape tape = new Tape();
        for(int i = 0; i < 12656374; i++){
            tape.action(states);
        }

        System.out.println(tape.counter);

        int c = 0;
        for(int i: tape.memory){
            c += i;
            //System.out.print(i);
        }
        System.out.println(c);
        System.out.println(tape.memory.size());

        filereader.close();
    }

    private static class State{
        String name = "";
        int valueToWriteWhen0 = 0;
        String directionToMoveWhen0 = "";
        String nameOfStateAfter0 = "";
        int valueToWriteWhen1 = 0;
        String directionToMoveWhen1 = "";
        String nameOfStateAfter1 = "";

        State(String name, int valueToWriteWhen0, String directionToMoveWhen0, String nameOfStateAfter0, int valueToWriteWhen1, String directionToMoveWhen1, String nameOfStateAfter1){
            this.name = name;
            this.valueToWriteWhen0 = valueToWriteWhen0;
            this.directionToMoveWhen0 = directionToMoveWhen0;
            this.nameOfStateAfter0 = nameOfStateAfter0;
            this.valueToWriteWhen1 = valueToWriteWhen1;
            this.directionToMoveWhen1 = directionToMoveWhen1;
            this.nameOfStateAfter1 = nameOfStateAfter1;
        }

        @Override
        public String toString() {
            return "State [directionToMoveWhen0=" + directionToMoveWhen0 + ", directionToMoveWhen1="
                    + directionToMoveWhen1 + ", name=" + name + ", nameOfStateAfter0=" + nameOfStateAfter0
                    + ", nameOfStateAfter1=" + nameOfStateAfter1 + ", valueToWriteWhen0=" + valueToWriteWhen0
                    + ", valueToWriteWhen1=" + valueToWriteWhen1 + "]";
        }
    }

    private static class Tape{
        List<Integer> memory = new ArrayList<>();
        int counter = 0;
        int cursor = 0;
        String currentStateName = "A";

        Tape(){
            memory.add(0);
        }

        void action(Map<String, State> states){
            State currentState = states.get(currentStateName);
            int valueAtCursor = memory.get(cursor);
            if(valueAtCursor == 0){
                memory.set(cursor, currentState.valueToWriteWhen0);
                valueAtCursor = currentState.valueToWriteWhen0;
                if(valueAtCursor == 1){
                    //System.out.print("blep");
                    counter += 1;
                }
                if(currentState.directionToMoveWhen0.equals("right.")){
                    cursor += 1;
                } else{
                    cursor -= 1;                    
                }
                currentStateName = currentState.nameOfStateAfter0;
            } else{
                memory.set(cursor, currentState.valueToWriteWhen1);
                valueAtCursor = currentState.valueToWriteWhen1;
                if(valueAtCursor == 0){
                    counter -= 1;
                }
                if(currentState.directionToMoveWhen1.equals("right.")){
                    cursor += 1;
                } else{
                    cursor -= 1;
                }
                currentStateName = currentState.nameOfStateAfter1;
            }
            if(cursor >= memory.size()){
                cursor = memory.size()-1;
                memory.add(0);
            }
            if(cursor < 0){
                cursor = 0;
                memory.add(0, 0);
            }
            
        }
    }

}
