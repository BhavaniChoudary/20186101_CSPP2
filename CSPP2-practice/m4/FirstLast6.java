import java.util.Scanner;
class FirstLast6 {
    public static boolean check6(int arr[], int n) {
        if (arr[0] == 6 || arr[n-1] == 6) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no.of elements");
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++) {
            System.out.println("Enter the elements");
            arr[i] = s.nextInt();
        }
        boolean r = check6(arr, n);
        System.out.println(r);
    }
}
