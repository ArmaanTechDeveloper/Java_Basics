import java.util.Scanner;
public class binary_search {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println(" Enter the size of the array ");
        int n = sc.nextInt();


        System.out.println("Enter the elements in ascending order ");
        int[] arr = new int [n];
        for(int inp = 0;inp < n ; inp ++){
            System.out.println(" Enter the "+(inp+1)+" element of the array ");
            arr[inp] = sc.nextInt();
        }

        System.out.println(" Enter the element to be searched ");
        int d = sc.nextInt();

        int li = 0 , hi = n-1 , mi = (li+hi)/2 , f=0;
        while(li<=hi) {
            if (arr[mi] == d) {
                f = 1;
                System.out.println(" The number you entered is founded in the array ");
                break;
            } else if (arr[mi] < d) {
                li = mi + 1;
            } else {
                hi = mi - 1;
            }
            mi = (li + hi) / 2;
        }
        if(f==0){
            System.out.println(" The number you entered was not found in the array ");
        }
    }
}
