package pl.sda.sort;

public class ShiftHeap {

    /*
    ShiftHeap(A[0..N-1])
	for i <- n-1 to 1
		A[0] <-> A[i]
		let parentIndex <- 0
		let leftChildIndex <- 1
		while leftChildIndex < i
			let greaterChildIndex <- leftChildIndex
			let rightChildIndex <- leftChildIndex + 1
			if rightChildIndex < i and A[rightChildIndex] > A[leftChildIndex]
				greaterChildIndex <- rightChildIndex
			if A[greaterChildIndex] <= A[parentIndex]
				break
			A[parentIndex] <-> A[greaterChildIndex]
			parentIndex <- greaterChildIndex
			leftChildIndex <- getLeftChild(parentIndex)
	return A

     */

    public static void execute(Integer[] tree) {
        for (int i = tree.length - 1; i > 0; i--) {
            swap(tree, 0, i);
            int parentIndex = 0;
            int leftChildIndex = 1;
            while (leftChildIndex < i) {
                int greaterChildIndex = leftChildIndex;
                int rightChildIndex = leftChildIndex + 1;
                if (rightChildIndex < i &&
                        tree[rightChildIndex] > tree[leftChildIndex]) {
                    greaterChildIndex = rightChildIndex;
                }
                if (tree[greaterChildIndex] <= tree[parentIndex]) {
                    break;
                }

                swap(tree, parentIndex, greaterChildIndex);
                parentIndex = greaterChildIndex;
                leftChildIndex = HeapHelper.getLeftSonIndex(parentIndex);
            }
        }
    }

    private static void swap(Integer[] tab, int a, int b) {
        int temp = tab[a];
        tab[a] = tab[b];
        tab[b] = temp;
    }

}
