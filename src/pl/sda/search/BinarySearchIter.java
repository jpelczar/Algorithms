package pl.sda.search;

import java.util.List;

public class BinarySearchIter implements SearchAlgorithm {
    @Override
    public Integer search(Integer value, List<Integer> input) {
        return null;
    }

    /**
     * BinarySearchIter(A[0..N-1], value)
     *     low = 0
     *     high = N - 1
     *     while low <= high
     *         mid = (low + high) / 2
     *         if A[mid] > value
     *             high = mid - 1
     *         else if A[mid] < value
     *             low = mid + 1
     *         else
     *             return mid
     *     return not_found
     */
    @Override
    public Integer search(Integer value, Integer[] input) {
        int low = 0;
        int high = input.length - 1;

        while (low <= high) {
            int mid = (low + high)/2;
            if (input[mid] > value) {
                high = mid - 1;
            } else if (input[mid] < value) {
                low = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
