package multidimensionalArrays;

/**
 * Создайте двумерный массив.  Выведите на консоль диагонали массива.
 */
public class N4 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i][i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i][array.length - i - 1] + " ");
        }
    }
}
