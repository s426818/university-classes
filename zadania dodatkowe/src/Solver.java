import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solver {
    
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
                System.out.print(s);
                Hand hand = new Hand(s);
                handsToSort.add(hand);
            }
        }

        for(Hand hand: handsToSort){
            hand.putCardsIntoList();
            hand.findValuesAlternative();
            hand.setHighestValue();
        }

        List<Hand> sortedHands = new ArrayList<>();
        for(Hand h: handsToSort){
            int i = 0;
            int positionToInsert = 0;

            /*
            while(i < sortedHands.size()){
                Hand handToTest = sortedHands.get(i);
                if(h.isStronger(handToTest) == 1){
                    i += 1;
                } else{
                    positionToInsert = i;
                }
                
            }
            sortedHands.add(positionToInsert, h);
            */

            /*
            for(Hand ha: sortedHands){
                if(h.isStronger(ha) == 1){
                    i += 1;
            }

            sortedHands.add(i, h);
            }
            */

            /*
            for(Hand ha: sortedHands){
                if(h.isStronger(ha) == 1){
                    i += 1;
                } else{
                    if(h.isStronger(ha) == 0){

                    } else{
                        sortedHands.add(i, h);
                    }
                }
            }
            */

            /*
            while(i < sortedHands.size()){
                Hand handToTest = sortedHands.get(i);
                if(h.isStronger(handToTest) == 1){
                    i += 1;
                } else{
                    if(h.isStronger(handToTest) == 0){
                        i += 1;
                    } else{
                        positionToInsert = i;
                        i = sortedHands.size();
                    }
                }
            }
            */

            while(i < sortedHands.size()){
                Hand handToTest = sortedHands.get(i);
                if(h.isStronger(handToTest) == 1){
                    i += 1;
                } else{
                    positionToInsert = i;
                    i = sortedHands.size();
                }
            }

            /*
            if(positionToInsert != 0){
                sortedHands.add(positionToInsert-1, h);
            } else{
                sortedHands.add(positionToInsert, h);
            }
            */
            
            sortedHands.add(positionToInsert, h);
            
            if(!sortedHands.contains(h)){
                sortedHands.add(h);
            }
            
        }


        
        /*
        
        A lot of prints for testing, remove it later

        */
        
        /*
        for(Hand hand: handsToSort){
            System.out.println("Blep");
            System.out.println(hand.card1);
            System.out.println(hand.card2);
            System.out.println(hand.card3);
            System.out.println(hand.card4);
            System.out.println(hand.card5);
        }

        System.out.println("Blepcioczek");
        for(Hand hand: handsToSort){
            System.out.println(hand);
        }
        */

        //for(Hand hand: sortedHands){
         //   System.out.println(hand);
        //}

        System.out.println("");
        for(Hand hand: sortedHands){
            for(Card card: hand.cards){
                System.out.print(card.rank);
                System.out.print(card.suit);
                System.out.print(" ");
            }
            System.out.println("");
            for(String s: hand.values){
                System.out.println(s);
            }
        }

        for(Hand hand: sortedHands){
            String temp = "";
            for(Card card: hand.cards){
                temp += card.rank;
                temp += card.suit;
            }
            temp += " ";
            System.out.print(temp);
        }



        System.out.println(sortedHands.size());
        //System.out.println(sortedHands.get(3));

        return line;
    }

    static List<String> generateHandsTexas(List<String> inputHands, String board){

        return inputHands;
    }

    static List<String> generateHandsOmaha(List<String> inputHands, String board){

        return inputHands;
    }

    public static void main(String[] args) throws IOException {
        
        //System.out.println(process("texas-holdem 4cKs4h8s7s Ad4s Ac4d As9s KhKd 5d6d"));
        //System.out.println(process("texas-holdem 2h3h4h5d8d KdKs 9hJh"));
        //System.out.println(process("omaha-holdem 3d3s4d6hJc Js2dKd8c KsAsTcTs Jh2h3c9c Qc8dAd6c 7dQsAc5d"));

        /*
        System.out.println(process("five-card-draw 7h4s4h8c9h Tc5h6dAc5c Kd9sAs3cQs Ah9d6s2cKh 4c8h2h6c9c"));

        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println(process("five-card-draw 9h2c9c9dAs 2h2s4cTdQh AhKc5h2d8s 3dQsTs3h5s 4h6s7h6d7c"));

        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println(process("five-card-draw 9h2c9c9dAs 3dQsTs3h5s 2h2s4cTdQh AhKc5h2d8s 4h6s7h6d7c"));

        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println(process("five-card-draw 9h2c9c9dAs 3dQsTs3h5s 2h2s4cTdKh AhKc5h2d8s 4h6s7h6d7c"));
        
        
        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println(process("five-card-draw 7h4s4h8c9h Tc5h6dAc5c"));

        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println(process("five-card-draw Tc5h6dAc5c 7h4s4h8c9h"));

        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println(process("five-card-draw 4hTs7h6d7c 6h2c9c9dAs 3dQsTs3h5s 2h2s4cTdKh AhKc5h2d8s"));

        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println(process("five-card-draw 7hTs7h6d7c 6h2c9c9dAs 3dQs3s3h5s 2h2s4cTdKh AhKc5h2d8s"));

        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println(process("five-card-draw 7hTs7h6d7c 6h2c9c9dAs 3dQs3s3h5s 2h2s2cTdKh AhKc5h2d8s"));
        */

        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\solverInput.txt"));

        String input = filereader.readLine();
        while(input!=null){
            if(input.split(" ")[0].equals("five-card-draw")){
                System.out.println(process(input));
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
        Card card1 = new Card();
        Card card2 = new Card();
        Card card3 = new Card();
        Card card4 = new Card();
        Card card5 = new Card();

        List<Card> cards = new ArrayList<>();
        List<Integer> ranksOfRest = new ArrayList<>();

        List<String> values = new ArrayList<>();
        String highestValue = "High card";
        int highestValueInt = 0;
        int highestRankInTotal = 0;
        int highestRankInHighestValue = 0;
        int highestRankInSecondToBestValue = 0;
        int highestRankInRest = 0;


        Hand(){

        }

        Hand(String inputHand){
            String [] splitInputHand = inputHand.split("");
            card1 = new Card(splitInputHand[0], splitInputHand[1]);
            card2 = new Card(splitInputHand[2], splitInputHand[3]);
            card3 = new Card(splitInputHand[4], splitInputHand[5]);
            card4 = new Card(splitInputHand[6], splitInputHand[7]);
            card5 = new Card(splitInputHand[8], splitInputHand[9]);
        }

        void putCardsIntoList(){
            cards.add(card1);
            cards.add(card2);
            cards.add(card3);
            cards.add(card4);
            cards.add(card5);
        }

        void putRanksOfRestIntoList(){
            for(Card c: cards){
                if(c.rank != highestRankInHighestValue && c.rank != highestRankInSecondToBestValue){
                    ranksOfRest.add(c.rank);
                }
            }
            Collections.sort(ranksOfRest);
            Collections.reverse(ranksOfRest);
        }

        int countHighestRankInTotal(){
            for(Card c: cards){
                if(c.rank > highestRankInTotal){
                    highestRankInTotal = c.rank;
                }
            }

            return highestRankInTotal;
        }

        // method that builds values list and sets highest ranks to variables
        void findValues(){
            // straight
            if(isItStraight()){
                values.add("Straight");
                highestRankInHighestValue = countHighestRankInTotal();
            }
            // flush
            if(card1.suit.equals(card2.suit) 
               && card1.suit.equals(card3.suit)
               && card1.suit.equals(card4.suit)
               && card1.suit.equals(card5.suit)){
                if(values.contains("Straight")){
                    values.remove("Straight");
                    values.add("Straight Flush");
                } else{
                    values.add("Flush");
                }                
                highestRankInHighestValue = countHighestRankInTotal();
            }
            // four of a kind
            int temp = isItFourOfAKind();
            if(temp != -1){
                values.add("Four of a kind");
                highestRankInHighestValue = temp;
            } else{
                // three of a kind
                temp = isItThreeOfAKind();
                int temp2 = 0;
                if(temp != -1){
                    values.add("Three of a kind");
                    highestRankInHighestValue = temp;
                    // full house
                    temp2 = isItPairWithArgument(temp);
                    if(temp2 != -1){
                        values.remove("Three of a kind");
                        values.add("Full house");
                        highestRankInSecondToBestValue = temp2;
                    }
                } else{
                    // pair
                    temp = isItPair();
                    if(temp != -1){
                        temp2 = isItPairWithArgument(temp);
                        if(temp2 != -1){
                            values.add("Two pairs");
                            if(temp > temp2){
                                highestRankInHighestValue = temp;
                                highestRankInSecondToBestValue = temp2;
                            } else{
                                highestRankInHighestValue = temp2;
                                highestRankInSecondToBestValue = temp;
                            }
                        } else{
                            values.add("Pair");
                            highestRankInHighestValue = temp;
                        }
                    }
                }
                highestRankInRest = countHighestBesideValue(temp, temp2);
            }

            countHighestRankInTotal();

            if(values.size() == 0){
                values.add("High card");
            }

            if(highestRankInRest == 0){
                highestRankInRest = highestRankInTotal;
            }

            setHighestValue();
            countHighestRankInTotal();
            
        }

        void findValuesAlternative(){
            if(isItStraight()){
                values.add("Straight");
                highestRankInHighestValue = countHighestRankInTotal();
                for(Card c: cards){
                    ranksOfRest.add(c.rank);
                }
            }
            if(card1.suit == card2.suit && card1.suit == card3.suit  && card1.suit == card4.suit  && card1.suit == card5.suit){
                values.add("Flush");
                if(values.contains("Straight")){
                    values.add("Straight Flush");
                }
                highestRankInHighestValue = countHighestRankInTotal();
                for(Card c: cards){
                    ranksOfRest.add(c.rank);
                }
            }

            Card temp = isItFourOfAKindAlternative();
            if(temp == null){
                temp = isItThreeOfAKindAlternative();
                if(temp == null){
                    temp = isItPairAlternative();
                    if(temp == null){
                        if(values.size() == 0){
                            values.add("High card");
                            for(Card c: cards){
                                ranksOfRest.add(c.rank);
                            }
                        }
                        
                    } else{
                        values.add("Pair");
                        Card temp2 = isItPairWithArgumentAlternative(temp);
                        if(temp2 == null){
                            highestRankInHighestValue = temp.rank;
                            for(Card c: cards){
                                if(c.rank != temp.rank){
                                    ranksOfRest.add(c.rank);
                                }
                            }
                        } else{
                            if(temp.rank != temp2.rank){
                                values.add("Two pairs");
                                if(temp.rank > temp2.rank){
                                    highestRankInHighestValue = temp.rank;
                                    highestRankInSecondToBestValue = temp2.rank;
                                } else{
                                    highestRankInHighestValue = temp2.rank;
                                    highestRankInSecondToBestValue = temp.rank;
                                }
                                for(Card c: cards){
                                    if(c.rank != temp.rank && c.rank != temp2.rank){
                                        ranksOfRest.add(c.rank);
                                        highestRankInRest = c.rank;
                                    }
                                }
                            }
                        }
                    }
                } else{
                    values.add("Three of a kind");
                    Card temp2 = isItPairWithArgumentAlternative(temp);
                    if(temp2 == null){
                        for(Card card: cards){
                            if(card.rank != temp.rank){
                                if(highestRankInRest < card.rank){
                                    highestRankInRest = card.rank;
                                }                                
                                ranksOfRest.add(card.rank);
                            }
                        }
                    } else{
                        values.add("Full house");
                        highestRankInHighestValue = temp.rank;
                        highestRankInSecondToBestValue = temp2.rank;
                        for(Card card: cards){
                            if(card.rank != temp.rank && card.rank != temp2.rank){
                                highestRankInRest = card.rank;
                                ranksOfRest.add(card.rank);
                            }
                        }
                    }
                }
            } else{
                values.add("Four of a kind");
                highestRankInHighestValue = temp.rank;
                for(Card card: cards){
                    if(card.rank != temp.rank){
                        highestRankInRest = card.rank;
                        highestRankInSecondToBestValue = card.rank;
                        ranksOfRest.add(card.rank);
                    }
                }
            }

            Collections.sort(ranksOfRest);
            Collections.reverse(ranksOfRest);

        }

        Card isItFourOfAKindAlternative(){
            if(card1.rank == card2.rank){
                if(card1.rank == card3.rank && card1.rank == card4.rank
                   || card1.rank == card3.rank && card1.rank == card5.rank
                   || card1.rank == card4.rank && card1.rank == card5.rank){
                    return card1;
                }
            } else{
                if(card1.rank == card3.rank && card1.rank == card4.rank && card1.rank == card5.rank){
                    return card1;
                } else{
                    if(card2.rank == card3.rank && card2.rank == card4.rank && card2.rank == card5.rank){
                        return card2;
                    }
                }
            }
            return null;
        }

        Card isItThreeOfAKindAlternative(){
            // 1 and 2
            if(card1.rank == card2.rank){
                // 1 and 2 and (3 or 4 or 5)
                if(card1.rank == card3.rank
                   || card1.rank == card5.rank
                   || card1.rank == card4.rank){
                    return card1;
                }
            } else{
                // 1 and 3
                if(card1.rank == card3.rank){
                    // 1 and 3 and (4 or 5)
                    if(card1.rank == card4.rank || card1.rank == card5.rank){
                        return card1;
                    }
                } else{
                    // 1 and 4 and 5
                    if(card1.rank == card4.rank && card1.rank == card5.rank){
                        return card1;
                    } else{
                        // 2 and 3
                        if(card2.rank == card3.rank){
                            // 2 and 3 and (4 or 5)
                            if(card2.rank == card4.rank || card2.rank == card5.rank){
                                return card2;
                            } else{
                                // 2 and 4 and 5
                                if(card2.rank == card4.rank && card2.rank == card5.rank){
                                    return card2;
                                } else{
                                    // 3 and 4 and 5
                                    if(card3.rank == card4.rank && card3.rank == card5.rank){
                                        return card3;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return null;
        }

        Card isItPairWithArgumentAlternative(Card cardToTest){
            List<Card> cardsToTest = new ArrayList<>();
            for(Card c: cards){
                if(c.rank != cardToTest.rank){
                    cardsToTest.add(c);
                }
            }
            if(cardsToTest.size() == 2){
                if(cardsToTest.get(0).rank == cardsToTest.get(1).rank){
                    return cardsToTest.get(0);
                }
            } else{
                if(cardsToTest.size() == 3){
                    if(cardsToTest.get(0).rank == cardsToTest.get(1).rank || cardsToTest.get(0).rank == cardsToTest.get(2).rank){
                        return cardsToTest.get(0);
                    } else{
                        if(cardsToTest.get(1).rank == cardsToTest.get(2).rank){
                            return cardsToTest.get(1);
                        }
                    }
                }
            }
            return null;
        }

        Card isItPairAlternative(){
            if(card1.rank == card2.rank || card1.rank == card3.rank || card1.rank == card4.rank || card1.rank == card5.rank){
                return card1;
            } else{
                if(card2.rank == card3.rank || card2.rank == card4.rank || card2.rank == card5.rank){
                    return card2;
                } else{
                    if(card3.rank == card4.rank || card3.rank == card5.rank){
                        return card3;
                    } else{
                        if(card4.rank == card5.rank){
                            return card4;
                        }
                    }
                }
            }
            return null;
        }

        void setHighestValue(){
            if(values.contains("Pair")){
                highestValue = "Pair";
                highestValueInt = 1;
            }
            if(values.contains("Two pairs")){
                highestValue = "Two pairs";
                highestValueInt = 2;
            }
            if(values.contains("Three of a kind")){
                highestValue = "Three of a kind";
                highestValueInt = 3;
            }
            if(values.contains("Straight")){
                highestValue = "Straight";
                highestValueInt = 4;
            }
            if(values.contains("Flush")){
                highestValue = "Flush";
                highestValueInt = 5;
            }
            if(values.contains("Full house")){
                highestValue = "Full house";
                highestValueInt = 6;
            }
            if(values.contains("Four of a kind")){
                highestValue = "Four of a kind";
                highestValueInt = 7;
            }
            if(values.contains("Straight Flush")){
                highestValue = "Straight Flush";
                highestValueInt = 8;
            }
        }

        Boolean isItStraight(){
            List<Integer> ranks = new ArrayList<>();
            ranks.add(card1.rank);
            ranks.add(card2.rank);
            ranks.add(card3.rank);
            ranks.add(card4.rank);
            ranks.add(card5.rank);

            Collections.sort(ranks);

            int counter = 0;
            for(int i = 0; i < ranks.size()-1; i++){
                if(ranks.get(i) + 1 == ranks.get(i+1)){
                    counter += 1;
                }
            }

            if(counter == 4){
                return true;
            } else{
                if(ranks.get(0) == 2){
                    if(ranks.get(1) == 11 && ranks.get(2) == 12 && ranks.get(3) == 13 && ranks.get(4) == 14
                       || ranks.get(1) == 3 && ranks.get(2) == 12 && ranks.get(3) == 13 && ranks.get(4) == 14
                       || ranks.get(1) == 3 && ranks.get(2) == 4 && ranks.get(3) == 13 && ranks.get(4) == 14
                       || ranks.get(1) == 3 && ranks.get(2) == 4 && ranks.get(3) == 5 && ranks.get(4) == 14){
                        return true;
                    }
                }
            }

            return false;
        }

        int isItFourOfAKind(){
            if(card1.rank == card2.rank){
                if(card1.rank == card3.rank && card1.rank == card4.rank
                   || card1.rank == card3.rank && card1.rank == card5.rank
                   || card1.rank == card4.rank && card1.rank == card5.rank){
                    return card1.rank;
                }
            } else{
                if(card1.rank == card3.rank && card1.rank == card4.rank && card1.rank == card5.rank){
                    return card1.rank;
                }
                if(card2.rank == card3.rank && card2.rank == card4.rank && card2.rank == card5.rank){
                    return card2.rank;
                }
            }
            return -1;
        }

        int isItThreeOfAKind(){
            if(card1.rank == card2.rank){
                if(card1.rank == card3.rank || card1.rank == card4.rank || card1.rank == card5.rank){
                    return card1.rank;
                }
            } else{
                if(card1.rank == card3.rank){
                    if(card1.rank == card4.rank || card1.rank == card5.rank){
                        return card1.rank;
                    }
                } else{
                    if(card1.rank == card4.rank && card1.rank == card5.rank){
                        return card1.rank;
                    }
                }
            }
            return -1;
        }

        // this method checks whether there is a pair different that the pair that has already been found
        int isItPairWithArgument(int arg){
            if(card1.rank == arg){
                if(card2.rank == arg){
                    if(card3.rank == arg){
                        if(card4.rank != arg && card4.rank == card5.rank){
                            return card4.rank;
                        }
                    } else{
                        if(card3.rank == card4.rank || card3.rank == card5.rank){
                            return card3.rank;
                        }
                    }
                } else{
                    if(card2.rank == card3.rank || card2.rank == card4.rank || card2.rank == card5.rank){
                        return card2.rank;
                    }
                }
            } else{
                if(card1.rank == card2.rank || card1.rank == card3.rank || card1.rank == card4.rank || card1.rank == card5.rank){
                    return card1.rank;
                }
            }
            return -1;
        }

        int isItPair(){
            if(card1.rank == card2.rank || card1.rank == card3.rank || card1.rank == card4.rank || card1.rank == card5.rank){
                return card1.rank;
            } else{
                if(card2.rank == card3.rank || card2.rank == card4.rank || card2.rank == card5.rank){
                    return card2.rank;
                } else{
                    if(card3.rank == card4.rank || card3.rank == card5.rank){
                        return card3.rank;
                    } else{
                        if(card4.rank == card5.rank){
                            return card4.rank;
                        } 
                    }
                }
            }
            return -1;
        }

        // find higher rank from cards that are not in any value
        int countHighestBesideValue(int rankFromValue1, int rankFromValue2){
            if(values.contains("Four of a kind")){
                for(Card c: cards){
                    if(c.rank != highestRankInHighestValue){
                        return c.rank;
                    }
                }
            }
            if(values.contains("Three of a kind") || values.contains("Pair")){
                int max = 0;
                for(Card c: cards){
                    if(c.rank != highestRankInHighestValue && c.rank > max){
                        max = c.rank;
                    }
                }
                return max;
            }
            if(values.contains("Two pairs")){
                for(Card c: cards){
                    if(c.rank != rankFromValue1 && c.rank != rankFromValue2){
                        return c.rank;
                    }
                }
            }
            if(values.contains("High card")){
                return highestRankInTotal;
            }
            return -1;
        }

        int isStronger(Hand otherHand){
            if(highestValue.equals(otherHand.highestValue)){
                switch (highestValue){
                    case "Straight Flush":{
                        if(highestRankInTotal > otherHand.highestRankInTotal){
                            return 1;
                        } else{
                            if(highestRankInTotal == otherHand.highestRankInTotal){
                                return 0;
                            } else{
                                return -1;
                            }
                        }
                    }
                    case "Four of a kind":{
                        if(highestRankInHighestValue == otherHand.highestRankInHighestValue){
                            if(highestRankInRest > otherHand.highestRankInSecondToBestValue){
                                return 1;
                            } else{
                                if(highestRankInRest == otherHand.highestRankInSecondToBestValue){
                                    return 0;
                                } else{
                                    return -1;
                                }
                            }
                        } else{
                            if(highestRankInHighestValue > otherHand.highestRankInHighestValue){
                                return 1;
                            } else{
                                return -1;
                            }
                        }
                    }
                    case "Full house":{
                        if(highestRankInHighestValue > otherHand.highestRankInHighestValue){
                            return 1;
                        } else{
                            if(highestRankInHighestValue < otherHand.highestRankInHighestValue){
                                return -1;
                            } else{
                                if(highestRankInSecondToBestValue > otherHand.highestRankInSecondToBestValue){
                                    return 1;
                                } else{
                                    if(highestRankInSecondToBestValue == otherHand.highestRankInSecondToBestValue){
                                        return 0;
                                    } else{ 
                                        return -1;
                                    }
                                }
                            }
                        }
                    }
                    case "Flush":{
                        if(highestRankInTotal > otherHand.highestRankInTotal){
                            return 1;
                        } else{
                            if(highestRankInTotal == otherHand.highestRankInTotal){
                                return 0;
                            } else{
                                return -1;
                            }
                        }
                    }
                    case "Straight":{
                        if(highestRankInTotal > otherHand.highestRankInTotal){
                            return 1;
                        } else{
                            if(highestRankInTotal == otherHand.highestRankInTotal){
                                return 0;
                            } else{
                                return -1;
                            }
                        }
                    }
                    case "Three of a kind":{
                        if(highestRankInHighestValue> otherHand.highestRankInHighestValue){
                            return 1;
                        } else{
                            if(highestRankInHighestValue == otherHand.highestRankInHighestValue){
                                
                                int i = 0;
                                while(i<ranksOfRest.size()){
                                    if(ranksOfRest.get(i) > otherHand.ranksOfRest.get(i)){
                                        return 1;
                                    } else{
                                        if(ranksOfRest.get(i) < otherHand.ranksOfRest.get(i)){
                                            return -1;
                                        } else{
                                            i += 1;
                                        }
                                    }
                                }
                                return 0;
                            } else{
                                return -1;
                            }
                        }
                    }
                    case "Two pairs":{
                        if(highestRankInTotal > otherHand.highestRankInTotal){
                            return 1;
                        } else{
                            if(highestRankInTotal == otherHand.highestRankInTotal){
                                return 0;
                            } else{
                                return -1;
                            }
                        }
                    }
                    case "Pair":{
                        System.out.println();
                        if(highestRankInHighestValue> otherHand.highestRankInHighestValue){
                            return 1;
                        } else{
                            if(highestRankInHighestValue == otherHand.highestRankInHighestValue){
                                int i = 0;
                                System.out.println("**********");
                                for(int r: ranksOfRest){
                                    System.out.print(r);
                                    System.out.print(" ");
                                }
                                System.out.println("**********");
                                System.out.println("**********");
                                for(int r: otherHand.ranksOfRest){
                                    System.out.print(r);
                                    System.out.print(" ");
                                }
                                System.out.println("**********");
                                while(i<ranksOfRest.size()){
                                    if(ranksOfRest.get(i) > otherHand.ranksOfRest.get(i)){
                                        return 1;
                                    } else{
                                        if(ranksOfRest.get(i) < otherHand.ranksOfRest.get(i)){
                                            return -1;
                                        } else{
                                            i += 1;
                                        }
                                    }
                                }
                                return 0;
                            } else{
                                return -1;
                            }
                        }
                    }
                    case "High card":{
                        int i = 0;
                        while(i<ranksOfRest.size()){
                            if(ranksOfRest.get(i) > otherHand.ranksOfRest.get(i)){
                                return 1;
                            } else{
                                if(ranksOfRest.get(i) < otherHand.ranksOfRest.get(i)){
                                    return -1;
                                } else{
                                    i += 1;
                                }
                            }
                        }
                        return 0;
                    }
                }
            } else{
                if(highestValueInt > otherHand.highestValueInt){
                    return 1;
                } else{
                    if(highestValueInt == otherHand.highestValueInt){
                        return 0;
                    } else{
                        return -1;
                    }
                }
            }
            return -1;
        }

        Boolean isStrongerAlternative(Hand otherHand){
            if(highestValueInt > otherHand.highestValueInt){
                return true;
            } else{
                if(highestValueInt < otherHand.highestValueInt){
                    return false;
                } else{
                    switch (highestValueInt){
                        // high card
                        case 0:{
                            for(int i = 0; i < ranksOfRest.size(); i++){
                                if(ranksOfRest.get(i) > otherHand.ranksOfRest.get(i)){
                                    return true;
                                } else{
                                    if(ranksOfRest.get(i) > otherHand.ranksOfRest.get(i)){
                                        return false;
                                    }
                                }
                            }
                        } break;
                        // pair
                        case 1:{
                            if(highestRankInHighestValue > otherHand.highestRankInHighestValue){
                                return true;
                            } else{
                                if(highestRankInHighestValue < otherHand.highestRankInHighestValue){
                                    return false;
                                } else{
                                    for(int i = 0; i < ranksOfRest.size(); i++){
                                        if(ranksOfRest.get(i) > otherHand.ranksOfRest.get(i)){
                                            return true;
                                        } else{
                                            if(ranksOfRest.get(i) > otherHand.ranksOfRest.get(i)){
                                                return false;
                                            }
                                        }
                                    }
                                }
                            }
                            
                        } break;
                        // two pairs
                        case 2:{
                            if(highestRankInHighestValue > otherHand.highestRankInHighestValue){
                                return true;
                            } else{
                                if(highestRankInHighestValue < otherHand.highestRankInHighestValue){
                                    return false;
                                } else{
                                    if(highestRankInSecondToBestValue > otherHand.highestRankInSecondToBestValue){
                                        return true;
                                    } else{
                                        if(highestRankInSecondToBestValue < otherHand.highestRankInSecondToBestValue){
                                            return false;
                                        } else{
                                            if(highestRankInRest > otherHand.highestRankInRest){
                                                return true;
                                            } else{
                                                 return false;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        // three of a kind
                        case 3:{
                            if(highestRankInHighestValue > otherHand.highestRankInHighestValue){
                                return true;
                            } else{
                                if(highestRankInHighestValue < otherHand.highestRankInHighestValue){
                                    return false;
                                } else{
                                    for(int i = 0; i < ranksOfRest.size(); i++){
                                        if(ranksOfRest.get(i) > otherHand.ranksOfRest.get(i)){
                                            return true;
                                        } else{
                                            if(ranksOfRest.get(i) > otherHand.ranksOfRest.get(i)){
                                                return false;
                                            }
                                        }
                                    }
                                }
                            }
                            
                        } break;
                        // straight
                        case 4:{
                            for(int i = 0; i < ranksOfRest.size(); i++){
                                if(ranksOfRest.get(i) > otherHand.ranksOfRest.get(i)){
                                    return true;
                                } else{
                                    if(ranksOfRest.get(i) > otherHand.ranksOfRest.get(i)){
                                        return false;
                                    }
                                }
                            }
                        } break;
                        // flush
                        case 5:{
                            for(int i = 0; i < ranksOfRest.size(); i++){
                                if(ranksOfRest.get(i) > otherHand.ranksOfRest.get(i)){
                                    return true;
                                } else{
                                    if(ranksOfRest.get(i) > otherHand.ranksOfRest.get(i)){
                                        return false;
                                    }
                                }
                            }
                        } break;
                        // full house
                        case 6:{
                            if(highestRankInHighestValue > otherHand.highestRankInHighestValue){
                                return true;
                            } else{
                                if(highestRankInHighestValue < otherHand.highestRankInHighestValue){
                                    return false;
                                } else{
                                    if(highestRankInSecondToBestValue > otherHand.highestRankInSecondToBestValue){
                                        return true;
                                    } else{
                                        return false;
                                    }
                                }
                            }
                        }
                        // four of a kind
                        case 7:{
                            if(highestRankInHighestValue > otherHand.highestRankInHighestValue){
                                return true;
                            } else{
                                if(highestRankInHighestValue < otherHand.highestRankInHighestValue){
                                    return false;
                                } else{
                                    if(highestRankInRest > otherHand.highestRankInRest){
                                        return true;
                                    } else{
                                        return false;
                                    }
                                }
                            }
                        }
                        // straight flush
                        case 8:{
                            for(int i = 0; i < ranksOfRest.size(); i++){
                                if(ranksOfRest.get(i) > otherHand.ranksOfRest.get(i)){
                                    return true;
                                } else{
                                    if(ranksOfRest.get(i) > otherHand.ranksOfRest.get(i)){
                                        return false;
                                    }
                                }
                            }
                        } break;
                    }
                }
            }
            return false;
        }

        @Override
        public String toString() {
            return "Hand [card1=" + card1 + ", card2=" + card2 + ", card3=" + card3 + ", card4=" + card4 + ", card5="
                    + card5 + "]";
        }
    }
}
