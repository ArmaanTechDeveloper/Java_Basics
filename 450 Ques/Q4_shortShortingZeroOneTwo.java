/*
Given an array of size N containing only 0s, 1s, and 2s;
sort the array in ascending order.

Input: 
N = 5
arr[]= {0 2 1 2 0}
Output:
0 0 1 2 2
Explanation:
0s 1s and 2s are segregated into ascending order.

*/

import java.util.Scanner;

public class Q4_shortShortingZeroOneTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

//Inputting the size of the array
        System.out.println(" Enter the size of the array ");
        int N = sc.nextInt();

//Initializing the array arr - input array  out - ouput array 
        int arr[] = new int[N];
        int out[] = new int[N];
//Taking input of the array 
        for(int i = 0 ; i < arr.length ; i ++){
            System.out.println("Enter the "+(i+1)+"element of the array ");
            arr[i] = sc.nextInt();
        }

//Checking and storing the value of arr in out array 
        int index = 0;
        for(int element : arr){
            if(element == 0){
                out[index] = element;
                index ++;
            }
        }
        for(int element : arr){
            if(element == 1){
                out[index] = element;
                index ++;
            }
        }
        for(int element : arr){
            if(element == 2){
                out[index] = element;
                index ++;
            }
        }

// printing the sorted array 
        System.out.println(" The sorted array is ");
        for(int element : out){
            System.out.print(element + " ");
        }
        sc.close();
    }
}
