package pl.sda.sort;

public class SelectionEx {

    public static void main(String[] args) {
        SelectionEx selectionEx = new SelectionEx();

        int[] array = new int[]{5, 9, 3, 1, 15};

        int minIndex = selectionEx.min(array);

        System.out.println("Min value: " + array[minIndex] + " at index: "
                + minIndex);

        int minIndexFromAToB = selectionEx.minFromAToB(array, 0, 18888);

        System.out.println("From A to B. Min value: " + array[minIndexFromAToB]
                + " at index: " + minIndexFromAToB);
    }

    private int min(int[] array) {

        int minIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }

        return minIndex;
    }

    public int minFromAToB(int[] array, int a, int b) {
        if (a <= b && a < array.length && b < array.length && a >=0 && b >= 0) {

            int minIndex = a;

            for (int i = a; i <= b; i++) {
                if (array[i] < array[minIndex]) {
                    minIndex = i;
                }
            }

            return minIndex;
        }

        return -1;
    }

}
