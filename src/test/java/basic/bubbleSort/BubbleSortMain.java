package basic.bubbleSort;

import java.util.Arrays;

public class BubbleSortMain {
    public static void main(String[] args) {
        int[] numbers = {4, 9, 1, 7, 3, 0, 2, 10};
        Object sorter = new BubbleSorting();
        ((BubbleSorting) sorter).sort(numbers);
        System.out.println(Arrays.toString(numbers));

    }
}
