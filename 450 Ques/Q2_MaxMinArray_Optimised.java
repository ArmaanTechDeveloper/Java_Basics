import java.util.Scanner;

/*
Maximum and minimum of an array using minimum number of comparisons


<--------------- Little Optimised ----------->
*/ 


public class Q2_MaxMinArray_Optimised {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the size of the array ");
        int N = sc.nextInt();
        
        int arr[] = new int [N];

        System.out.println("Enter the elements of the array ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        if(N == 1){
            System.out.println(" The max element is "+arr[0]);
            System.out.println(" The min element is "+arr[0]);
        }
        if(N == 0){
            if(arr[0] > arr[1]){
                System.out.println("The max element is "+arr[0]);
                System.out.println("The min element is "+arr[1]);
            }
            else{
                System.out.println("The max element is "+arr[1]);
                System.out.println("The min element is "+arr[0]);
            }
        }

        // if N > 2

        int max = arr[0] , min = arr[0];
        for(int element : arr){
            if(element > max ){
                max = element;
            }
            if(element < min){
                min = element;
            }
        }

        System.out.println("The max element is "+max);
        System.out.println("The min element is "+min);
        sc.close();
    }
}
