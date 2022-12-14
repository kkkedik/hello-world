package by.itacademy.hw3;


public class Task8 {
    public static void main(String[] args) {
        int maxNumOfSec = 28800;
        int randomSec = (int) (Math.random() * ++maxNumOfSec);
        System.out.println("Для Петрова в секундах: " + randomSec);
        System.out.println("Для рабочих в часах до конца дня осталось: " + randomSec / 3600 + " часов");
    }
}
