package additionalTasks;

/**
 * Выведите на экран первые 11 членов последовательности Фибоначчи
 */
public class N0 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        for (int i = 2; i < 11; i++) {
            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}
