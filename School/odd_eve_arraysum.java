import java.util.Scanner;

public class odd_eve_arraysum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter the length of the array ");
        int N = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < arr.length; i++) {
            System.out.println(" Enter the " + (i + 1) + " element of the array ");
            arr[i] = sc.nextInt();
        }

        int odd = 0, eve = 0;

        for (int element : arr) {
            if (element % 2 == 0) {
                eve = eve + element;
            } else {
                odd = odd + element;
            }
        }
        
        System.out.println(" The sum of eve elements is " + eve);
        System.out.println(" The sum of odd elements is " + odd);
    }
}
