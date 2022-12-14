package by.itacademy.hw3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 0 до 59: ");
        int num = scanner.nextInt();
        if (num >= 0 && num < 60) {
            if (num > 0 && num < 16) {
                System.out.println("Первая четверть");
            } else if (num > 15 && num < 30) {
                System.out.println("Вторая четверь");
            }else if (num > 29 && num < 45) {
                System.out.println("Третья четверь");
            } else if (num > 44 && num < 59) {
                System.out.println("Четвертая четверь");
            }
            else {
                System.out.println("Промашка, столько минут не бывает, попробуй ещё раз");
            }
        }
    }
}
