import java.util.*;

class question_15{
    public static void main(String[]args){
         System.out.println();
        Scanner sc = new Scanner (System.in);
        
        // Write a Java program to swap two variables

        int a = 20 , b = 10 , c;

        System.out.println("Before swapping");
        System.out.println("a has "+a);
        System.out.println("b has "+b);


        c=a;
        a=b;
        b=a;
        
        System.out.println("after swapping");
        System.out.println("a has "+a);
        System.out.println("b has "+b);


        sc.close();
    }
}