import java.util.*;

class question_4{
    public static void main(String[]args){
         System.out.println();
        Scanner sc = new Scanner (System.in);
        
        // question_4:
// Write a Java program to print the result of the following operations. Go to the editor
// Test Data:
// a. -5 + 8 * 6
// b. (55+9) % 9
// c. 20 + -3*5 / 8
// d. 5 + 15 / 3 * 2 - 8 % 3


// Expected Output :
// 43
// 1
// 19
// 13

        int a=(-5+8*6);
        System.out.println(a);
        double b=(55+9)%9;
        System.out.println(b);
        double c=20+-3*5/8;
        System.out.println(c);
        double d=5+15/3*2-8%3;
        System.out.println(d);

        sc.close();
    }
}