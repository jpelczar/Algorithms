package pl.sda.sort;

public class HeapEx {

    public static void main(String[] args) {
        int[] tree = new int[]{8, 7, 5, 5, 4, 6, 5, 2, 1, 4, 3, 6, 2, 4};

        System.out.println("Get left son index: " + HeapHelper.getLeftSonIndex(12));
        System.out.println("Get right son index: " + HeapHelper.getRightSonIndex(12));
        System.out.println("Get parent index: " + HeapHelper.getParentIndex(12));
        System.out.println("Is left son exist: " + HeapHelper.isLeftSonExist(12, tree));
        System.out.println("Is right son exist: " + HeapHelper.isRightSonExist(12, tree));
        System.out.println("Is leaf: " + HeapHelper.isLeaf(12, tree));
    }

}
