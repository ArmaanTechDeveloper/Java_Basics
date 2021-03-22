import java.util.*;

class ps_6_prob7 {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);

        // Write a program to find the maximum element in an array

        System.out.println(" Enter the size of the array ");
        int N = sc.nextInt();

        int[] element = new int[N];

        int i, j, k;
        System.out.println(" Enter the element of an array ");
        
        for (i = 0; i < element.length; i++) {
            element[i] = sc.nextInt();
        }
        int min = element[0];

        for (int e : element) {
            if (e < min) {
                min = e;
            }
        }
        System.out.println(" The minimum is " + min);
        sc.close();
    }
}