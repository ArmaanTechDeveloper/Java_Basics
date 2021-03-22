import java.util.Scanner;

public class ps_7_prob6 {
    static int average(int... a) {
        int c = 0;
        for (int element : a) {
            c = c + element;
        }
        int l = a.length;
        int average = c / l;
        return average;
    }

    public static void main(String[] args) {
        //Finding average of numbers using varargs;
        int result = average(2, 2);
        System.out.println(" The average of the numbers is  " + result);
    }
}
