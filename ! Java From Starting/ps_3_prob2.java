import java.util.*;

class ps_3_prob2{
    public static void main(String[]args){
         System.out.println();
        Scanner sc = new Scanner (System.in);
        
        System.out.println(" Enter the string ");
        String str = sc.nextLine();

        String replace = str.replace(" ", "*");
        System.out.println(replace);

        sc.close();
    }
}