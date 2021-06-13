//Maximum and minimum of an array using minimum number of comparisons

import java.util.Scanner;
public class Q2_MaxMinArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int lengthOfArray = 5;
        int inp[] = new int [lengthOfArray];

        System.out.println("Enter the elements of the array : ");
        for(int i = 0 ; i <inp.length ; i++){
            System.out.println("Enter the "+(i+1)+" element ");
            inp[i] = sc.nextInt();
        }

//Finding the max and min of the array 
        int max = inp[0];
        int min = inp[0];
        for(int i = 0 ; i<inp.length;i++){
            if(inp[i] > max){
                max = inp[i];
            }
            if(inp[i]< min){
                min = inp[i];
            }
        }

        System.out.println(" The max element of the array is : " +max);
        System.out.println(" The min element of the array is : " +min);
    }
}