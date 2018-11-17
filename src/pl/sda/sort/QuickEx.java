package pl.sda.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class QuickEx {

    public static void main(String[] args) {
        int[] tab = new int[]{2, 9, 8, 5, 4, 7, 6};

//        System.out.println("Middle: " + getMiddle(tab));
//        System.out.println("Random: " + getRandom(tab));
//        System.out.println("Lower: " + Arrays.toString(lowerArray(tab)));
//        System.out.println("Lower stream: " +
//                Arrays.toString(lowerArrayStream(tab)));
//        System.out.println("Greater: " + Arrays.toString(greaterArray(tab)));
//        System.out.println("Greater stream: " +
//                Arrays.toString(greaterArrayStream(tab)));
//        System.out.println("Concat: " + Arrays.toString(concatArrays(tab)));


        lowerGreaterTab(tab);
        System.out.println("Lower Greater: " +
                Arrays.toString(tab));
    }

    private static int getMiddle(int[] tab) {

        int length = tab.length;
        int middle = length / 2;

        return tab[middle];
    }

    private static int getRandom(int[] tab) {

        int random = new Random().nextInt(tab.length);

        return tab[random];
    }

    private static Integer[] lowerArray(int[] tab) {
        int midVal = getMiddle(tab);
        List<Integer> result = new ArrayList<>();

        for (int aTab : tab) {
            if (midVal > aTab) {
                result.add(aTab);
            }
        }

        return result.toArray(new Integer[]{});
    }

    private static int[] lowerArrayStream(int[] tab) {
        int midVal = getMiddle(tab);

        return Arrays.stream(tab)
                .filter(tabVal -> tabVal < midVal)
                .toArray();
    }

    private static Integer[] greaterArray(int[] tab) {
        int midVal = getMiddle(tab);
        List<Integer> result = new ArrayList<>();

        for (int aTab : tab) {
            if (midVal < aTab) {
                result.add(aTab);
            }
        }

        return result.toArray(new Integer[]{});
    }

    private static int[] greaterArrayStream(int[] tab) {
        int midVal = getMiddle(tab);

        return Arrays.stream(tab)
                .filter(tabVal -> tabVal > midVal)
                .toArray();
    }

    private static int[] concatArrays(int[] tab) {
        int midVal = getMiddle(tab);
        int[] lower = lowerArrayStream(tab);
        int[] greater = greaterArrayStream(tab);

        int[] result = new int[tab.length];

        for (int i = 0; i < lower.length; i++) {
            result[i] = lower[i];
        }

        result[lower.length] = midVal;

        for (int i = lower.length + 1; i < result.length; i++) {
            result[i] = greater[i - (lower.length + 1)];
        }

        return result;
    }


    private static void lowerGreaterTab(int[] tab) {

        int midVal = getMiddle(tab); //pivot
        int midIndex = tab.length / 2; //pivot index

        swap(tab, midIndex, tab.length - 1); //ustawiamy pivot na końcu, a element ostatni na pivotIndex

        int j = 0; //j to pierwszy większy element od pivota

        //pętla od początku do przedostatniego elementu
        for (int i = 0; i < tab.length - 1; i++) {
            if (tab[i] <= midVal) { //sprawdzamy czy wrtośc spod i jest mniejsza lub równa pivot
                swap(tab, i, j); //jeśli tak to zamiana elemntów w tablicy i <-> j
                j++; //pierwszy większy element od pivot jest na pozycji j++ po zamianie wartości
            }
        }

        swap(tab, j, tab.length - 1); //zamiana pivota z pierwszym większym od niego elementem
    }

    private static void swap(int[] tab, int a, int b) {
        int temp = tab[a];
        tab[a] = tab[b];
        tab[b] = temp;
    }
}
