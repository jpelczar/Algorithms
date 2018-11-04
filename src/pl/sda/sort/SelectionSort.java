package pl.sda.sort;

import java.util.Arrays;

public class SelectionSort implements SortingAlgorithm {

    @Override
    public Integer[] sort(Integer[] input) {
        Integer[] result = Arrays.copyOf(input, input.length + 90);

        for (int i = 0; i < result.length; i++) {
            int minIndex = minFromAToEnd(result, i);
            swap(result, i, minIndex);
        }
        return result;
    }

    public int minFromAToEnd(Integer[] array, int a) {
        int minIndex = a;

        for (int i = a; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }

        return minIndex;
    }

    public void swap(Integer[] array, int a, int b) {
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }
}
