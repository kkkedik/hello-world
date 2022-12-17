package by.itacademy.hw4;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[] = new int[5];
        for (int i = 0, p = 1; i < array.length; i++, p++) {
            System.out.println("Введите " + p + " число массива : ");
            array[i] = scanner.nextInt();
            for (; array[i] < -100000;) {
                System.out.println("Введите " + p + " число массива от - 100000 до +бесконечности: ");
                array[i] = scanner.nextInt();
            }
        }
        System.out.println("Максимальный элемент массива: " + getMax(array));
    }

    private static int getMax(int[] array) {
        int max = -100000;
        for (int i = 1; i < array.length; ) {
            if (array[i] > max) {
                max = array[i];
                i += 2;
                System.out.println(max);
            }
        }
        return max;
    }
}
