import java.util.*;

class question_3 {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);

        int a[] = new int[10];

        int i, j, m = 0, min = 0, k, o = 0;

        System.out.println(" Enter elements of the array ");

        for (i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        for (j = 0; j < 5; j++) {
            if (m < a[j]) {
                m = a[j];

            }
        }
        for (k = 0; k < 5; k++) {
            o = a[0];
            if (o < a[k]) {
                min = o;
            }
        }
        System.out.println(" The max is " + m);
        System.out.println(" The minimum number is " + min);
        sc.close();
    }
}