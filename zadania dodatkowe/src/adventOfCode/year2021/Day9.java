package adventOfCode.year2021;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Day9 {

    private static int findTheSizeOfTheBasin(int i, int j, List<int[]> array){
        Set<int[]> setOfBasin = new HashSet<>();
        

        return setOfBasin.size();
    }
    
    private static int isItLowPoint(int i, int j, List<int[]> array){
        int number = array.get(i)[j];
        if(i == 0){

            if(j == 0){
                if(number < array.get(i)[j+1] && number < array.get(i+1)[j]){
                    System.out.println(number);
                    return number+1;
                }
            } else{
                if(j == array.get(i).length-1){
                    if(number < array.get(i)[j-1] && number < array.get(i+1)[j]){
                        System.out.println(number);
                        return number+1;
                    }
                } else{
                    if(number < array.get(i)[j+1] && number < array.get(i+1)[j] && number < array.get(i)[j-1]){
                        System.out.println(number);
                        return number+1;
                    }
                }
            }

        } else{

            if(i == array.size()-1){
                if(j == 0){
                    if(number < array.get(i)[j+1] && number < array.get(i-1)[j]){
                        return number+1;
                    }
                } else{
                    if(j == array.get(i).length-1){
                        if(number < array.get(i)[j-1] && number < array.get(i-1)[j]){
                            return number+1;
                        }
                    } else{
                        if(number < array.get(i)[j+1] && number < array.get(i-1)[j] && number < array.get(i)[j-1]){
                            return number+1;
                        }
                    }
                }
            } else{

                if(j == 0){
                    if(number < array.get(i)[j+1] && number < array.get(i-1)[j] && number < array.get(i+1)[j]){
                        return number+1;
                    }
                } else{
                    if(j == array.get(i).length-1){
                        if(number < array.get(i)[j-1] && number < array.get(i-1)[j] && number < array.get(i+1)[j]){
                            return number+1;
                        }
                    } else{
                        if(number < array.get(i)[j+1] && number < array.get(i+1)[j] && number < array.get(i)[j-1] && number < array.get(i-1)[j]){
                            return number+1;
                        }
                    }
                }

            }

        }        
        
        return 0;
    }

    public static void main(String[] args) throws IOException {
        
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2021\\input9.txt"));

        List<int[]> listOfLines = new ArrayList<>();
        String line = filereader.readLine();

        while(line!=null){
            int [] lineOfNumbers = new int[line.length()];
            for(int i = 0; i < line.length(); i++){
                lineOfNumbers[i] = Character.getNumericValue(line.charAt(i));
            }
            listOfLines.add(lineOfNumbers);
            line = filereader.readLine();
        }

        int suma = 0;
        for(int i = 0; i < listOfLines.size(); i++){
            for(int j = 0; j < listOfLines.get(0).length; j++){
                suma += isItLowPoint(i, j, listOfLines);
            }
        }

        System.out.println(suma);

        filereader.close();
        
    }

}
