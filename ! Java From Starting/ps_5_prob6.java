import java.util.*;

class ps_5_prob6 {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);

        // repeat 5 using while loop

        System.out.println(" Enter the number you want to repeat ");
        int n = sc.nextInt();

        System.out.println(" Enter the number of times you want to repeat the number ");
        int no = sc.nextInt();

        int i = 1;
        while (i <= no) {
            System.out.println(n);
            i++;
        }
        sc.close();
    }
}