package pl.sda.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class QuickEx {

    public static void main(String[] args) {
        int[] tab = new int[]{2, 9, 8, 5, 4, 7, 6};

        System.out.println("Middle: " + getMiddle(tab));
        System.out.println("Random: " + getRandom(tab));
        System.out.println("Lower: " + Arrays.toString(lowerArray(tab)));
        System.out.println("Lower stream: " +
                Arrays.toString(lowerArrayStream(tab)));
        System.out.println("Greater: " + Arrays.toString(greaterArray(tab)));
        System.out.println("Greater stream: " +
                Arrays.toString(greaterArrayStream(tab)));
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
}
