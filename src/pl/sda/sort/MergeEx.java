package pl.sda.sort;

import java.util.Arrays;

public class MergeEx {

    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8};
        int[] array2 = new int[]{9, 10, 11, 12, 13, 14, 15, 16, 17};

        System.out.println("Ex1 V1:");
        divArray(array);
        System.out.println("Ex1 V2:");
        divArrayV2(array);

        System.out.println("Ex2 V1:");
        System.out.println(Arrays.toString(concatSameSizeArrayV1(array, array2)));
        System.out.println("Ex2 V2:");
        System.out.println(Arrays.toString(concatSameSizeArrayV2(array, array2)));
        System.out.println("Ex2 V3:");
        System.out.println(Arrays.toString(concatSameSizeArrayV3(array, array2)));
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

    public static int[] concatSameSizeArrayV1(int[] left, int[] right) {
        if (left.length != right.length) {
            return new int[0];
        }

        int[] result = new int[left.length + right.length];

        int dodatkowaZmienna = 0;
        for (int i = 0; i < result.length; i += 2) {
            result[i] = left[dodatkowaZmienna];
            result[i + 1] = right[dodatkowaZmienna];
            dodatkowaZmienna++;
        }

        return result;
    }

    public static int[] concatSameSizeArrayV2(int[] left, int[] right) {
        if (left.length != right.length) {
            return new int[0];
        }

        int[] result = new int[left.length + right.length];

        for (int i = 0; i < result.length; i += 2) {
            result[i] = left[i / 2];
            result[i + 1] = right[i / 2];
        }

        return result;
    }


    public static int[] concatSameSizeArrayV3(int[] left, int[] right) {
        if (left.length != right.length) {
            return new int[0];
        }

        int[] result = new int[left.length + right.length];

        for (int i = 0; i < left.length; i++) {
            result[2 * i] = left[i];
            result[2 * i + 1] = right[i];
        }

        return result;
    }

}