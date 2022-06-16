package adventOfCode.year2021;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Day24 {

    private static int[] separateNumberToDigits(long number){
        int [] array = new int[14];
        for(int i = 13; i >= 0; i--){
            long k = number%10;
            array[i] = (int) k;
            number = number/10;
        }
        return array;
    }

    private static int add(int a, int b){
        return a+b;
    }

    private static int mul(int a, int b){
        return a*b;
    }

    private static int div(int a, int b){
        return a/b;
    }

    private static int mod(int a, int b){
        return a%b;
    }

    private static int eql(int a, int b){
        if(a == b){
            return 1;
        } else{
            return 0;
        }
    }

    private static int doSth(String s, int a, int b){
        if(s.equals("add")){
            return add(a, b);
        }
        if(s.equals("mul")){
            return mul(a, b);
        }
        if(s.equals("div")){
            return div(a, b);
        }
        if(s.equals("mod")){
            return mod(a, b);
        }
        if(s.equals("eql")){
            return eql(a, b);
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        
        BufferedReader filereader = null;        

        int w = 0;
        int x = 0;
        int y = 0;
        int z = 0;
        long number = 99999999999999L;
        int [] numberInArray = separateNumberToDigits(number);

        /*
        for(int i : numberInArray){
            System.out.println(i);
        }
        */

        int counter = 0;
        Boolean stop = false;
        while(!stop){
            filereader = new BufferedReader(new FileReader("src\\adventOfCode\\year2021\\inputs\\input24.txt"));
            String line = filereader.readLine();
            String [] inputLine = line.split(" ");
            while(line!=null){
                inputLine = line.split(" ");
                if(inputLine[0].equals("inp")){
                    w = numberInArray[counter];
                    counter += 1;
                } else{
                    if(inputLine[1].equals("x")){
                        if(inputLine[2].equals("x")){
                            x = doSth(inputLine[0], x, x);
                        } else{
                            if(inputLine[2].equals("y")){
                                x = doSth(inputLine[0], x, y);
                            } else{
                                if(inputLine[2].equals("w")){
                                    x = doSth(inputLine[0], x, w);
                                } else{
                                    if(inputLine[2].equals("z")){
                                        x = doSth(inputLine[0], x, z);
                                    } else{
                                        x = doSth(inputLine[0], x, Integer.parseInt(inputLine[2]));
                                    }
                                }
                            }
                        }
                    }
                    if(inputLine[1].equals("w")){
                        if(inputLine[2].equals("x")){
                            w = doSth(inputLine[0], w, x);
                        } else{
                            if(inputLine[2].equals("y")){
                                w = doSth(inputLine[0], w, y);
                            } else{
                                if(inputLine[2].equals("w")){
                                    w = doSth(inputLine[0], w, w);
                                } else{
                                    if(inputLine[2].equals("z")){
                                        w = doSth(inputLine[0], w, z);
                                    } else{
                                        w = doSth(inputLine[0], w, Integer.parseInt(inputLine[2]));
                                    }
                                }
                            }
                        }
                    }
                    if(inputLine[1].equals("y")){
                        if(inputLine[2].equals("x")){
                            y = doSth(inputLine[0], y, x);
                        } else{
                            if(inputLine[2].equals("y")){
                                y = doSth(inputLine[0], y, y);
                            } else{
                                if(inputLine[2].equals("w")){
                                    y = doSth(inputLine[0], y, w);
                                } else{
                                    if(inputLine[2].equals("z")){
                                        y = doSth(inputLine[0], y, z);
                                    } else{
                                        y = doSth(inputLine[0], y, Integer.parseInt(inputLine[2]));
                                    }
                                }
                            }
                        }
                    }
                    if(inputLine[1].equals("z")){
                        if(inputLine[2].equals("x")){
                            z = doSth(inputLine[0], z, x);
                        } else{
                            if(inputLine[2].equals("y")){
                                z = doSth(inputLine[0], z, y);
                            } else{
                                if(inputLine[2].equals("w")){
                                    z = doSth(inputLine[0], z, w);
                                } else{
                                    if(inputLine[2].equals("z")){
                                        z = doSth(inputLine[0], z, z);
                                    } else{
                                        z = doSth(inputLine[0], z, Integer.parseInt(inputLine[2]));
                                    }
                                }
                            }
                        }
                    }

                    
                }
                line = filereader.readLine();
                
            }
            counter = 0;

            System.out.println(number);
            if(z == 0){
                stop = true;
                System.out.println(number);
            }
            number -= 1;
            while(String.valueOf(number).contains("0")){
                number -= 1;
            }
            numberInArray = separateNumberToDigits(number);
            //
            counter = 0;
        }



        filereader.close();
        
    }
    
}
