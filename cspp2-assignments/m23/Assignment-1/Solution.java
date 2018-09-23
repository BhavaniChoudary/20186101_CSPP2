import java.util.*;
import java.io.*;
class Solution {
    /**
     * Main function.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        try {
        Frequency f = new Frequency();
        Scanner sc = new Scanner(System.in);
        File input = new File(sc.next());
        File[] listoffiles = input.listFiles();
        double maximum = 0;
        String result1 = "";
        int length = listoffiles.length;
        double[][] result = new double[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (i == j) {
                    result[i][j] = 100;
                } else {
                result[i][j] = Frequency.similarString(Frequency.
                    toString(listoffiles
                    [i]), Frequency.toString(listoffiles[j]));
                if (maximum < result[i][j]) {
                    maximum = result[i][j];
                    result1 = "Maximum similarity is in between "
                    + listoffiles[i].getName() + " and "
                    + listoffiles[j].getName();

                }
            }
            }
        }
        System.out.print("\t");
        for (int i = 0; i < length; i++) {
            System.out.print("\t" + listoffiles[i].getName());
        }
        System.out.println();
        for (int i = 0; i < length; i++) {
            System.out.print(listoffiles[i].getName() + "\t");
            for (int j = 0; j < length; j++) {
                System.out.print(result[i][j] + "\t\t");
            }
            System.out.println();
        }
        System.out.println(result1);


    } catch (NoSuchElementException e) {
        System.out.println("empty directory");
    }
    }
}

