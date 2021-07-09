// write a java program to determine syntax logical and runtime error
import java.util.Scanner;
public class ps_14_prob1 {
    public static void main(String[] args) {
        // int a = 7 <-- This is a syntax error
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the first number ");
        int a = sc.nextInt();
        System.out.println("Enter the second number to divide with ");
        int b = sc.nextInt();
        // logical error 
        try{
            int c = a/b;
            System.out.println(" The number after dividing is "+ c);
        }
        catch(ArithmeticException e){
            System.out.println(" A logical error occured ");
        }



        // Runtime error
        /*
        int a = 0;
        int c = a+b; <-- This is a runtime error as b is not defined in the program


        */

        sc. close();

    }
}
