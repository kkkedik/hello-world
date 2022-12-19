package by.itacademy.hw3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int choice = scanner.nextInt();
        if (choice > 0 && choice < 8) {
            switch (choice) {
                case 1:
                    System.out.println("Понедельник");
                    break;
                case 2:
                    System.out.println("Вторник");
                    break;
                case 3:
                    System.out.println("Среда");
                    break;
                case 4:
                    System.out.println("Четверг");
                    break;
                case 5:
                    System.out.println("Пятница");
                    break;
                case 6:
                    System.out.println("Выходной");
                    break;
                case 7:
                    System.out.println("Выходной");
                    break;
            }
        } else {
            System.out.println("Число не входит в диапазон от 1 до 7");
        }
    }
}
