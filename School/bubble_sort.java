import java.util.Scanner;
public class bubble_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int[] arr = new int [5];
        for(int k = 0 ; k<arr.length;k++){
            System.out.println(" Enter the "+(k+1)+" element of the array");
            arr[k] = sc.nextInt();
        }
        System.out.println(" The unsorted array is : ");
        System.out.println();
        for (int item : arr) {
            System.out.print(item + ",");
        }
        int i, j, sorted = 1;
        for (i = 0; i < arr.length - 1; i++) {
            for (j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j + 1] < arr[j]) {
                    sorted = 0;
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
            if (sorted == 1) {
                break;
            }
            
        }
        System.out.println(" The sorted array is : ");
        for (int element : arr) {
            System.out.print(element + ",");
        }
    }
}
