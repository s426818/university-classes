package smallFunctions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//czyli wyrażenia regularne
public class Regexy {

    /*
    1. Sprawdza czy liczba zmiennoprzecinkowa podana przez użytkownika ma poprawny format. 
       Na przykład liczba 123,2341515132135 czy -10 są poprawne ale 18-12 czy 123, już nie.

    2. Sprawdza czy numer domu jest w formacie numer\numer. 
       Poprawnym numerem jest 123\2A, 24B\3 czy 12\5, ale już numer abc\cba nie.
    
    3. Sprawdza czy użytkownik wprowadził poprawną nazwę miasta. 
       Na przykład Wrocław, Zielona Gora czy Bielsko-Biala jest ok, jednak Ptysiow123 już nie. 
       Dla uproszczenia załóżmy, że żadna nazwa miejscowości nie zawiera polskich znaków.
    */

    public static void main(String[] args) {
        //1
        Pattern firstPattern = Pattern.compile("-*\\d+,{0,1}\\d+");
        Matcher firstMatcher = firstPattern.matcher("123,23");
        Matcher secondMatcher = firstPattern.matcher("-10");
        Matcher thirdMatcher = firstPattern.matcher("18-12");
        Matcher fourthMatcher = firstPattern.matcher("123,");
        System.out.println(firstMatcher.matches());
        System.out.println(secondMatcher.matches());
        System.out.println(thirdMatcher.matches());
        System.out.println(fourthMatcher.matches());

        System.out.println("");

        //2
        Pattern secondPattern = Pattern.compile("\\d+[A-Z]{0,1}\\\\\\d+[A-Z]{0,1}");
        firstMatcher = secondPattern.matcher("123\\2A");
        secondMatcher = secondPattern.matcher("24B\\3");
        thirdMatcher = secondPattern.matcher("12\\5");
        fourthMatcher = secondPattern.matcher("abc\\cba");
        System.out.println(firstMatcher.matches());
        System.out.println(secondMatcher.matches());
        System.out.println(thirdMatcher.matches());
        System.out.println(fourthMatcher.matches());

        System.out.println("");

        //3
        Pattern thirdPattern = Pattern.compile("[A-Z]{1}[a-z]+[ -]?[A-Z]?[a-z]+");
        firstMatcher = thirdPattern.matcher("Zielona Gora");
        secondMatcher = thirdPattern.matcher("Wroclaw");
        thirdMatcher = thirdPattern.matcher("Bielsko-Biala");
        fourthMatcher = thirdPattern.matcher("Ptysiow123");
        System.out.println(firstMatcher.matches());
        System.out.println(secondMatcher.matches());
        System.out.println(thirdMatcher.matches());
        System.out.println(fourthMatcher.matches());
    }
}
