package multidimensionalArrays;

import java.util.Arrays;
import java.util.Random;

/**
 * Создайте двумерный массив целых чисел.  Отсортируйте элементы в строках двумерного массива по возрастанию.
 */
public class N5 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(array));

        for (int[] x: array){
            Arrays.sort(x);
        }
        System.out.println(Arrays.deepToString(array));
    }
}
