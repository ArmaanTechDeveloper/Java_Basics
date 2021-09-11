import java.util.*;

public class binarySearch {
    public void LinearSearching(int numToSearch, int arr[] , int oneByone){
        int index = arr.length;
        if(index == 0){
            return ;
        }
        else{
        System.out.println(arr[index-1]);
        LinearSearching(numToSearch, arr , arr[index-1]);
        index --;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        //object creation of the class
        binarySearch obj = new binarySearch();
        //taking the size of the array
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        //Declaring the array
        int arr[] = new int[size];
        //for loop to take the inputs of the array
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the "+(i+1)+" Element");
            arr[i] = sc.nextInt();
        }
        //Entering the number to be searched
        System.out.println("Enter the number to be searched ");
        int searchnum = sc.nextInt();


        obj.LinearSearching(searchnum, arr, 0);
        sc.close();
    }
}
