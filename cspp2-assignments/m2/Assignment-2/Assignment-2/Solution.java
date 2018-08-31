/**
 * @author : BhavaniChoudary
 */
import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
    /*
    Do not modify this main function.
    */
    /**
     * Constructs the object.
     */
    private Solution() {
        //Constructor is not used.
    }
    /**
     * This function gives the roots of quadratic equation.
     *
     * @param      a      Co-efficient of x square
     * @param      b      Co-efficient of x
     * @param      c      Constant
     */
    public static void rootsOfQuadraticEquation(final int a, final int b,
    final int c) {
        /**
         * gives roots of quadratic equation.
         */
        final int f = 4;
       int discriminant = (b * b) - (f * a * c);
       double root1 = (-b + (Math.sqrt(discriminant))) / (2 * a);
       double root2 = (-b - (Math.sqrt(discriminant))) / (2 * a);
       System.out.print(root1 + " " + root2);
    }
    /**
     * Main function. Prints roots of equation.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        rootsOfQuadraticEquation(a, b, c);
    }
    /*
    Need to write the rootsOfQuadraticEquation function and print the output.
    */
}



