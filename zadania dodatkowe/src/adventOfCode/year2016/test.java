package adventOfCode.year2016;

import java.util.ArrayList;

public class test {
 
    public static void main(String[] args) {
        char c = 48;
        int a = 'a';
        System.out.println(c);    
        System.out.println(a);    
        ArrayList<String> lista = new ArrayList<>();
        lista.add("kotek");
        lista.add("płotek");
        lista.add("tupcik");

        lista.add(1, "pupcik");

        for(String s: lista){
            System.out.println(s);
        }

        System.out.println("kotek".substring(0, 3));

        String kotek = "kotek";
        String motek = kotek;

        System.out.println(kotek);
        System.out.println(motek);

        kotek = kotek + " pupcik";

        System.out.println(kotek);
        System.out.println(motek);

        System.out.println(5/2);
    }

}
