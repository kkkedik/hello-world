package by.itacademy.hw3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        int triangleSide1 = getUserNum();
        int triangleSide2 = getUserNum();
        int triangleSide3 = getUserNum();
        if (triangleSide1 < 0 || triangleSide2 < 0 || triangleSide3 < 0) {
            System.out.println("Такой треугольник не может существовать, т.к одна либо несколько из сторон отрицательные, печалька(");
        } else {
            if (triangleSide1 > triangleSide2 + triangleSide3 || triangleSide2 > triangleSide1 + triangleSide3 || triangleSide3 > triangleSide1 + triangleSide2) {
                System.out.println("Такой треугольник не может существовать, т.к одна из сторон больше двух других");
            } else {
                System.out.println("Ты создал крутой треугольник со сторонами: " + triangleSide1 + "," + triangleSide2 + "," + triangleSide3 + ",");
            }
        }
    }

    public static int getUserNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длинну стороны треугольника: ");
        int number = scanner.nextInt();
        return number;
    }
}
