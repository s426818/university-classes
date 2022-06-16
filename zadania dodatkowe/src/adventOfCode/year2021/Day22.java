package adventOfCode.year2021;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Day22 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2021\\inputs\\input22.txt"));

        Set<String> cubesOn = new HashSet<>();
        Map<String, HashSet<String>> cubesThatAreOn = new HashMap<>();
        String line = filereader.readLine();

        while(line!=null){
            int xStart = 0;
            int xEnd = 0;
            int yStart = 0;
            int yEnd = 0;
            int zStart = 0;
            int zEnd = 0;
            String [] stringLine = line.split("\\.\\.");
            
            /*
            for(int i = 0; i < stringLine.length; i++){
                System.out.println(stringLine[i]);
            }
            */
            

            String [] xOnlyStart = stringLine[0].split("=");
            if(xOnlyStart[1].charAt(0)=='-'){
                xOnlyStart[1] = xOnlyStart[1].substring(1);
                xStart = Integer.parseInt(xOnlyStart[1]) * (-1);
            } else{
                xStart = Integer.parseInt(xOnlyStart[1]);
            }

            String [] xEndAndYStart = stringLine[1].split("=");
            /*
            for(String s : xEndAndYStart){
                System.out.println("******");
                System.out.println(s);
                System.out.println("******");
            }
            */
            //System.out.println(xEndAndYStart[0]);
            String [] xOnlyEnd = xEndAndYStart[0].split(",");
            /*
            for(String s : xOnlyEnd){
                System.out.println("++");
                System.out.println(s);
                System.out.println("++");
            }
            */
            if(xOnlyEnd[0].charAt(0) == '-'){
                xOnlyEnd[0] = xOnlyEnd[0].substring(1);
                xEnd = Integer.parseInt(xOnlyEnd[0]);
            } else{
                xEnd = Integer.parseInt(xOnlyEnd[0]);
            }
            if(xEndAndYStart[1].charAt(0) == '-'){
                xEndAndYStart[1] = xEndAndYStart[1].substring(1);
                yStart = Integer.parseInt(xEndAndYStart[1]) * (-1);
            } else{
                yStart = Integer.parseInt(xEndAndYStart[1]);
            }

            String [] yEndAndZStart = stringLine[2].split("=");
            String [] yOnlyEnd = yEndAndZStart[0].split(",");
            if(yOnlyEnd[0].charAt(0) == '-'){
                yOnlyEnd[0] = yOnlyEnd[0].substring(1);
                yEnd = Integer.parseInt(yOnlyEnd[0]) * (-1);
            } else{
                yEnd = Integer.parseInt(yOnlyEnd[0]);
            }
            if(yEndAndZStart[1].charAt(0) == '-'){
                yEndAndZStart[1] = yEndAndZStart[1].substring(1);
                zStart = Integer.parseInt(yEndAndZStart[1]) * (-1);
            } else{
                zStart = Integer.parseInt(yEndAndZStart[1]);
            }

            if(stringLine[3].charAt(0) == '-'){
                stringLine[3] = stringLine[3].substring(1);
                zEnd = Integer.parseInt(stringLine[3]) * (-1);
            } else{
                zEnd = Integer.parseInt(stringLine[3]);
            }

            String onOff = stringLine[0].split(" ")[0];

            if(onOff.equals("on")){
                for(int i = xStart; i <= xEnd; i++){
                    for(int j = yStart; j <= yEnd; j++){
                        for(int k = zStart; k <= zEnd; k++){
                            String tempCube = Integer.toString(i) + ", " + Integer.toString(j) + ", " + Integer.toString(k);
                            cubesOn.add(tempCube);
                            if(cubesThatAreOn.keySet().contains(Integer.toString(i))){
                                HashSet<String> set = cubesThatAreOn.get(Integer.toString(i));
                                set.add(Integer.toString(j) + ", " + Integer.toString(k));
                                cubesThatAreOn.put(Integer.toString(i), set);
                            } else{
                                HashSet<String> set = new HashSet<>();
                                set.add(Integer.toString(j) + ", " + Integer.toString(k));
                                cubesThatAreOn.put(Integer.toString(i), set);
                            }
                        }
                    }
                }
            } else{
                for(int i = xStart; i <= xEnd; i++){
                    for(int j = yStart; j <= yEnd; j++){
                        for(int k = zStart; k <= zEnd; k++){
                            String tempCube = Integer.toString(i) + ", " + Integer.toString(j) + ", " + Integer.toString(k);
                            if(cubesOn.contains(tempCube)){
                                cubesOn.remove(tempCube);
                            }
                            if(cubesThatAreOn.keySet().contains(Integer.toString(i))){
                                cubesThatAreOn.remove(Integer.toString(i));
                            }
                        }
                    }
                }
            }

            line = filereader.readLine();
        }

        /*
        for(String s : cubesOn){
            System.out.println(s);
        }
        */

        System.out.println(cubesOn.size());
        System.out.println(cubesThatAreOn.size());

        int suma = 0;
        for(String key : cubesThatAreOn.keySet()){
            suma += cubesThatAreOn.get(key).size();
        }
        System.out.println(suma);

        filereader.close();
    }

}
