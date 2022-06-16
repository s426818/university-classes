import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AnotherSolver {
    
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
        switch (gameType){
            case "texas-holdem": generateHandsTexas(inputHands, board); break;
            case "omaha-holdem": generateHandsOmaha(inputHands, board); break;
        }

        List<Hand> handsToSort = new ArrayList<>();
        if(gameType.equals("five-card-draw")){
            for(String s: inputHands){
                Hand hand = new Hand(s);
                hand.evaluate();
                handsToSort.add(hand);
            }
        }

        List<Hand> sortedHands = new ArrayList<>();
        for(Hand hand: handsToSort){
            int i = 0;
            int positionToInsert = 0;
            while(i < sortedHands.size()){
                if(hand.isStronger(sortedHands.get(i))){
                    i += 1;
                } else{
                    positionToInsert = i;
                    i = sortedHands.size();
                }
            }
            sortedHands.add(positionToInsert, hand);
        }

        for(Hand h: sortedHands){
            System.out.println(h);
        }
        System.out.println("");

        return line;
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
            if(input.split(" ")[0].equals("five-card-draw")){
                process(input);
            }
            input = filereader.readLine();
        }

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
        int total = 0;
        Value value = null;

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
            
            List<String> values = new ArrayList<>();         
            if(isItStraight()){
                /*
                for(int rank: sortedRanks){
                    System.out.print(rank);
                }
                System.out.println();
                */
                values.add("Straight");
                value = new Value("Straight", sortedRanks);
            }
            if(isItFlush()){
                /*
                for(Card card: cards){
                    System.out.print(card.rank);
                    System.out.print(card.suit);
                }
                System.out.println();
                */
                if(values.contains("Straight")){
                    values.remove("Straight");
                    values.add("Straight Flush");
                    value = new Value("Straight Flush", sortedRanks);
                } else{
                    values.add("Flush");
                    value = new Value("Flush", sortedRanks);
                }                
            }
            

            /*
            if(values.contains("Straight Flush")){

            }
            */

            int [] countedRanks = countRanks();
            int [] maxAndPosition = findMax(countedRanks);
            
            int max = maxAndPosition[0];
            List<Integer> temp = new ArrayList<>();
            switch (max){
                case 4:{
                    temp.add(maxAndPosition[1]);
                    for(int i: sortedRanks){
                        if(i != max){
                            temp.add(i);
                        }
                    }
                    value = new Value("Four of a kind", temp);
                } break;
                case 3:{
                    temp.add(maxAndPosition[1]);
                    Boolean isTherePair = false;
                    int position = -1;
                    for(int i = 2; i < countedRanks.length; i++){
                        if(countedRanks[i] == 2){
                            isTherePair = true;
                            position = i;
                        }
                    }
                    if(isTherePair){
                        temp.add(position);
                        value = new Value("Full house", temp);
                    } else{
                        for(int i = 2; i < countedRanks.length; i++){
                            if(countedRanks[i] == 1){
                                temp.add(i);
                            }
                        }
                        value = new Value("Three of a kind", temp);
                    }
                } break;
                case 2:{
                    List<Integer> ranksOfPairs = new ArrayList<>();
                    for(int i = 2; i < countedRanks.length; i++){
                        if(countedRanks[i] == 2){
                            ranksOfPairs.add(i);
                        }
                    }
                    if(ranksOfPairs.size() == 2){
                        if(ranksOfPairs.get(0) > ranksOfPairs.get(1)){
                            temp.add(ranksOfPairs.get(0));
                            temp.add(ranksOfPairs.get(1));                            
                        } else{
                            temp.add(ranksOfPairs.get(1));
                            temp.add(ranksOfPairs.get(0));
                        }
                        for(int i = 2; i < countedRanks.length; i++){
                            if(countedRanks[i] == 1){
                                temp.add(i);
                            }
                        }
                        value = new Value("Two pairs", temp);
                    } else{
                        temp.add(ranksOfPairs.get(0));
                        for(int i = 2; i < countedRanks.length; i++){
                            if(countedRanks[i] == 1){
                                temp.add(i);
                            }
                        }
                        value = new Value("Pair", temp);
                    }
                } break;
                default: value = new Value("High card", sortedRanks);
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


        Boolean isStronger(Hand otherHand){
            if(value.valueInt > otherHand.value.valueInt){
                return true;
            } else{
                if(value.valueInt < otherHand.value.valueInt){
                    return false;
                } else{
                    switch (value.name){
                        case "High card":{
                            for(int i = sortedRanks.size()-1; i >= 0; i--){
                                if(sortedRanks.get(i) > otherHand.sortedRanks.get(i)){
                                    return true;
                                } else{
                                    if(sortedRanks.get(i) < otherHand.sortedRanks.get(i)){
                                        return false;
                                    }
                                }
                            }
                        } break;
                        case "Pair":{
                            if(value.ranksToCheck.get(0) > otherHand.value.ranksToCheck.get(0)){
                                return true;
                            } else{
                                if(value.ranksToCheck.get(0) < otherHand.value.ranksToCheck.get(0)){
                                    return false;
                                } else{
                                    for(int i = value.ranksToCheck.size()-1; i >= 1; i--){
                                        if(value.ranksToCheck.get(i) > otherHand.value.ranksToCheck.get(i)){
                                            return true;
                                        } else{
                                            if(value.ranksToCheck.get(i) < otherHand.value.ranksToCheck.get(i)){
                                                return false;
                                            }
                                        }
                                    }
                                }
                            }
                        } break;
                        case "Two pairs":{
                            if(value.ranksToCheck.get(0) > otherHand.value.ranksToCheck.get(0)){
                                return true;
                            } else{
                                if(value.ranksToCheck.get(0) < otherHand.value.ranksToCheck.get(0)){
                                    return false;
                                } else{
                                    if(value.ranksToCheck.get(1) > otherHand.value.ranksToCheck.get(1)){
                                        return true;
                                    } else{
                                        if(value.ranksToCheck.get(1) < otherHand.value.ranksToCheck.get(1)){
                                            return false;
                                        } else{
                                            if(value.ranksToCheck.get(2) > otherHand.value.ranksToCheck.get(2)){
                                                return true;
                                            } else{
                                                if(value.ranksToCheck.get(2) < otherHand.value.ranksToCheck.get(2)){
                                                    return false;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } break;
                        case "Three of a kind":{
                            if(value.ranksToCheck.get(0) > otherHand.value.ranksToCheck.get(0)){
                                return true;
                            } else{
                                if(value.ranksToCheck.get(0) < otherHand.value.ranksToCheck.get(0)){
                                    return false;
                                } else{
                                    for(int i = value.ranksToCheck.size()-1; i >= 1; i--){
                                        if(value.ranksToCheck.get(i) > otherHand.value.ranksToCheck.get(i)){
                                            return true;
                                        } else{
                                            if(value.ranksToCheck.get(i) < otherHand.value.ranksToCheck.get(i)){
                                                return false;
                                            }
                                        }
                                    }
                                }
                            }
                        } break;
                        case "Straight":{
                            for(int i = value.ranksToCheck.size()-1; i >= 0; i--){
                                if(value.ranksToCheck.get(i) > otherHand.value.ranksToCheck.get(i)){
                                    return true;
                                } else{
                                    if(value.ranksToCheck.get(i) < otherHand.value.ranksToCheck.get(i)){
                                        return false;
                                    }
                                }
                            }
                        } break;
                        case "Flush":{
                            for(int i = value.ranksToCheck.size()-1; i >= 0; i--){
                                if(value.ranksToCheck.get(i) > otherHand.value.ranksToCheck.get(i)){
                                    return true;
                                } else{
                                    if(value.ranksToCheck.get(i) < otherHand.value.ranksToCheck.get(i)){
                                        return false;
                                    }
                                }
                            }
                        } break;
                        case "Full house":{
                            if(value.ranksToCheck.get(0) > otherHand.value.ranksToCheck.get(0)){
                                return true;
                            } else{
                                if(value.ranksToCheck.get(0) < otherHand.value.ranksToCheck.get(0)){
                                    return false;
                                } else{
                                    if(value.ranksToCheck.get(1) > otherHand.value.ranksToCheck.get(1)){
                                        return true;
                                    } else{
                                        if(value.ranksToCheck.get(1) < otherHand.value.ranksToCheck.get(1)){
                                            return false;
                                        }
                                    }
                                }
                            }
                        } break;
                        case "Four of a kind":{
                            if(value.ranksToCheck.get(0) > otherHand.value.ranksToCheck.get(0)){
                                return true;
                            } else{
                                if(value.ranksToCheck.get(0) < otherHand.value.ranksToCheck.get(0)){
                                    return false;
                                } else{
                                    if(value.ranksToCheck.get(1) > otherHand.value.ranksToCheck.get(1)){
                                        return true;
                                    } else{
                                        if(value.ranksToCheck.get(1) < otherHand.value.ranksToCheck.get(1)){
                                            return false;
                                        }
                                    }
                                }
                            }
                        } break;
                        case "Straight Flush":{
                            for(int i = value.ranksToCheck.size()-1; i >= 0; i--){
                                if(value.ranksToCheck.get(i) > otherHand.value.ranksToCheck.get(i)){
                                    return true;
                                } else{
                                    if(value.ranksToCheck.get(i) < otherHand.value.ranksToCheck.get(i)){
                                        return false;
                                    }
                                }
                            }
                        } break;
                    }
                }
            }
            return true;
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
                handString += "  ";
            }
            handString = handString.substring(0, handString.length()-1);
            return handString;
        }

        class Value{
            String name = "";
            int valueInt = 0;
            List<Integer> ranksToCheck = new ArrayList<>();

            Value(String name, List<Integer> lista){
                this.name = name;
                this.ranksToCheck = lista;
                switch (name){
                    case "High card": valueInt = 0;
                    case "Pair": valueInt = 1;
                    case "Two pairs": valueInt = 2;
                    case "Three of a kind": valueInt = 3;
                    case "Straight": valueInt = 4;
                    case "Flush": valueInt = 5;
                    case "Full house": valueInt = 6;
                    case "Four of a kind": valueInt = 7;
                    case "Straight Flush": valueInt = 8;
                }
            }
        }
    }
}
