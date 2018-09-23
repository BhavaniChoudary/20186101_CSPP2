import java.io.BufferedReader;
import java.io.File;
import java.util.Scanner;
import java.util.Arrays;
import java.io.FileReader;

/**
 * solution  class is to read the input and forward to other class.
 */
final  class Solution {
    /**
     * Constructs the object.
     */
     private Solution() {
//empty constructer.
    }
    /**
     * reads the text files in a entire folder.
     *
     * @param      args       The arguments
     *
     * @throws     Exception  { exception_description }
     */
    public static void main(final String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            String folder = s.nextLine();
File file = new File(
"F:\\cspp2\\cspp2-assignments\\m23\\Assignment-1\\Assignment-1\\" + folder);
            String[] file3 = file.list();
            int len = file3.length;
            //System.out.println(len);
            //System.out.println(Arrays.toString(file3));
            //System.out.println(file3[0]);
            if (len != 0) {
                Arrays.sort(file3);
                System.out.print("      ");
                System.out.print("  ");
                System.out.print("\t");
                for (int c = 0; c < file3.length - 1; c++) {
                    System.out.print(file3[c] + "\t");
                }
                System.out.println(file3[file3.length - 1] + "\t");
                long[][] result = new long[file3.length][file3.length];
                for (int a = 0; a < file3.length; a++) {
                    System.out.print(file3[a] + "\t");
                    for (int b = 0; b < file3.length; b++) {
File file1 = new File(
    "F:\\cspp2\\cspp2-assignments\\m23\\Assignment-1\\Assignment-1\\" + folder
 + "\\" + file3[a]);
File file2 = new File(
    "F:\\cspp2\\cspp2-assignments\\m23\\Assignment-1\\Assignment-1\\"
 + folder + "\\" + file3[b]);
        BufferedReader br1 = new BufferedReader(new FileReader(file1));
        BufferedReader br2 = new BufferedReader(new FileReader(file2));
                        String line1;
                        String line2;
                        String inp1 = "";
                        String inp2 = "";
                        Count cu = new Count();
                        while ((line1 = br1.readLine()) != null) {
                            line1 = line1.toLowerCase();
inp1 = inp1 + line1.replaceAll("[0-9_ ]", " ").replaceAll("\\s+", " ");
                        }
                        while ((line2 = br2.readLine()) != null) {
                            line2 = line2.toLowerCase();
    inp2 = inp2 + line2.replaceAll("[0-9_ ]", " ").replaceAll("\\s+", " ");
                        }
                        //System.out.println("call3");
                        long ot = cu.bagOFWords(inp1, inp2);
                        result[a][b] = ot;
                        System.out.print(ot);
                        System.out.print("  " + "\t");
                    }
                    System.out.println();

                }
                long max = result[0][1];
                String[] index = new String[2];
                index[0] = file3[0];
                index[1] = file3[0];
                for (int d = 0; d < file3.length; d++) {
                    for (int e = 0; e < file3.length; e++) {
                        if (result[d][e] > max && d != e) {
                            max = result[d][e];
                            index[0] = file3[d];
                            index[1] = file3[e];
                        }

                    }

                }
System.out.print(
    "Maximum similarity is between " + index[0] + " and " + index[1]);
            } else {
                System.out.println("empty directory");
            }
        }
        System.out.println("empty directory");
    }
}

