import java.util.*;

class question_11{
    public static void main(String[]args){
         System.out.println();
        Scanner sc = new Scanner (System.in);
        
// Write a Java program to print the area and perimeter of a circle. Go to the editor
// Test Data:
// Radius = 7.5
// Expected Output
// Perimeter is = 47.12388980384689
// Area is = 176.71458676442586

        System.out.println(" Enter The radius ");
        double r = sc.nextDouble();

        double p = 2*(22/7)*r;
        double a = (22/7)*r*r;

        System.out.println(" Perimeter is "+p);
        System.out.println(" Area is "+a);

        sc.close();
    }
}