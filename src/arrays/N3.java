package arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * Создайте 2 массива из 5 чисел.
 * 	Выведите массивы на консоль в двух отдельных строках.
 * 	Посчитайте среднее арифметическое элементов каждого массива
 * 	и сообщите, для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны)
 */
public class N3 {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            arr1[i] = random.nextInt();
            arr2[i] = random.nextInt();
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        double average1 = average(arr1);
        double average2 = average(arr2);

        if (average1 > average2){
            System.out.println("Среднее арифметическое элементов первого массива больше");
        }else if (average1 < average2){
            System.out.println("Среднее арифметическое элементов второго массива больше");
        }else {
            System.out.println("Средние арифметические элементов массивов равны");
        }
    }
    public static double average(int[] array){
        return Arrays.stream(array).reduce(Integer::sum).getAsInt() / (double)array.length;
    }
}
