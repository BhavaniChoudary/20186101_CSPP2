import java.util.Scanner;
/**
 * { item_description }.
 */
public final class Average {
/**
 * Constructs the object.
 */
    private Average() {
   }
   /**
    * { function_description }.
    *
    * @param      args  The arguments
    */
    public static void main(final String[] args) {
        int a, sum=0;
        float avg;
        Scanner s = new Scanner(System.in);
        a= s.nextInt();
        int[] arr = new int[a];
        for (int i = 0;i < a; i++) {
            arr[i] = s.nextInt();
            sum = sum + arr[i];
        }
        //float = sum;
        avg = sum / a;
        System.out.println("Average : " + avg);
    }
}
