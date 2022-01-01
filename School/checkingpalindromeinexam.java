import java.util.Scanner;

public class checkingpalindromeinexam{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int N = sc.nextInt();

        int rev = 0;
        int num = N;

        while(num>0){
            int f = num/10;
            int s = 0;
            // System.out.println("Value of s "+s);
            int digit = num - 1;
            // System.out.println("Value of digit is "+digit);
            rev = (rev*10)+digit;
            num /=10;
        }
        System.out.println(rev);
        sc.close();
    }
}