/**
 * @author : BhavaniChoudary
 */
import java.util.Scanner;
/**
 * Class for solution.
 */
final class Solution {
/* Fill the main function to print the number of 7's between 1 to n*/
    /**
     * private solution.
     *
     * @param      args  The arguments
     */
    /**
     * Constructs the object.
     */
    private Solution() {
        //Constructor.
    }
    /**
     * Main function. Returns the output.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 0;
        final int a = 7;
        final int b = 10;
        for (int i = 1; i <= n; i++) {
            //int y = 1;
            int x = i;
            while (x != 0) {
                int rem = x % b;
                if (rem == a) {
                    count = count + 1;
                }
                x = x / b;
            }
        }
        System.out.println(count);
    }
}



