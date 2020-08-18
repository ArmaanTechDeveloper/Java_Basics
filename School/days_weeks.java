import java.util.*;

class days_weeks{
    public static void main(String[]args){
         System.out.println();
        Scanner sc = new Scanner (System.in);
        
            // Inputting the no of day 

        System.out.println(" Enter the day number :) ");
        int ch = sc.nextInt();

            // Checking the days using switch 
        switch(ch){
            case 1:
            System.out.println(" Today is Sunday ");
            break;
            case 2:
            System.out.println(" Today is Monday ");
            break;
            case 3:
            System.out.println(" Today is Tuesday ");
            break;
            case 4:
            System.out.println(" Today is Wednesday ");
            break;
            case 5:
            System.out.println(" Today is Thursday ");
            break;
            case 6:
            System.out.println(" Today is Friday ");
            break;
            case 7:
            System.out.println(" Today is Saturday ");
            break;

            // default statement 

            default:
            System.out.println(" Wrong no of day input");

        }

        sc.close();
    }
}