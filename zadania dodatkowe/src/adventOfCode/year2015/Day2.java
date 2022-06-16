package adventOfCode.year2015;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Day2 {

    private static int smallestArea(int a, int b, int c){
        if(a <= b && a <=c){
            return a;
        }
        if(b <= a && b <= c){
            return b;
        }
        return c;
    }

    private static int howMuchPaper(int w, int h, int l){
        int sum = 0;
        int a = w*h;
        int b = w*l;
        int c = h*l;
        sum += (2*(a + b + c)) + smallestArea(a, b, c);
        return sum;
    }

    private static int wrapRibbon(int a, int b, int c){
        int sum = a*b*c;
        /*
        if(a >= b && a >= c){
            sum += 2*(b + c);
        }
        if(b >= a && b >= c){
            sum += 2*(a + c);
        }
        if(c >= b && c >= a){
            sum += 2*(b + a);
        }
        */
        int q = a + a + b + b;
        int w = b + b + c + c;
        int e = a + a + c + c;
        sum += smallestArea(q, w, e);
        return sum;
    }
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader filereader = null;
        filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2015\\inputs\\input2.txt"));

        String line = filereader.readLine();
        int paper = 0;
        int ribbon = 0;

        while(line!=null){
            String [] dimensions = line.split("x");
            paper += howMuchPaper(Integer.parseInt(dimensions[0]), Integer.parseInt(dimensions[1]), Integer.parseInt(dimensions[2]));
            ribbon += wrapRibbon(Integer.parseInt(dimensions[0]), Integer.parseInt(dimensions[1]), Integer.parseInt(dimensions[2]));
            line = filereader.readLine();
        }

        System.out.println(paper);
        System.out.println(ribbon);
        System.out.println(wrapRibbon(2, 3, 4));
        System.out.println(wrapRibbon(4, 3, 2));
        System.out.println(wrapRibbon(1, 1, 10));

        filereader.close();
    }

}
