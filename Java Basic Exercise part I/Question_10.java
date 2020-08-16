import java.util.*;

class question_10{
    public static void main(String[]args){
         System.out.println();
        Scanner sc = new Scanner (System.in);
        
// Write a Java program to compute a specified formula. Go to the editor
// Specified Formula :
// 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
// Expected Output
// 2.9760461760461765

        double a = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
        System.out.println(a);
        sc.close();
    }
}