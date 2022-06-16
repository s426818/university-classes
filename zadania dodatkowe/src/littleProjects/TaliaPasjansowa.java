package littleProjects;

import java.util.Iterator;

public class TaliaPasjansowa extends zbiorKart<Karta> {
    
    Karta returnOneCard(){
        Iterator<Karta> it = iterator();
        if(it.hasNext()){
            return it.next();
        } else{
            return null;
        }
    }

    Hand<Karta> returnThreeCards(){
        Iterator<Karta> it = iterator();
        //tu trzeba zmienić na rękę, ale nie ma jeszcze tej klasy
        Hand<Karta> list = new Hand<>();
        if(it.hasNext()){
            for(int i = 0; i < 3; i++){
                if(it.hasNext()){
                    list.add(it.next());
                }
            }
            return list;
        } else{
            return null;
        }
    }
    public TaliaPasjansowa(){

    }
}
