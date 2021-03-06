import java.util.Scanner;
/**
 * Write a java program to find the odd composite numbers
 * between 2 and n where n is given as an input.
 *
 * @author : BhavaniChoudary
 */
public final class Solution {
    /**
    * Empty constructor.
    */
    private Solution() {
        //not used
    }
    /**
     * gives boolean value.
     *
     * @param      n     n value.
     *
     * @return     description_of_the_return_value.
     */
    static boolean prime(final int n) {
        int c = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                c++;
            }
        }
        if (c == 2) {
            return false;
        }
        return true;
    }
    /**
     * gives odd composite numbers.
     *
     * @param      n     returns n value.
     */
    static void oddComposites(final int n) {
    for (int i = 2; i < n; i++) {
        if (i % 2 != 0) {
            if (prime(i)) {
                System.out.println(i);
            }
        }
    }
    }
    /**
    * main method as driver program.
    * @param args is the parameter for this method
    */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        oddComposites(n);
    }
}




