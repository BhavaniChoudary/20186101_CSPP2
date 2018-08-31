import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Concatinate {
    /**
    *Constructs the object.
    */
    private Concatinate() {
        /**
         * private constructor.
         */
    }
    /**
     * reads the input from the main fucntion.
     *
     * @param      s     Input string.
     *
     * @return     returns the concatinated string.
     */
    public static String helloname(final String s) {
        /**
        *appends two strings using + concatinate operator.
        */
        return "Hello " + s + "!";
    }
    /**
     * Main function. Returns the concatinated string.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        /**
         * returns the concatinated string.
         */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String rev = helloname(s);
        System.out.println(rev);
    }
    //Write revString function
}
