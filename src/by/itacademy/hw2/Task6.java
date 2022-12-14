package by.itacademy.hw2;

import java.util.Scanner;

public class Task6 {


    public static void main(String[] args) {
        double num1 = Math.abs(getNum());
        double num2 = Math.abs(getNum());
        double num3 = Math.abs(getNum());
        if (num1 < num2) {
            if (num1 < num3) {
                System.out.println("Min: " + num1);
            } else {
                System.out.println("Min: " + num3);
            }
        } else {
            if (num2 < num3) {
                System.out.println("Min: " + num2);
            } else {
                System.out.println("Min: " + num3);
            }
        }
    }

    public static double getNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        double number = scanner.nextDouble();
        return number;
    }
}
