package pl.sda.sort;

import java.util.Arrays;

public class SortMain {

    public static void main(String[] args) {

        Integer[] array = new Integer[]{3, 8, 1, 2, 9, 15, 11};

        SortingAlgorithm bubbleSort = new BubbleSort();

        Integer[] bubbleSrotResult = bubbleSort.sort(array);

        System.out.println("BS: " + Arrays.toString(bubbleSrotResult));

    }

}
