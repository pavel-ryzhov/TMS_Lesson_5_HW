package multidimensionalArrays;

import java.util.Arrays;
import java.util.Random;

/**
 * Создайте двумерный массив целых чисел.  Выведите на консоль сумму всех элементов массива.
 */
public class N3 {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(array));
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        System.out.printf("Сумма элементов: %d", sum);
    }
}
