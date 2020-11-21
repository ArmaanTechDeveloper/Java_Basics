import java.util.Scanner;

public class ps_7_prob3 {
    static int sum(int n) {
        int i, c = 0;
        for (i = 1; i <= n; i++) {
            c = c + i;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter the number to which you want to calculate the sum ");
        int n = sc.nextInt();

        int result = sum(n);
        System.out.println(" The value of sum is " + result);

    }
}
