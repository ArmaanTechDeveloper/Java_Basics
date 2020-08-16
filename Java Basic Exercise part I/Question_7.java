import java.util.*;

class question_7{
    public static void main(String[]args){
         System.out.println();
        Scanner sc = new Scanner (System.in);
        

        // Write a Java program that takes a number as input and prints its multiplication table upto 10. Go to the editor
        // Test Data:
        // Input a number: 8
        // Expected Output :
        // 8 x 1 = 8
        // 8 x 2 = 16
        // 8 x 3 = 24
        // ...
        // 8 x 10 = 80

        System.out.println(" Enter your number to print its table up to 10 ");
        int t = sc.nextInt();

        int i;
        for(i=1;i<=10;i++){
            int m = t*i;
            System.out.println(t+"x"+i+"="+m);

            }

        sc.close();
    }
}