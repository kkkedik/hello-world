package by.itacademy.hw2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        if (num % 2 == 0){
            System.out.println("Even number");
        } else {
            System.out.println("Not even number");
        }
    }
}
