import java.util.*;

class ps_3_prob1{
    public static void main(String[]args){
         System.out.println();
        Scanner sc = new Scanner (System.in);
        
        System.out.println(" Enter the string ");
        String s = sc.nextLine();
        String lc = s.toLowerCase();

        System.out.println(lc);
        sc.close();
    }
}