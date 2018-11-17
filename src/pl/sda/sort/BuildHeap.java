package pl.sda.sort;

public class BuildHeap {

    /*
    BuildHeap(A[0..N-1])
	for i <- 1 to n-1
		let currentNodeIndex <- i
		let parentIndex <- GetParentIndex(currentNodeIndex)
		let insertedValue <- A[i]
		while parentIndex >= 0 and A[parentIndex] < insertedValue
			A[currentNodeIndex] <- A[parentIndex]
			currentNodeIndex <- parentIndex
			parentIndex <- GetParentIndex(currentNodeIndex)
		A[currentNodeIndex] <- insertedValue
	return A

     */

    public static void execute(Integer[] tree) {
        for (int i = 1; i < tree.length; i++) {
            int currentNodeIndex = i;
            int parentIndex = HeapHelper.getParentIndex(currentNodeIndex);
            int insertedValue = tree[i];

            while (parentIndex >= 0 && tree[parentIndex] < insertedValue) {
                tree[currentNodeIndex] = tree[parentIndex];
                currentNodeIndex = parentIndex;
                parentIndex = HeapHelper.getParentIndex(currentNodeIndex);
            }

            tree[currentNodeIndex] = insertedValue;
        }
    }

}
