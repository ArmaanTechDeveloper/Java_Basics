import java.util.*;

class minmax {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);

        // minmax funtion between 2 numbers
        // Taking the input from the user

        int n;

        System.out.println(" Enter the choice you want to get min and max of numbers");
        System.out.println(" Enter 1 for finding minmax between 2 numbers ");
        System.out.println(" Enter 2 for finding minmax between 3 numbers");

        n=sc.nextInt();

        switch(n){
            case 1:
        System.out.println(" Enter the 1st number in which you want to find the min and max ");
        int n1 = sc.nextInt();

        System.out.println(" Enter the 2nd number in which you want to find the min and max ");
        int n2 = sc.nextInt();

        int max2 = Math.max(n1, n2);

        System.out.println(" The maximum number between the two are " + max2);
        int min2 = Math.min(n1, n2);

        System.out.println(" The minmum number between the two are " + min2);

        break;
            case 2:

            System.out.println(" Enter the 1st number between which you want to find the min and max");
            int no1=sc.nextInt();

            System.out.println(" Enter the 2nd number between which you want to find the min and max ");
            int no2=sc.nextInt();

            System.out.println(" Enter the 3rd number between which you want to find the min and max ");
            int no3=sc.nextInt();

            int t=Math.max(no1,no2);
            int c=Math.max(t,no3);

            System.out.println(" The maximum number between the three are : "+c);

            int min1=Math.min(no1 , no2);
            int m=Math.min(min1,no3);

            System.out.println(" The minimum number between the three are : "+m);
            break;
            default:
            System.out.println("Re run the program and enter the correct choice :) ");
        }
        
    
    sc.close();

    }
}