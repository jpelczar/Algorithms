package pl.sda.search;

public class Main {

    public static void main(String[] args) {

        Integer[] array = new Integer[]{9, 13, 5, 2, 9, 7, 4};

        SearchAlgorithm searchAlgorithm = new LinearSearch();

        int result = searchAlgorithm.search(17, array);

        System.out.println("Linear " + result);



        Integer[] sortedArr = new Integer[]{1, 5, 8, 12, 15};

        SearchAlgorithm binary = new BinarySearchIter();

        int binaryResult = binary.search(9, sortedArr);

        System.out.println("Binary " + binaryResult);
    }
}
