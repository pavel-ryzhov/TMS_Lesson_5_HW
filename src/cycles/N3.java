package cycles;

/**
 * Необходимо, чтоб программа выводила на экран вот такую последовательность:
 * 7 14 21 28 35 42 49 56 63 70 77 84 91 98.
 * В решении используйте цикл while.
 */
public class N3 {
    public static void main(String[] args) {
        int a = 1;
        while (a < 15){
            System.out.print(a * 7 + " ");
            a++;
        }
    }
}
