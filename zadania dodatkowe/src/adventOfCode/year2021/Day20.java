package adventOfCode.year2021;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Day20 {

    private static int [] readAlgorithm(String line){
        int [] array = new int[line.length()];
        for(int i = 0; i < line.length(); i++){
            if(line.charAt(i) == '#'){
                array[i] = 1;
            }
        }
        return array;
    }

    private static int [] readLineOfImage(String line){
        int [] array = new int[line.length() + 10];
        for(int i = 0; i < 5; i++){
            array[i] = 0;
        }        
        for(int i = 5; i < line.length() + 5; i++){
            if(line.charAt(i-5) == '#'){
                array[i] = 1;
            }
        }
        for(int i = line.length() + 5; i < line.length() + 10; i++){
            array[i] = 0;
        }    
        return array;
    }

    private static String createBinaryNumber(List<int[]> array, int x, int y){
        String binaryNumber = "";
        for(int i = x-1; i < x + 2; i++){
            for(int j = x-1; j < x + 2; j++){
                binaryNumber += Integer.toString(array.get(i)[j]);
            }
        }
        return binaryNumber;
    }

    private static int binaryToInt(String binaryNumber){
        int number = 0;
        int k = 0;
        for(int i = binaryNumber.length()-1; i >= 0; i--){
            number += (Character.valueOf(binaryNumber.charAt(i))-48) * Math.pow(2, k);
            k++;
        }
        return number;
    }
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2021\\inputs\\input20.txt"));

        String line = filereader.readLine();
        int [] algorithm = readAlgorithm(line);

        List<int[]> image = new ArrayList<>();

        line = filereader.readLine();
        line = filereader.readLine();
        int [] listOf0 = new int[line.length() + 10];
        

        for(int i = 0; i < 5; i++){
            image.add(listOf0);
        }   

        while(line!=null){
            image.add(readLineOfImage(line));
            line = filereader.readLine();
        }

        for(int i = 0; i < 5; i++){
            image.add(listOf0);
        }   

        
        for(int i = 0; i < 1; i++){
            List<int[]> newImage = new ArrayList<>();
            for(int o = 0; o < image.size(); o++){
                newImage.add(listOf0);
            }

            /*
            for(int[] array : newImage){
                for(int j = 0; j < array.length; j++){
                    System.out.print(array[j]);
                }
                System.out.println();
            }
            */

            for(int j = 1; j < image.size() - 1; j++){
                for(int k = 1; k < image.get(j).length - 1; k++){
                    String binaryNumber = createBinaryNumber(image, j, k);
                    //System.out.println(binaryNumber);
                    int index = binaryToInt(binaryNumber);
                    //System.out.println(index);
                    newImage.get(j)[k] = algorithm[index];
                    //System.out.println(algorithm[index]);
                    System.out.println(newImage.get(j)[k]);
                }
            }

            for(int[] array : newImage){
                for(int j = 0; j < array.length; j++){
                    System.out.print(array[j]);
                }
                System.out.println();
            }

            image = newImage;
        }
        

        
        System.out.println(binaryToInt("000100010"));

        for(int[] array : image){
            for(int i = 0; i < array.length; i++){
                System.out.print(array[i]);
            }
            System.out.println();
        }
        

        filereader.close();
    }

}
