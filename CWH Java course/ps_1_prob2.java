import java.util.*;

class ps_1_prob2{
    public static void main(String[]args){
         System.out.println();
        Scanner sc = new Scanner (System.in);
        
        System.out.println(" Enter first subject marks ");
        int a = sc.nextInt();

        System.out.println(" Enter second subject marks ");
        int b = sc.nextInt();

        System.out.println(" Enter the third subject marks ");
        int c = sc.nextInt();

        System.out.println(" Enter your total number of semesters attempted ");
        int at = sc.nextInt();

        int sum = a+b+c;
        int cgpa = sum/at;
        System.out.println(" The CGPA is "+cgpa);
        sc.close();
    }
}