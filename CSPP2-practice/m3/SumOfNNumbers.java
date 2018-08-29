import java.util.Scanner;
class SumOfNNumbers {
    public static void main(String[] args) {
        int n, i = 1;
        int sum = 0;
        System.out.println("Enter the number");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        for(i=0; i<=n; i++) {
            sum = sum + i;
        }
    System.out.println(sum);
    }
}