import java.util.Scanner;
/**
 * Class for input validator.
 */
class InputValidator {
    /**
     * string variable used to take the input.
     */
    private String data;
    /**
     * len is used to calculate data
     */
    private int len;
    /**
     * Constructs the object.
     *
     * @param      input  The input
     */
    public InputValidator(final String input) {
        data = input;
        len = data.length();
    }
    /**
     * validateData returns the boolean value.
     *
     * @return     description_of_the_return_value.
     */
    public boolean validateData() {
        int six = 6;
        if (len < six) {
            return false;
        }
        return true;
    }
}
/**
 * Class for solution.
 */
public class Solution {
    /**
     * Main function.
     */
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        InputValidator i = new InputValidator(input);
        System.out.println(i.validateData());

    }
}




