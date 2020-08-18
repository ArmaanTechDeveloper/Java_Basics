import java.util.*;

class question_13{
    public static void main(String[]args){
         System.out.println();
        Scanner sc = new Scanner (System.in);
        
// Write a Java program to print the area and perimeter of a rectangle. Go to the editor
// Test Data:
// Width = 5.5 Height = 8.5

// Expected Output
// Area is 5.6 * 8.5 = 47.60
// Perimeter is 2 * (5.6 + 8.5) = 28.20

        System.out.println(" Enter the width ");
        double w = sc.nextDouble();

        System.out.println(" Enter the Height ");
        double h = sc.nextDouble();

        double area = w*h;
        double perimeter = 2 * (h+w);

        System.out.println(" The area is "+area);
        System.out.println(" The perimeter is "+perimeter);

        sc.close();
    }
}