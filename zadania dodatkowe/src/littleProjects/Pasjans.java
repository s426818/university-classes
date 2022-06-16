package littleProjects;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Pasjans extends ArrayList<zbiorKart<Karta>>{
    
    Set<Karta> fillInCardsCollectionOfTypeCard(Set<Karta> set, int number, Set<String> colors){
        List<String> figures = new ArrayList<>();
        if(number > 10){
            figures.add("A");
            figures.add("K");
            figures.add("D");
            figures.add("J");           
        }
        while(number > 10){
            for (String string : colors) {
                Karta card = new Karta(figures.get(14-number) + string, false, number, Integer.toString(number));
                set.add(card);
            }
            number -= 1;
        }

        while(number > 1){
            for (String string : colors) {
                Karta card = new Karta(Integer.toString(number) + string, false, number, Integer.toString(number));
                set.add(card);
            }
            number -= 1;
        }
        return set;
    }

    /*
    private Set<String> fillInCardsCollection(Set<String> set, int number, Set<String> colors){
        List<String> figures = new ArrayList<>();
        if(number > 10){
            figures.add("A");
            figures.add("K");
            figures.add("D");
            figures.add("J");           
        }
        while(number > 10){
            for (String string : colors) {
                set.add((figures.get(14-number)) + (string));
            }
            number -= 1;
        }

        while(number > 1){
            for (String string : colors) {
                set.add(Integer.toString(number) + (string));
            }
            number -= 1;
        }
        return set;
    }
    */

    Set<String> fillInColors(Set<String> set){
        set.add("Kier");
        set.add("Karo");
        set.add("Pik");
        set.add("Trefl");
        return set;
    }

    

    public static void main(String[] args) {

        Set<Karta> karty = new HashSet<>();
        Pasjans pasjans = new Pasjans();
        

        Set<String> colors = new HashSet<>();
        colors = pasjans.fillInColors(colors);
        karty = pasjans.fillInCardsCollectionOfTypeCard(karty, 14, colors);

        Iterator<Karta> it = karty.iterator();

        TaliaPasjansowa talia = new TaliaPasjansowa();
        while(it.hasNext()){
            talia.add(it.next());
        }


        for(int i = 0; i < 7; i++){
            Kolumna<Karta> kolumna = new Kolumna<>();
            pasjans.add(i, kolumna);
        }

        /*
        Iterator<Karta> iterator = talia.iterator();
        for(zbiorKart<Karta> k : pasjans){
            k.add(iterator.next());
        }
        */
        
        Iterator<Karta> iterator = talia.iterator();
        
        for(int i = 0; i < 7; i++){
            //Iterator<Karta> iterator = talia.iterator();
            Kolumna<Karta> aktualnaKolumna = (Kolumna<Karta>) pasjans.get(i);
            for(int j = i; j < 7; j++){
                Karta wybranaKarta = iterator.next();
                talia.remove(wybranaKarta);
                if(j == i){
                    wybranaKarta.setVisible(true);
                }
                wybranaKarta.setPosition(Integer.parseInt(Integer.toString(i) + Integer.toString(j)));
                aktualnaKolumna.add(wybranaKarta);
            }
        }
        

        for(int i = 0; i < 5; i++){
            Pole pole = new Pole();
            if(i == 4){
                pole = new PoleObokTalii();
            }
            pasjans.add(i, pole);
            
        }

        for(int i = 0; i < 7; i++){
            //Kolumna<Karta> k = (Kolumna<Karta>) pasjans.get(i);
            for(int j = i; j < 7; j++){
                if(pasjans.get(j).get(i).getVisible() == true){
                    System.out.print(pasjans.get(j).get(i).getValue());
                } else{
                    System.out.print("-");
                }
            }
            System.out.print("\n");
        }


        /*
        for (String string : cards) {
            System.out.println(string);
        }
        */

        /*
        Map<Integer, ArrayList<HashMap<String, Boolean>>> pasjans = new HashMap<>();
        Set<String> cardsOnBoard = new HashSet<>();
        Set<String> cardsLeft = new HashSet<>();
        List<HashMap<String, Boolean>> listOfColumns = new ArrayList<>();
        */

        /*
        for(int i = 7; i >= 1; i--){
            for(int j = 7; j >= i; j--){
                Iterator<String> it = cards.iterator();
                String card = it.next();
                cardsOnBoard.add(card);
                cards.remove(card);
                //pasjans.put(key, value)
            }
        }
        */

        /*

        //pasjansKarta - plansza pasjansa, czyli lista 7 kolumn pasjansa
        List<ArrayList<Karta>> pasjansKarta = new ArrayList<>();
        ArrayList<Karta> kolumna = new ArrayList<>();
        
        //plansza wypełniana jest 7 pustymi kolumnami - listami kart
        for(int i = 0; i < 7; i++){
            pasjansKarta.add(i, kolumna);
        }

        List<ArrayList<Karta>> colorSlots = new ArrayList<>();
        //to samo z miejscami na odkładanie kart
        for(int i = 0; i < 7; i++){
            colorSlots.add(i, kolumna);
        }

        Set<Karta> kartyNaPlanszy = new HashSet<>();
        Iterator<Karta> iterator = karty.iterator();
        for(int i = 0; i < 7; i++){
            Karta wybranaKarta = iterator.next();
            //pasjansKarta.add(i, wybranaKarta);
            //pasjansKarta.add(i, pasjansKarta.get(i).add(i, wybranaKarta););
            for(int j = i; j < 7; j++){

            }
        }

        */





    }

    //private Pasjans plansza = new ArrayList<>();

    /*
    public Pasjans(ArrayList<Kolumna> listOfColumns){
        this.plansza = listOfColumns;
    }
    */

    private Boolean isFinished = false;

    Boolean returnIsFinished(){
        return isFinished;
    }

    /*
    public Pasjans(ArrayList<Kolumna<Karta>> list){
        this = list;
    }
    */

}
