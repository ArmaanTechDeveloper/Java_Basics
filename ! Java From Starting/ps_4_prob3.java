import java.util.*;

class ps_4_prob3{
    public static void main(String[]args){
         System.out.println();
        Scanner sc = new Scanner (System.in);
        
        System.out.println(" Enter the amount of income slab !! ");
        double income = sc.nextDouble();

        System.out.println(" We have assumed that 1 litre of slab costs 100 rs");
        if(income<2.5){
            System.out.println(" Enter the correct amount of slab ");
        }
        if(income>=2.5 && income <=5.0){
            double total = income * 100;
            double calc = (total * 5 )/100;
            double tax = total + calc;
            System.out.println(" Your amount payable is : "+tax);
        }
        if(income>5.0 && income <=10){
            double total = income * 100;
            double calc = (total * 20 )/100;
            double tax = total + calc;
            System.out.println(" Your amount payable is : "+tax);
        }
        if(income>10){
            double total = income * 100;
            double calc = (total * 30 )/100;
            double tax = total + calc;
            System.out.println(" Your amount payable is : "+tax);
        }
        sc.close();
    }
}