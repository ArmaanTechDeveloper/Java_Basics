import java.util.Scanner;

public class ps_7_prob4 {
    static void another_pattern(int n) {
        int i, j;
        for (i = n; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number of n");
        int n = sc.nextInt();

        another_pattern(n);
    }
}
