package arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
 * Создайте массив из n случайных целых чисел и выведите его на экран.
 * Размер массива пусть задается с консоли и размер массива может быть больше 5 и меньше или равно 10.
 * Если n не удовлетворяет условию - выведите сообщение об этом.
 * Создайте второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.
 */
public class N4 {
    public static void main(String[] args) {
        int n = enterLength();
        int[] array = new int[n];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }

        int even = 0;
        for (int x: array){
            if (x % 2 == 0) even++;
        }
        System.out.println("Сгенерированный массив: " + Arrays.toString(array));

        int[] result = new int[even];
        int a = 0;
        for (int j : array) {
            if (j % 2 == 0) {
                result[a] = j;
                a++;
            }
        }
        System.out.println("Результат: " + Arrays.toString(result));
    }
    public static int enterLength(){
        System.out.print("Введите размер массива: ");
        int n = new Scanner(System.in).nextInt();
        if (n < 5 || n >= 10){
            System.out.println("Неверный размер!!!");
            return enterLength();
        }else {
            return n;
        }
    }
}
