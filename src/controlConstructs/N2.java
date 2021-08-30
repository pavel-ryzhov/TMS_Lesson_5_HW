package controlConstructs;

import java.util.Scanner;

/**
 * Напишите программу, которая будет принимать на вход число и на выход будет выводить сообщение четное число или нет.
 * Для определения четности числа используйте операцию получения остатка от деления - операция выглядит так: '% 2').
 */
public class N2 {
    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();
        System.out.println(a % 2 == 0 ? "число чётное" : "число нечётное");
    }
}
