package controlConstructs;

import java.util.Scanner;

/**
 * Написать программу для вывода названия поры года по номеру месяца.
 * При решении используйте оператор switch-case.
 */
public class N0 {
    public static void main(String[] args) {
        System.out.print("Enter the month number: ");
        int month = new Scanner(System.in).nextInt();
        if (month < 1 || month > 12){
            System.out.println("Wrong month number");
            return;
        }
        switch (month){
            case 12:
            case 1:
            case 2:
                System.out.println("winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("summer");
                break;
            default:
                System.out.println("autumn");
        }
    }
}
