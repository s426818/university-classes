package smallFunctions;

import java.util.Scanner;

public class Main
{
    private static int myAge(){
        return 24;
    }
    
    private static String myName(){
        return "Pauliś";
    }
    
    private static void print(Object obj){
        System.out.println(obj);
    }
    
    private static void getTwoNumbers(double number1, double number2){
        print(number1+number2);
        print(number1-number2);
        print(number1*number2);
    }
    
    private static boolean isNumberEven(int number){
        if(number%2 == 0){
            return true;
        }
        return false;
    }
    
    private static boolean isNumberBy3And5(int number){
        if(number%3 == 0 & number%5 == 0){
            return true;
        }
        return false;
    }
    
    private static void thirdPower(int number){
        print(number*number*number);
    }
    
    private static double sqrt(double number){
        if(number<0){
            print("Liczba nie może być mniejsza niż 0.");
            return sqrt(number*(-1));
        }
        return Math.sqrt(number);
    }
    
    private static boolean isThisTriangle(int a, int b, int c){
        if(a+b>c || a+c>b || b+c>a){
            return true;
        }
        return false;
    }
    
    /*
    private static int max(int a, int b, int c){
        if(a>b){
            if(a>c){
                return a;
            } else{
                return c;
            }
        } else{
            if(b>c){
                return b;
            } else{
                return c;
            }
        }
    }
    */
    
    private static boolean isThisTriangleSquary(int a, int b, int c){
        if(isThisTriangle(a,b,c)){
            if(b*b+c*c==a*a || a*a+b*b == c*c || a*a+c*c == b*b){
                return true;
            } 
            return false;
        }
        return false;
    }
    
    private void start(){
        Human human = new Human(2, 15, 102, "Kasia", "M");
		print(human.name);
    }
    
    private static String[] alphabet(){
        String [] alp = {"a", "b", "c", "d", "e"};
        return alp;
    }
    
    private static int[] giveMeTableOfThreeNumbers(int[] table){
        if(table.length==3){
            int temp = table[0];
            table[0] = table[2];
            table[2] = temp;
        }
        return table;
    }
    
    /*
    private void letsPrintFrom0ToNumberWithFor(int number){
        for(int i=0; i<=number; i++){
            print(i);
        }
    }
    
    private void letsPrintFrom0ToNumberWithWhile(int number){
        int i = 0;
        while(i<=number){
            print(i);
        }
    }
    */

    private void numberBackwards(int number){
        int k = 0;
        int temp = number;
        while (temp>0){
            temp = temp/10;
            k += 1;
        }
        //print(k);
        for(int i = k; i>0; i--){
            print(number%10);
            number = number/10;
        }
    }
    
    private String stringBackwards(String word){
        String temp = "";
        for(int i = word.length()-1; i>=0; i--){
            temp += Character.toString(word.charAt(i));
        }
        return temp;
    }
    
    private String binaryNumber(int number){
        String temp = "";
        int num = number;
        while(num>0){
            num = num/10;
        }
        while(number>0){
            num = number%2;
            number = number/2;
            String temp2 = String.valueOf(num);
            temp += temp2;
        }
        //print(temp);
        String temp3 = "";
        for(int i = temp.length()-1; i>=0; i--){
            temp3 += Character.toString(temp.charAt(i));
        }
        //print(temp3);
        return temp3;
        
    }
    
    private boolean isThisPalindrome(String word){
        //int l = word.length()-1;
        //char [] wordTable = word.toCharArray();
        char [] wordNormal = new char [word.length()];
        char [] wordBackwards = new char [word.length()];
        for(int i = 0; i<word.length(); i++){
            char letter = word.charAt(i);
            wordNormal[i] = letter;
            wordBackwards[((word.length()-1)-i)] = letter;
        }
        for(int i = 0; i<word.length(); i++){
            if(wordNormal[i]==wordBackwards[i]){
                continue;
            } else{
                return false;
            }
        }
        return true;
    }
    
    /*
    private static int findMax(int[] array){
        int max = Integer.Min_Value;
        for(int i = 0; i<array.length; i++){
            if(array[i]>max){
                max = array[i];
            }
        }
        return max;
    }
    */
    
    private int[] sortByMax(int[] array){
        for(int i = array.length-1; i>=0; i--){
            int l = 0;
            int max = Integer.MIN_VALUE;
            int temp = array[i];
            for(int j = 0; j<=i; j++){
                if(array[j]>max){
                    max = array[j];
                    l = j;
                }
            }
            array[i] = max;
            array[l] = temp;
            
        }
        for(int i = 0; i<array.length; i++){
            System.out.print(array[i]);
        }
        return array;
    }
    
    private void printArrayAsString(int [] array){
        if(array.length == 0){
            print("[]");
        } else{
            String temp = "[" + String.valueOf(array[0]);
            if(array.length == 1){
                print("[" + temp + "]");
            } else{
                for(int i = 1; i<array.length; i++){
                    temp += ", " + String.valueOf(array[i]);
                }
                temp += "]";
                print(temp);
            }
        }
    }

    void getIntPrintBinaryRepresentation(Scanner scanner){
        print("Podaj liczbę całkowitą: ");
        int number = scanner.nextInt();
        print(binaryNumber(number));
    }

    void getArraySizeFillItAndSortIt(Scanner scanner){
        print("Podaj liczbę całkowitą: ");
        int number = scanner.nextInt();
        int [] array = new int[number];
        for(int i = 0; i< number; i++){
            print("Podaj liczbę całkowitą: ");
            array[i] = scanner.nextInt();
        }
        array = sortByMax(array);
        for(int i = 0; i< number; i++){
            print(array[i]);
        }
    }

    void getStringAndCheckIt(Scanner scanner){
        print("Podaj słowo: ");
        String word = scanner.nextLine();
        print(word.length());
        print(isThisPalindrome(word));
        for(int i = word.length() - 1; i>=0; i--){
            System.out.print(Character.toString(word.charAt(i)));
        }
    }
    
	public static void main(String[] args) {
		int age = myAge();
		String name = myName();
		print(age);
		print(name);
		print(myName());
		getTwoNumbers(5,13);
		print(isNumberEven(6));
		print(isNumberBy3And5(30));
		thirdPower(3);
		print(sqrt(7));
		print(isThisTriangleSquary(3,3,5));
		
		Main myprogram = new Main();
		myprogram.start();
		String [] alp = new String [5];
		alp = alphabet();
		for(int i=0; i<5; i++){
		    print(alp[i]);
		}
		int [] test1 = {1,2,3};
		int [] test2 = {0};
		int [] test3 = {1,2,3,4,5};
		test1 = giveMeTableOfThreeNumbers(test1);
		test2 = giveMeTableOfThreeNumbers(test2);
		test3 = giveMeTableOfThreeNumbers(test3);
		for(int i = 0; i<test1.length; i++){
		    print(test1[i]);
		}
		for(int i = 0; i<test2.length; i++){
		    print(test2[i]);
		}
		for(int i = 0; i<test3.length; i++){
		    print(test3[i]);
		}
		myprogram.numberBackwards(671234);
		String word = "ciastko";
		print(myprogram.stringBackwards(word));
		myprogram.binaryNumber(5);
		print(myprogram.isThisPalindrome(word));
		print(myprogram.isThisPalindrome("kotok"));
		myprogram.printArrayAsString(test3);
		int [] test4 = {6,8,3,0,2,9,1,4};
		myprogram.sortByMax(test4);
        Scanner scanner = new Scanner(System.in);
        myprogram.getIntPrintBinaryRepresentation(scanner);
        myprogram.getStringAndCheckIt(scanner);

        /*
        Pattern compiledPattern = Pattern.compile("Marcin");
        Matcher matcher = compiledPattern.matcher("Nazywam sie Marcin Pietraszek");
        
        System.out.println(matcher.find());
        System.out.println(matcher.matches());
        */
        
        scanner.close();
	}
	
	public class Human{
    int age;
    int weight;
    int heightCm;
    String name;
    String sex;
    
    public Human(int age, int weight, int heightCm, String name, String sex){
        this.age = age;
        this.weight = weight;
        this.heightCm = heightCm;
        this.name = name;
        this.sex = sex;
    }
    
    public int getAge(){
        return age;
    }
    
    public int getWeight(){
        return weight;
    }
    
    public int getHeightCm(){
        return heightCm;
    }
    
    public String getName(){
        return name;
    }
    
    public boolean isMale(){
        if(sex.equals("M")){
            return true;
        }
        return false;
    }
    
    
    
    
    
    
    
    
}
}

