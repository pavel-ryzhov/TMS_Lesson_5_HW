package controlConstructs;

import java.util.Scanner;

/**
 * Написать программу для вывода названия поры года по номеру месяца.
 * При решении используйте оператор if-else-if.
 */
public class N1 {
    public static void main(String[] args) {
        System.out.print("Enter the month number: ");
        int month = new Scanner(System.in).nextInt();
        if (month < 1 || month > 12){
            System.out.println("Wrong month number");
            return;
        }
        if (month <= 2 || month == 12){
            System.out.println("winter");
        }else if (month <= 5){
            System.out.println("spring");
        }else if (month <= 8){
            System.out.println("summer");
        }else {
            System.out.println("autumn");
        }
    }
}
