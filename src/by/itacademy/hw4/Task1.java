package by.itacademy.hw4;

public class Task1 {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            for (int k = 1; k < 11; ) {
                // попытка сделать красиво в столбики, со смещением, но работает
                // System.out.println(i + "*" + k + "=" + i * k++ + "  " + i + "*" + k + "=" + i * k++ + "  " + i + "*" + k + "=" + i * k++ + "  " + i + "*" + k + "=" + i * k++ + "  " + i + "*" + k + "=" + i * k++ + "  " + i + "*" + k + "=" + i * k++ + "  " + i + "*" + k + "=" + i * k++ + "  " + i + "*" + k + "=" + i * k++ + "  " + i + "*" + k + "=" + i * k++ + "  " + i + "*" + k + "=" + i * k++ + "  ");
                // ниже одекватно желаемое
                System.out.println(i + "*" + k + "=" + i * k++);
            }
        }
    }
}
