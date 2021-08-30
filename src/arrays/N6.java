package arrays;

import java.util.Arrays;

/**
 * Создайте массив строк. Заполните его произвольными именами людей.
 * Отсортируйте массив.
 * Результат выведите на консоль.
 */
public class N6 {
    public static void main(String[] args) {
        String[] names = {"Вася", "Петя", "Сергей", "Иван", "Саша"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
    }
}
