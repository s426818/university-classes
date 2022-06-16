package littleProjects;

public class Kolumna<T extends Karta> extends Pole {

    Kolumna<Karta> getVisibleCards(){
        Kolumna<Karta> cards = new Kolumna<>();
        var it = iterator();
        while(it.hasNext()){
            Karta card = it.next();
            if(card.getVisible()){
                cards.add(card);
            }
        }
        return cards;
    }

    public Kolumna(){
        
    }

    
    
    /*
    private ArrayList<Karta> listOfCards = new ArrayList<>();

    public Kolumna(ArrayList<Karta> listOfCards){
        this.listOfCards = listOfCards;
    }

    ArrayList<Karta> returnListOfCards(){
        return listOfCards;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((listOfCards == null) ? 0 : listOfCards.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Kolumna other = (Kolumna) obj;
        if (listOfCards == null) {
            if (other.listOfCards != null)
                return false;
        } else if (!listOfCards.equals(other.listOfCards))
            return false;
        return true;
    }
    */

    

}
