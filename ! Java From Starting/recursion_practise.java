import java.util.Scanner;

public class recursion_practise {

    static int sum(int n) {
        if (n <= 1) {
            return 1;
        }
        return n + sum(n - 1);
    }

    static int factorial(int n) {
        if (n <= 0) {
            System.out.println(" cannot do factorial");
        }
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    static void repeatfive(int n) {
        if (n <= 0) {
            return;
        }
        System.out.print(" 5 , ");

        repeatfive(n - 1);

    }

    static void repeatfour(int n) {
        if (n <= 0) {
            return;
        }
        System.out.print(" 4 , ");
        repeatfour(n - 1);
    }

    public static void main(String[] args) {

        System.out.println(" \n Enter the number of times you wan to repeat the number ");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        repeatfour(no);
        System.out.println(" ");
        repeatfive(no);

        System.out.println(" \n Time to print factorial ...");
        System.out.println(" Enter the number you wan to print factorial ");
        int fac = sc.nextInt();
        System.out.println("The factorial of number is : " + factorial(fac));

        System.out.println(" \n Time to sum consecutive numbers ");
        System.out.println(" Enter till where you want to print the sum of consecutive number ");
        int cons = sc.nextInt();
        System.out.println(" The sum is " + sum(cons));
    }
}