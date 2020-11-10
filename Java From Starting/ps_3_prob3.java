import java.util.*;

class ps_3_prob3{
    public static void main(String[]args){
         System.out.println();
        Scanner sc = new Scanner (System.in);
        
        System.out.println(" Enter Your name ");
        String str = sc.next();
        System.out.printf(" Dear %s , Trans a lot ",str);
        
        sc.close();
    }
}