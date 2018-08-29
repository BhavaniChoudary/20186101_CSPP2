
import java.util.Scanner;
/**
 * Class for solution.
 */
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        //Constructor.
    }
    /**
     * { function_description }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        System.out.println(gcd(n1, n2));
    }
    /*
    Need to write the gcd function and print the output.
    */
    /**
     * { function_description }.
     *
     * @param      n1    The n 1
     * @param      n2    The n 2
     *
     * @return     { description_of_the_return_value }.
     */
    public static int gcd(final int n1, final int n2) {
        int gcd = 0;
        for (int i = 1; i <= n1; ++i) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}



