package by.itacademy.hw2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of seconds: ");
        int sec = scanner.nextInt();
        int secInWeek = 604800;
        int secInDay = 68400;
        int secInHour = 3600;
        int numOfWeeks = sec / secInWeek;
        int numOfDays = sec % secInWeek / secInDay;
        int numOfHours = sec % secInWeek % secInDay / secInHour;
        int numOfMin = sec % secInWeek % secInDay % secInHour / 60;
        int numOfSec = sec % 60;
        System.out.println("Weeks :" + numOfWeeks);
        System.out.println("Days :" + numOfDays);
        System.out.println("Hours :" + numOfHours);
        System.out.println("Min :" + numOfMin);
        System.out.println("Sec :" + numOfSec);
    }
}
