import java.util.*;

class oddeveelement {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter the n number");
        int n = sc.nextInt();

        int o[] = new int[n];
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print(" Enter the " + (i + 1) + " number : ");
            o[i] = sc.nextInt();
        }
        int p = 0;

        for (int element : o) {
            if (element % 2 != 0) {
                a[p] = element;
                p++;
            }
        }
        System.out.println("Converting original array into actual array .......");

        System.out.println(" printing the arranged array now......");

        for (int element : o) {
            if (element % 2 == 0) {
                a[p] = element;
                p++;
            }
        }
        for(int element : a){
           System.out.print(" "+element+",");
        }

        sc.close();
    }
}