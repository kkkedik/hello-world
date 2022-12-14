package by.itacademy.hw3;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Введите целое однозначное число от -9 до 9: ");
        int userNum1 = getUserNum();
        System.out.println("Введите целое однозначное число -9 до 9: ");
        int userNum2 = getUserNum();
        int multiplication = userNum1 * userNum2;
        if (userNum1 > 9 || userNum1 < -9 || userNum2 > 9 || userNum2 < -9) {
            System.out.println("Одно либо оба введённых числа не подходят по условию условия");
        } else {
            System.out.println("Введите произведение введённых чисел: ");
            int multiplicationUser = getUserNum();

            if (multiplication == multiplicationUser) {
                System.out.println("Умничка,верно посчитал)");
            } else {
                System.out.println("Мда, ну ты и человек, учись считать, верный ответ: " + multiplication);
            }
        }
    }

    public static int getUserNum() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }
}

