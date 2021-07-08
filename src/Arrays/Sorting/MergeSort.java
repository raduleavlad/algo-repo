package Arrays.Sorting;

import Arrays.ArrayHelper;

public class MergeSort {

    /**
     * Used to init and print the data
     */
    public static void execute() {
        int[] a = {44, 21, 5, 2, 1, 52, 99};

        System.out.println("Input:");
        ArrayHelper.printArrayAndMoveToNewLine(a);
        System.out.println("Bubble sort result:");

        mergeSort(a);
        ArrayHelper.printArrayAndMoveToNewLine(a);
    }

    private static void mergeSort(int[] arr) {

    }

}
