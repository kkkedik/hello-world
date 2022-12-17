package by.itacademy.hw4;

public class Task9 {
    public static void main(String[] args) {
        //начинать можно и с 1001 т.к это будет первое совпадение
        int count = 0;
        for (int i = 1; i < 1000000; i++) {


            int currentNum = i % 10;
            int num10 = i / 10 % 10;
            int num100 = i % 1000 / 100;
            int sumRight = num10 + num100 + currentNum;

            int num1000 = i / 1000 % 10;
            int num10000 = i / 10000 % 10;
            int num100000 = i / 100000 % 10;
            int sumLeft = num1000 + num10000 + num100000;

            if (sumLeft == sumRight) {
                count++;
            }
        }
        System.out.println(count);
    }
}
