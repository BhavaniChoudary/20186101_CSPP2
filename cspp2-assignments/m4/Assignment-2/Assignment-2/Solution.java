/**
 * @author : BhavaniChoudary
 */
import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
	/**
     * Constructs the object.
     */
    private Solution() {
    /**
     * //Constructor is not used.
     */
    }
    /**
     * Main function. Add two matrices of the same size and gives the resultant matrix.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        /**
         * Adds matrices of the same size.
         */
        Scanner sc = new Scanner(System.in);
        int a1rows = sc.nextInt();
        int a1colmn = sc.nextInt();
        int[][] a1 = new int[a1rows][a1colmn];
        for (int i = 0; i < a1rows; i++) {
            for (int j = 0; j < a1colmn; j++) {
                a1[i][j] = sc.nextInt();
            }
        }
        int a2rows = sc.nextInt();
        int a2colmn = sc.nextInt();
        int[][] a2 = new int[a2rows][a2colmn];
        for (int i = 0; i < a2rows; i++) {
            for (int j = 0; j < a2colmn; j++) {
                a2[i][j] = sc.nextInt();
            }
        }
        int[][] sum = new int[a1rows][a1colmn];
        if (a1.length == a2.length) {
            for (int x = 0; x < a1rows; x++) {
                for (int y = 0; y < a1colmn; y++) {
                    sum[x][y] = a1[x][y] + a2[x][y];
                }
            }
            for (int i = 0; i < a2rows; i++) {
                for (int j = 0; j < a2colmn; j++) {
                    if (j == a2colmn - 1) {
                        System.out.print(sum[i][j]);
                    } else {
                        System.out.print(sum[i][j] + " ");
                    }
                }
                System.out.println();
            }

        } else {
            System.out.println("not possible");
        }
    }
}
