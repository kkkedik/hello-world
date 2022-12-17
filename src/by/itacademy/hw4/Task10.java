package by.itacademy.hw4;

public class Task10 {
    public static void main(String[] args) {
        int array[][] = new int[10][10];
        getNumToArray(array);
        getMax(array);
    }

    public static void getNumToArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 100);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static void getMax(int[][] array) {
        int maxSum = 0;
        int maxSumStr = 0;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                maxSumStr += array[i][j];
            }
            if (maxSumStr > maxSum) {
                maxSum = maxSumStr;
                index = i + 1;
            }
            maxSumStr = 0;
        }
        System.out.println("Максимальная сумма: " + maxSum + " в строке: " + index);
    }
}
