package projectEuler;

public class PowersSumOfDigits {

    private int numebrOfLetters(int number){
        if(number == 1){
            //one
            return 3;
        } 
        if(number == 2){
            //two
            return 3;
        }
        if(number == 3){
            //three
            return 5;
        }
        if(number == 4){
            //four
            return 4;
        }
        if(number == 5){
            //five
            return 4;
        }
        if(number == 6){
            //six
            return 3;
        }
        if(number == 7){
            //seven
            return 5;
        }
        if(number == 8){
            //eight
            return 5;
        } else{
            //nine
            return 4;
        }
    }

    private int NumberLettersCount(int number){
        int sum = 0;
        while(number >= 1){
            sum += numebrOfLetters(number%10);
            number = number/10;
        }
        return sum;
    }

    private int manyNumbersLettersCount(int number1, int number2){
        int sum = 0;
        for(int i = number1; i <= number2; i++){
            System.out.print("Dla: ");
            System.out.println(i);
            sum += NumberLettersCount(i);
            System.out.println(sum);
        }
        return sum;
    }

    private int SumOfDigits(double number, double power){
        int sum = 0;
        number = Math.pow(number, power);
        while(number >= 1){
            sum += number%10;
            number = number/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        PowersSumOfDigits program = new PowersSumOfDigits();
        System.out.println(program.SumOfDigits(2, 15));
        System.out.println(program.manyNumbersLettersCount(1, 5));
    }
}
