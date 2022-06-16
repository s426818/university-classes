package adventOfCode.year2016;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Day2 {

    private static int up(int position){
        switch (position){
            case 1: return 1;
            case 2: return 2;
            case 3: return 3;
            case 4: return 1;
            case 5: return 2;
            case 6: return 3;
            case 7: return 4;
            case 8: return 5;
            case 9: return 6;
        }
        return 0;
    }

    private static int down(int position){
        switch (position){
            case 1: return 4;
            case 2: return 5;
            case 3: return 6;
            case 4: return 7;
            case 5: return 8;
            case 6: return 9;
            case 7: return 7;
            case 8: return 8;
            case 9: return 9;
        }
        return 0;
    }

    private static int left(int position){
        switch (position){
            case 1: return 1;
            case 2: return 1;
            case 3: return 2;
            case 4: return 4;
            case 5: return 4;
            case 6: return 5;
            case 7: return 7;
            case 8: return 7;
            case 9: return 8;
        }
        return 0;
    }

    private static int right(int position){
        switch (position){
            case 1: return 2;
            case 2: return 3;
            case 3: return 3;
            case 4: return 5;
            case 5: return 6;
            case 6: return 6;
            case 7: return 8;
            case 8: return 9;
            case 9: return 9;
        }
        return 0;
    }

    private static int direction(String instruction, int position){
        switch (instruction){
            case "U": return up(position);
            case "D": return down(position);
            case "L": return left(position);
            case "R": return right(position);
        }
        return 0;
    }
    
    private static int buffedUp(int position){
        switch (position){
            case 1: return 1;
            case 2: return 2;
            case 3: return 1;
            case 4: return 4;
            case 5: return 5;
            case 6: return 2;
            case 7: return 3;
            case 8: return 4;
            case 9: return 9;
            case 10: return 6;
            case 11: return 7;
            case 12: return 8;
            case 13: return 11;
        }
        return 0;
    }

    private static int buffeDown(int position){
        switch (position){
            case 1: return 3;
            case 2: return 6;
            case 3: return 7;
            case 4: return 8;
            case 5: return 5;
            case 6: return 10;
            case 7: return 11;
            case 8: return 12;
            case 9: return 9;
            case 10: return 10;
            case 11: return 13;
            case 12: return 12;
            case 13: return 13;
        }
        return 0;
    }

    private static int buffedLeft(int position){
        switch (position){
            case 1: return 1;
            case 2: return 2;
            case 3: return 2;
            case 4: return 3;
            case 5: return 5;
            case 6: return 5;
            case 7: return 6;
            case 8: return 7;
            case 9: return 8;
            case 10: return 10;
            case 11: return 10;
            case 12: return 11;
            case 13: return 13;
        }
        return 0;
    }

    private static int buffedRight(int position){
        switch (position){
            case 1: return 1;
            case 2: return 3;
            case 3: return 4;
            case 4: return 4;
            case 5: return 6;
            case 6: return 7;
            case 7: return 8;
            case 8: return 9;
            case 9: return 9;
            case 10: return 11;
            case 11: return 12;
            case 12: return 12;
            case 13: return 13;
        }
        return 0;
    }

    private static int buffedDirection(String instruction, int position){
        switch (instruction){
            case "U": return buffedUp(position);
            case "D": return buffeDown(position);
            case "L": return buffedLeft(position);
            case "R": return buffedRight(position);
        }
        return 0;
    }
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2016\\inputs\\input2.txt"));

        String line = filereader.readLine();
        int position = 5;
        int buffedPosition = 5;
        List<Integer> code = new ArrayList<>();
        List<Integer> buffedCode = new ArrayList<>();

        while(line!=null){
            String [] splitLine = line.split("");
            for(String s: splitLine){
                position = direction(s, position);
                buffedPosition = buffedDirection(s, buffedPosition);
            }
            code.add(position);
            buffedCode.add(buffedPosition);
            line = filereader.readLine();
        }

        for(int i: code){
            System.out.print(i);
        }
        System.out.println("");
        for(int i: buffedCode){
            System.out.println(i);
        }

        filereader.close();
        
    }
}
