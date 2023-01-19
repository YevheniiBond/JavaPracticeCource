package basic.bubbleSort;

import org.testng.annotations.Test;

import java.util.Arrays;

public class Repeating {
   static int[] listOfElements = {1, 9, 2, 10, 4, 8, 6, 5};


    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++)
            for (int j = 1; j < array.length; j++)
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;;
                }
    }

    public static void main(String[] args) {
        bubbleSort(listOfElements);
        System.out.println(Arrays.toString(listOfElements));
    }
}
