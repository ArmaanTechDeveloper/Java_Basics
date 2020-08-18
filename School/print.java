import java.util.*;

class printing{
    public static void main(String[]args){
         System.out.println();
        Scanner sc = new Scanner (System.in);
        
        int number;
        System.out.println(" Enter your number to be printed again and again ");
        number =sc.nextInt();

        int l;

        for(l=1;l>=0;l++){
            System.out.println(number);
        }

        sc.close();
    }
}