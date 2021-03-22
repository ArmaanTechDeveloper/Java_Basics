import java.util.*;

class ps_2_prob3{
    public static void main(String[]args){
         System.out.println();
        Scanner sc = new Scanner (System.in);
        
        System.out.println(" Enter the number ");
        int number = sc.nextInt();
        int def = 50;
        System.out.println(" The default number taken is : "+def);
        boolean a = (number >= 50);
        System.out.println(a);
        sc.close();
    }
}