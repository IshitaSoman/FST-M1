package Activities;
import java.util.Arrays;
import java.util.Random;

//import static java.util.DualPivotQuicksort.insertionSort;


import java.util.Arrays;
import java.util.Random;

public class Activity4 {

    public static void main(String[] args) {
        int[] array = generateRandomArray(10);

        System.out.println("Array before sorting: ");
        displayArray(array);

        insertionSort(array);

        System.out.println("\nArray after sorting: ");
        displayArray(array);
    }


    private static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }


    private static void displayArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Method to perform insertion sort
    private static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }
}
