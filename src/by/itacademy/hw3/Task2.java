package by.itacademy.hw3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        if (num % 2 == 0 && num < 0) {
            System.out.println("Число чётное и отрицательное");
        } else if (num % 2 != 0 && num > 0) {
            System.out.println("Число нечётное и положительное");
        } else {
            System.out.println("Число не попало в промежуток необходимых значений");
        }
    }
}
