package adventOfCode.year2021;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DayFour {

    public static int howManyMarked(ArrayList<Bingo> listOfBingos){
        int suma = 0;
        for(Bingo bingo : listOfBingos){
            if(bingo.isMarked==true){
                suma += 1;
            }
        }
        return suma;
    }

    public static Bingo returnUnmarkedBingo(ArrayList<Bingo> listOfBingos){
        Bingo bingo = new Bingo();
        for(Bingo bingos : listOfBingos){
            if(bingos.isMarked == false){
                bingo = bingos;
            }
        }
        return bingo;
    }
    

    public static void main(String[] args) throws IOException {

        ArrayList<Bingo> planszeBingo = new ArrayList<>();
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2021\\input4.txt"));
        
        ArrayList<ArrayList<Integer>> bingosWithNumber = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < 100; i++){
            ArrayList<Integer> lista = new ArrayList<>();
            bingosWithNumber.add(lista);
        }
        

        String line = filereader.readLine();
        String[] numeryStringi = line.split(",");
        int[] numery = new int[numeryStringi.length];
        int i = 0;
        for(String s : numeryStringi){
            numery[i] = Integer.parseInt(s);
            i += 1;
        }
        int a = 0;
        line = filereader.readLine();
        while(line!=null){
            if(!(line.length()>0)){
                line = filereader.readLine();
                continue;
                 //
            } else{
                //System.out.println(line);
                Bingo bingo = new Bingo();
                int l = 0;
                int[][] plansza = new int[5][5];
                int suma = 0;
                for(int k = 0; k < 5; k++){
                    String[] liniaStringi = line.split(" ");
                    List<String> listaStringiArray = new ArrayList<>();
                    for(int b = 0; b < liniaStringi.length; b++){
                        if(!liniaStringi[b].equals("")){
                            listaStringiArray.add(liniaStringi[b]);
                        }
                    }
                    
                    int[] liniaNumery = new int[listaStringiArray.size()];
                    i = 0;
                    for(String s : listaStringiArray){
                        /*
                        if(s.equals("")){
                            continue;
                        }
                        */
                        //System.out.println(bingosWithNumber.get(Integer.parseInt(s)));
                        bingosWithNumber.get(Integer.parseInt(s)).add(a);
                        //System.out.println(bingosWithNumber.get(Integer.parseInt(s)));
                        liniaNumery[i] = Integer.parseInt(s);
                        suma += liniaNumery[i];
                        i += 1;
                    }
                    
                    plansza[l] = liniaNumery;
                    l += 1;
                    line = filereader.readLine();
                }
                bingo.setPlansza(plansza);
                bingo.setSumaNieoznaczonych(suma);
                bingo.setStartingMark();
                planszeBingo.add(bingo);
                a += 1;
            }
            line = filereader.readLine();
            //System.out.println("Tup?");

         }

        /*

        for(int b = 0; b < bingosWithNumber.size(); b ++){
            System.out.println(bingosWithNumber.get(b));
        }
        
        */
        
        Boolean isFinished = false;
        
        /*
        int suma = 0;
        int licznik = 0;
        while(!isFinished){
            int aktualnyNumer = numery[licznik];
            for(int c = 0; c < bingosWithNumber.size(); c++){
                if(bingosWithNumber.get(aktualnyNumer).contains(c)){
                    Bingo aktualneBingo = planszeBingo.get(c);
                    int [] wspolrzedne = aktualneBingo.whichOneMark(aktualnyNumer);
                    if(aktualneBingo.isBoardMarked(wspolrzedne[0], wspolrzedne[1])){
                        System.out.println(aktualneBingo.sumaNieoznaczonych);
                        suma = aktualneBingo.sumaNieoznaczonych*aktualnyNumer;
                        System.out.println(suma);
                        isFinished = true;
                    };
                }
            }
            licznik += 1;
        }

        */

        int licznik = 0;
        Bingo bingo = new Bingo();
        while(!isFinished){
            int aktualnyNumer = numery[licznik];
            for(int c = 0; c < bingosWithNumber.size(); c++){
                if(bingosWithNumber.get(aktualnyNumer).contains(c)){
                    Bingo aktualneBingo = planszeBingo.get(c);
                    aktualneBingo.whichOneMark(aktualnyNumer);
                    if(howManyMarked(planszeBingo) == planszeBingo.size()){
                        bingo = aktualneBingo;
                        isFinished = true;
                        System.out.println(bingo.sumaNieoznaczonych * aktualnyNumer);
                        break;
                    }
                }
            }
            licznik += 1;
        }



        System.out.println("Koniec!");

        filereader.close();

    }

    static ArrayList<ArrayList<Integer>> newBingosWIthNumber(ArrayList<ArrayList<Integer>> oldBingosWithNumbers, int i){
        for(ArrayList<Integer> it : oldBingosWithNumbers){
            if(it.contains(i)){
                it.remove(i);
            }
        }
        return oldBingosWithNumbers;
    }

    private static class Bingo{

        int [][] plansza = new int[5][5];
        int [][] planszaZaznaczeń = new int[5][5];
        int sumaNieoznaczonych = 0;
        Boolean isMarked = false;


        public void setStartingMark(){
            for(int i = 0; i < 5; i++){
                for(int j = 9; j < 5; j++){
                    planszaZaznaczeń[i][j] = 0;
                }
            }
        }

        public void mark(int i, int j){
            planszaZaznaczeń[i][j] = 1;
        }

        public int [] whichOneMark(int a){
            int i = 0;
            int j = 0;
            while(plansza[i][j]!=a){
                //System.out.println(i);
                //System.out.println(j);
                if(j < 4){
                    j += 1;
                } else{
                    i += 1;
                    j = 0;
                }
            }

            mark(i, j);
            sumaNieoznaczonych -= plansza[i][j];
            int [] toReturn = new int[2];
            //System.out.println(i);
            //System.out.println(j);
            toReturn[0] = i;
            toReturn[1] = j;
            if(isBoardMarked(i, j)){
                isMarked = true;
            }
            
            return toReturn;
        }

        public Boolean isBoardMarked(int i, int j){
            int liczniki = 0;
            int licznikj = 0;
            for(int k = 0; k<5; k++){
                if(planszaZaznaczeń[i][k] == 1){
                    liczniki += 1;
                }
                if(planszaZaznaczeń[k][j] == 1){
                    licznikj += 1;
                }
            }

            if(liczniki == 5 || licznikj == 5){
                isMarked = true;
                return true;
            } else{
                return false;
            }
        }

        public void setPlansza(int[][] plansza) {
            this.plansza = plansza;
        }

        public void setSumaNieoznaczonych(int sumaNieoznaczonych) {
            this.sumaNieoznaczonych = sumaNieoznaczonych;
        }
    }
}
