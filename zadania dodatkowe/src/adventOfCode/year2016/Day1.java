package adventOfCode.year2016;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Day1 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2016\\inputs\\input1.txt"));

        String [] input = filereader.readLine().split(", ");
        
        filereader.close();

        String orientation = "North";
        int x = 0;
        int y = 0;

        for(String s: input){
            // turn left
            if(Character.toString(s.charAt(0)).equals("L")){
                if(orientation.equals("North")){
                    orientation = "West";
                    y -= Character.valueOf(s.charAt(1)) - 48;
                } else{
                    if(orientation.equals("East")){
                        orientation = "North";
                        x += Character.valueOf(s.charAt(1)) - 48;
                    } else{
                        if(orientation.equals("South")){
                            orientation = "East";
                            y += Character.valueOf(s.charAt(1)) - 48;
                        } else{
                            orientation = "South";
                            x -= Character.valueOf(s.charAt(1)) - 48;
                        }
                    }
                }
            } else{
                // turn right
                if(orientation.equals("North")){
                    orientation = "East";
                    y += Character.valueOf(s.charAt(1)) - 48;
                } else{
                    if(orientation.equals("East")){
                        orientation = "South";
                        x -= Character.valueOf(s.charAt(1)) - 48;
                    } else{
                        if(orientation.equals("South")){
                            orientation = "West";
                            y -= Character.valueOf(s.charAt(1)) - 48;
                        } else{
                            orientation = "North";
                            x += Character.valueOf(s.charAt(1)) - 48;
                        }
                    }
                }
            }
        } 

        System.out.println(x);
        System.out.println(y);
        System.out.println(Math.abs((double) x) + Math.abs((double) y));

        Actor actor = new Actor();
        System.out.println(actor.distanceFromXY);
        for(String s: input){
            actor.go(s);
        }

        System.out.println(actor.distanceFromXY);
        
    }

}
