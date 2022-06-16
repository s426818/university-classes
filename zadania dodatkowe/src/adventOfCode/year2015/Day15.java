package adventOfCode.year2015;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Day15 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2015\\inputs\\input15.txt"));

        List<Ingredient> list = new ArrayList<>();

        String line = filereader.readLine();
        while(line!=null){
            String [] splitLine = line.split(" ");
            String name = splitLine[0].substring(0, splitLine[0].length()-2);
            int capacity = Integer.parseInt(splitLine[2].substring(0, splitLine[2].length()-1));
            int durability = Integer.parseInt(splitLine[4].substring(0, splitLine[4].length()-1));
            int flavor = Integer.parseInt(splitLine[6].substring(0, splitLine[6].length()-1));
            int texture = Integer.parseInt(splitLine[8].substring(0, splitLine[8].length()-1));
            int calories = Integer.parseInt(splitLine[10]);
            Ingredient ingredient = new Ingredient(name, capacity, durability, flavor, texture, calories);
            list.add(ingredient);
            line = filereader.readLine();
        }

        /*
        int max = 0;
        for(int i = 0; i <= 100; i++){
            for(int j = 0; j <= 100; j++){
                if(i + j == 100){
                    int capacity = list.get(0).capacity * i + list.get(1).capacity * j;
                    if(capacity < 0){
                        capacity = 0;
                    }
                    int durability = list.get(0).durability * i + list.get(1).durability * j;
                    if(durability < 0){
                        durability = 0;
                    }
                    int flavor = list.get(0).flavor * i + list.get(1).flavor * j;
                    if(flavor < 0){
                        flavor = 0;
                    }
                    int texture = list.get(0).texture * i + list.get(1).texture * j;
                    if(texture < 0){
                        texture = 0;
                    }
                    if(max < (capacity * durability * flavor * texture)){
                        max = capacity * durability * flavor * texture;
                    }
                }
            }
        }
        */

        long max = Integer.MIN_VALUE;
        for(int i = 0; i <= 100; i++){
            for(int j = 0; j <= 100; j++){
                for(int k = 0; k <= 100; k++){
                    for(int l = 0; l <= 100; l++){
                        if(i + j + k + l == 100){
                            int capacity = list.get(0).capacity * i + list.get(1).capacity * j + list.get(2).capacity * k + list.get(3).capacity * l;
                            if(capacity < 0){
                                capacity = 0;
                            }
                            int durability = list.get(0).durability * i + list.get(1).durability * j + list.get(2).durability * k + list.get(3).durability * l;
                            if(durability < 0){
                                durability = 0;
                            }
                            int flavor = list.get(0).flavor * i + list.get(1).flavor * j + list.get(2).flavor * k + list.get(3).flavor * l;
                            if(flavor < 0){
                                flavor = 0;
                            }
                            int texture = list.get(0).texture * i + list.get(1).texture * j + list.get(2).texture * k + list.get(3).texture * l;
                            if(texture < 0){
                                texture = 0;
                            }
                            if(max < (capacity * durability * flavor * texture)){
                                max = capacity * durability * flavor * texture;
                            }
                            /*
                            int calories = list.get(0).calories * i + list.get(1).calories * j + list.get(2).calories * k + list.get(3).calories * l;
                            if(calories == 500){
                                if(max < (capacity * durability * flavor * texture)){
                                    max = capacity * durability * flavor * texture;
                                }
                            }
                            */
                            //System.out.println(capacity * durability * flavor * texture);
                        }
                    }
                }
            }
        }

        System.out.println(max);

        filereader.close();

    }

    private static class Ingredient{
        String name = "";
        int capacity = 0;
        int durability = 0;
        int flavor = 0;
        int texture = 0;
        int calories = 0;

        private Ingredient(String name, int capacity, int durability, int flavor, int texture, int calories){
            this.name = name;
            this.capacity = capacity;
            this.durability = durability; 
            this.flavor = flavor;
            this.texture = texture;
            this.calories = calories;
        }
    }
    
}
