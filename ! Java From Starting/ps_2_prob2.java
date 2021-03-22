import java.util.*;

class ps_2_prob2{
    public static void main(String[]args){
         System.out.println();
        Scanner sc = new Scanner (System.in);
        
        System.out.println(" Enter the grade ");
        int g  = sc.nextInt();

        int encrypt = g+8;
        int decrypt = g-8;

        System.out.println(" The encrypted is : "+encrypt);
        System.out.println(" The decrypted is : "+decrypt);
        sc.close();
    }
}