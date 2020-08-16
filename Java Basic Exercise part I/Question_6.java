import java.util.*;

class question_6{
    public static void main(String[]args){
         System.out.println();
        Scanner sc = new Scanner (System.in);
        
        // Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. Go to the editor
        // Test Data:
        // Input first number: 125
        // Input second number: 24
        // Expected Output :
        // 125 + 24 = 149
        // 125 - 24 = 101
        // 125 x 24 = 3000
        // 125 / 24 = 5
        // 125 mod 24 = 5

        System.out.println(" Enter your first number ");
        int a = sc.nextInt();
        System.out.println(" Enter your second number ");
        int b = sc.nextInt();

        int c = a+b;
        int d = a-b;
        int e = a*b;
        int f = a/b;
        int g = a%b;

        System.out.println(c+" "+d+" "+e+" "+f+" "+g);

        sc.close();
    }
}