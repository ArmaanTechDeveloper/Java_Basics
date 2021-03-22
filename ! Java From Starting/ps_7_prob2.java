import java.util.Scanner;

public class ps_7_prob2 {

    static void pattern(int a) {
        int i, j;
        for (i = 1; i <= a; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Printing the pattern

        System.out.println(" Enter the value of n ");
        int n = sc.nextInt();
        pattern(n);
    }
}
