package cycles;

/**
 * Вывести 10 первых чисел последовательности 0, -5,-10,-15..
 */
public class N4 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i * -5 + " ");
        }
    }
}
