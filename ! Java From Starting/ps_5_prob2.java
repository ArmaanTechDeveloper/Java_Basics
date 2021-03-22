import java.util.*;

class ps_5_prob2 {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the n number ");
        int n = sc.nextInt();

        int sum = 0, i = 1;
        while (i <= n) {
            int number = 2*i;
            System.out.print(number + ",");
            sum = sum + number ;
            i++;
        }
        System.out.println(" The sum of the number is "+sum);

        sc.close();
    }
}