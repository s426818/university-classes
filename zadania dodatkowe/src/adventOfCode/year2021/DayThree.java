package adventOfCode.year2021;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class DayThree {
    
    private static int binaryToInt(long number){
        int temp = 0;
        int k = 1;
        while(number > 0){
            temp += (number%10) * k;
            number = number/10;
            k *= 2;
        }
        return temp;
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedReader filereader = null;
        int [] arrayOf1 = new int [12];
        int [] arrayOf0 = new int [12];
        long gammaRate = 0;
        long epsilonRate = 0;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2021\\input3.txt"));
        String line = filereader.readLine();
        
        while(line!=null){
            for(int i = 0; i<line.length(); i++){
                if(line.charAt(i)=='1'){
                    arrayOf1[i] += 1;
                } else{
                    arrayOf0[i] +=1;
                }
            }
            line = filereader.readLine();
        }
        for(int i = 0; i<12; i++){
            if(arrayOf0[i]<arrayOf1[i]){
                int j = 11-i;
                gammaRate += 1 * Math.pow(10, j);
            }
            if(arrayOf0[i]>arrayOf1[i]){
                int j = 11-i;
                epsilonRate += 1 * Math.pow(10, j);
            }
        }
        System.out.println(gammaRate);
        System.out.println(epsilonRate);
        int gammaRateInt = binaryToInt(gammaRate);
        int epsilonRateInt = binaryToInt(epsilonRate);
        System.out.println(gammaRateInt);
        System.out.println(epsilonRateInt);
        System.out.println(gammaRateInt*epsilonRateInt);
        
        List<String> oxygen = new ArrayList<>();
        List<String> co2 = new ArrayList<>();
        int numebrOf1 = 0;
        while(line!=null){
            oxygen.add(line);
            co2.add(line);
            if(line.charAt(0)=='1'){
                numebrOf1 += 1;
            }
            line = filereader.readLine();
        }
        if(numebrOf1 > 499){
            for(Iterator<String> temp = oxygen.iterator(); temp.hasNext();){
                String next = temp.next();
                if(next.charAt(0)=='0'){
                    temp.remove();
                }
            }
        } else {
            for(Iterator<String> temp = oxygen.iterator(); temp.hasNext();){
                String next = temp.next();
                if(next.charAt(0)=='1'){
                    temp.remove();
                }
            }
        }
        //kopia dla co2
        if(numebrOf1 <= 499){
            for(Iterator<String> temp = co2.iterator(); temp.hasNext();){
                String next = temp.next();
                if(next.charAt(0)=='0'){
                    temp.remove();
                }
            }
        } else {
            for(Iterator<String> temp = co2.iterator(); temp.hasNext();){
                String next = temp.next();
                if(next.charAt(0)=='1'){
                    temp.remove();
                }
            }
        }
        numebrOf1 = 0;
        int l = 1;
        while(oxygen.size()>1){
            numebrOf1 = 0;
            int numberOf0 = 0;
            for(int i = 0; i < oxygen.size(); i++){
                if(oxygen.get(i).charAt(l)=='1'){
                    numebrOf1 += 1;
                } else{
                    numberOf0 += 1;
                }
            }
            if(numberOf0 > numebrOf1){
                for(Iterator<String> temp = oxygen.iterator(); temp.hasNext();){
                    String next = temp.next();
                    if(next.charAt(l)=='1'){
                        temp.remove();
                    }
                }
            } else{
                for(Iterator<String> temp = oxygen.iterator(); temp.hasNext();){
                    String next = temp.next();
                    if(next.charAt(l)=='0'){
                        temp.remove();
                    }
                }
            
            }
            l += 1;
        }

        //kopia dla co2
        l = 1;
        while(co2.size()>1){
            numebrOf1 = 0;
            int numberOf0 = 0;
            for(int i = 0; i < co2.size(); i++){
                if(co2.get(i).charAt(l)=='1'){
                    numebrOf1 += 1;
                } else{
                    numberOf0 += 1;
                }
            }
            if(numberOf0 <= numebrOf1){
                for(Iterator<String> temp = co2.iterator(); temp.hasNext();){
                    String next = temp.next();
                    if(next.charAt(l)=='1'){
                        temp.remove();
                    }
                }
            } else{
                for(Iterator<String> temp = co2.iterator(); temp.hasNext();){
                    String next = temp.next();
                    if(next.charAt(l)=='0'){
                        temp.remove();
                    }
                }
            
            }
            l += 1;
        }

        if(oxygen.isEmpty()){
            System.out.println("yes");
        } else{
            System.out.println(oxygen.get(0));
        }

        System.out.println(co2.get(0));

        

        long bup = Integer.parseInt(oxygen.get(0));
        long co2Long = Long.parseLong(co2.get(0));
        int co2Binary = binaryToInt(co2Long);
        System.out.println(co2Binary);

        int wynik = binaryToInt(bup);
        System.out.println(wynik);
        System.out.println(co2Binary*wynik);
        
        scanner.close();
        filereader.close();
    }
}
