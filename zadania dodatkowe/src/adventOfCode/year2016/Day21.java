package adventOfCode.year2016;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Day21 {

    private static List<String> swapPositions(List<String> password, int positionX, int positionY){
        String x = password.get(positionX);
        String y = password.get(positionY);
        password.remove(positionX);
        password.add(positionX, y);
        password.remove(positionY);
        password.add(positionY, x);
        return password;
    }
    
    private static List<String> swapLetters(List<String> password, String letterX, String letterY){
        int positionX = Integer.MIN_VALUE;
        int positionY = Integer.MIN_VALUE;
        for(int i = 0; i < password.size(); i++){
            if(password.get(i).equals(letterX)){
                positionX = i;
            }
            if(password.get(i).equals(letterY)){
                positionY = i;
            }
        }
        password = swapPositions(password, positionX, positionY);
        return password;
    }

    private static List<String> reverse(List<String> password, int positionX, int positionY){
        String [] split = new String [(positionY-positionX) + 1];
        int k = 0;
        for(int i = positionY; i >= positionX; i--){
            split[k] = password.get(i);
            k += 1;
        }
        k = 0;
        for(int i = positionX; i <= positionY; i++){
            password.remove(i);
            password.add(i, split[k]); 
            k += 1;
        }
        return password;
    }

    private static List<String> rotateLeft(List<String> password, int shift){
        /*
        String [] split = new String[shift];
        for(int i = 0; i < shift; i++){
            split[i] = password.get(i);
        }
        for(int i = 0; i < shift; i++){
            password.remove(i);
            password.add(split[i]);
        }
        */
        password = rotateRight(password, password.size() - shift);
        return password;
    }

    private static List<String> rotateRight(List<String> password, int shift){
        for(int i = 0; i < shift; i++){
            String s = password.get(password.size()-1);
            password.remove(password.size()-1);
            password.add(0, s);
        }
        return password;
    }

    private static List<String> move(List<String> password, int positionX, int positionY){
        String s = password.get(positionX);
        password.remove(positionX);
        password.add(positionY, s);
        return password;
    }

    private static List<String> rotateBasedOnPosition(List<String> password, String letter){
        int positionX = Integer.MIN_VALUE;
        for(int i = 0; i < password.size(); i++){
            if(password.get(i).equals(letter)){
                positionX = i;
            }
        }
        if(positionX >= 4){
            positionX += 1;
        }
        positionX += 1;
        password = rotateRight(password, positionX);
        return password;
    }

    // nie działa :/
    private static List<String> unRotateBasedOnPosition(List<String> password, String letter){
        List<String> check = new ArrayList<>();
        for(int i = 0; i < password.size(); i++){
            int k = i + 1;
            if(i >= 4){
                k += 1;
            }
            check = rotateLeft(password, k);
            int l = Integer.MIN_VALUE;
            for(int j = 0; j < check.size(); j++){
                if(check.get(j).equals(letter)){
                    l = j;
                }
            }
            if(l == i){
                return check;
            }
            /*
            if(password.equals(rotateBasedOnPosition(check, letter))){
                return check;
            }
            */
        }
        return password;
    }

    private static List<String> undoRotateBasedOnPosition(List<String> password, String letter){
        int [] positions = new int[password.size()];
        for(int i = 0; i < password.size(); i++){
            positions[i] = i+1;
            if(i >= 4){
                positions[i] = i+2;
            }
        }
        for(int i: positions){
            System.out.println(i);
        }

        for(int i: positions){
            System.out.println(i);
            List<String> check = rotateRight(password, i);
            System.out.println(rotateRight(password, i));
            if(rotateBasedOnPosition(rotateRight(password, i), letter).equals(password)){
                System.out.println(check);
            }
        }

        return password;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2016\\inputs\\input21.txt"));

        String [] passwordString = "abcdefgh".split("");
        List<String> password = new ArrayList<>();
        for(String s: passwordString){
            password.add(s);
        }

        for(String s: password){
            System.out.print(s);
        }
        System.out.println();

        String line = filereader.readLine();
        while(line!=null){
            String [] splitLine = line.split(" ");
            switch (splitLine[0]){
                case "swap":{
                    switch (splitLine[1]){
                        case "letter":{
                            password = swapLetters(password, splitLine[2], splitLine[5]);
                        } ; break;
                        case "position":{
                            password = swapPositions(password, Integer.parseInt(splitLine[2]), Integer.parseInt(splitLine[5]));
                        } ; break;
                    }
                } ; break;
                case "reverse":{
                    password = reverse(password, Integer.parseInt(splitLine[2]), Integer.parseInt(splitLine[4]));
                } ; break;
                case "rotate":{
                    switch (splitLine[1]){
                        case "left":{
                            password = rotateLeft(password, Integer.parseInt(splitLine[2]));
                        } ; break;
                        case "right":{
                            password = rotateRight(password, Integer.parseInt(splitLine[2]));
                        } ; break;
                        case "based":{
                            password = rotateBasedOnPosition(password, splitLine[6]);
                        } ; break;
                    }
                } ; break;
                case "move":{
                    password = move(password, Integer.parseInt(splitLine[2]), Integer.parseInt(splitLine[5]));
                } ; break;
                
            }
            line = filereader.readLine();
            /*
            for(String s: password){
                System.out.print(s);
            }
            System.out.println();
            */
        }

        for(String s: password){
            System.out.print(s);
        }
        System.out.println();

        String [] passwordStringtest = "decab".split("");
        List<String> passwordtest = new ArrayList<>();
        for(String s: passwordStringtest){
            passwordtest.add(s);
        }
        System.out.println(unRotateBasedOnPosition(passwordtest, "d"));

        System.out.println(undoRotateBasedOnPosition(passwordtest, "d"));
        //System.out.println(rotateRight(passwordtest, 6));

        filereader.close();

        /*
        password = swapPositions(password, 4, 0);
        for(String s: password){
            System.out.print(s);
        }
        System.out.println();
        password = swapLetters(password, "d", "b");
        for(String s: password){
            System.out.print(s);
        }
        System.out.println();
        password = reverse(password, 0, 4);
        for(String s: password){
            System.out.print(s);
        }
        System.out.println();
        password = rotateLeft(password, 1);
        for(String s: password){
            System.out.print(s);
        }
        System.out.println();
        password = move(password, 1, 4);
        for(String s: password){
            System.out.print(s);
        }
        System.out.println();
        password = move(password, 3, 0);
        for(String s: password){
            System.out.print(s);
        }
        System.out.println();
        password = rotateBasedOnPosition(password, "b");
        for(String s: password){
            System.out.print(s);
        }
        System.out.println();
        password = rotateBasedOnPosition(password, "d");
        for(String s: password){
            System.out.print(s);
        }
        */
    }
}
