package adventOfCode.year2016;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Day10 {
    
    private static int findBot(List<Bot> bots){
        int k = 0;
        while(!bots.get(k).canPerformAction()){
            k += 1;
        }
        return k;
    }

    private static int [] findInstruction(List<int []> list, int number){
        int i = 0;
        while(list.get(i)[0] != number){
            i += 1;
        }
        return list.get(i);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2016\\inputs\\input10.txt"));

        List<String> instructions = new ArrayList<>();
        List<Bot>    bots = new ArrayList<>();
        String line = filereader.readLine();
        List<Bot>    outputs = new ArrayList<>();
        // bot-bot = 0; bot-output = 1; output-bot = 2; output-output = 3;
        List<int []> shortInstructions = new ArrayList<>();

        for(int i = 0; i < 210; i++){
            bots.add(new Bot(i));
        }

        for(int i = 0; i < 21; i++){
            outputs.add(new Bot(i));
        }

        while(line!=null){
            String [] lineSplit = line.split(" ");
            if(line.charAt(0) == 'v'){
                if(bots.get(Integer.parseInt(lineSplit[5])).microchip1 == -1){
                    bots.get(Integer.parseInt(lineSplit[5])).microchip1 = Integer.parseInt(lineSplit[1]);
                } else{
                    bots.get(Integer.parseInt(lineSplit[5])).microchip2 = Integer.parseInt(lineSplit[1]);                    
                }
            } else{
                instructions.add(line);
                int [] shortInstruction = new int[4];
                    shortInstruction[0] = Integer.parseInt(lineSplit[1]);
                    shortInstruction[1] = Integer.parseInt(lineSplit[6]);
                    shortInstruction[2] = Integer.parseInt(lineSplit[11]);
                    if(lineSplit[5].equals("bot")){
                        if(lineSplit[10].equals("bot")){
                            shortInstruction[3] = 0;
                        } else{
                            shortInstruction[3] = 1;
                        }
                    } else{
                        if(lineSplit[10].equals("bot")){
                            shortInstruction[3] = 2;
                        } else{
                            shortInstruction[3] = 3;
                        }
                    }
                    shortInstructions.add(shortInstruction);
            }
            line = filereader.readLine();
        }

        int botNumber = Integer.MIN_VALUE;

        while(shortInstructions.size() > 0){
            int index = findBot(bots);
            int [] table = findInstruction(shortInstructions, index);
            bots.get(table[0]).makeFirstSmaller();
            if(bots.get(table[0]).microchip1 == 17 && bots.get(table[0]).microchip2 == 61){
                botNumber = bots.get(table[0]).id;
            }
            switch (table[3]){
                // bot-bot
                case 0: bots.get(table[1]).addMicrochip(bots.get(table[0]).microchip1);
                        bots.get(table[2]).addMicrochip(bots.get(table[0]).microchip2);
                        bots.get(table[0]).resetMicrochips();
                        break;
                //bot-output
                case 1: bots.get(table[1]).addMicrochip(bots.get(table[0]).microchip1);
                        outputs.get(table[2]).addMicrochip(bots.get(table[0]).microchip2);
                        bots.get(table[0]).resetMicrochips();
                        break;
                //output-bot
                case 2: outputs.get(table[1]).addMicrochip(bots.get(table[0]).microchip1);
                        bots.get(table[2]).addMicrochip(bots.get(table[0]).microchip2);
                        bots.get(table[0]).resetMicrochips();
                        break;
                //output-output
                case 3: outputs.get(table[1]).addMicrochip(bots.get(table[0]).microchip1);
                        outputs.get(table[2]).addMicrochip(bots.get(table[0]).microchip2);
                        bots.get(table[0]).resetMicrochips();
                        break;
            }
            shortInstructions.remove(table);
        }

        int multiply = 1;
        for(int i = 0; i < 3; i++){
            multiply *= outputs.get(i).microchip1;
        }

        System.out.println(botNumber);
        System.out.println(multiply);

        filereader.close();
    }

    private static class Bot{
        int id = 0;
        int microchip1 = -1;
        int microchip2 = -1;

        private Bot(){

        }

        private Bot(int id, int microchip1, int microchip2){
            this.id = id;
            this.microchip1 = microchip1;
            this.microchip2 = microchip2;
        }

        private Bot(int id){
            this.id = id;
        }

        private Boolean canPerformAction(){
            if(microchip1 != -1 && microchip2 != -1){
                return true;
            } else{
                return false;
            }
        }

        private void makeFirstSmaller(){
            if(microchip1 > microchip2){
                int temp = microchip1;
                microchip1 = microchip2;
                microchip2 = temp;
            }
        }

        private void addMicrochip(int chip){
            if(microchip1 == -1){
                microchip1 = chip;
            } else{
                microchip2 = chip;
            }
        }

        private void resetMicrochips(){
            microchip1 = -1;
            microchip2 = -1;
        }

    }

}
