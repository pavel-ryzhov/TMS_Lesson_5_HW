package arrays;

import java.util.Scanner;

/**
 * Создайте массив целых чисел. Напишете программу, которая выводит сообщение о том, входит ли заданное число в массив или нет.
 * Пусть число для поиска задается с консоли (класс Scanner).
 */
public class N0 {
    public static void main(String[] args) {
        int[] array = {54, 6, 2, 9834, 3489, 2934};
        int a = new Scanner(System.in).nextInt();
        for (int x: array){
            if (x == a){
                System.out.println("Массив содержит введённое число");
                return;
            }
        }
        System.out.println("Массив не содержит введённое число");
    }
}
