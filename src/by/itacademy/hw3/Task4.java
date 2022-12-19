package by.itacademy.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a > b && b > c)
            System.out.println(c + " " + b + " " + a);
        if (a > b && b < c && a > c)
            System.out.println(b + " " + c + " " + a);
        if (a > b && c > b && a < c)
            System.out.println(b + " " + a + " " + c);
        if (a < b && c > a)
            System.out.println(c + " " + a + " " + b);
        if (a < b && c < a && b > c)
            System.out.println(a + " " + c + " " + b);
        if (a < b && c < a && b < c)
            System.out.println(a + " " + b + " " + c);
    }

}
