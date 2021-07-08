package Arrays.Sorting;

import Arrays.ArrayHelper;

public class BubbleSort {

    /**
     * Used to init and print the data
     */
    public static void execute() {
        int[] a = {44, 21, 5, 2, 1, 52, 99};

        System.out.println("Input:");
        ArrayHelper.printArrayAndMoveToNewLine(a);
        System.out.println("Bubble sort result:");

        sortBubble(a);
        ArrayHelper.printArrayAndMoveToNewLine(a);
    }


    /**
     * Sorts the given array using the Bubble sort method
     *
     * @param arr The array to be sorted
     */
    private static void sortBubble(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = i; j < arr.length; j++) {
                /*if the current element is greater than
                 * another one down the line
                 */
                if(arr[i] > arr[j]) {
                    int swap = arr[i];
                    arr[i] = arr[j];
                    arr[j] = swap;
                }
            }
        }
    }

}
