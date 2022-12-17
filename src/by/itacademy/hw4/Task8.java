package by.itacademy.hw4;

public class Task8 {
    public static void main(String[] args) {
        int array1[] = new int[10];
        getNumToArray(array1);
        BubbleSort(array1);
        goToString(array1);
        int array2[] = new int[10];
        getNumToArray(array2);
        sortSelection(array2);
        goToString(array2);
        int array3[] = new int[10];
        getNumToArray(array3);
        sortInsert(array3);
        goToString(array3);
    }

    public static void goToString(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void getNumToArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void BubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    public static void sortSelection(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int pos = i;
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;
                    min = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = min;
        }
    }

    public static void sortInsert(int[] array) {
        int j;
        for (int i = 1; i < array.length; i++) {

            int swap = array[i];
            for (j = i; j > 0 && swap < array[j - 1]; j--) {
                array[j] = array[j - 1];
            }
            array[j] = swap;
        }
    }
}
