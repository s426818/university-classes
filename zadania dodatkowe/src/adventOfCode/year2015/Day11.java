package adventOfCode.year2015;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Day11 {

    private static Boolean isPasswordValid(String password){
        Boolean ilo = false;
        Boolean pairs = false;
        Boolean trio = false;
        int k = 0;
        Character c = 1;
        while(!ilo && k < password.length()-2){
            if(pairs && trio){
                k += 1;
                continue;
            }
            if(password.charAt(k) == 'i' || password.charAt(k) == 'l' || password.charAt(k) == 'o'){
                ilo = true;
            }
            if(password.charAt(k) == password.charAt(k+1)){
                if(c == 1){
                    c = password.charAt(k);
                } else{
                    if(c != password.charAt(k)){
                        pairs = true;
                    }
                }
            }
            if((password.charAt(k) + 2) == (password.charAt(k+1) + 1) && ((password.charAt(k+2)) == (password.charAt(k+1) + 1))){
                trio = true;
            }
            k += 1;
        }
        if(!ilo && pairs && trio){
            return true;
        }
        if(trio){
            if(password.charAt(k) == password.charAt(k+1) && c!=1){
                if(c != password.charAt(k)){
                    pairs = true;
                }
            }
            if((password.charAt(k) == 'i' || password.charAt(k) == 'l' || password.charAt(k) == 'o') 
              || (password.charAt(k+1) == 'i' || password.charAt(k+1) == 'l' || password.charAt(k+1) == 'o')){
                ilo = true;
              }
        }
        if(!ilo && pairs && trio){
            return true;
        }
        return false;
    }

    private static String increase(String password, int k){
        String beggining = password.substring(0, k);
        String ending = password.substring(k+1);
        if(password.charAt(k) == 'z'){
            password = beggining + Character.toString('a') + ending;
        } else{
            password = beggining + Character.toString(password.charAt(k)+1) + ending;
        }
        return password;
    }

    private static String generatePassword(String password){
        password = increase(password, password.length()-1);
        int k = password.length()-1;
        //int counter = 0;
        while(!isPasswordValid(password)){
            if(password.charAt(k) == 'a'){
                k -= 1;
                password = increase(password, k);
                String beggining = password.substring(0, k);
                for(int i = k; i < password.length(); i++){
                    beggining += "a";
                }
                password = beggining;
                System.out.println(password);
                k = password.length()-1;
            } else{
                password = increase(password, k);
            }
            
        }
        return password;
    }
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2015\\inputs\\input11.txt"));

        String password = filereader.readLine();
        
        System.out.println(generatePassword(password));
        //abcdefgh
        //abcdffaa
        System.out.println(isPasswordValid("abcdffaa"));

        filereader.close();



    }
    
}
