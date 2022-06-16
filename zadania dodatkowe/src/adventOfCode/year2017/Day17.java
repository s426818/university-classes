package adventOfCode.year2017;

import java.util.ArrayList;
import java.util.List;

public class Day17 {
    
    public static void main(String[] args) {
        //step is an input
        int step = 377;
        List<Integer> buffer = new ArrayList<>();
        buffer.add(0);
        int currentPosition = 0;
        int position0 = 0;

        int bufferSize = 1;
        int currentPositionOther = 0;
        int position0Other = 0;
        int value = Integer.MIN_VALUE;
        for(int i = 1; i < 50000000 + 1; i++){
            int newPosition = currentPositionOther;
            int howMuchToGo = step % bufferSize;
            newPosition += howMuchToGo;
            if(newPosition >= bufferSize){
                newPosition -= bufferSize;
            }
            newPosition += 1;
            bufferSize += 1;
            if(newPosition == position0Other+1){
                value = i;
            }
            if(position0Other > newPosition){
                position0Other += 1;
            }
            
            currentPositionOther = newPosition;
        }
        System.out.println(value);

        /*
        for(int i = 1; i < 50000000 + 1; i++){
            int newPosition = currentPosition;
            int howMuchToGo = step % buffer.size();
            newPosition += howMuchToGo;
            if(newPosition >= buffer.size()){
                newPosition -= buffer.size();
            }
            /*
            while(howMuchToGo > 0){
                newPosition += 1;
                if(newPosition > buffer.size() - 1){
                    newPosition = 0;
                }
                howMuchToGo -= 1;
            }
            *//*
            newPosition += 1;
            buffer.add(newPosition, i);
            if(position0 > newPosition){
                position0 += 1;
            }
            currentPosition = newPosition;
        }
        */

        /*
        for(int i: buffer){
            System.out.print(i);
            System.out.print(" ");
        }
        */
        System.out.println();
        System.out.println(currentPosition);
        System.out.println(buffer.get(currentPosition += 1));
        System.out.println(position0);
        System.out.println(buffer.get(position0 + 1));
    }
}
