package pl.sda.search;

public class BinaryEx {

    public static void main(String[] args) {
        int[] seven = new int[]{0, 1, 2, 3, 4, 5, 6};
        int[] six = new int[]{0, 1, 2, 3, 4, 5};

        System.out.println("Middle for seven v1: " + getMiddleIndex(seven));
        System.out.println("Middle for seven v2: " + getMiddleIndexV2(seven));

        System.out.println("Middle for six v1: " + getMiddleIndex(six));
        System.out.println("Middle for six v2: " + getMiddleIndexV2(six));

        System.out.println();
        System.out.println("Print to index");
        printToIndex(4, seven);

        System.out.println();
        System.out.println("Print from index");
        printFromIndex(4, seven);


        System.out.println();
        System.out.println("Fibb 0: " + fibonacci(0));
        System.out.println("Fibb 1: " + fibonacci(1));
        System.out.println("Fibb 2: " + fibonacci(2));
        System.out.println("Fibb 3: " + fibonacci(3));
        System.out.println("Fibb 4: " + fibonacci(4));
        System.out.println("Fibb 5: " + fibonacci(5));
        System.out.println("Fibb 6: " + fibonacci(6));

    }

    private static int getMiddleIndex(int[] array) {
        return array.length / 2;
    }

    private static int getMiddleIndexV2(int[] array) {
        if (array.length % 2 == 0)
            return array.length / 2 - 1;

        return array.length / 2;
    }


    private static void printToIndex(int a, int[] arr) {
        for (int i = 0; i <= a; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void printFromIndex(int b, int arr[]) {
        for (int i = b; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static int fibonacci(int index) {
        if (index == 0) {
            return 0;
        } else if (index == 1) {
            return 1;
        }

        return fibonacci(index - 1) +
                fibonacci(index - 2);
    }
}
