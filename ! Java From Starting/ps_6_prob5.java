import java.util.*;

class ps_6_prob5 {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);

        // write a java program to reverse and array

        System.out.println(" Enter the size of the array ");
        int N = sc.nextInt();

        int[] element = new int[N];

        int i, j;
        for (i = 0; i < element.length; i++) {
            System.out.println(" Enter " + i + " element");
            element[i] = sc.nextInt();
        }

        System.out.println(" printing the array in reverse order ");
        for (j = element.length - 1; j >= 0; j--) {
            System.out.println(element[j]);
        }
        sc.close();
    }
}