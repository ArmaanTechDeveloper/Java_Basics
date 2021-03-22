import java.util.*;

class ps_4_prob5 {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter the year to find is a leap year or not ");
        int year = sc.nextInt();
        if (year % 4 == 0) {
            System.out.println(" Leap year ");
        } else {
            System.out.println(" Not a leap year ");
        }
        sc.close();
    }
}