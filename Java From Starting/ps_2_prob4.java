import java.util.*;

class ps_2_prob4{
    public static void main(String[]args){
         System.out.println();
        Scanner sc = new Scanner (System.in);
        
        // write the following in java program 

        System.out.println(" Enter the value of V");
        int v = sc.nextInt();
        System.out.println(" Enter the value of U");
        int u =sc.nextInt();
        System.out.println(" Enter the value of a");
        int a = sc.nextInt();
        System.out.println(" Enter the value of s");
        int s = sc.nextInt();

        int evalute = ((v*v)-(u*u))/(2*a*s);
        System.out.println(" The value of expression is "+evalute);
        
        sc.close();
    }
}