import java.util.*;

class pattern_1{
    public static void main(String[]args){
         System.out.println();
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter your N number ");
        int n = sc.nextInt();

        int i , j;

        for(i = n ;i>=0;i--){
            for(j = i ; j>=0 ; j--){
                System.out.print(" * ");
            }
            System.out.println();
        }
        sc.close();
    }
}