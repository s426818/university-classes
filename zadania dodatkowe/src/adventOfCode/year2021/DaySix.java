package adventOfCode.year2021;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class DaySix {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2021\\input6.txt"));

        String input = filereader.readLine();
        String [] liczbyString = input.split(",");

        /*
        
        ArrayList<Rybcia> listaRyb = new ArrayList<>();
        for(String liczba : liczbyString){
            Rybcia rybcia = new Rybcia(Integer.parseInt(liczba));
            listaRyb.add(rybcia);
        }

        for(int i = 0; i < 256; i++){

            int k = listaRyb.size();
            int l = 0;
            while(k > 0){
                Rybcia aktualnRybcia = listaRyb.get(l);
                listaRyb = aktualnRybcia.mijaDzien(listaRyb);
                k -= 1;
                l += 1;
            }

        }
        

        System.out.println(listaRyb.size());
        */

        /*
        ArrayList<RybciaMama> listaRyb = new ArrayList<>();
        for(String liczba : liczbyString){
            RybciaMama rybcia = new RybciaMama(Integer.parseInt(liczba));
            listaRyb.add(rybcia);
        }

        for(int i = 0; i < 256; i++){
            for(RybciaMama rybciaMama : listaRyb){
                rybciaMama.mijaDzienMamyRybci();
            }
        }

        int suma = 0;
        for(RybciaMama rybciaMama : listaRyb){
            System.out.println(rybciaMama.listaDzieci.size());
            suma += rybciaMama.listaDzieci.size();
        }
        System.out.println(suma + listaRyb.size());
        */

        ArrayList<RybciaPlus> listaSkrocona = new ArrayList<>();
        for(int i = 0; i < 9; i++){
            RybciaPlus nowaRybciaPlus = new RybciaPlus(i);
            listaSkrocona.add(nowaRybciaPlus);
        }

        for(String liczba : liczbyString){
            RybciaMama rybcia = new RybciaMama(Integer.parseInt(liczba));
            listaSkrocona.get(rybcia.licznik).ileTakichRybc += 1;
            listaSkrocona.get(rybcia.licznik).listaRybcMam.add(rybcia);
        }

        long suma = 0;
        for(int i = 0; i < 256; i++){
            listaSkrocona = mijaDzienRybciPlus(listaSkrocona);
        }
        for(RybciaPlus rybcia : listaSkrocona){
            suma += rybcia.ileTakichRybc;
        }
        System.out.println(suma);

        filereader.close();

    }

    private static class Rybcia {
        private int licznik = 0;

        public Rybcia(int licznik){
            this.setLicznik(licznik);
        }

        public Rybcia(){

        }
        

        private ArrayList<Rybcia> mijaDzien(ArrayList<Rybcia> lista){
            if(licznik == 0){
                Rybcia nowaRybcia = new Rybcia(8);
                lista.add(nowaRybcia);
                licznik = 6;
            } else{
                licznik -= 1;
            }
            return lista;
        }

        public void setLicznik(int licznik) {
            this.licznik = licznik;
        }

    }

    private static ArrayList<RybciaPlus> mijaDzienRybciPlus(ArrayList<RybciaPlus> listaRybc){
        long k = listaRybc.get(0).ileTakichRybc ;
        for(int i = 0; i < 8; i++){
            listaRybc.get(i).ileTakichRybc = listaRybc.get(i+1).ileTakichRybc;
            if(i == 6){
                listaRybc.get(i).ileTakichRybc += k;
            }
        }
        listaRybc.get(8).ileTakichRybc = k;
        return listaRybc;
    }

    private static class RybciaPlus{
        int licznik = 0;
        long ileTakichRybc = 0;
        ArrayList<RybciaMama> listaRybcMam = new ArrayList<>();

        public RybciaPlus(int licznik){
            this.licznik = licznik;
        }

    }

    private static class RybciaMama extends Rybcia{
        private int licznik = 0;
        private ArrayList<Rybcia> listaDzieci = new ArrayList<>();

        private RybciaMama(int licznik){
            this.licznik = licznik;
            /*
            Rybcia rybcia = new Rybcia(licznik);
            listaDzieci.add(rybcia);
            */
        }

        private void mijaDzienMamyRybci(){
            int k = listaDzieci.size();
            int l = 0;
            while(k > 0){
                Rybcia aktualnRybcia = listaDzieci.get(l);
                listaDzieci = aktualnRybcia.mijaDzien(listaDzieci);
                k -= 1;
                l += 1;
            }
            if(licznik == 0){
                Rybcia nowaRybcia = new Rybcia(8);
                listaDzieci.add(nowaRybcia);
                licznik = 6;
            } else{
                licznik -= 1;
            }
        }

        
    }

}
