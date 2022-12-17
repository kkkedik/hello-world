package by.itacademy.hw4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберете какое положительное число будете вводить и будем считать сумму и произведение его чисе. \n1.Двузначное \n2.Трехзначное \n3.Четырехзначное \n4.Пятизначное");
        int choice = scanner.nextInt();
        int sum = 0;
        int productOfNum = 0;
        int currentNum;
        int num10;
        int num100;
        int num1000;
        int num10000;
        if (choice > 0 && choice < 5) {
            switch (choice) {
                case 1:
                    System.out.println("Введите двузначное число");
                    int num1 = scanner.nextInt();
                    currentNum = num1 % 10;
                    num10 = num1 / 10 % 10;
                    sum = num10 + currentNum;
                    productOfNum = num10 * currentNum;
                    break;
                case 2:
                    System.out.println("Введите трехзначное число");
                    int num2 = scanner.nextInt();
                    currentNum = num2 % 10;
                    num10 = num2 / 10 % 10;
                    num100 = num2 / 100;
                    sum = num10 + num100 + currentNum;
                    productOfNum = num10 * num100 * currentNum;
                    break;
                case 3:
                    System.out.println("Введите четырехзначное число");
                    int num3 = scanner.nextInt();
                    currentNum = num3 % 10;
                    num10 = num3 / 10 % 10;
                    num100 = num3 / 100 % 10;
                    num1000 = num3 / 1000;
                    sum = num10 + num100 + num1000 + currentNum;
                    productOfNum = num10 * num100 * num1000 * currentNum;
                    break;
                case 4:
                    System.out.println("Введите пятизначное число");
                    int num4 = scanner.nextInt();
                    currentNum = num4 % 10;
                    num10 = num4 / 10 % 10;
                    num100 = num4 / 100 % 10;
                    num1000 = num4 / 1000 % 10;
                    num10000 = num4 / 10000 % 10;
                    sum = num10 + num100 + num1000 + num10000 + currentNum;
                    productOfNum = num10 * num100 * num1000 * num10000 * currentNum;
                    break;
            }
        } else {
            System.out.println("Число не входит в диапазон от 1 до 4");
        }
        System.out.println("Сумма цифр числа: " + sum + " Произведение цифр числа: " + productOfNum);
    }
}

