package cycles;

import java.util.Scanner;

/**
 * Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа от 1 до введенного пользователем числа.
 * Для ввода числа воспользуйтесь классом Scanner.
 */
public class N2 {
    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();
        int b = 0;
        for (int i = 1; i < a; i++) {
            b += i;
        }
        System.out.println(b);
    }
}
