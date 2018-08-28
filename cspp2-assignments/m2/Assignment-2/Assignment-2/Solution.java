import java.util.Scanner;
/**
 * Class for solution.
 */
public class Solution {
    /*
    Do not modify this main function.
    */
    private Solution() {
        //Constructor is not used
    }
    public static void rootsOfQuadraticEquation(final int a, final int b,
    final int c) {
        final int four = 4;
       int discriminant = (b * b) - (four * a * c);
       double root1 = (-b + (Math.sqrt(discriminant))) / (2 * a);
       double root2 = (-b - (Math.sqrt(discriminant))) / (2 * a);
       System.out.print(root1 + " " + root2);
    }
    public static void main(String[] args) {
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
