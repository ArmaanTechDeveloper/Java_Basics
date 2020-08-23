import java.util.*;

class question_7 {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);

        int a[] = { 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 5, 5, 5 };

        int in;
        System.out.println(" Enter the number to find the number in arrays ");
        in = sc.nextInt();

        int i, c = 0;
        for (i = 0; i < a.length; i++) {
            if (in == a[i]) {
                c = c + 1;
            }
        }
        System.out.println(" The number of times present is " + c);
        sc.close();
    }
}