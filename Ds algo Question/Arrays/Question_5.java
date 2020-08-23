import java.util.*;

class question_5 {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);

        // Sorting
        int a[] = new int[5];
        int i, k, j, temp = 0;

        System.out.println(" Enter the Elements of the Array ");
        for (k = 0; k < 5; k++) {
            a[k] = sc.nextInt();
        }

        for (i = 0; i < a.length - 1; i++) {
            for (j = i + 1; j<a.length ; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(" The sorted array is ");
        for (i = 0; i < a.length ; i++) {
            System.out.println(a[i]);
        }

        sc.close();
    }
}