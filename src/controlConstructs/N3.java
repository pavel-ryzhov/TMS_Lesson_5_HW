package controlConstructs;

import java.util.Scanner;

/**
 * Для введенного числа t (температура на улице) вывести
 * Если t>–5, то вывести «Тепло».
 * Если –5>= t > –20, то вывести «Нормально».
 * Если –20>= t, то вывести «Холодно».
 */
public class N3 {
    public static void main(String[] args) {
        int t = new Scanner(System.in).nextInt();
        if (t > -5) {
            System.out.println("Тепло");
        } else if (t > -20) {
            System.out.println("Нормально");
        } else {
            System.out.println("Холодно");
        }
    }
}
