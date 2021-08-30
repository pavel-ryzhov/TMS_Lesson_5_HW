package multidimensionalArrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Создать трехмерный массив из целых чисел. С помощью циклов "пройти" по всему массиву и увеличить каждый элемент на заданное число.
 * Пусть число, на которое будет увеличиваться каждый элемент, задается из консоли.
 */
public class N0 {
    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();
        int[][][] array = new int[3][3][3];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] = random.nextInt();
                }
            }
        }
        System.out.println(Arrays.deepToString(array));

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] += a;
                }
            }
        }

        System.out.println(Arrays.deepToString(array));
    }
}
