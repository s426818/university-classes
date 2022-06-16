package adventOfCode.year2017;

public class Day3 {

    private static int sumOfNeighbours(int [][] array, int x, int y){
        int sum = 0;
        for(int i = x-1; i <= x+1; i++){
            for(int j = y-1; j <= y+1; j++){
                sum += array[i][j];
            }
        }
        return sum;
    }

    private static int[] newIndexes(int x, int y, int [][] array){
        int [] indexes = new int [2];
        if(x == y){
            if(array[x][y+1] != 0){
                x += 1;
            } else{
                y += 1;
            }
        } else{
            if(y > x){
                if(array[x][y+1] == 0 && array[x][y-1] != 0){
                    x -= 1;
                } else{
                    y -= 1;
                }
            } else{
                if(x > y){
                    if(array[x][y-1] == 0 && array[x][y+1] != 0){
                        x += 1;
                    } else{
                        y += 1;
                    }
                }
            }
        }
        indexes[0] = x;
        indexes[1] = y;
        return indexes;
    }
    
    private static int[][] generateWeirdGrid(int maxValue){
        int [][] blep = new int[625][625];
        int x = 312;
        int y = 312;
        int k = 1;
        while(k < maxValue + 1){
            if(k == maxValue){
                System.out.println(x);
                System.out.println(y);
            }
            blep[x][y] = k;
            k += 1;
            int [] indexes = newIndexes(x, y, blep);
            x = indexes[0];
            y = indexes[1];
        }
        //List<Integer> tempList = new ArrayList<>();


        return blep;
    }

    private static int[][] generateWeirdGridWithSums(int maxValue){
        int [][] blep = new int[625][625];
        int x = 312;
        int y = 312;
        int k = 1;
        while(k < maxValue + 1){
            if(k == maxValue){
                System.out.println(x);
                System.out.println(y);
            }
            blep[x][y] = k;
            
            int [] indexes = newIndexes(x, y, blep);
            x = indexes[0];
            y = indexes[1];
            k = sumOfNeighbours(blep, x, y);
            
        }
        System.out.print("k: ");
        System.out.println(k);
        //List<Integer> tempList = new ArrayList<>();


        return blep;
    }

    private static int countMemory(int number){
        int counter = 1;
        int value = 3;
        while(number > counter){
            counter += 2*(value) + 2*(value - 2);
            value += 2;
        }

        return counter;
    }

    public static void main(String[] args) {
        int [][] grid = generateWeirdGrid(312051);
        int [][] gridWithSums = generateWeirdGridWithSums(312051);
        
        for(int i = 0; i < gridWithSums.length; i++){
            for(int j = 0; j < gridWithSums[0].length; j++){
                System.out.print(gridWithSums[i][j]);
            }
            System.out.println();
        }
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
        

        System.out.println(countMemory(312051));
        double number = (double) countMemory(312051);
        System.out.println(number);
        System.out.println(Math.sqrt(number));
        System.out.println(countMemory(559));
    }

}
