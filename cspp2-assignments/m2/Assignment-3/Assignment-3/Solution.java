/**
 * @author : BhavaniChoudary
 */
import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
    /*
    * class for calculating.
    */
    /**
     * Constructs the object.
     */
    private Solution() {
        //Constructor is not used.
    }
    /**
     * main function. prints the result.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int base = s.nextInt();
        int exponent = s.nextInt();
        long result = power(base, exponent);
        System.out.println(result);
    }
    /*
    power function and returns the output
    */
    /**
     * returns the output.
     *
     * @param      base      The base
     * @param      exponent  The exponent
     *
     * @return     description_of_the_return_value
     */
    static long power(final int base, final int exponent) {
        if (exponent > 0) {
            return base * power(base, exponent - 1);
        }
        return 1;
    }
}






