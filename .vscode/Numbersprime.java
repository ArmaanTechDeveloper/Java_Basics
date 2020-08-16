import java.util.*;

// Rabbit is eating an apple in missisipi

class Numbersprime{
    public static void main(String[]args){
         System.out.println();
        Scanner sc = new Scanner (System.in);
        
        String s,w,w2,w3;
        System.out.println(" Enter ");
         s=sc.nextLine();
        
        w= s.replace("Rabbit","bitrab");
        w2=w.replace("apple","pleap");
        w3=w2.replace("missisipi","sipiimiss");

        System.out.println(w3);
        sc.close();
    }
}