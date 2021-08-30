package arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Создайте массив целых чисел. Удалите все вхождения заданного числа из массива.
 * Пусть число задается с консоли (класс Scanner). Если такого числа нет - выведите сообщения об этом.
 * В результате должен быть новый массив без указанного числа.
 */
public class N1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        System.out.println("Начальный массив: " + Arrays.toString(array));
        int a = new Scanner(System.in).nextInt();
        int counter = 0;
        for (int x: array){
            if (a == x) counter++;
        }
        if (counter == 0){
            System.out.println("Такого числа нет в массиве");
            return;
        }

        int[] newArray = new int[array.length - counter];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] != a){
                newArray[j] = array[i];
                j++;
            }
        }
        System.out.println("Новый массив: " + Arrays.toString(newArray));
    }
}
