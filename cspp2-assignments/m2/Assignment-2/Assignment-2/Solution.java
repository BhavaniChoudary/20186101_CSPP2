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
     * { function_description }.
     *
     * @param      a     { parameter_description }
     * @param      b     { parameter_description }
     * @param      c     { parameter_description }
     */
    public static void rootsOfQuadraticEquation(final int a, final int b,
    final int c) {
        //final int f = 4;
       int discriminant = (b * b) - (4 * a * c);
       double root1 = (-b + (Math.sqrt(discriminant))) / (2 * a);
       double root2 = (-b - (Math.sqrt(discriminant))) / (2 * a);
       System.out.print(root1 + " " + root2);
    }
    /**
     * { function_description }.
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



