import java.util.*;

class ps_1_prob4{
    public static void main(String[]args){
         System.out.println();
        Scanner sc = new Scanner (System.in);
        
        System.out.println(" Enter the distance into kilometers ");
        double km = sc.nextDouble();

        double m = km*1000;
        System.out.println(" The km you entered in meters is "+m);
        sc.close();
    }
}