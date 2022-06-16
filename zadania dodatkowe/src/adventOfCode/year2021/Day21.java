package adventOfCode.year2021;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Day21 {
    
    private static int roll(int k){
        if(k < 100){
            return k + 1;
        } else{
            return 1;
        }
    }

    private static int howMuchAdd(int number, int position){
        int rest = number % 10;
        if(position + rest <= 10){
            return position + rest;
        } else{
            return (position + rest) - 10;
        }
    }

    public static void main(String[] args) throws IOException {
        
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2021\\inputs\\input21.txt"));

        String line = filereader.readLine();
        int [] positions = new int [2];
        positions[0] = Character.valueOf(line.charAt(line.length()-1)) - 48;
        line = filereader.readLine();
        positions[1] = Character.valueOf(line.charAt(line.length()-1)) - 48;

        filereader.close();

        int sum1 = 0;
        int sum2 = 0;

        int k = 1;
        int player = 1;
        int counter = 0;

        while(sum1 < 1000 && sum2 < 1000){
            int roll = 0;
            for(int i = 0; i < 3; i++){
                roll += k;
                k = roll(k);
                
            }
            roll = roll%10;
            if(player == 1){
                int addition = howMuchAdd(roll, positions[0]);
                sum1 += addition;
                positions[0] = addition;
                player = 2;
            } else{
                if(player == 2){
                    int addition = howMuchAdd(roll, positions[1]);
                    sum2 += addition;
                    positions[1] = addition;
                    player = 1;
                }
            }
            counter += 3;
        }

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(counter);

        if(sum1 < sum2){
            System.out.println(sum1 * counter);
        } else{
            System.out.println(sum2 * counter);
        }

    }
    
}
