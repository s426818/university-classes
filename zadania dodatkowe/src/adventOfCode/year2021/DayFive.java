package adventOfCode.year2021;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DayFive {

    private static int [][] zaznaczLinięSX(int i, int j, int k, int [][] tablica){
        //System.out.println(j);
        //System.out.println(k);
        for(int l = j; l <= k; l++){
            tablica[i][l] += 1;
        }
        return tablica;
    }

    private static int [][] zaznaczLinię(int i, int j, int k, int [][] tablica){
        //System.out.println(j);
        //System.out.println(k);
        for(int l = j; l <= k; l++){
            tablica[i][l] += 1;
        }
        return tablica;
    }

    private static int [][] zaznaczLinięSY(int i, int j, int k, int [][] tablica){
        //System.out.println(j);
        //System.out.println(k);
        for(int l = j; l <= k; l++){
            tablica[l][i] += 1;
        }
        return tablica;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2021\\input5.txt"));
        List<Integer[]> lista = new ArrayList<>();

        int [][] tablicaZaznaczonychLinii = new int [1000][1000];

        for(int i = 0; i < 1000; i++){
            for(int j = 0; j < 1000; j++){
                tablicaZaznaczonychLinii[i][j] = 0;
            }
        }

        String line = filereader.readLine();
        while(line!=null){
            String [] linijka = line.split(" -> ");
            String [] wspolrzedneStartoweString = linijka[0].split(",");
            String [] wspolrzedneKoncoweString = linijka[1].split(",");
            int [] wspolrzedneStartoweInt = {Integer.parseInt(wspolrzedneStartoweString[0]), Integer.parseInt(wspolrzedneStartoweString[1])};
            int [] wspolrzedneKoncoweInt = {Integer.parseInt(wspolrzedneKoncoweString[0]), Integer.parseInt(wspolrzedneKoncoweString[1])};
            Integer[] wspolrzedneX1Y1X2Y2 = {wspolrzedneStartoweInt[0], wspolrzedneStartoweInt[1], wspolrzedneKoncoweInt[0], wspolrzedneKoncoweInt[1]};
            if(wspolrzedneX1Y1X2Y2[0] == wspolrzedneX1Y1X2Y2[2] || wspolrzedneX1Y1X2Y2[1] == wspolrzedneX1Y1X2Y2[3]){
                lista.add(wspolrzedneX1Y1X2Y2);
                /*
                for(int i = 0; i < wspolrzedneX1Y1X2Y2.length; i++){
                    System.out.print(wspolrzedneX1Y1X2Y2[i]);
                }
                System.out.println("");
                */
            }
            line = filereader.readLine();
        }

        for(Integer [] tablicaWspolrzednych : lista){
            if(tablicaWspolrzednych[0] == tablicaWspolrzednych[2]){
                if(tablicaWspolrzednych[1] > tablicaWspolrzednych[3]){
                   tablicaZaznaczonychLinii = zaznaczLinięSX(tablicaWspolrzednych[0], tablicaWspolrzednych[3], tablicaWspolrzednych[1], tablicaZaznaczonychLinii);
                } else{
                    tablicaZaznaczonychLinii = zaznaczLinięSX(tablicaWspolrzednych[0], tablicaWspolrzednych[1], tablicaWspolrzednych[3], tablicaZaznaczonychLinii);
                }
            } else{
                if(tablicaWspolrzednych[0] > tablicaWspolrzednych[2]){
                    tablicaZaznaczonychLinii = zaznaczLinięSY(tablicaWspolrzednych[1], tablicaWspolrzednych[2], tablicaWspolrzednych[0], tablicaZaznaczonychLinii);
                } else{
                    tablicaZaznaczonychLinii = zaznaczLinięSY(tablicaWspolrzednych[1], tablicaWspolrzednych[0], tablicaWspolrzednych[2], tablicaZaznaczonychLinii);
                }
            }
        }

        int ileLiniiZachodzi = 0;
        for(int i = 0; i < 1000; i++){
            int licznik = 0;
            for(int j = 0; j < 1000; j++){
                //System.out.print(tablicaZaznaczonychLinii[i][j]);
                if(tablicaZaznaczonychLinii[i][j] > 1){
                    System.out.print(tablicaZaznaczonychLinii[i][j]);
                    licznik += 1;
                    ileLiniiZachodzi += 1;
                }
            }
            if(licznik > 0){
                System.out.println("");
            }
            licznik = 0;
        }

        /*
        Za mało wyszło?
        */
        System.out.println(ileLiniiZachodzi);

        filereader.close();
    }
}
