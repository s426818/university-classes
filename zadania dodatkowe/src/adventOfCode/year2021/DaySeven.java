package adventOfCode.year2021;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DaySeven {

    private static double sumaKolejnychNLiczb(double liczba){
        double wynik = 0;
        for(double i = liczba; i > 0; i--){
            wynik += i;
        }
        return wynik;
    }

    public static void main(String[] args) throws IOException {        

        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2021\\input7.txt"));

        String input = filereader.readLine();
        String [] pozycje = input.split(",");
        int min = Integer.MAX_VALUE;

        /*
        for(String pozycjaDoKtorejSieOdnosimy : pozycje){
            int wynik = 0;
            for(String pozycjaAktualna : pozycje){
                wynik += Math.abs(Double.parseDouble(pozycjaAktualna) - Double.parseDouble(pozycjaDoKtorejSieOdnosimy));
                //System.out.println(Double.parseDouble(pozycjaAktualna) - Double.parseDouble(pozycjaDoKtorejSieOdnosimy));
            }
            //System.out.println(wynik);
            if(min > wynik){
                min = wynik;
            }
        }
        */

        for(String pozycjaDoKtorejSieOdnosimy : pozycje){
            int wynik = 0;
            
            for(String pozycjaAktualna : pozycje){
                double roznica = Math.abs(Double.parseDouble(pozycjaAktualna) - Double.parseDouble(pozycjaDoKtorejSieOdnosimy));
                wynik += sumaKolejnychNLiczb(roznica);
            }
            //System.out.println(wynik);
            if(min > wynik){
                min = wynik;
            }
        }

        System.out.println(min);

        filereader.close();
    }


    
}
