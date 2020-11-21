import java.util.Scanner;

public class ps_7_prob5 {
    static int fib(int n) {
        if (n == 1 || n == 2) {
            return n - 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int result = fib(n);

        System.out.println(" The value in nth position is " + result);
    }
}
