import java.util.*;

class ps_6_prob2 {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);

        // write a program to find wheather a given element is present in an array or
        // not
        System.out.println(" Enter the element to check it is present in the array or not ");
        int check = sc.nextInt();

        System.out.println(" Enter the size of the array ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println(" Enter the elements of the array ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(" Enter " + i + "element");
            arr[i] = sc.nextInt();
        }
        int k = 1;
        for (int element : arr) {
            if (element == check) {
                k++;
            }
        }
        if (k == 2) {
            System.out.println(" Match found ! element is present ");
        } else {
            System.out.println(" Match not found ! element is not present ");
        }

        sc.close();
    }
}