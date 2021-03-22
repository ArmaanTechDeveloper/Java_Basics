import java.util.*;

class ps_5_prob7 {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter the number of times you want to repeat the loop ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("1");
        }
        sc.close();
    }
}