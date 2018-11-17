package pl.sda.sort;

public class HeapHelper {
    /*
    numer lewego syna = 2k + 1
numer prawego syna = 2k + 2
numer ojca = [(k - 1) / 2], dla k > 0
lewy syn istnieje, jeśli 2k + 1 < n
prawy syn istnieje, jeśli 2k + 2 < n
węzeł k jest liściem, jeśli 2k + 2 > n

     */

    public static int getLeftSonIndex(int index) {
        return 2 * index + 1;
    }

    public static int getRightSonIndex(int index) {
        return 2 * index + 2;
    }

    public static int getParentIndex(int index) {
        if (index > 0)
            return (index - 1) / 2;

        return -1;
    }

    public static boolean isRoot(int index) {
        return index == 0;
    }

    public static boolean isLeftSonExist(int index, int[] tree) {
        return getLeftSonIndex(index) < tree.length;
    }

    public static boolean isRightSonExist(int index, int[] tree) {
        return getRightSonIndex(index) < tree.length;
    }

    public static boolean isLeaf(int index, int[] tree) {
        return 2 * index + 2 > tree.length;
    }
}
