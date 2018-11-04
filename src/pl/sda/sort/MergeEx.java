package pl.sda.sort;

import java.util.Arrays;

public class MergeEx {

    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println("Ex1 V1:");
        divArray(array);
        System.out.println("Ex1 V2:");
        divArrayV2(array);
    }


    public static void divArray(int[] array) {
        int mid = array.length / 2; // 7/2 = 3

        int[] left = new int[mid]; //3
        int[] right = new int[array.length - mid]; //7 - 3 = 4

        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }

        for (int i = mid; i < array.length; i++) {
            right[i - mid] = array[i];
        }

        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
    }


    public static void divArrayV2(int[] array) {
        int mid = array.length / 2; // 7/2 = 3

        int[] left = new int[mid]; //3
        int[] right = new int[array.length - mid]; //7 - 3 = 4

        for (int i = 0; i < array.length; i++) {
            if (i < mid) {
                left[i] = array[i];
            } else {
                right[i - mid] = array[i];
            }
        }

        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
    }

}