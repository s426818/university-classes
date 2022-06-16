package adventOfCode.year2017;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Day2 {

    private static int ifDivides(String s, String st){
        if(Integer.parseInt(s)%Integer.parseInt(st) == 0){
            return Integer.parseInt(s)/Integer.parseInt(st);
        } else{
            if(Integer.parseInt(st)%Integer.parseInt(s) == 0){
                return Integer.parseInt(st)/Integer.parseInt(s);
            }
        }
        return 0;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2017\\inputs\\input2.txt"));

        int sum = 0;
        int anotherSum = 0;
        List<String []> input = new ArrayList<>();
        String line = filereader.readLine();
        while(line!=null){
            String [] test = line.split("	");
            /*
            for(String s: test){
                //System.out.println(s);
            }
            */
            input.add(line.split("	"));
            line = filereader.readLine();

            for(String s: test){
                for(String st: test){
                    if(!s.equals(st)){
                        if(ifDivides(s, st) != 0){
                            System.out.println(ifDivides(s, st));
                            anotherSum += ifDivides(s, st);
                        }   
                        
                    }
                }
            }
        }

        filereader.close();

        

        for(String [] s: input){
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for(String st: s){
                if(!st.equals(" ") && !st.equals("") && !st.equals(" ")){
                    int i = Integer.parseInt(st);
                    if(i > max){
                        max = i;
                    }
                    if(i < min){
                        min = i;
                    }
                } else{
                    
                }
                
            }
            sum += max - min;
        }

        System.out.println(anotherSum/2);
        System.out.println(sum);
    }
}
