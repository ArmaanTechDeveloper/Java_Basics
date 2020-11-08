import java.util.*;

class Marks {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter Your 5 subject marks ");
        int a[] = new int[5];

        int i;
        for (i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        int c = 0;
        for (int element : a) {
            c = c + element;
        }
        System.out.println(" Enter the marks out of to calculate percentage ");
        int o = sc.nextInt();
        int pp = o * 5;
        double percentage = c * 100 /pp;
        System.out.println(" The percentage is : " + percentage);
    }
}