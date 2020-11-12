import java.util.*;

class ps_4_prob6{
    public static void main(String[]args){
         System.out.println();
        Scanner sc = new Scanner (System.in);
        
        System.out.println(" Enter the website URL ");
        String s = sc.nextLine();

        if(s.contains(".com")){
            System.out.println(" commercial website");
        }
        else if(s.contains(".org")){
            System.out.println(" organization website ");
        }
        else if (s.contains(".in")){
            System.out.println(" Indian website ");
        }
        else{
            System.out.println(" Rerun and enter the website with correct URl ");
        }
        sc.close();
    }
}