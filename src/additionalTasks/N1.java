package additionalTasks;

import java.util.Scanner;

/**
 * За каждый месяц банк начисляет к сумме вклада 7% от суммы. Напишите программу, в которую пользователь вводит сумму вклада и количество месяцев. А банк вычисляет конечную сумму вклада с учетом начисления процентов за каждый месяц.
 * Для вычисления суммы с учетом процентов используйте цикл for. Пусть сумма вклада будет представлять тип float.
 */
public class N1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму вклада: ");
        float amount = scanner.nextFloat();
        System.out.print("Введите количество месяцев: ");
        int months = scanner.nextInt();
        for (int i = 0; i < months; i++) {
            amount += amount * 0.07;
        }
        System.out.println(amount);
    }
}
