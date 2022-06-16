package littleProjects;

import java.util.HashSet;
import java.util.Iterator;

public class Talia<T extends Karta> extends HashSet<Karta> {
    

    Karta returnOneCard(){
        Iterator<Karta> it = iterator();
        return it.next();
    }

    Karta returnThreeCards(){
        Iterator<Karta> it = iterator();
        return it.next();
    }

}
