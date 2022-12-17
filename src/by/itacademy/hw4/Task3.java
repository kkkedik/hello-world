package by.itacademy.hw4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int num = getNum();
        int sum = 0;
        int p =+2;
        for (int i = 0; i <= num; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static int getNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        return number;
    }
}
