package smallFunctions;

import java.util.concurrent.TimeUnit;

public class GameOfLife {

    private int howManyNeighbours(int [][] matrix, int x, int y){
        int counter = 0;

        //górna krawędź
        //prawy górny róg
        if(x == 0 && y == 0){
            counter += matrix[0][1] + matrix[1][1] + matrix[1][0] + matrix[1][matrix[0].length-1] + matrix[0][matrix.length-1] 
                    + matrix[matrix.length-1][matrix.length-1] + matrix[matrix.length-1][0] + matrix[matrix.length-1][1];
            return counter;
        } else{
            //lewy górny róg
            if(x == 0 && y == matrix[0].length-1){
                counter += matrix[0][matrix.length-2] + matrix[1][matrix.length-1] + matrix[1][matrix.length-2] 
                        + matrix[matrix.length-1][matrix.length-1] + matrix[matrix.length-1][0] + matrix[0][0] 
                        + matrix[matrix.length-1][matrix.length-2] + matrix[1][0];
                return counter;
            } else{
                if(x == 0){
                    //reszta górnej krawędzi
                    counter += matrix[matrix.length-1][y-1] + matrix[matrix.length-1][y] + matrix[matrix.length-1][y+1];
                    for(int i = 0; i < 2; i++){
                        for(int j = y-1; j < y+2; j++){
                            if(j != i){
                                counter += matrix[i][j];
                            }
                        }
                    }
                    return counter;
                }
            }
        }

        //dolna krawędź
        //lewy dolny róg
        if(x == matrix.length-1 && y == 0){
            counter += matrix[matrix.length-2][0] + matrix[matrix.length-2][1] + matrix[matrix.length-1][1]
                    + matrix[matrix.length-2][matrix.length-1] + matrix[matrix.length-1][matrix.length-1] 
                    + matrix[0][matrix.length-1] +  matrix[0][0] + matrix[0][1];
            return counter;
        } else{
            //prawy dolny róg
            if(x == matrix.length-1 && y == matrix[0].length-1){
                counter += matrix[matrix.length-2][matrix.length-1] + matrix[matrix.length-2][matrix[0].length-2] 
                        + matrix[matrix.length-1][matrix.length-2] + matrix[0][matrix.length-2] + matrix[0][matrix.length-1] 
                        + matrix[0][0] + matrix[matrix.length-1][0] + matrix[matrix.length-2][0];
                return counter;
            } else{
                //reszta dolnej krawędzi
                if(x == matrix.length-1){
                    counter += matrix[0][y-1] + matrix[0][y] + matrix[0][y+1]
                           + matrix[x][y-1] + matrix[x][y+1] + matrix[x-1][y-1] + matrix[x-1][y] + matrix[x-1][y+1];
                    return counter;
                }
            }
        }

        //prawa krawędź
        if(y == matrix.length-1){
            counter += matrix[x-1][matrix.length-2] + matrix[x][matrix.length-2] + matrix[x+1][matrix.length-2] + matrix[x-1][matrix.length-1] 
                    + matrix[x+1][matrix.length-1] + matrix[x-1][0] + matrix[x][0] + matrix[x+1][0];
                    System.out.println(counter);
            return counter;
        }
        
        //lewa krawędź
        if(y == 0){
            counter += matrix[x-1][0] + matrix[x+1][0] + matrix[x-1][1] + matrix[x][1] + matrix[x+1][1] + matrix[x-1][matrix.length-1] 
                    + matrix[x][matrix.length-1] + matrix[x+1][matrix.length-1];
            System.out.println(counter);
            return counter;
        }
        
        //pozostałe pola w tablicy
        if(x > 0 && x < matrix.length-1 && y > 0 && y < matrix.length-1){
            counter += matrix[x-1][y-1] + matrix[x-1][y] + matrix[x-1][y+1] + matrix[x][y-1] + matrix[x][y+1] + matrix[x+1][y-1] + matrix[x+1][y] 
                    + matrix[x+1][y+1];
        }

        return counter;
    }

    private int isNowAlive(int [][] matrix, int x, int y){
        if(matrix[x][y]==1){
            if(howManyNeighbours(matrix, x, y) < 2 || howManyNeighbours(matrix, x, y) > 3){
                return 0;
            } 
            if(howManyNeighbours(matrix, x, y) == 2 || howManyNeighbours(matrix, x, y) == 3){
                return 1;
            }
        }
        
        if(howManyNeighbours(matrix, x, y) == 3){
            return 1;
        }
        
        return 0;
    }

    public int [][] createNewMatrix(int [][] matrix){
        int [][] newMatrix = new int [matrix.length][];
        for(int i =0; i < matrix.length; i++){
            newMatrix[i] = matrix[i].clone();
        }
        for(int i = 0; i< matrix.length; i++){
            for(int j = 0; j< matrix.length; j++){
                newMatrix[i][j] = isNowAlive(matrix, i, j);
            }
        }
        return newMatrix;
    }

    private void printMatrix(int [][] matrix){
        for(int i = 0; i < matrix.length+2; i++){
            System.out.print("-");
        }
        System.out.println("\n");
        for(int i = 0; i < matrix.length; i++){
            System.out.print("|");
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j]);
                System.out.print("|");
            }
            //System.out.print("|");
            System.out.println("\n");
        }
        //System.out.println("\n");
        for(int i = 0; i < matrix.length+2; i++){
            System.out.print("-");
        }
        System.out.println("\n");
    }
    

    public static void main(String[] args) throws InterruptedException {
        GameOfLife program = new GameOfLife();
        int [][] matrix = new int[5][5];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                matrix[i][j] = 0;
            }
        }
        /*
        matrix[2][1] = 1;
        matrix[2][2] = 1;
        matrix[2][3] = 1;
        */
        matrix[1][1] = 1;
        matrix[2][2] = 1;
        matrix[1][3] = 1;
        matrix[2][3] = 1;
        matrix[3][2] = 1;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                //System.out.println(matrix[i][j]);
            }
        }
        program.printMatrix(matrix);
        for(int i = 0; i<10; i++){
            TimeUnit.SECONDS.sleep(1);
            matrix = program.createNewMatrix(matrix);
            program.printMatrix(matrix);
        }
    }
}
