import java.util.*;
import java.io.*;
/**
 * Class for frequency.
 */
class Frequency {
    /**
     * Constructs the object.
     */
    Frequency() {
    }
    /**
     * Returns a string representation of the object.
     *
     * @param      filename  The filename
     *
     * @return     String representation of the object.
     */
    public static String toString(final File filename) {
        String s = "";
        try {
            Scanner input = new Scanner(new FileReader(filename));
            StringBuilder sb = new StringBuilder();
            while (input.hasNext()) {
                sb.append(input.next());
                sb.append(" ");
            }
            input.close();
            s = sb.toString();
        } catch (FileNotFoundException e) {
            System.out.println("no file");
        }
        return s;
    }
    /**
     * Removes all.
     *
     * @param      text  The text
     *
     * @return     { description_of_the_return_value }
     */
    public static Map removeAll(String text) {
        String[] wordList = text.replaceAll("[^a-zA-Z. ] ","")
        .toLowerCase().split(" ");
        Map<String, Integer> map = new HashMap<>();
        int freq = 0;
        for (int i = 0; i < wordList.length; i++) {
            if (!map.containsKey(wordList[i])) {
                map.put(wordList[i], 1);
            } else {
                map.put(wordList[i], map.get(wordList[i]) + 1);
            }
        }
        //System.out.println(map);
        return map;
    }
    /**
     * function_description.
     *
     * @param      s1    The s 1
     * @param      s2    The s 2
     *
     * @return     { description_of_the_return_value }
     */
    public static double similarString(final String s1, final String s2) {
        int rows = s1.length();
        int columns = s2.length();
        double stringLength = rows + columns;
        int[][] maximum = new int[rows + 1][columns + 1];
        int result = 0;
        double similarity = 0;
        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j <= columns; j++) {
                if (i == 0 || j == 0) {
                    maximum[i][j] = 0;
                } else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    maximum[i][j] = maximum[i - 1][j - 1] + 1;
                    //result = max(result, maximum[i][j]);
                } else {
                    maximum[i][j] = 0;
                }
                if (result < maximum[i][j]) {
                    result = maximum[i][j];
                }
            }
        }
        similarity = Math.round(((result * 2) / stringLength) * 100D) / 100D;
        return (similarity * 100);
        }
}