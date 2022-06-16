package projectEuler;

public class Collatz {

    public static void print(Object obj){
        System.out.println(obj);
    }

    private int lengthOfSequence(int number){
        int l = 1;
        while(number != 1){
            if(number%2 == 0){
                number = number/2;
            } else{
                number = 3*number + 1;
            }
            //System.out.println(number);
            l += 1;
        }
        return l;
    }

    public static void main(String[] args) {
        Collatz program = new Collatz();
        int max = 0;
        for(int i = 1; i <= 1000000; i++){
            if(max < program.lengthOfSequence(i)){
                max = program.lengthOfSequence(i);
            }
        }
        print(max);
    }
}
