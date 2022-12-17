package by.itacademy.hw4;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[] = new int[10];
        int numOfPositive = 0;
        int numOfNegative = 0;
        for (int i = 0, p = 1; i < array.length; i++, p++) {
            System.out.println("Введите " + p + " число массива : ");
            array[i] = scanner.nextInt();
            if (array[i] < 0) {
                numOfNegative++;
            } else {
                numOfPositive++;
            }
        }
        goToString(array);
        int positive[] = new int[numOfPositive];
        int negative[] = new int[numOfNegative];
        for (int i = 0, p = 0, t = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                positive[p++] = array[i];
            } else {
                negative[t++] = array[i];
            }
        }
        goToString(negative);
        goToString(positive);
    }

    public static void goToString(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
