package arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Создайте и заполните массив случайным числами и выведете максимальное, минимальное и среднее значение.
 * Для генерации случайного числа используйте метод Math.random().
 * Пусть будет возможность создавать массив произвольного размера.
 * Пусть размер массива вводится с консоли.
 */
public class N2 {
    public static void main(String[] args) {
        System.out.print("Введите размер массива: ");
        int length = new Scanner(System.in).nextInt();

        if (length < 1) return;

        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * Integer.MAX_VALUE);
        }

        System.out.printf("Максимальное значение: %d\n", maxValue(array));
        System.out.printf("Минимальное значение: %d\n", minValue(array));
        System.out.printf("Среднее значение: %d\n", Arrays.stream(array).reduce(Integer::sum).getAsInt() / array.length);

    }
    public static int maxValue(int[] array){
        int result = array[0];
        for (int x: array){
            if (x > result) result = x;
        }
        return result;
    }
    public static int minValue(int[] array){
        int result = array[0];
        for (int x: array){
            if (x < result) result = x;
        }
        return result;
    }
}
