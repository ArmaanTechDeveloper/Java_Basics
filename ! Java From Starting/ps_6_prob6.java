import java.util.*;

class ps_6_prob6 {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);

        // Write a program to find the maximum element in an array

        System.out.println(" Enter the size of the array ");
        int N = sc.nextInt();

        int[] element = new int[N];

        int i, j, k;
        int max=0;
        System.out.println(" Enter the element of an array ");

        for (i = 0; i < element.length; i++) {
            element[i] = sc.nextInt();
        }

        for (j = 0; j < element.length; j++) {
            for (k = 0; k < element.length; k++) {
                if (element[j] > element[k]) {
                    max = element[j];
                }
            }
        }
        System.out.println(" The maximum is "+max);
        sc.close();
    }
}