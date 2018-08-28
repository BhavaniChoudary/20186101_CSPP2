import java.util.Scanner;
/**
 * Class for solution.
 */
public class Solution {
    /*
    Do not modify this main function.
    */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);      
        int base = s.nextInt();
        int exponent = s.nextInt();
        long result=power(base,exponent);
        System.out.println(result);
    }
    /*
    Need to write the power function and print the output.
    */
    /**
     * { function_description }
     *
     * @param      base      The base
     * @param      exponent  The exponent
     *
     * @return     { description_of_the_return_value }
     */
    static long power(final int base, final int exponent) {
        if (exponent > 0) {
            return base * power(base, exponent - 1);
        }
        return 1;
    }
}






