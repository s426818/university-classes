package littleProjects;

import java.util.Iterator;

public class Hand<T extends Karta> extends zbiorKart<Karta> {
    
    Karta returnOneCard(){
        Iterator<Karta> it = iterator();
        if(it.hasNext()){
            return it.next();
        } else{
            return null;
        }
    }

    public Hand(){

    }



}
