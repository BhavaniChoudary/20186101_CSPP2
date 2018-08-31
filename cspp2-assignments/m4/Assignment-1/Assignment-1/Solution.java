/**
 * @author : BhavaniChoudary
 */
import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
    /**
    *Fills the main function to print maximum of given array.
    */
    private Solution() {
        /**
         * //Constructor is not used.
         */
    }
    /**
     * Main function. Prints the largest number in the given array.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        /**
         * Gives the final output.
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



