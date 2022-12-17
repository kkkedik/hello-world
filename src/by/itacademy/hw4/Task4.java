package by.itacademy.hw4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrTry1[] = new int[5];
        for (int i = 0, p = 1; i < arrTry1.length; i++, p++) {
            System.out.println("Введите " + p + " число массива от - 100 до 100: ");
            arrTry1[i] = scanner.nextInt();
            for (; arrTry1[i] < -100 || arrTry1[i] > 100; ) {
                System.out.println("Введите " + p + " число массива от - 100 до 100: ");
                arrTry1[i] = scanner.nextInt();
            }
        }

        System.out.println("Максимальный индекс элемента: " + getIndexOfMax(arrTry1));
        System.out.println("Минимальный индекс элемента: " + getIndexOfMin(arrTry1));
    }

    private static int getIndexOfMax(int[] array) {
        int max = 0;
        int indexOfMax = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                indexOfMax = i;
            }
        }
        return indexOfMax;
    }

    private static int getIndexOfMin(int[] array) {
        int min = 0;
        int indexOfMin = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                indexOfMin = i;
            }
        }
        return indexOfMin;
    }
}
