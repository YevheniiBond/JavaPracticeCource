package basic.bubbleSort;

import java.util.Arrays;

public class MyDummyArray {
    public static void main(String[] args) {
        int[] myArray = {9, 3, 8, 1, 6, 4, 7};
     sorting(myArray);
        System.out.println(Arrays.toString(myArray));
    }


    public static void sorting(int[] myArray) {
        for (int i = 0; i < myArray.length; i++)
            for (int j = 1; j < myArray.length; j++)
                if (myArray[j] < myArray[j - 1]){
                    int semp = myArray[j];
                    myArray[j]=myArray[j-1];
                    myArray[j-1] = semp;
                }

    }
}
