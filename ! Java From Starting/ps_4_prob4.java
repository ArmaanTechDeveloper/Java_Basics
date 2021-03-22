import java.util.*;

class ps_4_prob_4{
    public static void main(String[]args){
         System.out.println();
        Scanner sc = new Scanner (System.in);
        
        System.out.println(" Enter the no to find day of week between 1 -  7");
        int w = sc.nextInt();

        switch(w){
            case 1 :
            System.out.println(" Monday ");
            break;
            case 2 :
            System.out.println(" Tuesday ");
            break;
            case 3 :
            System.out.println(" Wednesday ");
            break;
            case 4 :
            System.out.println(" Thursday ");
            break;
            case 5 :
            System.out.println(" Friday ");
            break;
            case 6 :
            System.out.println(" Saturday ");
            break;
            case 7 :
            System.out.println(" Sunday ");
            break;
            default :
            System.out.println("Rerun. and Enter correct number of day please ");
        }
        sc.close();
    }
}