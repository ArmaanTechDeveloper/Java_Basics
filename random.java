import java.util.*;
import java.util.Random;

class random{
    public static void main(String[]args){
         System.out.println();
        Scanner sc = new Scanner (System.in);
        Random rn = new Random();


        int random = rn.nextInt(1000);
        System.out.println(" The random number is "+random);
        

        sc.close();
    }
}