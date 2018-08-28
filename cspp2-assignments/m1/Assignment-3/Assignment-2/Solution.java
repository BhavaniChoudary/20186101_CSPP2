/**
 * { item_description }.
 */
import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
    //
    }
    /**
     * { function_description }.
     *
     * @param      base    The base
     * @param      height  The height
     */
    static void areaOfTriangle(final int base, final int height) {
        /**
         * { var_description }.
         */
        //final float f = 0.5;
        double area;
        area = (0.5 * base * height);
        System.out.println(area);

    }
    /**
     * { function_description }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        /**
         * { var_description }.
         */
        Scanner scan = new Scanner(System.in);
        int base = scan.nextInt();
        int height = scan.nextInt();
        areaOfTriangle(base, height);
    }
    /*
    Need to fill the areaOfTriangle function and print the output
    of fahrenheit.
    */
}
