import java.util.*;

class ps_5_prob3 {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter the number you want to print the table ");
        int n = sc.nextInt();

        System.out.println(" Enter the number of times you want to print the table ");
        int no = sc.nextInt();
        int table;
        for (int i = 1; i <= no; i++) {
            
            table = n * i;
            System.out.println(n + "X" + i + "=" + table);
        }
        sc.close();
    }
}