/* 

Given an array arr[] and a number K where K is smaller than size of array, 
the task is to find the Kth smallest element in the given array. 
It is given that all array elements are distinct. 

Input:
N = 6
arr[] = 7 10 4 3 20 15
K = 3
Output : 7
Explanation :
3rd smallest element in the given 
array is 7.

*/


import java.util.Scanner;


public class Q3_kthSmallestElement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//Inputting the size of the array

        System.out.println(" Enter the number of elements to be entered in the array ");
        int N = sc.nextInt();

//Initializing the array 
        int arr[] = new int [N];
//Inputting the array
        for(int i = 0 ; i < arr.length ; i ++){
            System.out.println(" Enter the" + (i+1)+" elements of the array ");
            arr[i] = sc.nextInt();
        }
//Inputting kth number to find smallest
        System.out.println(" Enter the kth smallest element of the array ");
        int K = sc.nextInt();
//Sorting the array in ascending order
        int temp;
        for(int i = 0 ; i < arr.length ; i ++){
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[j] < arr[i]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
//Printing the kth smallest element
        System.out.println(" The kth smallest element of the array is "+ arr[K-1]);
        sc.close();
    }
}