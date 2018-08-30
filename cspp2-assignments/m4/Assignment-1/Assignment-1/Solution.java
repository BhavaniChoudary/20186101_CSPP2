/**
 * { item_description }.
 */
import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
    /**
    *Fill this main function to print maximum of given array.
    */
    private Solution() {
        /**
         * { item_description }.
         */
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
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        t = a[0];
        for (int j = 0; j < n; j++) {
            if (t < a[j]) {
                t = a[j];
            }
        }
        System.out.println(t);
    }
}
