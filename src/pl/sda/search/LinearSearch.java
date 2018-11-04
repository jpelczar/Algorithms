package pl.sda.search;

import java.util.LinkedList;
import java.util.List;

public class LinearSearch<T extends Comparable<T>>
        implements SearchAlgorithm<T> {

    @Override
    public Integer search(T value, List<T> input) {
        return null;
    }


    /**
     * LinearSearch(x, A[0..n-1])
     * for i <- 0 to n-1
     * if A[i]=x
     * return i;
     * return no_result
     */
    @Override
    public Integer search(T value, T[] input) {

        for (int i = 0; i < input.length; i++) {
            if (input[i].equals(value)) {
                return i;
            }
        }

        return -1;
    }

    public List<Integer> searchAll(T value, T[] input) {

        List<Integer> results = new LinkedList<>();

        for (int i = 0; i < input.length; i++) {
            if (input[i].equals(value)) {
                results.add(i);
            }
        }

        return results;
    }
}
