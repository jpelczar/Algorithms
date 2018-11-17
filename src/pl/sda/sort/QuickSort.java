package pl.sda.sort;

public class QuickSort implements SortingAlgorithm {
    @Override
    public Integer[] sort(Integer[] tab) {
        quicksort(tab, 0, tab.length - 1);

        return tab;
    }

/*
    QuickSort(A[0..N-1], left ,right)
        let mid <- (left+right)/2
        let j <- left
        let pivot <- A[mid]
        A[mid] <- A[right]
        for i <- left to right-1
            if A[i] <  pivot
                A[i] <-> A[j]
                j <- j+1
        A[right] <- A[j]
        A[j] <- pivot
        if left < j-1
            QuickSort(A, left, j-1)
        if j+1<right
            QuickSort(A, j+1, right)
        return A
     */

    private void quicksort(Integer[] tab, int left, int right) {
        int midIndex = (left + right) / 2;
        int j = left;
        int pivot = tab[midIndex];
        tab[midIndex] = tab[right];

        for (int i = left; i < right; i++) {
            if (tab[i] < pivot) {
                swap(tab, i, j);
                j++;
            }
        }

        tab[right] = tab[j];
        tab[j] = pivot;

        if (left < j - 1) {
            quicksort(tab, left, j - 1);
        }
        if (j + 1 < right) {
            quicksort(tab, j + 1, right);
        }
    }

    private void swap(Integer[] tab, int a, int b) {
        int temp = tab[a];
        tab[a] = tab[b];
        tab[b] = temp;
    }
}
