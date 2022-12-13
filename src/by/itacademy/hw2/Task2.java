package by.itacademy.hw2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number: ");
        double number1 = scanner.nextDouble();
        System.out.println("Second number: ");
        double number2 = scanner.nextDouble();
        System.out.println(sumAndProduct(number1, number2));
    }

    public static double sumAndProduct(double number1, double number2) {
        double sum = number1 + number2;
        double product = number1 * number2 + sum;
        return product;
    }
}
