package adventOfCode.year2021;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class DayOne {

    private int HowManyLinesInFile(Scanner scanner, BufferedReader filreader) throws IOException{
        //System.out.println("Podaj nazwę pliku: ");
        //String path = scanner.nextLine();
        int k = 0;
        try{
            filreader = new BufferedReader(new FileReader("src\\adventOfCode\\year2021\\input1.txt"));
            String line = filreader.readLine();
            
            while(line!=null){
                k += 1;
                line = filreader.readLine();
            }
            filreader.close();
            //System.out.println(k);
        } finally{
            if(filreader != null){
                filreader.close();
            }
        }
        return k;
    }

    //How many measurements are larger than the previous measurement?
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        DayOne program = new DayOne();
        /*
        String numberWord = scanner.nextLine();
        int number = Integer.parseInt(numberWord);
        numberWord = scanner.nextLine();
        int numberPrev = Integer.parseInt(numberWord);
        numberWord = scanner.nextLine(); 
        int l = 0;       
        if (numberPrev > number){
            l = 1;
        }
        while (!numberWord.equals("")){
            numberPrev = number;             
            number = Integer.parseInt(numberWord);          
            if(number > numberPrev){
                l += 1;
            }
            numberWord = scanner.nextLine();
        }
        System.out.println(l);
        */

        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2021\\input1.txt"));
        String linePrev = filereader.readLine();
        int numberLinePrev = Integer.parseInt(linePrev);
        String line = filereader.readLine();
        int numberLine = Integer.parseInt(line);
        int k = 0;
        if(numberLine>numberLinePrev){
            k = 1;
        }
        line = filereader.readLine();
        while(line!=null){
            numberLinePrev = numberLine;
            numberLine = Integer.parseInt(line);
            if(numberLine > numberLinePrev){
                k += 1;
            }
            line = filereader.readLine();
        }
        System.out.println(k);

        /*zadanie 2*/
        int linesInInput = program.HowManyLinesInFile(scanner, filereader);
        System.out.println(linesInInput);
        int [] arrayWithSums = new int [linesInInput];
        int licznik = linesInInput - 3;
        /*
        if(linesInInput%3==0){
            licznik = linesInInput-3;
        }
        if(linesInInput%3==1){
            licznik = linesInInput-4;
        }
        if(linesInInput%3==2){
            licznik = linesInInput-5;
        }
        */
        BufferedReader secondFileReader = new BufferedReader(new FileReader("src\\adventOfCode\\year2021\\input1.txt"));
        for(int i = 0; i<=licznik; i++){
            int m = Integer.parseInt(secondFileReader.readLine());
            arrayWithSums[i] += m;
            arrayWithSums[i+1] += m;
            arrayWithSums[i+2] += m;
        }
        int n = 0;
        for(int i = 0; i < licznik; i++){
            if(arrayWithSums[i]<arrayWithSums[i+1]){
                n += 1;
            }
        }
        System.out.println(n);

        secondFileReader.close();
        filereader.close();

    }
}
