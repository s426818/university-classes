package adventOfCode.year2017;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Day16 {
    
    private static String spin(String input, int number){
        String newBeggining = input.substring(input.length() - number, input.length());
        String newEnding = input.substring(0, input.length() - number);
        String output = newBeggining + newEnding;
        return output;
    }

    private static String exchange(String input, int a, int b){
        String [] inputSplit = input.split("");
        String temp = inputSplit[a];
        inputSplit[a] = inputSplit[b];
        inputSplit[b] = temp;
        String output = "";
        for(String s: inputSplit){
            output += s;
        }
        return output;
    }

    private static String partner(String input, String a, String b){
        String [] inputSplit = input.split("");
        int positionA = Integer.MIN_VALUE;
        int positionB = Integer.MIN_VALUE;
        for(int i = 0; i < inputSplit.length; i++){
            if(inputSplit[i].equals(a)){
                positionA = i;
            }
            if(inputSplit[i].equals(b)){
                positionB = i;
            }
        }
        String output = exchange(input, positionA, positionB);
        return output;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2017\\inputs\\input16.txt"));

        String programs = "abcdefghijklmnop";
        String comparsion = "abcdefghijklmnop";
        String p = "abcde";
        System.out.println(spin(p, 1));
        System.out.println(exchange(spin(p, 1), 3, 4));
        System.out.println(partner(exchange(spin(p, 1), 3, 4), "e", "b"));

        String [] moves = filereader.readLine().split(",");

        int loop = 1000000000;
        int rest = loop % 60;
        for(long l = 0; l < rest; l ++){
            if(programs.equals(comparsion)){
                System.out.println(l);
            }
            for(String s: moves){
                //System.out.println(s);
                if(s.split("")[0].equals("s")){
                    String move = s.substring(1);
                    programs = spin(programs, Integer.parseInt(move));
                }
                if(s.split("")[0].equals("x")){
                    String move = s.substring(1);
                    String [] moveSplit = move.split("/");
                    programs = exchange(programs, Integer.parseInt(moveSplit[0]), Integer.parseInt(moveSplit[1]));
                }
                if(s.split("")[0].equals("p")){
                    String [] moveSplit = s.split("");
                    programs = partner(programs, moveSplit[1], moveSplit[3]);
                }
            }
        }

        /*
        for(String s: moves){
            //System.out.println(s);
            if(s.split("")[0].equals("s")){
                String move = s.substring(1);
                programs = spin(programs, Integer.parseInt(move));
            }
            if(s.split("")[0].equals("x")){
                String move = s.substring(1);
                String [] moveSplit = move.split("/");
                programs = exchange(programs, Integer.parseInt(moveSplit[0]), Integer.parseInt(moveSplit[1]));
            }
            if(s.split("")[0].equals("p")){
                String [] moveSplit = s.split("");
                programs = partner(programs, moveSplit[1], moveSplit[3]);
            }
        }
        */

        System.out.println(programs);

        filereader.close();
    }

}
