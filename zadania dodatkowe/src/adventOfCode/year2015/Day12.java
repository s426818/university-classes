package adventOfCode.year2015;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Day12 {

    private static int stringToInt(String number){
        int newNumber = 0;
        int c = 0;
        for(int i = number.length()-1; i >= 0; i--){
            newNumber += (Character.valueOf(number.charAt(i)) - 48) * Math.pow(10, c);
            c += 1;
        }
        return newNumber;
    }
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2015\\inputs\\input12.txt"));

        String input = filereader.readLine();
        //String [] objects = input.split(",");
        int sum = 0;
        Set<Character> numbers = new HashSet<>();
        numbers.add('0');
        numbers.add('1');
        numbers.add('2');
        numbers.add('3');
        numbers.add('4');
        numbers.add('5');
        numbers.add('6');
        numbers.add('7');
        numbers.add('8');
        numbers.add('9');

        System.out.println(stringToInt("123"));

        /*
        int k = 0;
        while(k < input.length()){
            if(input.charAt(k) == '['){
                int counter = 1;
                List<String> numbersInArray = new ArrayList<>();
                int numberStart = 0;
                while(counter!=0 && k < input.length()-1){
                    k += 1;
                    if(input.charAt(k) == '['){
                        counter += 1;
                    } else{
                        if(input.charAt(k) == ']'){
                            counter -= 1;
                        } else{
                            if(numbers.contains(input.charAt(k))){
                                String newNumber = "";
                                while(numbers.contains(input.charAt(k)) && k < input.length()){
                                    newNumber += Character.toString(input.charAt(k));
                                    k += 1;
                                }
                                sum += stringToInt(newNumber);
                            }
                        }
                    }
                }
            } else{

            }
            k += 1;
        }
        */

        int l = 0;
        while(l < input.length()){
            if(numbers.contains(input.charAt(l))){
                String newNumber = "";
                while(numbers.contains(input.charAt(l)) && l < input.length()){
                    newNumber += Character.toString(input.charAt(l));
                    l += 1;
                }
                sum += stringToInt(newNumber);
                /*
                System.out.println(newNumber);
                System.out.println(stringToInt(newNumber));
                System.out.println("");
                */
            } else{
                if(input.charAt(l) == '-'){
                    l += 1;
                    if(numbers.contains(input.charAt(l))){
                        String newNumber = "";
                        while(numbers.contains(input.charAt(l)) && l < input.length()){
                            newNumber += Character.toString(input.charAt(l));
                            l += 1;
                        }
                        sum -= stringToInt(newNumber);
                        /*
                        System.out.println(newNumber);
                        System.out.println(stringToInt(newNumber));
                        System.out.println("");
                        */
                    }
                }
            }
            l += 1;
        }

        System.out.println(sum);
        

        filereader.close();
    }
    
}
