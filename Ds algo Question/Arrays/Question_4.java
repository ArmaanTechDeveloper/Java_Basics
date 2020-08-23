import java.util.*;

class question_4 {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);

        int a[] = new int[5];

        int i, j;
        System.out.println(" Enter the elements of the array ");
        for (i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        for (j = a.length - 1; j >= 0; j--) {
            System.out.print(a[j]);
        }
        sc.close();
    }
}