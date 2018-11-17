package pl.sda.sort;

import static pl.sda.sort.HeapHelper.*;

public class HeapEx {

    public static void main(String[] args) {
        int[] tree = new int[]{8, 7, 6, 6, 4, 6, 5, 2, 1, 4, 3, 6, 2, 4};

        System.out.println("Get left son index: " + getLeftSonIndex(12));
        System.out.println("Get right son index: " + getRightSonIndex(12));
        System.out.println("Get parent index: " + getParentIndex(12));
        System.out.println("Is left son exist: " + isLeftSonExist(12, tree));
        System.out.println("Is right son exist: " + isRightSonExist(12, tree));
        System.out.println("Is leaf: " + HeapHelper.isLeaf(12, tree));

        compareWithParent(5, tree);
        swapParentChild(tree, 7, Child.RIGHT);
    }

    /*
    Stwórz metodę do porównywania wartości dziecka z rodzicem w kompletnym drzewie binarnym (niekoniecznie kopcu) -
    przykładowo podany zostanie węzeł o indeksie 7 wtedy należy wypisać jego rodzica i czy jest większy czy mniejszy:
    “child: 43 - index: 7, parent: value = 54 greater than child - index: 3”
     */

    private static void compareWithParent(int index, int[] tree) {
        int parentIndex = getParentIndex(index);
        if (parentIndex < 0) {
            System.out.println("Nie dla korzenia");
            return;
        }

        int value = tree[index];
        int parentValue = tree[parentIndex];

        if (value == parentValue) {
            printParentChild(index, value, parentIndex, parentValue, "equal to");
        } else if (value > parentValue) {
            printParentChild(index, value, parentIndex, parentValue, "less than");
        } else {
            printParentChild(index, value, parentIndex, parentValue, "greater than");
        }
    }

    private static void printParentChild(int index, int value, int parentIndex,
                                         int parentValue, String result) {
        System.out.println("Child = " + value + " - index: " + index + ", parent = " + parentValue + " " +
                result + " child - index: " + parentIndex);
    }

    /*
     *Stwórz metodę do wymiany rodzic <-> dziecko (lewe lub prawe).
     * Metoda powinna korzystać z enum Child {LEFT, RIGHT}.
     * Następnie wypisz jakie elementy zostały wymienione (indeks, wartość, rodzic czy dziecko lewe czy prawe)
     */

    private static void swapParentChild(int[] tree, int index, Child child) {
        int childIndex = 0;
        switch (child) {
            case LEFT:
                if (!isLeftSonExist(index, tree)) {
                    System.out.println("Left son doesn't exist!!!");
                    return;
                }
                childIndex = getLeftSonIndex(index);
                break;
            case RIGHT:
                if (!isRightSonExist(index, tree)) {
                    System.out.println("Right son doesn't exist!!!");
                    return;
                }
                childIndex = getRightSonIndex(index);
                break;
        }

        swap(tree, index, childIndex);

        System.out.println("Index: " + index + " Value before: " + tree[childIndex] + " Value after: " +
                tree[index] + " Child: " + child);
    }

    private static void swap(int[] tab, int a, int b) {
        int temp = tab[a];
        tab[a] = tab[b];
        tab[b] = temp;
    }

    enum Child {
        LEFT, RIGHT
    }
}
