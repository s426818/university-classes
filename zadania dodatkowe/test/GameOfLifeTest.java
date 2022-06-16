import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Before;
import org.junit.Test;

import smallFunctions.GameOfLife;

public class GameOfLifeTest {
    private int [][] matrix = new int [5][5];
    private int [][] cloneMatrix = new int [5][5];
    private GameOfLife game = new GameOfLife();

    @Before
    public void prepareMatrix(){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                matrix[i][j] = 0;
                cloneMatrix[i][j] = 0;
            }
        }
    }

    @Test
    public void test(){
        assertTrue(true);
    }

    @Test
    public void shouldBeBlockStill(){
        for(int i = 1; i < 3; i++){
            for(int j = 1; j < 3; j++){
                matrix[i][j] = 1;
                cloneMatrix[i][j] = 1;
            }
        }
        for(int i = 0; i < 10; i++){
            matrix = game.createNewMatrix(matrix);
        }
        //assertEquals(cloneMatrix, matrix);

        assertArrayEquals(cloneMatrix, matrix);
    }

    @Test
    public void shouldOscillateBlinkerRow(){
        for(int i = 1; i < 4; i++){
            matrix[i][2] = 1;
            cloneMatrix[i][2] = 1;
        }
        for(int i = 0; i < 10; i++){
            matrix = game.createNewMatrix(matrix);
        }
        assertArrayEquals(cloneMatrix, matrix);
    }

    @Test
    public void shouldOscillateBlinkerColumn(){
        for(int i = 1; i < 4; i++){
            matrix[i][2] = 1;
            cloneMatrix[2][i] = 1;
        }
        for(int i = 0; i < 11; i++){
            matrix = game.createNewMatrix(matrix);
        }
        assertArrayEquals(cloneMatrix, matrix);
    }
}
