package adventOfCode.year2021;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DayTwo {
    public static void main(String[] args) throws IOException {
        int depth = 0;
        int forward = 0;
        int aim = 0;
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2021\\input2.txt"));
        String line = filereader.readLine();
        /*
        while(line!=null){
            int length = line.length();
            if(line.charAt(0) == 'f'){
                //System.out.println(forward);
                forward += (line.charAt(length-1) - 48);
                //System.out.println(forward);
                //System.out.println(line.charAt(length-1));
            }
            if(line.charAt(0) == 'u'){
                depth -= (line.charAt(length-1) - 48);
            }
            if(line.charAt(0) == 'd'){
                depth += (line.charAt(length-1) - 48);
            }
            line = filereader.readLine();
        }
        System.out.println(depth);
        System.out.println(forward);
        System.out.println(depth*forward);
        */
        while(line!=null){
            int length = line.length();
            if(line.charAt(0) == 'f'){
                forward += (line.charAt(length-1) - 48);
                depth += aim*(line.charAt(length-1) - 48);
            }
            if(line.charAt(0) == 'u'){
                aim -= (line.charAt(length-1) - 48);
            }
            if(line.charAt(0) == 'd'){
                aim += (line.charAt(length-1) - 48);
            }
            line = filereader.readLine();
        }
        System.out.println(forward*depth);
        filereader.close();
    }
}
