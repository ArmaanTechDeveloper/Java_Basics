import java.util.Scanner;

/*
Write a program to reverse an array or string
Input  : arr[] = {1, 2, 3}
Output : arr[] = {3, 2, 1}

<-------------- Optimised way --------------->
arr = 1 2 3 4 
1st = 4 2 3 1 
2nd = 4 3 2 1 
*/

public class Q1_reverseAnArray_Optimised {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the size of the array ");
        int N = sc.nextInt();
        
        int arr[] = new int [N];
        int startPosition = 0 , endPosition = N-1;

        System.out.println("Enter the elements of the array ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        int temp;
        while(startPosition < endPosition){

            temp = arr[startPosition];
            arr[startPosition] = arr[endPosition];
            arr[endPosition] = temp;


            startPosition += 1;
            endPosition -= 1;
        }

        System.out.println("The reversed array is ");
        
        for(int element : arr){
            System.out.println(element);
        }

        sc.close();
    }
}
