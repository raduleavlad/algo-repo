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

        System.out.println("Merge sort result:");
        ArrayHelper.printArrayAndMoveToNewLine(mergeSort(a));
    }

    
    /**
     * Used to split the param Array in half and init the sort
     * Calls its self till the array length is <= 0
     *
     * @param arr The array to sort
     * @return The sorted array
     */
    private static int[] mergeSort(int[] arr) {

        //if the array len is <= 1 we have reached the bottom level
        if(arr.length <= 1){
            return arr;
        }

        //creates 2 arrays with half the size of arr
        int half = arr.length/2;
        int[] a1 = new int[half];
        int[] a2 = new int[arr.length-half];

        //populates a1
        for(int i = 0; i < half; i++){
            a1[i] = arr[i];
        }

        //populates a2
        for(int i = half; i < arr.length; i++) {
            a2[i-half] = arr[i];
        }

        //calls the method again for each subarray
        a1 = mergeSort(a1);
        a2 = mergeSort(a2);

        //the ordered merge between a1 and a2
        return merge(a1,a2);
    }

    
    /**
     * Merges the two arrays received as params in order
     * 
     * @param a1
     * @param a2
     * @return
     */
    private static int[] merge(int[] a1, int[] a2) {
        //the result
        int[] b = new int[a1.length + a2.length];
        //index for a1
        int i = 0;
        //index for a2
        int j = 0;
        //index for b
        int k = 0;

        // iterates through both arrays and adds the smallest element to b
        while(i < a1.length && j < a2.length) {
            if(a1[i] <= a2[j]) {
                b[k++] = a1[i++];
            } else {
                b[k++] = a2[j++];
            }
        }

        //if there are any elements in a1, it copies them into b
        while(i < a1.length) {
            b[k++] = a1[i++];
        }

        //if there are any elements in a2, it copies them into b
        while(j < a2.length) {
            b[k++] = a2[j++];
        }

        return b;
    }

}
