package by.itacademy.hw2;

public class Task4 {
    public static void main(String[] args) {
        implicitConversion();
        explicitConversion();
    }

    // креатив покинул чат(
    // как я понял явное и неявное надо
    public static double implicitConversion() {
        byte i = 10;
        short i1 = i;
        int i2 = i + 1;
        long i3 = i + 2;
        float k1 = i2 + 10;
        double k2 = i3 + 20;
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(k1);
        System.out.println(k2);
        return i;
    }

    public static double explicitConversion() {
        long i3 = 40;
        double k2 = 10.4;
        float k1 = (float) k2;
        int i2 = (int) i3;
        short i1 = (short) i2;
        byte i = (byte) i1;
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(k1);
        System.out.println(k2);
        return i;
    }
}
