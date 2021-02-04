import java.util.Scanner;

public class testing_intellij {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.println(" Enter the number a and b to start the sum ");
        a = sc.nextInt();
        b = sc.nextInt();
        int c = a + b;
        System.out.println(" Sum of both the numbers is : " + c);
    }
}
