package adventOfCode.year2015;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Day20 {

    private static ArrayList<Integer> dividers(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i < (n/2) + 1; i++){
            if(n%i == 0){
                list.add(i);
            }
        }
        return list;
    }

    private static int sumOfList(ArrayList<Integer> list){
        int sum = 0;
        for(int i : list){
            sum += i;
        }
        return sum;
    }

    private static int numberOfPresents(int n){
        int presents = n;
        for(int i = 1; i < (n/2) + 1; i++){
            if(n%i == 0){
                presents += i;
            }
        }
        return presents*10;
    }
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2015\\inputs\\input20.txt"));

        int number = Integer.parseInt(filereader.readLine()) / 10;
        filereader.close();

        List<Integer> list = dividers(number);
        /*
        for(int i : list){
            number -= i*10;
            System.out.println(number);
        }
        */

        /*
        int temp = number;
        int divider = 0;
        int j = 0;
        while(number > 0){
            temp = number;
            divider = 10*(list.get(j));
            number -= 10*(list.get(j));
            j += 1;
        }

        System.out.println(temp);
        System.out.println(divider);
        System.out.println(number);

        int n = 1;
        while(numberOfPresents(n) < number){
            n += 1;
        }
        */

        int n = 1;
        while(sumOfList(dividers(n)) < number){
            n += 1;
        }

        System.out.println(n);

    }
    
}
