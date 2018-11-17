package pl.sda.sort;

import java.util.Random;

public class QuickEx {

    public static void main(String[] args) {
        int[] tab = new int[]{5, 7, 2, 1, 6, 9, 3};

        System.out.println("Middle: " + getMiddle(tab));
        System.out.println("Random: " + getRandom(tab));
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
}
