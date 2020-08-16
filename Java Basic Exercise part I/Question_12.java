import java.util.*;

class question_12{
    public static void main(String[]args){
         System.out.println();
        Scanner sc = new Scanner (System.in);
        
        // Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

        System.out.println(" Enter 3 number ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum = a+b+c;
        int avg = sum/3;
        System.out.println("The average is "+avg);


        sc.close();
    }
}