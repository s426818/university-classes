package adventOfCode.year2017;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Day13 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2017\\inputs\\input13.txt"));
        
        int [] ranges = new int[91];
        Wall[] walls  = new Wall[91];
        String line = filereader.readLine();
        while(line!=null){
            String [] splitLine = line.split(": ");
            ranges[Integer.parseInt(splitLine[0])] = Integer.parseInt(splitLine[1]);
            Wall wall = new Wall(0, Integer.parseInt(splitLine[1]), Integer.parseInt(splitLine[0]));
            walls[Integer.parseInt(splitLine[0])] = wall;
            line = filereader.readLine();
        }

        int l = 0;
        for(Wall wall: walls){
            if(wall!=null){
                System.out.println(wall.depth);
                l += 1;
            }            
        }

        int sumSeverity = 0;
        for(int i = 0; i < walls.length; i++){
            if(walls[i]!=null){
                if(0 == walls[i].scannerPosition){
                    sumSeverity += walls[i].severity();
                    
                    walls[i].caughtSomeone();
                }
    
                
            }   
            for(Wall wall: walls){
                if(wall!=null){
                    wall.moveScanner();
                }                    
            }         
        }

        System.out.println(sumSeverity);

        int delay = 0;
        int k = 0;
        Boolean caught = true;
        while(caught){
            k = 0;
            for(int i = 0; i <= delay; i++){
                for(Wall wall: walls){
                    if(wall!=null){
                        wall.scannerPosition = 0;
                    }                    
                } 
            }
            
            for(int i = 0; i < walls.length; i++){
                if(walls[i]!=null){
                    if(0 == walls[i].scannerPosition){
                        sumSeverity += walls[i].severity();
                        
                        walls[i].caughtSomeone();
                    } else{
                        k += 1;
                    }
        
                    
                }   
                for(Wall wall: walls){
                    if(wall!=null){
                        wall.moveScanner();
                    }                    
                }         
            }
            if(k == l){
                System.out.println(delay);
                caught = false;
            } 
            delay += 1;
        }

        

        filereader.close();
    }

    private static class Wall{
        int scannerPosition = 0;
        int range = 0;
        int depth = 0;
        Boolean caught = false;
        Boolean forward = true;

        private Wall(){

        }

        private Wall(int scannerPosition, int range, int depth){
            this.scannerPosition = scannerPosition;
            this.range = range;
            this.depth = depth;
        }

        private void moveScanner(){
            if(forward){
                scannerPosition += 1;
            } else{
                scannerPosition -= 1;
            }            
            if(scannerPosition >= range - 1){
                forward = false;
            }
            if(scannerPosition == 0){
                forward = true;
            }
        }

        private void caughtSomeone(){
            caught = true;
        }

        private int severity(){
            return depth*range;
        }
    }
    
}
