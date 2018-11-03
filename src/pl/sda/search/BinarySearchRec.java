package pl.sda.search;

import java.util.List;

public class BinarySearchRec<T extends Comparable<T>>
        implements SearchAlgorithm<T> {
    @Override
    public Integer search(T value, List<T> input) {
        return null;
    }

    @Override
    public Integer search(T value, T[] input) {
        return searchRec(value, input, 0, input.length - 1);
    }

    private Integer searchRec(T value, T[] input, int low, int high) {
        if (high < low) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (input[mid].compareTo(value) > 0) {
            return searchRec(value, input, low, mid - 1);
        } else if (input[mid].compareTo(value) < 0) {
            return searchRec(value, input, mid + 1, high);
        } else {
            return mid;
        }
    }
}
