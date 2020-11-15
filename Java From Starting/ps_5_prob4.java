import java.util.*;

class ps_5_prob4 {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);

        // to print multiplication table in reverse order

        System.out.println(" Enter the number you want to print the table ");
        int n = sc.nextInt();

        System.out.println(" Enter the number of times you want to print the table ");
        int no = sc.nextInt();

        for (int i = no; i > 0; i--) {
            int table = n * i;
            System.out.println(n + "X" + i + "=" + table);
        }
        sc.close();
    }
}