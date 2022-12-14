package by.itacademy.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Введите %s число: \n", i + 1);
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        //for (int i = 0; i < array.length; i++) {
        //    System.out.print(array[i] + " ");
        //}
    }

}
