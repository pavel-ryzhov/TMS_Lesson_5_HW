package arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * Реализуйте алгоритм сортировки пузырьком.
 */
public class N7 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        System.out.println(Arrays.toString(array));


        for (int j = array.length; j > 1; j--){
            boolean isNotSorted = true;
            for (int i = 1; i < j; i++) {
                if (array[i - 1] > array[i]){
                    isNotSorted = false;
                    int a = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = a;
                }
            }
            if (isNotSorted){
                break;
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
