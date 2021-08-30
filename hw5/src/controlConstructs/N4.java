package controlConstructs;

import java.util.Scanner;

/**
 * По введенному номеру определить цвет радуги (1 – красный, 4 – зеленый и т. д.)
 */
public class N4 {
    public static void main(String[] args) {
        int t = new Scanner(System.in).nextInt();
        if (t < 1 || t > 7){
            System.out.println("Неверный номер цвета");
            return;
        }
        switch (t){
            case 1:
                System.out.println("красный");
                break;
            case 2:
                System.out.println("оранжевый");
                break;
            case 3:
                System.out.println("жёлтый");
                break;
            case 4:
                System.out.println("зеленый");
                break;
            case 5:
                System.out.println("голубой");
                break;
            case 6:
                System.out.println("синий");
                break;
            case 7:
                System.out.println("фиолетовый");
                break;
        }
    }
}
