package pl.sda.sort;

import java.util.Arrays;

public class BubbleEx {

    public static void main(String[] args) {
        BubbleEx bubbleEx = new BubbleEx();

        int[] array = new int[]{0, 1, 2, 3, 4, 5};

        bubbleEx.swap(array, 0, 4);

        System.out.println(Arrays.toString(array));

        bubbleEx.ex2(array);

        System.out.println("******************");

        bubbleEx.ex3(array);

        System.out.println("******************");

        bubbleEx.ex4(array);

        System.out.println("******************");

        bubbleEx.ex5(array);
    }


    private void swap(int[] array, int a, int b) {
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }

    private void ex2(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + ":" + array[i]);
            if (i != array.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]");
        System.out.println();
    }

    private void ex3(int[] array) {
        for (int i = 0; i < array.length; i++) {
            ex2(array);
        }
    }


    private void ex4(int[] array) {
        for (int a = 0; a < array.length; a++) {
            if (a > 0) {
                swap(array, a - 1, a);
            }
            ex2(array);
        }
    }

    /**
     * 1,2,3
     * 1,2
     * 1
     */
    private void ex5(int[] array) {
        for (int a = 0; a < array.length; a++) {
            System.out.print("[");
            for (int i = 0; i < array.length - a; i++) {
                System.out.print(i + ":" + array[i]);
                if (i != array.length - 1 - a) {
                    System.out.print(",");
                }
            }
            System.out.print("]");
            System.out.println();
        }
    }
}
