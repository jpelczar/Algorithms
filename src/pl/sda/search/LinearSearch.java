package pl.sda.search;

import java.util.List;

public class LinearSearch implements SearchAlgorithm {

    @Override
    public Integer search(Integer value, List<Integer> input) {
        return null;
    }


    /**
     * LinearSearch(x, A[0..n-1])
     *    for i <- 0 to n-1
     *      if A[i]=x
     *          return i;
     *    return no_result
     */
    @Override
    public Integer search(Integer value, Integer[] input) {

        for (int i = 0; i < input.length; i++) {
            if(input[i].equals(value)){
                return i;
            }
        }

        return -1;
    }
}
