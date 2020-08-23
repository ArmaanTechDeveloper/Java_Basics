import java.util.*;

class quesiton_8 {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);

        int a[] = { 0, 2, 2, 1, 0, 1, 0, 2, 2, 1 };

        int i, j, temp;
        for (i = 0; i < a.length - 1; i++) {
            for (j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (i = 0; i < a.length; i++) {
            System.out.print(a[i] + " , ");
        }
        sc.close();
    }
}