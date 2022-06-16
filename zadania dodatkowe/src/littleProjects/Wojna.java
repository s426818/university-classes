package littleProjects;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Wojna {

    void whoWonThisTime(){
        if(gracz1.get(0).getNumericValue() > gracz2.get(0).getNumericValue()){
            System.out.print(gracz1.get(0).getValue());
            System.out.print(" > ");
            System.out.print(gracz2.get(0).getValue());
            System.out.print("\n");
            gracz1.add(gracz1.get(0));
            gracz1.add(gracz2.get(0));
            gracz1.remove(0);
            gracz2.remove(0);
        } else{
            if(gracz1.get(0).getNumericValue() < gracz2.get(0).getNumericValue()){
                System.out.print(gracz1.get(0).getValue());
                System.out.print(" < ");
                System.out.print(gracz2.get(0).getValue());
                System.out.print("\n");
                gracz2.add(gracz1.get(0));
                gracz2.add(gracz2.get(0));
                gracz1.remove(0);
                gracz2.remove(0);
            } else{
                System.out.print(gracz1.get(0).getValue());
                System.out.print(" = ");
                System.out.print(gracz2.get(0).getValue());
                System.out.print("\n");
                stos.add(gracz1.get(0));
                stos.add(gracz2.get(0));
                gracz1.remove(0);
                gracz2.remove(0);
            }
        }
    }
    
    public static void main(String[] args) {
        
        Hand<Karta> g1 = new Hand<>();
        Hand<Karta> g2 = new Hand<>();
        Wojna gra = new Wojna(g1, g2);
        Pasjans pasjans = new Pasjans();
        Set<String> kolory = new HashSet<>();
        kolory = pasjans.fillInColors(kolory);
        Set<Karta> karty = new HashSet<>();
        karty = pasjans.fillInCardsCollectionOfTypeCard(karty, 14, kolory);
        
        Iterator<Karta> it = karty.iterator();

        TaliaPasjansowa talia = new TaliaPasjansowa();
        while(it.hasNext()){
            talia.add(it.next());
        }

        Collections.shuffle(talia);

        Iterator<Karta> itk = talia.iterator();
        while(itk.hasNext()){
            gra.gracz1.add(itk.next());
            gra.gracz2.add(itk.next());
        }

        while(!gra.isFinished){
            
            for(int i = 0; i<25; i++){
                gra.whoWonThisTime();
            }
            gra.isFinished = true;
            
        }
    }

    private Boolean isFinished = false;
    private Hand<Karta> gracz1 = new Hand<>();
    private Hand<Karta> gracz2 = new Hand<>();
    private Hand<Karta> stos = new Hand<>();

    public Wojna(Hand<Karta> g1, Hand<Karta> g2){
        this.gracz1 = g1;
        this.gracz2 = g2;
    }

    public Boolean getIsFinished() {
        return isFinished;
    }
    public void setIsFinished(Boolean isFinished) {
        this.isFinished = isFinished;
    }
    public Hand<Karta> getGracz1() {
        return gracz1;
    }
    public void setGracz1(Hand<Karta> gracz1) {
        this.gracz1 = gracz1;
    }
    public Hand<Karta> getGracz2() {
        return gracz2;
    }
    public void setGracz2(Hand<Karta> gracz2) {
        this.gracz2 = gracz2;
    }

    public Hand<Karta> getStos() {
        return stos;
    }

    public void setStos(Hand<Karta> stos) {
        this.stos = stos;
    }
}
