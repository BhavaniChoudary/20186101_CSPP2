/*Given an String, Write a java method that
returns the decimal value for the given binary string.
*/
import java.util.Scanner;
/**
 * Class for solution.
 */
public class Solution {
/**
 * Constructs the object.
 */
    private Solution() {
        //Constructor.
    }
    /**
     * Main function. Returns reverse of the string.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String reverse = reverseString(s);
        System.out.println(reverse);
    }
    /**
     * Returns reverse of the string.
     *
     * @param      s    Input string.
     *
     * @return     description_of_the_return_value
     */
    public static String reverseString(final String s) {
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse = reverse + s.charAt(i);
        }
        return reverse;
    }
    //Write reverseString function
}
