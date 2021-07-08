package Arrays;

public class ArrayHelper {

    private static final String ELEMENT_SEPARATOR = ";";

    /**
     * Prints the array then moves to the next line
     *
     * @param arr The array to be printed
     */
    public static void printArrayAndMoveToNewLine(int[] arr) {
        for(int i: arr) {
            System.out.print(i + ELEMENT_SEPARATOR + " ");
        }

        System.out.println("");
    }


    /**
     * Prints the aray on multiple lines
     *
     * @param arr The array to be printed
     */
    public static void printArrayOnMultipleLines(int[] arr) {
        for(int i: arr) {
            System.out.println(i);
        }

        System.out.println("");
    }

}
