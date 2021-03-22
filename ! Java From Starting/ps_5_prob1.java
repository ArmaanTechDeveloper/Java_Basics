import java.util.*;

class ps_5_prob1 {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);

        // Print the following pattern in java

        int i, j;
        for (i = 1; i <= 4; i++) {
            for (j = i; j <= 4; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}