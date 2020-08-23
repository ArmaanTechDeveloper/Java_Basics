import java.util.*;

class question_3{
    public static void main(String[]args){
         System.out.println();
        Scanner sc = new Scanner (System.in);
        System.out.println(" Enter the string with whitespaces");
        String s = sc.nextLine();

        int i;
        
        String c = s.replace(" ","");
        System.out.println(c);
        sc.close();
    }
}