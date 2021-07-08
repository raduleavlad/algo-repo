package Arrays;

public class ArrayHelper {

    private static final String ELEMENT_SEPARATOR = ";";

    public static void printArrayAndMoveToNewLine(int[] arr) {
        for(int i: arr) {
            System.out.print(i + ELEMENT_SEPARATOR + " ");
        }

        System.out.println("");
    }

}
