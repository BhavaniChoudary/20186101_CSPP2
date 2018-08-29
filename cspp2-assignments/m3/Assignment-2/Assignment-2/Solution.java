/**
 * { item_description }
 */
import java.util.Scanner;
/**
 * Class for solution.
 */
public class Solution {
/* Fill the main function to print the number of 7's between 1 to n*/
    /**
     * { function_description }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 0;
        int a = 7;
        int b = 10;
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



