import java.util.*;

class ps_6_prob3 {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter the no of students ");
        int N = sc.nextInt();

        int[] element = new int[N];

        System.out.println(" Enter the elements of the array ");
        for (int i = 0; i < element.length; i++) {
            System.out.println(" Enter " + i + " element");
            element[i] = sc.nextInt();
        }
        int k = 0;
        for (int i : element) {
            k = k + i;

        }
        int average = k / N;
        System.out.println(" The average of the students is " + average);
        sc.close();
    }
}