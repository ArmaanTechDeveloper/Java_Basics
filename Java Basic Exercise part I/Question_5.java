import java.util.*;

class question_5{
    public static void main(String[]args){
         System.out.println();
        Scanner sc = new Scanner (System.in);
        
// Write a Java program that takes two numbers as input and display the product of two numbers. Go to the editor
// Test Data:
// Input first number: 25
// Input second number: 5
// Expected Output :
// 25 x 5 = 125

        System.out.println(" Enter your first number ");
        int a = sc.nextInt();
        System.out.println(" Enter your second number ");
        int b = sc.nextInt();
        int c = a*b;
        System.out.println(c);

        sc.close();
    }
}