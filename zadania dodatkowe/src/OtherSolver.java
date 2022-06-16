import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OtherSolver {

    static List<String> generateSubsets(String gameType, int sizeOfSubset, String setOfCards, String board){
        List<String> generatedHandsString = new ArrayList<>();
        switch (gameType){
            case "texas-holdem": {
                setOfCards += board;
                String[] splitSetOfCards = setOfCards.split("");
                for(int i = 0; i < setOfCards.length()-2; i+=2){                    
                    for(int j = i+2; j < setOfCards.length(); j+=2){
                        String generatedHand = "";
                        for(int k = 0; k < setOfCards.length(); k+=2){
                            if(i != j){
                                if(k != i && k != j){
                                    generatedHand += splitSetOfCards[k] + splitSetOfCards[k+1];
                                }
                            }
                            
                        }
                        generatedHandsString.add(generatedHand);
                    }
                }
            } break;
            case "omaha-holdem": {
                String[] splitBoard = board.split("");
                String[] splitSetOfCards = setOfCards.split("");
                List<String> generatedFromBoard = new ArrayList<>();
                List<String> generatedFromSetOfCards = new ArrayList<>();
                for(int i = 0; i < setOfCards.length()-2; i+=2){                    
                    for(int j = i+2; j < setOfCards.length(); j+=2){
                        String generatedHand = "";
                        for(int k = 0; k < setOfCards.length(); k+=2){
                            if(i != j){
                                if(k != i && k != j){
                                    generatedHand += splitSetOfCards[k] + splitSetOfCards[k+1];
                                }
                            }
                            
                        }
                        generatedFromSetOfCards.add(generatedHand);
                    }
                }
                for(int i = 0; i < board.length()-2; i+=2){                    
                    for(int j = i+2; j < board.length(); j+=2){
                        String generatedHand = "";
                        for(int k = 0; k < board.length(); k+=2){
                            if(i != j){
                                if(k != i && k != j){
                                    generatedHand += splitBoard[k] + splitBoard[k+1];
                                }
                            }
                            
                        }
                        generatedFromBoard.add(generatedHand);
                    }
                }

                for(String s: generatedFromSetOfCards){
                    for(String st: generatedFromBoard){
                        String hand = s + st;
                        generatedHandsString.add(hand);
                    }
                }


            } break;
        }
        return generatedHandsString;
    }

    static List<Hand> bubbleSort(List<Hand> listToSort){
        for(int i = 0; i < listToSort.size() - 1; i++){
            for(int j = 0; j < listToSort.size() - (i+1); j++){
                if(listToSort.get(j).total < listToSort.get(j+1).total){
                    continue;
                } else{ 
                    if(listToSort.get(j).total > listToSort.get(j+1).total){
                        Collections.swap(listToSort, j, j+1); 
                    } else{
                        if(listToSort.get(j).toString().compareTo(listToSort.get(j+1).toString()) > 0){
                            Collections.swap(listToSort, j, j+1); 
                        }
                    }
                }
            }
        }
        return listToSort;
    }
    
    static String process(String line){

        String [] splitLine = line.split(" ");
        String gameType = splitLine[0];
        String board = "";
        int position = 1;
        List<String> inputHands = new ArrayList<>();
        if(gameType.equals("texas-holdem") || gameType.equals("omaha-holdem")){
            board = splitLine[1];
            position = 2;
        }
        for(int i = position; i < splitLine.length; i++){
            inputHands.add(splitLine[i]);
        }

        List<Hand> handsToSort = new ArrayList<>();

        /*
        switch (gameType){
            case "texas-holdem":{
                List<String> generatedHandsString = new ArrayList<>();
                for(String s: inputHands){
                    List<Hand> handsToChooseBestFrom = new ArrayList<>();
                    generatedHandsString = generateSubsets(gameType, 5, s, board);
                    for(String st: generatedHandsString){
                        Hand hand = new Hand(st);
                        hand.evaluate();
                        handsToChooseBestFrom.add(hand);
                    }
                    handsToChooseBestFrom = bubbleSort(handsToChooseBestFrom);
                    Hand newHand = new Hand(s);
                    newHand.total = handsToChooseBestFrom.get(handsToChooseBestFrom.size()-1).total;
                    handsToSort.add(newHand);
                }
            } break;
            case "omaha-holdem":{
                //List<String> generatedHandsString = new ArrayList<>();
            } break;
        }
        */

        if(gameType.equals("texas-holdem") || gameType.equals("omaha-holdem")){
            List<String> generatedHandsString = new ArrayList<>();
                for(String s: inputHands){
                    List<Hand> handsToChooseBestFrom = new ArrayList<>();
                    generatedHandsString = generateSubsets(gameType, 5, s, board);
                    for(String st: generatedHandsString){
                        Hand hand = new Hand(st);
                        hand.evaluate();
                        handsToChooseBestFrom.add(hand);
                    }
                    handsToChooseBestFrom = bubbleSort(handsToChooseBestFrom);
                    Hand newHand = new Hand(s);
                    newHand.total = handsToChooseBestFrom.get(handsToChooseBestFrom.size()-1).total;
                    handsToSort.add(newHand);
                }
        }


        if(gameType.equals("five-card-draw")){
            for(String s: inputHands){                
                Hand hand = new Hand(s);
                hand.evaluate();
                handsToSort.add(hand);  
            }
            System.out.println();
        }

        /*
        for(Hand h: sortedHands){
            System.out.println(h);
            System.out.println(h.total);
        }
        */
        List<Hand> sortedHands = bubbleSort(handsToSort);
        for(Hand h: sortedHands){
            //System.out.println(h);
            //System.out.println(h.total);
        }

        String valueToReturn = "";
        for(int i = 0; i < sortedHands.size() - 1; i++){
            if(sortedHands.get(i).total != sortedHands.get(i+1).total){
                valueToReturn += sortedHands.get(i).toString() + " ";
            } else{
                valueToReturn += sortedHands.get(i).toString() + "=";
            }
        }

        /*
        if(sortedHands.get(sortedHands.size()-2).total == sortedHands.get(sortedHands.size()-1).total){

        }
        */

        valueToReturn += sortedHands.get(sortedHands.size()-1).toString();

        return valueToReturn;
    }

    static List<String> generateHandsTexas(List<String> inputHands, String board){

        return inputHands;
    }

    static List<String> generateHandsOmaha(List<String> inputHands, String board){

        return inputHands;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\solverInput.txt"));

        String input = filereader.readLine();
        while(input!=null){
            /*
            if(input.split(" ")[0].equals("texas-holdem") || input.split(" ")[0].equals("five-card-draw")){
                System.out.println(process(input));;
            }
            */
            System.out.println(process(input));
            input = filereader.readLine();
        }

        System.out.println(process("texas-holdem 2h3h4h5d8d KdKs 9hJh"));
        System.out.println(process("texas-holdem 4cKs4h8s7s Ad4s Ac4d As9s KhKd 5d6d"));

        System.out.println(process("five-card-draw 6c6h6c5d4c ThAhJhKhQh"));

        System.out.println(process("five-card-draw 5s5d5cAcAs QhQcQsAcAs"));

        System.out.println(process("omaha-holdem 2c9d9hQdQh 6hJs2d4d 7dQsThJh KsTs2h6s 4s4hAd5c JdQc4cKd 9c5s7h5d 2sKc5h6c"));
        

        filereader.close();        

    }

    static class Card{
        int rank = 2;
        String suit = "s";

        Card(){

        }

        Card(String rank, String suit){
            if(rank.equals("T")){
                this.rank = 10;
            } else{
                if(rank.equals("J")){
                    this.rank = 11;
                } else{
                    if(rank.equals("Q")){
                        this.rank = 12;
                    } else{
                        if(rank.equals("K")){
                            this.rank = 13;
                        } else{
                            if(rank.equals("A")){
                                this.rank = 14;
                            } else{
                                this.rank = Integer.parseInt(rank);
                            }    
                        }    
                    }    
                }    
            }            
            this.suit = suit;
        }

        @Override
        public String toString() {
            return "Card [rank=" + rank + ", suit=" + suit + "]";
        }

    }

    static class Hand{
        List<Card> cards = new ArrayList<>(); 
        List<Integer> sortedRanks = new ArrayList<>();   
        String totalValue = "";
        double total = 0;

        Hand(){

        }

        Hand(String inputHand){
            String [] splitInputHand = inputHand.split("");
            for(int i = 0; i < splitInputHand.length-1; i += 2){
                Card cardToAdd = new Card(splitInputHand[i], splitInputHand[i+1]);
                cards.add(cardToAdd);
            }

            for(Card c: cards){
                sortedRanks.add(c.rank);
            }
            Collections.sort(sortedRanks);
        }

        void evaluate(){ 
            /*
            List<String> values = new ArrayList<>();         
            if(isItStraight()){
                
                for(int rank: sortedRanks){
                    System.out.print(rank);
                }
                System.out.println();
                
                values.add("Straight");
            }
            if(isItFlush()){
                
                for(Card card: cards){
                    System.out.print(card.rank);
                    System.out.print(card.suit);
                }
                System.out.println();
                
                if(values.contains("Straight")){
                    values.remove("Straight");
                    values.add("Straight Flush");
                } else{
                    values.add("Flush");
                }                
            }
            */

            /*
            if(values.contains("Straight Flush")){

            }

            int [] countedRanks = countRanks();
            int [] maxAndPosition = findMax(countedRanks);
            */

            int [] countedRanks = countRanks();
            int [] maxAndPosition = findMax(countedRanks);

            if(isItFlush() && isItStraight()){
                total = 8 * (Math.pow(2, 20));
                if(sortedRanks.get(4) == 14 && sortedRanks.get(3) == 5){
                    total += 5 * ((Math.pow(2, 16)));
                } else{
                    total += sortedRanks.get(4) * ((Math.pow(2, 16)));
                }
                return;
            } else if(isItFourOfAKind(maxAndPosition[0])){
                total = 7 * ((Math.pow(2, 20)));
                total += maxAndPosition[1] * ((Math.pow(2, 16)));
                if(sortedRanks.get(0) == maxAndPosition[1]){
                    total += sortedRanks.get(4) * ((Math.pow(2, 12)));
                } else{
                    total += sortedRanks.get(0) * ((Math.pow(2, 12)));
                }
            } else{
                int temp = isItFullHouse(maxAndPosition[0], countedRanks);
                if(temp != -1){
                    total = 6 * ((Math.pow(2, 20)));
                    total += maxAndPosition[1] * ((Math.pow(2, 16)));
                    total += temp * ((Math.pow(2, 12)));
                    //System.out.println(total);
                } else{
                    if(isItFlush()){
                        total = 5 * ((Math.pow(2, 20)));
                        int power = 0;
                        for(int i = 0; i < sortedRanks.size(); i++){
                            total += sortedRanks.get(i) * (Math.pow(2, power));
                            power += 4;
                        }
                    } else{
                        if(isItStraight()){
                            total = 4 * ((Math.pow(2, 20)));
                            if(sortedRanks.get(4) == 14 && sortedRanks.get(3) == 5){
                                total += 5 * ((Math.pow(2, 16)));
                            } else{
                                total += sortedRanks.get(4) * ((Math.pow(2, 16)));
                            }
                        } else{
                            int [] rest = isItThreeOfAKind(maxAndPosition[0], countedRanks);
                            if(rest != null){
                                total = 3 * ((Math.pow(2, 20)));
                                total += maxAndPosition[1] * ((Math.pow(2, 16)));
                                total += rest[1] * ((Math.pow(2, 12)));
                                total += rest[0] * ((Math.pow(2, 8)));
                            } else{
                                List<Integer> restFromPair = isItTwoPairOrPair(maxAndPosition[0], countedRanks);
                                if(restFromPair != null){
                                    // two pair
                                    if(restFromPair.size() == 3){
                                        total = 2 * ((Math.pow(2, 20)));
                                        total += restFromPair.get(1) * ((Math.pow(2, 16)));
                                        total += restFromPair.get(0) * ((Math.pow(2, 12)));
                                        total += restFromPair.get(2) * ((Math.pow(2, 8)));
                                    } else{
                                        if(restFromPair.size() == 4){
                                            total = 1 * ((Math.pow(2, 20)));
                                            total += restFromPair.get(0) * ((Math.pow(2, 16)));
                                            total += restFromPair.get(3) * ((Math.pow(2, 12)));
                                            total += restFromPair.get(2) * ((Math.pow(2, 8)));
                                            total += restFromPair.get(1) * ((Math.pow(2, 4)));
                                        }
                                    }
                                } else{
                                    total = 0 * ((Math.pow(2, 20)));
                                    int power = 0;
                                    for(int i = 0; i < sortedRanks.size(); i++){
                                        total += sortedRanks.get(i) * (Math.pow(2, power));
                                        power += 4;
                                    }
                                }
                            }
                        }
                    } 
                } 
            }

        }

        Boolean isItStraight(){

            int counter = 0;
            for(int i = 0; i < sortedRanks.size()-1; i++){
                if(sortedRanks.get(i)+1 == sortedRanks.get(i+1)){
                    counter += 1;
                }
            }

            if(counter == sortedRanks.size()-1){
                return true;
            } else{
                // special case with Ace (baby straight)
                if(sortedRanks.get(4) == 14){
                    for(int i = 2; i < 6; i++){
                        if(sortedRanks.get(i-2) != i){
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        Boolean isItFlush(){
            String temp = cards.get(0).suit;
            for(Card c: cards){
                if(!c.suit.equals(temp)){
                    return false;
                }
            }
            return true;
        }

        int [] countRanks(){
            int [] rankCounts = new int[15];
            for(int rank: sortedRanks){
                rankCounts[rank] += 1;
            }
            return rankCounts;
        }

        int []  findMax(int [] countedRanks){
            int [] array = new int[2];
            int max = 0;
            int position = 0;
            for(int i = 0; i < countedRanks.length; i++){
                if(max < countedRanks[i]){
                    max = countedRanks[i];
                    position = i;
                }
            }
            array[0] = max;
            array[1] = position;
            return array;
        }

        Boolean isItFourOfAKind(int max){
            if(max == 4){
                return true;
            }
            return false;
        }

        int isItFullHouse(int max, int [] countedRanks){
            if(max == 3){
                for(int i = 2; i < countedRanks.length; i++){
                    if(countedRanks[i] == 2){
                        return i;
                    }
                }
            }
            return -1;
        }

        int [] isItThreeOfAKind(int max, int [] countedRanks){
            if(max != 3){
                return null;
            }
            int [] rest = new int [2];
            int position = 0;
            for(int i = 2; i < countedRanks.length; i++){
                if(countedRanks[i] == 1){
                    rest[position] = i;
                    //rest[position] = countedRanks[i];
                    position += 1;
                }
            }
            return rest;
        }

        List<Integer> isItTwoPairOrPair(int max, int [] countedRanks){
            if(max != 2){
                return null;
            }
            
            List<Integer> rest = new ArrayList<>();
            List<Integer> pairs = new ArrayList<>();
            for(int i = 2; i < countedRanks.length; i++){
                if(countedRanks[i] == 1){
                    rest.add(i);
                } else{
                    if(countedRanks[i] == 2){
                        pairs.add(i);
                    }
                }
            }
            pairs.addAll(rest);
            /*
            if(rest.size() == 1){
                pairs.add(-2);
            } else{
                if(rest.size() == 3){
                    pairs.add(-1);
                }
            }
            */
            return pairs;
        }

        @Override
        public String toString() {
            String handString = "";
            for(int i = 0; i < cards.size(); i++){
                switch (cards.get(i).rank){
                    case 14: handString += "A"; break;
                    case 13: handString += "K"; break;
                    case 12: handString += "Q"; break;
                    case 11: handString += "J"; break;
                    case 10: handString += "T"; break;
                    default: handString += Integer.toString(cards.get(i).rank);
                }
                handString += cards.get(i).suit;
                //handString += "  ";
            }
            //handString = handString.substring(0, handString.length()-1);
            return handString;
        }

        class Value{
            String name = "";
            //List<Integer> 
        }
    }
}
