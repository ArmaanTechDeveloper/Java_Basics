// Write a program to input three number and print their sum

import java.util.*;

class ps_1_prob1{
    public static void main(String[]args){
         System.out.println();
        Scanner sc = new Scanner (System.in);
        
        System.out.println(" Enter the first number ");
        int a = sc.nextInt();

        System.out.println(" Enter the second number ");
        int b = sc.nextInt();

        System.out.println(" Enter the third number ");
        int c = sc.nextInt();

        int sum = a+b+c;
        System.out.println(" The sum of the three number is "+sum);
        sc.close();
    }
}