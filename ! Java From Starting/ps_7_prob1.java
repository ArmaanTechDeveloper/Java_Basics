import java.util.Scanner;

public class ps_7_prob1 {
    static void multiply(int n, int a) {
        for (int i = 1; i <= n; i++) {
            int table = a * i;
            System.out.println(a + "X" + i + "=" + table);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the range ");
        int r = sc.nextInt();

        System.out.println(" Enter the number ");
        int k = sc.nextInt();

        multiply(r, k);
    }
}