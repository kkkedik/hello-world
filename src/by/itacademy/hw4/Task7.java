package by.itacademy.hw4;

public class Task7 {
    public static void main(String[] args) {
        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        goToString(array);
        // был вариант вывести массив в обратном порядке, но это я так понял не то
        // можно так же создать второй массив, записать в него в обратном порядке
        // значения и перезаписать в основном массиве значения, но я посчитал,
        // что то, что ниже более рационально, надеюсь подрозумевалось именно это

        int blank[] = new int[10];
        for (int i = 0, p = blank.length - 1; i < array.length; i++, p--) {
            blank[p] = array[i];
        }
        array = blank;
        goToString(array);
    }

    public static void goToString(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
