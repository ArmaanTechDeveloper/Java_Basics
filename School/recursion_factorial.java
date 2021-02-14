import java.util.Scanner;
public class recursion_factorial {
    public int factorial(int n){
        if(n==0){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args) {
        recursion_factorial ob = new recursion_factorial();
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number to find the factorial of the number ");
        int x = sc.nextInt();
        int fac = ob.factorial(x);
        System.out.println(" The factorial of the number is : "+fac);
        sc.close();
    }
}
