//Write a program to reverse an array or string
//Input  : arr[] = {1, 2, 3}
//Output : arr[] = {3, 2, 1}

import java.util.Scanner;
public class Q1_reverseAnArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int inp[] = new int[3];


        int index = 0;
        int out[] = new int[3];

// Taking the input of the array
        for(int i = 0 ; i <inp.length;i++){
            System.out.println("Enter the "+(i+1)+" element ");
            inp[i] = sc.nextInt();
        }
// Storing the input array reversed to output array
        for(int i = inp.length-1 ; i>=0 ; i--){
            out[index] = inp[i];
            index++;
        }
// Printing the reversed array
        System.out.println(" The Reversed output array is : ");
        for (int element : out){
            System.out.println(element);
        }

    }
}