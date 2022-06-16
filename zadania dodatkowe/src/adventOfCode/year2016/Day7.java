package adventOfCode.year2016;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Day7 {

    private static Boolean isThereAbba(String s){
        String [] splitS = s.split("");
        for(int i = 0; i < splitS.length-3; i++){
            if(splitS[i].equals(splitS[i+3]) && splitS[i+1].equals(splitS[i+2]) && !splitS[i].equals(splitS[i+1])){
                return true;
            }
        }
        return false;
    }
    
    private static String [] splitLine(String line){
        String [] split = new String[3];
        String [] temp = line.split("");
        String s = "";
        int k = 0;
        while(!temp[k].equals("[")){
            s += temp[k];
            k += 1;
        }
        split[0] = s;
        s = "";
        k += 1;
        while(!temp[k].equals("]")){
            s += temp[k];
            k += 1;
        }
        split[1] = s;
        s = "";
        k += 1;
        while(k < temp.length){
            s += temp[k];
            k += 1;
        }
        split[2] = s;
        return split;
    }

    private static ArrayList<String> split(ArrayList<String> array, String line){
        if(line.length() == 0){
            return array;
        } else{
            if(line.charAt(0) == '['){
                String [] temp = line.split("");
                    int k = 1;
                    String s = "";
                    while(k < line.length() && line.charAt(k) != ']'){
                        s += temp[k];
                        k += 1;
                    }
                    array.add(s);
                    array = split(array, line.substring(k));
            } else{
                if(line.charAt(0) == ']'){
                    String [] temp = line.split("");
                    int k = 1;
                    String s = "";
                    while(k < line.length() && line.charAt(k) != '['){
                        s += temp[k];
                        k += 1;
                    }
                    array.add(s);
                    array = split(array, line.substring(k));
                } else{ 
                    String [] temp = line.split("");
                    int k = 0;
                    String s = "";
                    while(k < line.length() && line.charAt(k) != '['){
                        s += temp[k];
                        k += 1;
                    }
                    array.add(s);
                    array = split(array, line.substring(k));
                }
            }
        }
        return array;
    }

    private static ArrayList<String> findABA(String s){
        ArrayList<String> aba = new ArrayList<>();
        String [] sp = s.split("");
        for(int i = 0; i < sp.length - 2; i++){
            if(sp[i].equals(sp[i+2]) && !sp[i].equals(sp[i+1])){
                aba.add(sp[i]+sp[i+1]+sp[i+2]);
            }
        }
        return aba;
    }

    private static ArrayList<String> createBABFromABA(ArrayList<String> abas){
        ArrayList<String> bab = new ArrayList<>();
        for(String s: abas){
            String [] sp = s.split("");
            bab.add(sp[1]+sp[0]+sp[1]);
        }
        return bab;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2016\\inputs\\input7.txt"));

        String line = filereader.readLine();
        int counter = 0;
        int counterPlus = 0;
        int counterSSL = 0;

        while(line!=null){
            ArrayList<String> array = split(new ArrayList<>(), line);
            String [] temp = splitLine(line);
            if(array.size() == 3){
                if(!isThereAbba(array.get(1)) && (isThereAbba(array.get(0)) || isThereAbba(array.get(2)))){
                    counterPlus += 1;
                }
                ArrayList<String> arrayList = findABA(array.get(0));
                arrayList.addAll(findABA(array.get(2)));
                ArrayList<String> arrayListABAtoBAB = findABA(array.get(1));
                arrayListABAtoBAB = createBABFromABA(arrayListABAtoBAB);
                int pom = 0;
                for(String s: arrayList){
                    for(String st: arrayListABAtoBAB){
                        if(s.equals(st)){
                            pom +=1;
                        }
                    }
                }
                if(pom > 0){
                    counterSSL += 1;
                }
            } else{
                if(array.size() == 5){
                    if(!isThereAbba(array.get(1)) && !isThereAbba(array.get(3)) && 
                      (isThereAbba(array.get(0)) || isThereAbba(array.get(4)) || isThereAbba(array.get(2)))){
                        counterPlus += 1;
                    }
                    ArrayList<String> arrayList = findABA(array.get(0));
                    arrayList.addAll(findABA(array.get(2)));
                    arrayList.addAll(findABA(array.get(4)));
                    ArrayList<String> arrayListABAtoBAB = findABA(array.get(1));
                    arrayListABAtoBAB.addAll(findABA(array.get(3)));
                    arrayListABAtoBAB = createBABFromABA(arrayListABAtoBAB);
                    int pom = 0;
                    for(String s: arrayList){
                        for(String st: arrayListABAtoBAB){
                            if(s.equals(st)){
                                pom +=1;
                            }
                        }
                    }
                    if(pom > 0){
                        counterSSL += 1;
                    }
                } else{
                    if(array.size() == 7){
                        if(!isThereAbba(array.get(1)) && !isThereAbba(array.get(3)) && !isThereAbba(array.get(5)) && 
                          (isThereAbba(array.get(0)) || isThereAbba(array.get(4)) || isThereAbba(array.get(6)) || isThereAbba(array.get(2)))){
                        counterPlus += 1;
                        }
                        ArrayList<String> arrayList = findABA(array.get(0));
                        arrayList.addAll(findABA(array.get(2)));
                        arrayList.addAll(findABA(array.get(4)));
                        arrayList.addAll(findABA(array.get(6)));
                        ArrayList<String> arrayListABAtoBAB = findABA(array.get(1));
                        arrayListABAtoBAB.addAll(findABA(array.get(3)));
                        arrayListABAtoBAB.addAll(findABA(array.get(5)));
                        arrayListABAtoBAB = createBABFromABA(arrayListABAtoBAB);
                        int pom = 0;
                        for(String s: arrayList){
                            for(String st: arrayListABAtoBAB){
                                if(s.equals(st)){
                                    pom +=1;
                                }
                            }
                        }
                        if(pom > 0){
                            counterSSL += 1;
                        }
                    }
                }
            }
            if(!isThereAbba(temp[1]) && (isThereAbba(temp[0]) || isThereAbba(temp[2]))){
                counter += 1;
            }
            
            line = filereader.readLine();
        }

        System.out.println(counter);
        System.out.println(counterPlus);
        System.out.println(counterSSL);

        filereader.close();
    }
}
