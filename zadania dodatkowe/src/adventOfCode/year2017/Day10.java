package adventOfCode.year2017;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Day10 {

    private static int[] reverseWholeList(int[] list){
        int[] newList = new int[list.length];
        int k = 0;
        for(int i = list.length-1; i >= 0; i--){
            newList[k] = list[i];
            k += 1;
        }
        return newList;
    }

    private static int[] reverse(int[] list, int length, int startingPosition){
        if(length == list.length){
            return reverseWholeList(list);
        }
        int maxIndex = list.length-1;
        int currentIndex = startingPosition;
        int [] reversedFragment = new int[length];
        int k = 0;
        if(currentIndex + length <= maxIndex){
            for(int i = currentIndex + length; i > currentIndex; i--){
                reversedFragment[k] = list[i-1];
                k += 1;
            }
            for(int i = 0; i < k; i++){
                list[startingPosition + i] = reversedFragment[i];
            }
        } else{
            while(currentIndex <= maxIndex){
                reversedFragment[k] = list[currentIndex];
                k += 1;
                currentIndex += 1;
            }
            currentIndex = 0;
            while(k < length){
                reversedFragment[k] = list[currentIndex];
                currentIndex += 1;
                k += 1;
            }

            //reversedFragment = reverseWholeList(reversedFragment);
            currentIndex -= 1;
            k = 0;
            while(currentIndex >= 0){
                list[currentIndex] = reversedFragment[k];
                k += 1;
                currentIndex -= 1;
            }
            currentIndex = maxIndex;
            while(k < reversedFragment.length){
                list[currentIndex] = reversedFragment[k];
                k += 1;
                currentIndex -= 1;
            }
        }
        return list;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2017\\inputs\\input10.txt"));

        int currentPosition = 0;
        int skipSize = 0;
        int [] list = new int[5];
        for(int i = 0; i < list.length; i++){
            list[i] = i;
        }

        String [] lengths = filereader.readLine().split(",");
        for(String s: lengths){
            int i = Integer.parseInt(s);
            int [] newList = reverse(list, i, currentPosition);
            list = newList;
            currentPosition += i + skipSize;
            skipSize += 1;
            for(int j: list){
                System.out.print(j);
                System.out.print(", ");
            }
            System.out.println();
            list = newList;
        }

        filereader.close();
    }
    
}
