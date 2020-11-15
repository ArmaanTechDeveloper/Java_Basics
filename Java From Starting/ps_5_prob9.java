import java.util.*;

class ps_5_prob9 {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);

        // multiplication table sum
        System.out.println(" Enter the number you want the table ");
        int n = sc.nextInt();

        System.out.println(" Enter the number of times you want to do the table ");
        int no = sc.nextInt();

        int i, sum = 0;
        for (i = 1; i <= no; i++) {
            int table = n * i;
            sum = sum + table;
        }
        System.out.println(" The sum of your table is " + sum);
        sc.close();
    }
}