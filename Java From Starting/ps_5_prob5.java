import java.util.*;

class ps_5_prob5 {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);

        //Finding the factorial of a number 

        System.out.println(" Enter the number o find factorial of the number ");
        int n = sc.nextInt();

        int i, sum = 1;
        for (i = n; i >= 1; i--) {
            sum = sum * i;
        }
        System.out.println(sum);
        sc.close();
    }
}