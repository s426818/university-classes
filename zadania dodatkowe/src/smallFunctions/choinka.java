package smallFunctions;

import java.util.Scanner;

public class choinka {

    private static String addSymbol(String str, int i, String symbol){
        for(int j = 0; j < i; j++){
            str += symbol;
        }
        return str;
    }
    
    private void drawChristmasTree(Scanner scanner){
        System.out.println("Podaj wysokość choinki: ");
        int height = scanner.nextInt();
        //int width = 2*height + 1;
        for(int i = height; i>0; i-- ){
            String level = "";
            /*
            for(int j = 0; j <= i; j++){
                level += " ";
            }
            */
            level = addSymbol(level, i-1, " ");
            level = addSymbol(level, (2*(height - i)) + 1, "*");
            level = addSymbol(level, i-1, " ");
            System.out.println(level);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        choinka program = new choinka();
        program.drawChristmasTree(scan);
        scan.close();
    }
}
