package pl.sda.sort;

public class HeapSort implements SortingAlgorithm{
    @Override
    public Integer[] sort(Integer[] input) {
        BuildHeap.execute(input);
        ShiftHeap.execute(input);
        return input;
    }
}
